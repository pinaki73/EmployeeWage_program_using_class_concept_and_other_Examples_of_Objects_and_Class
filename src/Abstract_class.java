
abstract class ANIMALS {
    public boolean eat(){
        System.out.println("the animal can eat");
        return false;
    }
    class Dog extends ANIMALS {
        public boolean eat(){
            System.out.println("the animal can eat");
            return false;
        }
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.eat();
    }

}
