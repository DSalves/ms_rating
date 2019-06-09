package br.com.pedido.ms_rating.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingDTO {

    private String idCustomer;
    private String nameAppraiser;
    private double score;
    private String evaluationDate;
    private String message;
}
