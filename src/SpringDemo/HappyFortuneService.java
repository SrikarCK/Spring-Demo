package SpringDemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {

        String[] fortune = { "Today is your lucky day!.",
                            "Practise make man perfect.",
                            "Wakeup work hard!."};

        int autoPickUp = new Random().nextInt(fortune.length);
        String theFortune = fortune[autoPickUp];
        return theFortune;
    }
}
