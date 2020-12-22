import java.util.ArrayList;

public class Team {
    private final String name;
    protected ArrayList<Object> teammates;

    public String getName() {
        return name;
    }

    public Team(String name, ArrayList<Object> teammates) {
        this.name = name;
        this.teammates = teammates;
    }

    public void teamResult() {
        StringBuilder sb = new StringBuilder();
        System.out.println("\nРезультаты команды:");
        for (Object teammate : teammates) {
            if(teammate instanceof Cat) {
                sb.append(((Cat) teammate).info());
            }
            if(teammate instanceof Human) {
                sb.append(((Human) teammate).info());
            }
            if(teammate instanceof Robot) {
                sb.append(((Robot) teammate).info());
            }
        }
        System.out.println(sb);
    }
}
