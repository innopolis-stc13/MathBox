package hw3;

public class Main {

    static Integer[] array = {42, 16, 666, 15, 8, 777, 4, 108, 23};

    public static void main(String[] args) {

        MathBox box = new  MathBox(array);



        System.out.println(box.summator());
        System.out.println(box.splitter(5));
        System.out.println(box.addObject(5));
        System.out.println(box.addObject("Hi!")); //тест исключения

    }

}
