package ge.edu.btu.controller;

import ge.edu.btu.model.Currency;
import ge.edu.btu.model.Currencydata;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
//http://localhost:8080/assignment_2_war_exploded/api/currencyManager/Currency

@Path("/currencyManager")
public class CurrencyController {

//    @GET
//    @Path("/Currency")
//    @Produces(MediaType.APPLICATION_JSON)
//    public ArrayList<Currency> getCurrency(){
//        return Currencydata.getInstance();
//    }

    @GET
    @Path("/Currency")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getCurrency() {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency(1,"USD", 3.16, 3.2));
        currencyList.add(new Currency(2,"EUR", 3.425, 3.475));
        currencyList.add(new Currency(4,"RUB", 4.12, 4.3));
        currencyList.add(new Currency(6,"AZN", 1.6, 1.84));
        return currencyList;
    }
//

    @GET
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void buyCurrency(Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        for (int i=0; i<currencies.size(); i++ ){
            if (currencies.get(i).getTitle() == request.getParameter("to")) {
                return request.getParameter("amount") / currencies.get(i).getBuy();
            }
        }
    }

    @GET
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void sellCurrency(Currency currency){
        ArrayList<Currency> currencies=Currencydata.getInstance();
        for (int i=0; i<currencies.size(); i++ ){
            if (currencies.get(i).getTitle() == request.getParameter("to")) {
                return request.getParameter("amount") * currencies.get(i).getSell();
            }
        }
    }
}

