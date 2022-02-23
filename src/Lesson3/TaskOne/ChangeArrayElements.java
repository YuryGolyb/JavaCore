package Lesson3.TaskOne;

import java.sql.SQLOutput;

/**
 * Created by Golub Yurii
 * Date: 18.02.2022
 */
public class ChangeArrayElements <T extends String>{

    private T[] str;

    public ChangeArrayElements(T... str){
        this.str=str;
    }

    public void printArr(){
        System.out.println("***********PRINT ARRAY************");
        for (int i = 0; i < str.length ; i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        System.out.println("**********************************");
    }

    public  void changeArrElement(int a,int b){
        System.out.println("*******CHANGE ARRAY ELEMENTS******");
        if(a> str.length||b> str.length){
            System.out.println("Sorry, max value 'a', 'b' is - " +str.length+"!");
        }else if(a==b){
            System.out.println("Sorry, it doesn't make sense!");
        }
        else{
            T x=str[a-1];
            T y=str[b-1];
            for (int i = 0; i < str.length ; i++) {
                str[a-1]=y;
                str[b-1]=x;
                System.out.print(str[i]+" ");
            }
            System.out.println();
        }
        System.out.println("**********************************");
    }
}