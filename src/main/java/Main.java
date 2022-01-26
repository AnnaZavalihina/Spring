import car.Config;
import car.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Driver person = context.getBean("person", Driver.class);
        person.push();























//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        Car car1 = context.getBean("car", Car.class);
//        car1.setMark("Audi");
//        car1.start();
//        Cat cat1 = context.getBean("cat", Cat.class);
//        Person person1 = context.getBean("person", Person.class);
//        person1.setAge(20);
//        person1.say();
//        person1.getCat().say();
//        HelloWorld hellow = context.getBean("helloWorld", HelloWorld.class);
//        hellow.sayHello();
//        System.out.println("\n");
//
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(Appconfig.class);
//
//        Car car2 = context1.getBean("carApp", Car.class);
//        car2.setMark("Audi");
//        car2.start();
//        HelloWorld hellow2 = context1.getBean("helloWorldApp", HelloWorld.class);
//        hellow2.sayHello();
    }
}
