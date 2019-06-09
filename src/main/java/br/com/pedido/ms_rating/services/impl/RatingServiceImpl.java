package br.com.pedido.ms_rating.services.impl;

import br.com.pedido.ms_rating.domain.RatingDTO;
import br.com.pedido.ms_rating.domain.RatingListDTO;
import br.com.pedido.ms_rating.mapper.RatingMapper;
import br.com.pedido.ms_rating.repositories.RatingRepository;
import br.com.pedido.ms_rating.services.RatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static br.com.pedido.ms_rating.helper.DataHelper.calculateScore;
import static br.com.pedido.ms_rating.helper.DataHelper.captureDate;

@Service
public class RatingServiceImpl implements RatingService {

    private final static Logger LOGGER = LoggerFactory.getLogger(RatingServiceImpl.class);

    private final RatingMapper ratingMapper;
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingMapper ratingMapper, RatingRepository ratingRepository) {
        this.ratingMapper = ratingMapper;
        this.ratingRepository = ratingRepository;
    }


    @Override
    public RatingListDTO getRating(String id) {
        List<RatingDTO> ratingDTOList = ratingRepository.executeQuerySeachRatingById(id)
                .stream()
                .map(rating -> {
                    RatingDTO ratingDTO  = ratingMapper.ratingToRatingDTO(rating);
                    return ratingDTO;
                })
                .collect(Collectors.toList());
        return new RatingListDTO(calculateScore(ratingDTOList),ratingDTOList);
    }

    @Override
    public void saveRating(RatingDTO ratingDTO) {
        ratingDTO.setEvaluationDate(captureDate());
        ratingRepository.save(ratingMapper.ratingDtoToRating(ratingDTO));
    }
    
}
