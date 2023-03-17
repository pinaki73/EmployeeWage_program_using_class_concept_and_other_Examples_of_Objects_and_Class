class Employee{
    int workinghrs = 0;
    int wageperhr = 100;
    int empwage = 0;
    int total_wage = 0;
    int days_in_a_month = 20;

}

public class employeewage {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        for (int i = 0; i <e1.days_in_a_month; i++) {
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case 1:
                    System.out.println("He is a fulltime employee");
                    e1.workinghrs = 8;
                    break;
                case 2:
                    System.out.println("He is a parttime employee");
                    e1.workinghrs = 4;
                    break;
                default:
                    e1.workinghrs = 0;
                    break;
            }
            e1.empwage = e1.workinghrs * e1.wageperhr;
            System.out.println(" ");
            System.out.println("The wage of the employee is = "+e1.empwage);
            e1.total_wage += e1.empwage;
            System.out.println(" The total employee wage for a month is = " + e1.total_wage );
        }
    }
}
