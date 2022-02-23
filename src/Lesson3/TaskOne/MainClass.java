package Lesson3.TaskOne;

import Lesson3.TaskOne.ChangeArrayElements;

/**
 * Created by Golub Yurii
 * Date: 18.02.2022
 */
public class MainClass {

    public static void main(String[] args){

        ChangeArrayElements<String> testArray= new ChangeArrayElements<String>("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q");

        testArray.printArr();
        testArray.changeArrElement(1,17);//В качестве аргументов передаются номера ячеек массива, которые необходимо поменять местами
    }
}