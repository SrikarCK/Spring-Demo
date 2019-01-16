package SpringDemo;

public class BaseballCoach implements Coach {

    //Define private field for dependency
    private FortuneService fortuneService;

    //Define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        //Use myFortuneService to get a fortune
        return fortuneService.getFortune();
    }

    //Methods start and destroy a bean

    //Add init --> (initialisation) or Startup method
    public void doMystartupStuff() {
        System.out.println("BaseBallCoach: inside method doMystartupStuff");
    }
    //Add destroy method
    public void doMyCleanupStuff(){
        System.out.println("BaseBallCoach: inside method doMyCleanupStuff");
    }
}
