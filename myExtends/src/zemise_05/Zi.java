package zemise_05;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi中method方法被调用");
    }

    public void show(){
        super.show();
        System.out.println("Zi中的show()方法被调用");
    }
}
