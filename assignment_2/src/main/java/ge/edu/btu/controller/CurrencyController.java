package ge.edu.btu.controller;

import ge.edu.btu.model.ChangeAmount;
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
    public ArrayList<Currency> getCurrency(){
        return Currencydata.getInstance();
    }

    @POST
    @Path("/Currency")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCurrency(Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        currencies.add(currency);
    }
    @GET
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public double buyCurrency(ChangeAmount changeAmount){
        ArrayList<Currency> currencies = Currencydata.getInstance();
        double answer = 0;
        for (int i=0; i<currencies.size(); i++ ){
            if (currencies.get(i).getTitle() == changeAmount.getTo()){
                answer = currencies.get(i).getBuy();
            }
            else{
                return 0;
            }
        }
        return changeAmount.getAmount() * answer;
    }

    @GET
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public double sellCurrency(ChangeAmount changeAmount){
         ArrayList<Currency> currencies = Currencydata.getInstance();
        double answer = 0;
        for (int i=0; i<currencies.size(); i++ ){
            if (currencies.get(i).getTitle() == changeAmount.getTo()){
                answer = currencies.get(i).getSell();
            }
            else{
                return 0;
            }
        }
        return changeAmount.getAmount() / answer;
    }
}

