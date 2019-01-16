package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Setter injection.
public class SetterDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        CircketCoach circketCoach = context.getBean("CricketCoach",CircketCoach.class);//(beanId,interface)

        //Call methods on bean
        System.out.println(circketCoach.getDailyWorkout());
        System.out.println(circketCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
