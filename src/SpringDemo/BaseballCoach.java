package SpringDemo;

public class BaseballCoach implements Coach{

    //Define private field for dependency
    private FortuneService fortuneService;

    //Define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        //Use myFortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
