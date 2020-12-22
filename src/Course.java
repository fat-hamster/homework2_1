import java.util.ArrayList;

public class Course {
    private final ArrayList<Object> courses;

    public Course(ArrayList<Object> courses) {
        this.courses = courses;
    }

    public void doIt(Team team) {
        for (Object course : courses) {
            if(course instanceof Wall) {
                System.out.println(((Wall) course));
                for (Object player : team.teammates) {
                    ((Wall) course).jumpWall(player);
                }
            } else {
                System.out.println(((RunningTrack) course));
                for (Object player : team.teammates) {
                    ((RunningTrack) course).runTrack(player);
                }
            }
        }
    }
}
