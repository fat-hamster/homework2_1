import java.util.ArrayList;
import java.util.Random;

public class Main {
    private Course course;
    private Team team;

    public static void main(String[] args) {
        Main game = new Main();

        game.init();
        game.start();
        game.end();
    }

    private void init() {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        ArrayList<Object> players = new ArrayList<>();
        ArrayList<Object> obstacleCourse = new ArrayList<>();
        players.add(cat);
        players.add(human);
        players.add(robot);
        for (int i = 0; i < 10; i++) {
            Wall wall = new Wall(new Random().nextInt(6) + 1);
            RunningTrack track = new RunningTrack(new Random().nextInt(50) + 50);
            obstacleCourse.add(wall);
            obstacleCourse.add(track);
        }

        team = new Team("StarHamsters", players);
        course = new Course(obstacleCourse);
    }

    private void start() {
        System.out.println("команда " + team.getName() + " начинает прохождение полосы препятствий!");
        System.out.println("Состав команды:");
        for (Object player : team.teammates) {
            System.out.println(player);
        }
        System.out.println();
        course.doIt(team);
    }

    private void end() {
        team.teamResult();
        System.out.println("Мы хорошо провели время! До встречи!");
    }
}
