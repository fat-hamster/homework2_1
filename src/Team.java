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
}
