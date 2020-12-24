import java.util.ArrayList;

public class Course {
    private final ArrayList<Object> courses;

    public Course(ArrayList<Object> courses) {
        this.courses = courses;
    }

    public void doIt(Team team) {
        for (Object course : courses) {
            if(course instanceof Wall) {
                System.out.println();
                System.out.println((course));

                for (Players player : team.teammates) {
                    if(!player.isContinueChamp()) {
                        continue;
                    }
                    if (player.jump((Wall) course)) {
                        System.out.println(player.getName() + passMessage());
                    } else {
                        System.out.println(player.getName() + failMessage());
                    }
                }
            } else {
                System.out.println();
                System.out.println((course));
                for (Players player : team.teammates) {
                    if(!player.isContinueChamp()) {
                        continue;
                    }
                    if(player.run((RunningTrack) course)) {
                        System.out.println(player.getName() + passMessage());
                    } else {
                        System.out.println(player.getName() + failMessage());
                    }
                }
            }
        }
    }

    private String passMessage() {
        return " справился";
    }

    private String failMessage() {
        return " не справился и выбывает";
    }
}
