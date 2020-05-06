package ana.zurabashvili.weather.controller;

import ana.zurabashvili.weather.Client;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class ChatBotService {
    public static String answer(String question){
        try {
            return Client.get(String.format("weather/%s", question));
        }catch (Exception exception) {
            return "ამ კითხვაზე პასუხი არ მაქვს";
        }
    }
}