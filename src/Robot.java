import java.util.Random;

public class Robot {
    private final int JUMP_DISTANCE;
    private final int RUN_DISTANCE;
    private boolean continueChamp;

    public Robot() {
        JUMP_DISTANCE = new Random().nextInt(6) + 6;
        RUN_DISTANCE = new Random().nextInt(600) + 400;
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

    @Override
    public String toString() {
        return "Robot{" +
                "JUMP_DISTANCE=" + JUMP_DISTANCE +
                ", RUN_DISTANCE=" + RUN_DISTANCE +
                '}';
    }
}