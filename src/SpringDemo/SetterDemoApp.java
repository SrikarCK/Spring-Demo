package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Setter injection.
public class SetterDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        CircketCoach circketCoach = context.getBean("cricketCoach",CircketCoach.class);//(beanId,interface)

        //Call methods on bean
        System.out.println(circketCoach.getDailyWorkout());
        System.out.println(circketCoach.getDailyFortune());

        //Call our new methods to get the literal values
        System.out.println(circketCoach.getEmailAddress());
        System.out.println(circketCoach.getTeam());

        //close the context
        context.close();

    }
}
