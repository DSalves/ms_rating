package br.com.pedido.ms_rating.repositories.impl;

import br.com.pedido.ms_rating.model.Rating;
import br.com.pedido.ms_rating.repositories.RatingCustomRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import java.util.List;

import static br.com.pedido.ms_rating.helper.QueryHelper.querySearchRatingByIdCustomer;

public class RatingCustomRepositoryImpl implements RatingCustomRepository {

    private final MongoTemplate mongoTemplate;

    public RatingCustomRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Rating> executeQuerySeachRatingById(String id) {
        BasicQuery query = new BasicQuery(querySearchRatingByIdCustomer(id));
        return mongoTemplate.find(query, Rating.class);
    }
}
