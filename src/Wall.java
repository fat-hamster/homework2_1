public class Wall {
    private final int WALL_HEIGHT;

    public int getWALL_HEIGHT() {
        return WALL_HEIGHT;
    }

    public Wall(int wallHeight) {
        WALL_HEIGHT = wallHeight;
    }

    @Override
    public String toString() {
        return "Стена высотой " + WALL_HEIGHT + " м";
    }
}
