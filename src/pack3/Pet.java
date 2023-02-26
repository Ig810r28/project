package pack3;

public class Pet extends Animal {
    public Pet() {
        super();
        System.out.println("I am pet");
    }

    int eyes = 2;
    String name;
    int tail = 1;
    int paw = 4;

    void run(){
        System.out.println("Pet runs");
    }

    void jump(){
        System.out.println("Pet jump");
    }
}
