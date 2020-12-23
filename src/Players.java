public interface Players {
    boolean isContinueChamp();
    boolean run(RunningTrack track);
    boolean jump(Wall wall);
    String info();

    default String getName() {
        return this.getClass().toString().substring(this.getClass().toString().indexOf(' '));
    }
}
