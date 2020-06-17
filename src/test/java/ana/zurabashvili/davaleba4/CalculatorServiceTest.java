package ana.zurabashvili.davaleba4;

import ana.zurabashvili.davaleba4.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest(){
        int result = 20;
        int realresult = calculatorService.multiplication(10,2);

        assertEquals(result, realresult);
        System.out.println("result expected " + result);
        System.out.println("result for real " + realresult);
    }
}
