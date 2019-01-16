package SpringDemo;

public class CircketCoach implements Coach {

    private FortuneService fortuneService;

    //Add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - emailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - Team");
        this.team = team;
    }

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
