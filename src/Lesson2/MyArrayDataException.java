package Lesson2;

/**
 * Created by Golub Yurii
 * Date: 16.02.2022
 */
public class MyArrayDataException extends Exception{

    MyArrayDataException(int row, int col) {
        super(String.format("Некоректные данные в ячейке - %d строка, %d столбец",row,col));
    }
}