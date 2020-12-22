import java.util.Random;

public class Human {
    private final int JUMP_DISTANCE;
    private final int RUN_DISTANCE;
    private boolean continueChamp;

    public Human() {
        JUMP_DISTANCE = new Random().nextInt(1) + 1;
        RUN_DISTANCE = new Random().nextInt(60) + 40;
        continueChamp = true;
    }

    public int getJUMP_DISTANCE() {
        return JUMP_DISTANCE;
    }

    public int getRUN_DISTANCE() {
        return RUN_DISTANCE;
    }

    public boolean isContinueChamp() {
        return continueChamp;
    }

    public void setContinueChamp(boolean continueChamp) {
        this.continueChamp = continueChamp;
    }

    public void run() {
        System.out.println("Бегу");
    }

    public void jump() {
        System.out.println("Прыгаю");
    }
}
