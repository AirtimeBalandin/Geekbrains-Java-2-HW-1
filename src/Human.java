public abstract class Human implements Participants{
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    int maxCycleDistance;
    boolean onDistance;

    public boolean inProgress(){
        return onDistance;
    }

    public Human(String name, int maxRunDistance, int maxSwimDistance, int maxCycleDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance =maxSwimDistance;
        this.maxCycleDistance = maxCycleDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " успешно справился с кросс");
        } else {
            System.out.println(name + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <=maxSwimDistance){
            System.out.println(name + " успешно проплыл");
        } else {
            System.out.println(name + " не смог доплыть до берега");
            onDistance = false;
        }
    }

    public void cycle(int distance) {
        if (distance <= maxCycleDistance) {
            System.out.println(name + " успешно завершил триатлон");
        } else {
            System.out.println(name + " не смог закончить триатлон");
            onDistance = false;
        }
    }
    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }
}
