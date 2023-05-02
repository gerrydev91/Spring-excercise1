package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Salute salute = (Salute) context.getBean("salute");

        String sayHello = salute.printSalute();

        System.out.println(sayHello);

        
        
    }
}
