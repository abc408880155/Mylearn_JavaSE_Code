package zemise_03;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }



    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void Jumpping() {
        System.out.println("猫能跳高了");
    }
}
