package homework_6;

public abstract class Animal {
    protected String name;
    protected int max_length_run;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int max_length_run) {
        this.name = name;
        this.max_length_run = max_length_run;
    }

    abstract void run(int length_run);


    abstract void jump(double height_jump);


}
