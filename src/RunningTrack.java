public class RunningTrack {
    private final int RUN_DISTANCE;

    public int getRUN_DISTANCE() {
        return RUN_DISTANCE;
    }

    public RunningTrack(int runDistance) {
        RUN_DISTANCE = runDistance;
    }

    @Override
    public String toString() {
        return "Бег, дистанция " + RUN_DISTANCE + " м";
    }
}
