import Soap.SoapClient;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ChatBotService {
    public static String answer(String question) throws ServiceException, RemoteException {
        String result;

        switch (question) {
            case "გამარჯობა":
                result = "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
                break;
            case "რა რიცხვია?":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                result = dtf.format(now);
                break;
            case "რომელი საათია?":
                DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime nowTime = LocalDateTime.now();
                result = time.format(nowTime);
                break;
            case "USD":
                result= SoapClient.SoapConnect("USD") +  SoapClient.SoapConnectDesc("USD") +
                        SoapClient.GetCurrencyChange("USD");
                break;
            case "EUR":
                result= SoapClient.SoapConnect("EUR") +  SoapClient.SoapConnectDesc("EUR") +
                        SoapClient.GetCurrencyChange("EUR");
                break;
            case "RUB":
                result= SoapClient.SoapConnect("RUB") +  SoapClient.SoapConnectDesc("RUB") +
                        SoapClient.GetCurrencyChange("RUB");
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
                break;
        }

        return result;
    }
}
