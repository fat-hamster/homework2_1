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
            if (WALL_HEIGHT <= ((Cat) obj).getJUMP_DISTANCE() && ((Cat) obj).isContinueChamp()) {
                System.out.println("Кот" + passMessage());
            } else {
                System.out.println("Кот" + failMessage());
                ((Cat) obj).setContinueChamp(false);
            }
            return;
        }
        if(obj instanceof Human) {
            if (WALL_HEIGHT <= ((Human) obj).getJUMP_DISTANCE() && ((Human) obj).isContinueChamp()) {
                System.out.println("Человек" + passMessage());
            } else {
                System.out.println("Человек" + failMessage());
                ((Human) obj).setContinueChamp(false);
            }
            return;
        }
        if(obj instanceof Robot) {
            if (WALL_HEIGHT <= ((Robot) obj).getJUMP_DISTANCE() && ((Robot) obj).isContinueChamp()) {
                System.out.println("Робот" + passMessage());
            } else {
                System.out.println("Робот" + failMessage());
                ((Robot) obj).setContinueChamp(false);
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
}
