interface animal{
    abstract void breathe();
    abstract void eat();
    abstract void sleep();
}
class Dogs implements animal{

    @Override
    public void breathe() {
        System.out.println("The dog is breathing");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("The dog is sleeping");
    }
}
public class Interface{
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.eat();
        d1.breathe();
        d1.sleep();
    }
}