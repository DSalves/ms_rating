package br.com.pedido.ms_rating.services;

import br.com.pedido.ms_rating.domain.RatingDTO;
import br.com.pedido.ms_rating.domain.RatingListDTO;


public interface RatingService {

    RatingListDTO getRating(String id);

    void saveRating(RatingDTO ratingDTO);
}
