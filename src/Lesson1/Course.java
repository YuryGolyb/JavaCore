package Lesson1;

/**
 * Created by Golub Yurii
 * Date: 16.02.2022
 */
public class Course {
    
    protected  void sprint(Team[] team,int runDistance){
        System.out.println("*****************SPRINT********************");
        for (Team value : team) {
            if (runDistance > (value.getMaxRunningDistance())) {
                System.out.println("Sorry, " + value.getName() + " max run " + value.getMaxRunningDistance() + " meters");
            } else {
                System.out.println(value.getName() + " ran " + runDistance + " meters");
            }
        }
        System.out.println("*******************************************");
        System.out.println();
    }

    protected void timeRun(Team[] team,int runDistance){

        System.out.println("*****************TIME RUN******************");

        for (Team value : team) {
            if (runDistance > (value.getMaxRunningDistance())) {
                System.out.println("Sorry, " + value.getName() + " max run " + value.getMaxRunningDistance() + " meters");
            } else {
                System.out.println(value.getName() + " ran " + runDistance + " meters in " + runDistance / value.getRunningSpeed() + " minutes");
            }
        }
        int min = runDistance / team[0].getRunningSpeed();

        for (int x = 1; x < team.length; x++) {
            if(runDistance / team[x].getRunningSpeed()<min)
                min = runDistance / team[x].getRunningSpeed();
        }
        System.out.println();
        System.out.println("***************THE BEST TIME***************");
        System.out.println("The best time is "+min+ " minutes");
    }
}