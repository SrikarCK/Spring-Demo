package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("baseballCoach",Coach.class);

        Coach alphaCoach = context.getBean("baseballCoach",Coach.class);

        boolean result = (coach == alphaCoach);

        System.out.println("Pointing to the same object: "+result);
        System.out.println("Memory location for coach object "+coach);
        System.out.println("Memory location for alphaCoach object "+alphaCoach);



        context.close();
    }
}
