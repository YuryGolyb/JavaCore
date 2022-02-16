package Lesson1;

/**
 * Created by Golub Yurii
 * Date: 16.02.2022
 */
public class Runner {

    public static void main(String[] args) {

        Team[] team = {
                new Team("Jack Daniels", "USA", 28, 33, 1000),
                new Team("William Lawson", "Scotland", 24, 36, 1100),
                new Team("Jim Beam", "USA", 25, 29, 1050),
                new Team("Johnnie Walker", "Scotland", 27, 34, 1200)
        };

        getAllInfo(team);

        Course runSprint= new Course();
        runSprint.sprint(team,200);

        Course timeRunning= new Course();
        timeRunning.timeRun(team,1000);

    }

    private static void getAllInfo(Team[] team){
        System.out.println("*****************TEAM INFO*****************");
        for (Team value : team) {
            System.out.println(value.getFullInfo());
        }
        System.out.println("*******************************************");
        System.out.println();
    }
}