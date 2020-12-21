package homework_6;

public class Dog extends Animal implements Swimmable {
    protected int max_length_run = 500;
    protected final double MAX_HEIGHT_JUMP = 0.5;
    protected final int Max_LENGTH_SWIM = 10;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int max_length_run) {
        super(name, max_length_run);
        this.max_length_run = max_length_run;
    }

    @Override
    public void run(int length_run) {
        if ((length_run <= 0) || (length_run > max_length_run)) {
            System.out.println(name + " результат: Run false");
        } else {
            System.out.println(name + " результат: Run true");
        }
    }

    @Override
    void jump(double height_jump) {
        if ((height_jump <= 0) || (height_jump > MAX_HEIGHT_JUMP)) {
            System.out.println(name + " результат: jump false");
        } else {
            System.out.println(name + " результат: jump true");
        }

    }

    @Override
    public void swim(int length_swim) {
        if ((length_swim <= 0) || (length_swim > Max_LENGTH_SWIM)) {
            System.out.println(name + " результат: swim false");
        } else {
            System.out.println(name + " результат: swim true");
        }
    }
}
