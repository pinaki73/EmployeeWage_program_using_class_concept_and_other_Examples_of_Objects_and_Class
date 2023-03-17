public class Overloading {
    static void display(int a){
        System.out.println("the value is"+a);
    }
    static void display(int a, int b){
        System.out.println("the value are"+a+ " "+b);
    }
    public static void main(String[] args) {
        display(1);
        display(1,4);
        Language l1 = new Language();
        Language l2 = new Language("something");
        l1.getLanguage();
        l2.getLanguage();
    }
}
class Language{
    String language;
    Language() {
        this.language = "english";
    }
        Language(String f){
            this.language = "hindi";
        }
        public void getLanguage() {
            System.out.println(language);
    }
}
