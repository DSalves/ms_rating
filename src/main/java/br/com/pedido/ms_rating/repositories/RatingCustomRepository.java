package br.com.pedido.ms_rating.repositories;

import br.com.pedido.ms_rating.model.Rating;

import java.util.List;

public interface RatingCustomRepository {

    List<Rating> executeQuerySeachRatingById(String id);

}
