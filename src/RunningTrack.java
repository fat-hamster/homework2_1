public class RunningTrack {
    private final int RUN_DISTANCE;

    public RunningTrack(int runDistance) {
        RUN_DISTANCE = runDistance;
    }

    public void runTrack(Object obj) {
        if(obj instanceof Cat) {
            if(!((Cat) obj).isContinueChamp()) {
                return;
            }
            if(RUN_DISTANCE <= ((Cat) obj).getRUN_DISTANCE()) {
                System.out.println("Кот" + passMessage());
            } else {
                System.out.println("Кот" + failMessage());
                ((Cat) obj).setContinueChamp(false);
            }
            return;
        }
        if(obj instanceof Human) {
            if(!((Human) obj).isContinueChamp()) {
                return;
            }
            if(RUN_DISTANCE <= ((Human) obj).getRUN_DISTANCE()) {
                System.out.println("Человек" + passMessage());
            } else {
                System.out.println("Человек" + failMessage());
                ((Human) obj).setContinueChamp(false);
            }
            return;
        }
        if(obj instanceof Robot) {
            if(!((Robot) obj).isContinueChamp()) {
                return;
            }
            if(RUN_DISTANCE <= ((Robot) obj).getRUN_DISTANCE()) {
                System.out.println("Робот" + passMessage());
            } else {
                System.out.println("Робот" + failMessage());
                ((Robot) obj).setContinueChamp(false);
            }
        }
    }

    private String passMessage() {
        return " пробежал дистанцию";
    }

    private String failMessage() {
        return " не пробежал дистанцию и выбывает";
    }

    @Override
    public String toString() {
        return "Бег, дистанция " + RUN_DISTANCE + " м";
    }
}
