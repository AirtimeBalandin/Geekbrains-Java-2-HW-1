public class Team {
    /*
    Добавить класс Team, который будет содержать: название команды,
     массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
      метод для вывода информации о членах команды прошедших дистанцию,
       метод вывода информации обо всех членах команды.
     */
    String teamName;
    Participants[] teamMembers = new Participants[4];

    public Team(String teamName, Participants[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public Participants[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for (Participants c:teamMembers){
            c.showResult();
        }
    }
    public void showMembersFinished(){
        for (Participants c:teamMembers){
            if (c.inProgress())
                c.showResult();
        }
    }

}
