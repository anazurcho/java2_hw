package ge.edu.btu.controller;

import ge.edu.btu.model.Currency;
import ge.edu.btu.model.Currencydata;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
//http://localhost:8080/assignment_2_war_exploded/api/currencyManager/Currency

@Path("/currencyManager")
public class CurrencyController {

    @GET
    @Path("/Currency")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Currency> getStudents(){
        return Currencydata.getInstance();
    }

    @POST
    @Path("/Currency")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCurrency(Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        currencies.add(currency);
        System.out.println(currency.toString());
    }
    @POST
    @Path("/buy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void buyCurrency(Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        currencies.add(currency);
        System.out.println(currency.geltoOther());
    }


//    @PUT
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void updateCurrency(@PathParam("id") int id,  Currency currency){
//        ArrayList<Currency> currencies=Currencydata.getInstance();
//        for (int i=0; i<currencies.size(); i++ ){
//            if (currencies.get(i).getId() == id){
//                currencies.get(i).setTitle(currency.getTitle());
//                currencies.get(i).setBuy(currency.getBuy());
//                currencies.get(i).setSell(currency.getSell());
//                currencies.get(i).setId(currency.getId());
//            }
//        }
//    }

    @GET
    @Path("/getCurrency/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Currency getCurrency(@PathParam("id") int id) {
        System.out.println(id);
        return new Currency(id,"Gel",25,23);
    }
    @PUT
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Currency updateCurrency(Currency currency) {
        System.out.println(currency.geltoOther());
        return currency;
    }
    public void sellCurrency(string to, int amount,  Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        for (int i=0; i<currencies.size(); i++ ){
            if (currencies.get(i).getTo() == to){
                currencies.get(i).setTitle(currency.getBuy()*);
                currencies.get(i).setBuy(currency.getBuy());
                currencies.get(i).setSell(currency.getSell());
                currencies.get(i).setId(currency.getId());
            }
        }
    }

}

