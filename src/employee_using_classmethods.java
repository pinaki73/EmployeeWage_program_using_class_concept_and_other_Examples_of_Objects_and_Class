
public class employee_using_classmethods {

    public int computeEmpwage(String companyname, int wageperhr, int no_of_working_hours, int no_of_working_days)
    {
        int workinghrs= 0; int total_emp_wage;
         int total_working_hours = 0;  int total_working_days = 0;
        while (total_working_hours <= no_of_working_hours && total_working_days < no_of_working_days){
            total_working_days++;
            int empcheck = (int)Math.floor(Math.random() * 10) % 3;
            switch (empcheck){
                case 1:
                    System.out.println("HE IS A FULL TIME EMPLOYEE");
                    workinghrs = 8;
                    break;
                case 2:
                    System.out.println("HE IS A PARTTIME EMPLOYEE");
                    workinghrs = 4;
                    break;
                default:
                    workinghrs = 0;
                    break;
            }
            total_working_hours += workinghrs;
            System.out.println("Total working days ="+total_working_days+ " " +"Working hours ="+workinghrs);
        }
        total_emp_wage = total_working_hours * wageperhr;
        System.out.println("Total employee wage for " +companyname+" "+"is "+total_emp_wage);
        System.out.println("Total working hours for " +companyname+" "+"is "+total_working_hours);
        return total_emp_wage;
    }
    public static void main(String[] args) {
        employee_using_classmethods c1 = new employee_using_classmethods();
        employee_using_classmethods c2 = new employee_using_classmethods();
        c1.computeEmpwage("Reliance", 40, 110, 20);
        System.out.println(c1);
        c2.computeEmpwage("Mahindra", 70, 100, 30);
        System.out.println(c2);
    }
}
