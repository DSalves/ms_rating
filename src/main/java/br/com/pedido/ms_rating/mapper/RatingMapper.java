package br.com.pedido.ms_rating.mapper;

import br.com.pedido.ms_rating.domain.RatingDTO;
import br.com.pedido.ms_rating.model.Rating;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RatingMapper {

    RatingMapper INSTANCE = Mappers.getMapper(RatingMapper.class);

    Rating ratingDtoToRating(RatingDTO ratingDTO);
    RatingDTO ratingToRatingDTO(Rating rating);

}
