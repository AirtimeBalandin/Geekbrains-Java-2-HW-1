public class Swim extends Obstacle {
    private int distance;
    public Swim(int distance){
        this.distance = distance;
    }
    @Override
    public void doIt(Participants participants){
        participants.swim(distance);
    }
}
