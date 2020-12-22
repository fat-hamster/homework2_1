public class RunningTrack {
    private final int RUN_DISTANCE;

    public int getRUN_DISTANCE() {
        return RUN_DISTANCE;
    }

    public RunningTrack(int runDistance) {
        RUN_DISTANCE = runDistance;
    }

    public void runTrack(Object obj) {
        if(obj instanceof Cat) {
            if(!((Cat) obj).isContinueChamp()) {
                return;
            }
            if(((Cat) obj).run(this)) {
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
            if(((Human) obj).run(this)) {
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
            if(((Robot) obj).run(this)) {
                System.out.println("Робот" + passMessage());
            } else {
                System.out.println("Робот" + failMessage());
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
