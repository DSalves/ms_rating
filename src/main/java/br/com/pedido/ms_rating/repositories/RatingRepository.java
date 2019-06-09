package br.com.pedido.ms_rating.repositories;

import br.com.pedido.ms_rating.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String>,RatingCustomRepository {
}
