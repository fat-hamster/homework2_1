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
                for (Object player : team.teammates) {
                    if(player instanceof Cat) {
                        if(!((Cat) player).isContinueChamp()) {
                            continue;
                        }
                        if (((Cat) player).jump((Wall) course)) {
                            System.out.println("Кот" + passMessage());
                        } else {
                            System.out.println("Кот" + failMessage());
                        }
                        continue;
                    }
                    if(player instanceof Human) {
                        if(!((Human) player).isContinueChamp()) {
                            continue;
                        }
                        if (((Human) player).jump((Wall) course)) {
                            System.out.println("Человек" + passMessage());
                        } else {
                            System.out.println("Человек" + failMessage());
                        }
                        continue;
                    }
                    if(player instanceof Robot) {
                        if(!((Robot) player).isContinueChamp()) {
                            continue;
                        }
                        if (((Robot) player).jump((Wall) course)) {
                            System.out.println("Робот" + passMessage());
                        } else {
                            System.out.println("Робот" + failMessage());
                        }
                    }
                }
            } else {
                System.out.println();
                System.out.println((course));
                for (Object player : team.teammates) {
                    //((RunningTrack) course).runTrack(player);
                    if(player instanceof Cat) {
                        if(!((Cat) player).isContinueChamp()) {
                            continue;
                        }
                        if(((Cat) player).run((RunningTrack) course)) {
                            System.out.println("Кот" + passMessage());
                        } else {
                            System.out.println("Кот" + failMessage());
                        }
                        continue;
                    }
                    if(player instanceof Human) {
                        if(!((Human) player).isContinueChamp()) {
                            continue;
                        }
                        if(((Human) player).run((RunningTrack) course)) {
                            System.out.println("Человек" + passMessage());
                        } else {
                            System.out.println("Человек" + failMessage());
                        }
                        continue;
                    }
                    if(player instanceof Robot) {
                        if(!((Robot) player).isContinueChamp()) {
                            continue;
                        }
                        if(((Robot) player).run((RunningTrack) course)) {
                            System.out.println("Робот" + passMessage());
                        } else {
                            System.out.println("Робот" + failMessage());
                        }
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
