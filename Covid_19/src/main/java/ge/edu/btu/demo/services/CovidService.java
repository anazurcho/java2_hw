package ge.edu.btu.demo.services;

import ge.edu.btu.demo.model.Covid;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService
public class CovidService {

    List<Covid> covidList=new ArrayList<Covid>(Arrays.asList(
        new Covid("USA",819321,45356,83008),
        new Covid("Spain",208389,21717,85915),
        new Covid("Italy",183957,24648,39181),
        new Covid("France",158050,20796,39181),
        new Covid("Germany",148925,5117,99400),
        new Covid("UK",133495,18100,9181),
        new Covid("Turkey",95591,2259,14918)
    ));

    @WebMethod
    public List<Covid> getStatistic(){
        return covidList;
    }

    @WebMethod
    public Covid getCountryStatistic(String country){
        for (Covid cov: covidList){
            if(cov.getCountry().equals(country)){
                return cov;
            }
        }
        return null;
    }

    @WebMethod
    public int TotalConfirmed(){
        int result = 0;
        for (Covid cov: covidList){
            result += cov.getConfirmed();
            }
        return result;
    }

    @WebMethod
    public int TotalDeathget(){
        int result = 0;
        for (Covid cov: covidList){
            result += cov.getDeath();
        }
        return result;
    }

    @WebMethod
    public int TotalRecoveryget(){
        int result = 0;
        for (Covid cov: covidList){
            result += cov.getRecovered();
        }
        return result;
    }

}
