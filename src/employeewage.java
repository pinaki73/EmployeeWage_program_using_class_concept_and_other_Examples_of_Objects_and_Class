class Employee {
    int workinghrs = 0;
    int wageperhr = 100;
    int empwage = 0;
    int total_wage = 0;
    int no_of_working_days = 20;
    public void empwage() {
        empwage = workinghrs * wageperhr;
        System.out.println("The empwage is = " + empwage);
    }

    public void totalwage() {
        total_wage += empwage;
        System.out.println("The total wage for a month is " + total_wage);
    }
}


public class employeewage {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        for (int i = 0; i <= e1.no_of_working_days; i++) {
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
            e1.empwage();
            e1.totalwage();
        }
    }
}

