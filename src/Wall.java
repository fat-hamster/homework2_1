public class Wall {
    private final int WALL_HEIGHT;

    public int getWALL_HEIGHT() {
        return WALL_HEIGHT;
    }

    public Wall(int wallHeight) {
        WALL_HEIGHT = wallHeight;
    }

    public void jumpWall(Object obj) {
        if(obj instanceof Cat) {
            if(!((Cat) obj).isContinueChamp()) {
                return;
            }
            if (((Cat) obj).jump(this)) {
                System.out.println("Кот" + passMessage());
            } else {
                System.out.println("Кот" + failMessage());
            }
            return;
        }
        if(obj instanceof Human) {
            if(!((Human) obj).isContinueChamp()) {
                return;
            }
            if (((Human) obj).jump(this)) {
                System.out.println("Человек" + passMessage());
            } else {
                System.out.println("Человек" + failMessage());
            }
            return;
        }
        if(obj instanceof Robot) {
            if(!((Robot) obj).isContinueChamp()) {
                return;
            }
            if (((Robot) obj).jump(this)) {
                System.out.println("Робот" + passMessage());
            } else {
                System.out.println("Робот" + failMessage());
            }
            return;
        }
    }

    private String passMessage() {
        return " перепрыгнул стену";
    }

    private String failMessage() {
        return " не перепрыгнул стену и выбывает";
    }

    @Override
    public String toString() {
        return "Стена высотой " + WALL_HEIGHT + " м";
    }
}
