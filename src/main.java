public class main {
    /*
     2. Добавить класс Team, который будет содержать: название команды,
     массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
      метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
      3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
       метод который будет просить команду пройти всю полосу;
      */
    public static void main(String[] args) {
        Obstacle[] obstacles = {new Run(5), new Swim(3), new Cycle(10)};
        Course course = new Course(obstacles); // Создаем полосу препятствий
        Participants[] participants = {new FrenchAthlete("Leo"), new BritishAthlete("John"), new GermanAthlete("Franz"), new RussianAthlete("Ivan")};

        Team team = new Team("Winners", participants ); // Создаем команду
        course.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

        System.out.println("===created new team===");
        System.out.println(team.getTeamName());

        System.out.println("===Greeting team members===");
        team.showResults();

        System.out.println("===team goes to course===");
        course.doIt(team);

        System.out.println("===show team Results===");
        team.showResults();

        System.out.println("===team members finished course===");
        team.showMembersFinished();

    }

}
