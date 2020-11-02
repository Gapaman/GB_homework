package homework_7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {

        this.food = food;
    }

    public void printInfo() {

        System.out.println(" в тарелке осталось  " + food + " корма ");

    }

    public void addFood() {

        int add_food = (int) (Math.random() * 100) + 1;
        this.food += add_food;
        System.out.println("добавляем корма " + add_food + "." + " В тарелке стало " + food);
    }

    public void decreaseFood(int appetite) {
        food -= appetite;

    }
    public void do_Empty_plate(){
        food=0;
        System.out.println("Миска пуста. Кот съел все");
    }
}