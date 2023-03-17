class Animal{
    public void eat(){
        System.out.println("The animal can eat");
    }
    public void sleep(){
        System.out.println("The animal can sleep");
    }
    public void breathe(){
        System.out.println("The animal can breathe");
    }
    public void movement(){
        System.out.println("The animal can move");
    }
}
class Dog extends ANIMALS {
    String breed = "Dog";
    public void movement(){
        System.out.println("The dog can run");
    }
}
class Doberman extends Dog{
    String breed = "Doberman";

   public void movement(){
       System.out.println("The doberman can run");
       super.movement();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Doberman c1 = new Doberman();
        d1.eat();
        d1.breed = "doberman";
        d1.movement();
        c1.movement();
    }
}