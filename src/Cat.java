import java.util.Random;

public class Cat {
    private final int JUMP_DISTANCE;
    private final int RUN_DISTANCE;
    private boolean continueChamp;

    public Cat() {
        JUMP_DISTANCE = new Random().nextInt(5) + 3;
        RUN_DISTANCE = new Random().nextInt(6) + 5;
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
