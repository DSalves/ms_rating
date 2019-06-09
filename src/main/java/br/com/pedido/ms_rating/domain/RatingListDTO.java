package br.com.pedido.ms_rating.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingListDTO {

    double socreMedium;
    List<RatingDTO> ratingDTOList;

}
