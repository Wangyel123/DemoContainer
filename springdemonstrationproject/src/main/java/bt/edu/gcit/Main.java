package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Alien obj = new Alien();
        // obj.code();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates IoC container
        Alien obj  = (Alien) context.getBean("alien"); //creates an object of Alien class
        // Alien obj  = context.getBean("alien",Alien.class);
        obj.code();

        // Laptop lap = (Laptop) context.getBean("laptop"); //creates an object of Laptop class
        // lap.compile();
        // Laptop lap = (Laptop) context.getBean("Laptop"); //creates an object of Laptop class
        // lap.compile();
        // System.out.println(obj.getLap());

        // Alien obj1  = (Alien) context.getBean("alien"); //creates an object of Alien class
        // obj1.code();
        //scope of the bean is singleton by default
        //if we want to change the scope of the bean to prototype, we can do so by adding scope="prototype" in the bean tag in spring.xml
    }
}