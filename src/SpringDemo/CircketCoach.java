package SpringDemo;

public class CircketCoach implements Coach {

    private FortuneService fortuneService;

    public CircketCoach() {
        System.out.println("CricketCoach: inside no-args Constructor.");
    }

    public void setFortuneService(HappyFortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - setFortuneServices");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
