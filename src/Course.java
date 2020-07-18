public class Course {
    Obstacle[] obstacle;

    public Course(Obstacle[] obstacles){
        this.obstacle = obstacles;
    }

    public void doIt(Team team){
        Participants[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Participants c: teamMembers){
                for (Obstacle o: obstacle){
                    o.doIt(c);
                    if (!c.inProgress()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
