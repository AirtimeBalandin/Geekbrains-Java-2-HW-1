public class Run extends Obstacle{
    private int distance;
    public Run(int distance){
        this.distance = distance;
    }
    @Override
    public void doIt(Participants participants){
        participants.run(distance);
    }
}
