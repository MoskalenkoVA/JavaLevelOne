package Lesson6;

import java.util.Random;

public class Main {
    Random random = new Random();
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");

        cat1.run(100);
        cat1.swim(5);
        cat1.jump(2);

        Cat cat2 = new Cat("Мурзик");
        cat2.run(5);
        cat2.swim(4);
        cat2.jump(2);

        Dog dog1 = new Dog("Рекс");
        dog1.run(6.6);
        dog1.swim(11);
        dog1.jump(5);

    }
}
