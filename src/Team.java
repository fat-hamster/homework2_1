import java.util.ArrayList;

public class Team {
    private final String name;
    protected ArrayList<Players> teammates;

    public String getName() {
        return name;
    }

    public Team(String name, ArrayList<Players> teammates) {
        this.name = name;
        this.teammates = teammates;
    }

    public void teamResult() {
        StringBuilder sb = new StringBuilder();
        System.out.println("\nРезультаты команды:");
        for (Players teammate : teammates) {
            sb.append(teammate.info());
        }
        System.out.println(sb);
    }
}
