package br.com.pedido.ms_rating.helper;

public class QueryHelper {

    public static String querySearchRatingByIdCustomer(String id){
        return "{idCustomer:/"+id+"/i}";
    }

}
