package Lesson3.TaskTwo;


import java.util.ArrayList;


/**
 * Created by Golub Yurii
 * Date: 21.02.2022
 */
public class Runner {

    public static void main(String[] args) {

        Apple apple1=new Apple(1.0f);
        Apple apple2=new Apple(1.3f);
        Apple apple3=new Apple(1.2f);

        ArrayList<Apple> apples= new ArrayList<>();

        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        Box<Apple> appleBox= new Box<>(apples);

        Apple apple4=new Apple(1.0f);
        Apple apple5=new Apple(1.3f);
        Apple apple6=new Apple(1.2f);
        Apple apple7=new Apple(1.4f);

        ArrayList<Apple> apples2= new ArrayList<>();

        apples2.add(apple4);
        apples2.add(apple5);
        apples2.add(apple6);
        apples2.add(apple7);

        Box<Apple> appleBox2= new Box<>(apples2);

        Orange orange1=new Orange(1.6f);
        Orange orange2=new Orange(1.8f);
        Orange orange3=new Orange(1.5f);


        ArrayList<Orange> oranges= new ArrayList<>();

        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);

        Box<Orange> orangeBox= new Box<>(oranges);

        Orange orange4=new Orange(1.3f);
        Orange orange5=new Orange(1.0f);



        ArrayList<Orange> oranges2= new ArrayList<>();

        oranges2.add(orange4);
        oranges2.add(orange5);

        Box<Orange> orangeBox2= new Box<>(oranges2);



        System.out.println(appleBox.getWeightBox());
        System.out.println(appleBox2.getWeightBox());
        System.out.println("**********");

        System.out.println(appleBox.compareBoxes(appleBox2));
        System.out.println("**********");

        appleBox.moveBetweenBoxes(appleBox2);
        System.out.println("**********");

        System.out.println(orangeBox.getWeightBox());
        System.out.println(orangeBox2.getWeightBox());
        System.out.println("**********");

        orangeBox2.moveBetweenBoxes(orangeBox);
        System.out.println("**********");

        System.out.println(orangeBox.compareBoxes(appleBox));


    }
}