public class Team {
    private final String name;
    Object[] teammates;

    public String getName() {
        return name;
    }

    public Team(String name, Object[] teammates) {
        this.name = name;
        this.teammates = teammates;
    }
}
