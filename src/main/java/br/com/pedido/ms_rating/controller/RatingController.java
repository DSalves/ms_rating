package br.com.pedido.ms_rating.controller;

import br.com.pedido.ms_rating.constants.RatingConstants;
import br.com.pedido.ms_rating.domain.RatingDTO;
import br.com.pedido.ms_rating.domain.RatingListDTO;
import br.com.pedido.ms_rating.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RatingConstants.URL_BASE_RATING_V1)
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public RatingListDTO getRatingCustomer(@RequestParam("idCustomer") String id){
        return ratingService.getRating(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRaing(@RequestBody RatingDTO ratingDTO){
        ratingService.saveRating(ratingDTO);
    }

}
