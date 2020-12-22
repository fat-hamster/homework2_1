import java.util.Random;

public class Robot {
    private final int JUMP_HEIGHT;
    private final int RUN_DISTANCE;
    private boolean continueChamp;
    private int maxRun;
    private int maxJump;

    public Robot() {
        JUMP_HEIGHT = new Random().nextInt(6) + 6;
        RUN_DISTANCE = new Random().nextInt(600) + 400;
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
        return "\nРобот: \nмаксимальная дистанция бега: " + maxRun +
                "\nМаксимальная высота прыжка: " + maxJump +
                "\nЗакончил чемпионат?: " + continueChamp + '\n';
    }

    @Override
    public String toString() {
        return "Робот {" +
                "Высота прыжка = " + JUMP_HEIGHT +
                ", Дистанция бега = " + RUN_DISTANCE +
                '}';
    }
}