package homework_6;

public class Cat extends Animal {
    protected final int MAX_LENGTH_RUN = 200;
    protected final double MAX_HEIGHT_JUMP = 2;


    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int length_run) {
        if ((length_run <= 0) || (length_run >= MAX_LENGTH_RUN)) {
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


}
