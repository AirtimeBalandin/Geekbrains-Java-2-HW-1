public class Cycle extends Obstacle {
    private int distance;
    public Cycle(int distance){
        this.distance = distance;
    }
    @Override
    public void doIt(Participants participants){
        participants.cycle(distance);
    }
}