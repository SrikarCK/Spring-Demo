package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor injection.
public class HelloSpringApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach BaseballCoach = context.getBean("BaseballCoach",Coach.class);//(beanId,interface)

        //Call methods on bean
        System.out.println(BaseballCoach.getDailyWorkout());
        System.out.println(BaseballCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
