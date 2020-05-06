package ana.zurabashvili.weather.services;
import ana.zurabashvili.weather.module.Weather;
import ana.zurabashvili.weather.module.WindDirection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/weather")
public class WeatherService {
    List<Weather> weathers = new ArrayList<>(Arrays.asList(
            new Weather("Tbilisi",31.6,3.2,3.16,3.2, WindDirection.EAST),
            new Weather("Batumi",3.16,3.2,3.16,3.2,  WindDirection.EAST),
            new Weather("Sairme",3.16,3.2,3.16,3.2, WindDirection.SOUTH),
            new Weather("Woporti",3.16,3.2,3.16,3.2, WindDirection.NORTH),
            new Weather("Rustavi",3.16,3.2,3.16,3.2, WindDirection.SOUTH),
            new Weather("Xashuri",3.16,3.2,3.16,3.2, WindDirection.WEST)
    ));
//    http://localhost:8080/ana_zurabashvili_davaleba1_war_exploded/api/weather/all
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeathers(){return weathers; }
    
//    http://localhost:8080/ana_zurabashvili_davaleba1_war_exploded/api/weather/Tbilisi
    @GET
    @Path("/{cityName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getCountryWeather(@PathParam("cityName") String cityName) {
        for (Weather weather: weathers){
            if(weather.getCityName().equals(cityName)){ return weather; }
        }
        return null;
    }
}
