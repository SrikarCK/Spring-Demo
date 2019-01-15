package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach BaseballCoach = context.getBean("BaseballCoach",Coach.class);//(beanId,interface)
//        Coach swimCoach = context.getBean("swimCoach",Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);

        //Call methods on bean
        System.out.println(BaseballCoach.getDailyWorkout());
        System.out.println(BaseballCoach.getDailyFortune());
//        System.out.println(swimCoach.getDailyWorkout());
//        System.out.println(swimCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
