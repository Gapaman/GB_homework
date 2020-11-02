package homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;


    public Cat(String name, boolean fullness) {
        this.name = name;
        this.fullness = fullness;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;

    }

    @Override
    public String toString() {
        return "Cытость кота "+name+" "+ fullness;
    }

    public void printFullness() {
        System.out.println(this);

    }


    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fullness = true;
            printFullness();
        } else {
            printFullness();
            System.out.println("В тарелке не хватает корма");
        }
    }

    public void eat(Plate plate, int appetite) {
        if (plate.getFood() < appetite) {
            plate.do_Empty_plate();
            fullness = false;
            printFullness();
        } else {
            plate.decreaseFood(appetite);
            fullness = true;
            printFullness();
            System.out.println("В тарелке осталось " + plate.getFood());
        }
    }

}


