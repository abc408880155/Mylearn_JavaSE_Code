package zemise_06;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }

    public void lookDoor(){
        System.out.println("狗狗会看门");
    }
}
