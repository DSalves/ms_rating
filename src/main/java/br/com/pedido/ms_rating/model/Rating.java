package br.com.pedido.ms_rating.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Rating {

    @Id
    private String idRating;
    private String idCustomer;
    private String nameAppraiser;
    private double score;
    private String evaluationDate;
    private String message;
}
