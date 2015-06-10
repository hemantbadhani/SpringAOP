package hbadhani.spring.aspect;

import hbadhani.spring.model.Circle;
import org.aspectj.lang.annotation.*;

/**
 * Created by hbadhani on 10/06/2015.
 */
@Aspect
public class LoggingAspect {
    @Before("allGetters()  && allCircleMethods()")
    public void loggingAdviceBefore(){
        System.out.println("Get method called");
    }



    @Pointcut("execution(* get*(..))")
    private void allGetters(){}

    @Before("allCircleMethods()")
    private void callforAllCircleMethodCalls(){
        System.out.println("Circle method call");

    }
    @Pointcut("execution(* hbadhani.spring.model.Circle.*(..))")
    private void allCircleMethods(){}

    @Before("allTriangleMethods()")
    private void callforAllTriangleMethodCalls(){
        System.out.println("Triangle method call");

    }
    @Pointcut("within(hbadhani.spring.model.Triangle)")
    private void allTriangleMethods(){}


}
