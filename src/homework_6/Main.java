package homework_6;

public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Бобик");
        Dog secondDog = new Dog("Лаки", 700);
        Cat firstCat = new Cat("Барсик");
        Cat secondCat = new Cat("Бэтмен");
        firstDog.run(400);
        secondDog.run(600);
        firstDog.jump(1);
        secondDog.jump(0.4);
        firstDog.swim(9);
        secondDog.swim(11);
        firstCat.run(300);
        secondCat.run(150);
        firstCat.jump(4);
        secondCat.jump(2);

    }
}
