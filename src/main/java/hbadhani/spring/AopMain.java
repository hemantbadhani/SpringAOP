/**
 * Created by hbadhani on 10/06/2015.
 */
package hbadhani.spring;
import hbadhani.spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService service = context.getBean("service",ShapeService.class);
        System.out.println(service.getCircle().getName());
        service.getCircle().setName("New Name for Circle");
        System.out.println(service.getCircle().getName());
        System.out.println(service.getTriangle().getName());


    }

}
