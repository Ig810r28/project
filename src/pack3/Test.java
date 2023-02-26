package pack3;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
//    animal.eat();
//    animal.drink();

        Pet pet = new Pet();
//    System.out.println(pet.eyes);
//    System.out.println(pet.tail);
//    System.out.println(pet.paw);
//    pet.run();
//    pet.jump();

        Dog dog = new Dog("Kit-Kat");
    dog.play();

        Cat cat = new Cat("Viskas");
    cat.sleep();

        System.out.println(dog.paw);
        cat.sleep();




    }

}
