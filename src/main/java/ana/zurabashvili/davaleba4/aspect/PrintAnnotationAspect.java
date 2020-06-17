package ana.zurabashvili.davaleba4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {

    @Before("@annotation(ana.zurabashvili.davaleba4.aspect.Println)")
    public void multiplication(JoinPoint joinPoint){
        System.out.println("PrintAnnotationAspect მოვდივარ");
        System.out.println("გადაცემული არგუმენტები="+ Arrays.toString(joinPoint.getArgs()));
    }
}
