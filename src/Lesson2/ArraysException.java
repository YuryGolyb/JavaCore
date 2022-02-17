package Lesson2;


/**
 * Created by Golub Yurii
 * Date: 16.02.2022
 */
public class ArraysException {

    public static void main(String[] args){

        ArraysException arr = new ArraysException();

            String [][] array = {
                    {"1","1","1","1"},{"1","1","1","1"}, {"1","u","1","1"},{"1","1","1","1"}
            };

            String [][] arrayTwo={
                    {"1","1"},{"1","1"}
            };

        try {
            arr.checkArraySize(array);
//            arr.checkArraySize(arrayTwo);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        System.out.println("****************************");

        try {
            System.out.println(sumArraysElement(array));
//            System.out.println(sumArraysElement(arrayTwo));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public void checkArraySize(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" + " строке", i+1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


     public static int sumArraysElement(String[][] arr) throws MyArrayDataException{

        int sum=0;

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               try {
                    sum+=Integer.parseInt(arr[i][j]);
                }catch(NumberFormatException e){
                    throw new MyArrayDataException(i+1,j+1);
                }
            }
         }
        return sum;
    }
}