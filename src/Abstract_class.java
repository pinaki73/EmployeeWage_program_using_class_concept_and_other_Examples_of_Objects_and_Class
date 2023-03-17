
abstract class ANIMALS {
    public void eat(){
        System.out.println("the animal can eat");
    }
    class Dog extends ANIMALS {
        public void eat(){
            System.out.println("the animal can eat");
        }
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.eat();
    }

}
