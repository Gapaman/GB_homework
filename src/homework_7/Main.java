package homework_7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик ", 110, false);
        Cat cat2 = new Cat("Мурзик", 30, false);
        Cat cat3 = new Cat("Васька", false);// котик , который съедает до 0;
        Plate plate = new Plate(100);
        cat.eat(plate);
        plate.printInfo();
        plate.addFood();
        cat2.eat(plate);
        plate.printInfo();
        cat3.eat(plate, 500);
        createCats();


    }

    public static void createCats() {
        System.out.println();
        Cat cats[] = {
                new Cat("Жора", 30, false),
                new Cat("Бетмэн", 20, false),
                new Cat("Роббин", 20, false),
                new Cat("Чарли", 5, false),
                new Cat("Пушистик", 5, false)
        };
        Plate plate1 = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate1);
        }
    }

}
