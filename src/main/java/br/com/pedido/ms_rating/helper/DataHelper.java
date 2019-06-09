package br.com.pedido.ms_rating.helper;

import br.com.pedido.ms_rating.domain.RatingDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DataHelper {

    public static String captureDate(){
        LocalDate localDate = LocalDate.now();
        return localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public static double calculateScore(List<RatingDTO> ratingDTOList){
        return ratingDTOList.stream().mapToDouble(RatingDTO::getScore).average().orElse(0.0);
    }
}
