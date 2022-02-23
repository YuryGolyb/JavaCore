package Lesson3.TaskTwo;


import java.util.ArrayList;

/**
 * Created by Golub Yurii
 * Date: 18.02.2022
 */
public class Box<T extends Fruit>{



    ArrayList<T> fruitBox;

    public Box (ArrayList<T> fruitBox){
        this.fruitBox=fruitBox;
    }


    public ArrayList<T> getFruitBox(){
        return fruitBox;
    }

    public Float getWeightBox(){
        Float sum = 0.0f;
        for(T t: getFruitBox()){
            if(t!=null) {
                Float value = t.getWeight();
                sum = sum + value;
            }
        }
        return sum;
    }

    public Boolean compareBoxes(Box<? extends Fruit> e){
       return this.getWeightBox().floatValue() == e.getWeightBox().floatValue();
    }

    public void moveBetweenBoxes(Box<T> e) {

        for (int i = 0; i < e.getFruitBox().size(); i++) {
            this.getFruitBox().add(e.getFruitBox().get(i));
        }
        e.getFruitBox().clear();
        System.out.println(this.getWeightBox() + ", " + e.getWeightBox());
    }
}