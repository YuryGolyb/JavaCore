package Lesson1;

/**
 * Created by Golub Yurii
 * Date: 16.02.2022
 */
public class Team {

    private String name;
    private String country;

    private int age;
    private int maxRunningDistance;
    private int runningSpeed;

    protected Team(String name, String country, int age, int runningSpeed, int maxRunningDistance) {

        this.name = name;
        this.country = country;
        this.age = age;
        this.runningSpeed = runningSpeed;
        this.maxRunningDistance = maxRunningDistance;
    }

    protected String getFullInfo() {
        return
                this.name + "," +
                        this.country + "," +
                        "AGE-" + this.age + "," +
                        "SPEED-" + this.runningSpeed + "," +
                        "MAX DISTANCE-" + this.maxRunningDistance;
    }

    String getName() {
        return this.name;
    }

    int getMaxRunningDistance() {
        return this.maxRunningDistance;
    }

    int getRunningSpeed() {
        return this.runningSpeed;
    }
}