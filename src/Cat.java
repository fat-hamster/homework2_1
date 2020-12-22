import java.util.Random;

public class Cat {
    private final int JUMP_HEIGHT;
    private final int RUN_DISTANCE;
    private boolean continueChamp;
    private int maxJump;
    private int maxRun;

    public Cat() {
        JUMP_HEIGHT = new Random().nextInt(5) + 3;
        RUN_DISTANCE = new Random().nextInt(6) + 5;
        continueChamp = true;
        maxJump = 0;
        maxRun = 0;
    }

    public int getJUMP_HEIGHT() {
        return JUMP_HEIGHT;
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

    public boolean run(RunningTrack track) {
        if(RUN_DISTANCE >= track.getRUN_DISTANCE()) {
            if(maxRun < track.getRUN_DISTANCE()) {
                maxRun = track.getRUN_DISTANCE();
            }
            return true;
        }
        continueChamp = false;
        return false;
    }

    public boolean jump(Wall wall) {
        if(JUMP_HEIGHT >= wall.getWALL_HEIGHT()) {
            if(maxJump < wall.getWALL_HEIGHT()) {
                maxJump = wall.getWALL_HEIGHT();
            }
            return true;
        }
        continueChamp = false;
        return false;
    }

    public String info() {
        return "\nКот: \nмаксимальная дистанция бега: " + maxRun +
                "\nМаксимальная высота прыжка: " + maxJump +
                "\nЗакончил чемпионат?: " + continueChamp + '\n';
    }

    @Override
    public String toString() {
        return "Кот {" +
                "Высота прыжка = " + JUMP_HEIGHT +
                ", Дистанция бега = " + RUN_DISTANCE +
                '}';
    }
}
