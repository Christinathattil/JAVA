import java.util.Scanner;

public class Employee
{
    Scanner sc=new Scanner(System.in);
    int employeeId;
    String employeeName;
    String designation;
    
    public static void main(String[] args)
    {
        HourlyEmployee emp=new HourlyEmployee();
        //SalariedEmployee emp1 = new SalariedEmployee();
        ExecutiveEmployee emp1=new ExecutiveEmployee();
        
        emp.insert();
        emp.input();
        emp.weeklySalary();
        emp1.insert1();
        emp1.EmpmonthlySalary();    
        emp1.calculateBonus();
        emp.display();
        emp1.display();    
    }


    public void insert()
    {
        System.out.println("Enter the id of the employee");
        employeeId=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the name of the employee");
        employeeName=sc.nextLine();
        
        System.out.println("Enter the designation of the employee");
        designation=sc.nextLine();
    }

    public double calculateBonus()
    {
        return 0;
    }
 
    void display()
    {
        System.out.println("\n\nThe id of the employee                              " + employeeId);
        System.out.println("The name of the employee                            " + employeeName);
        System.out.println("The designation of the employee                     " + designation);
               
    }
}

class HourlyEmployee extends Employee
{           
    double hourlyRate;
    int hoursWorked;
    double weeklySal;
    double bonus;
    
    void input()
    {
        System.out.println("Enter the compensation per hour of the employee");
        hourlyRate=sc.nextDouble();
    
        System.out.println("Enter the total hours worked in a week by the employee");
        hoursWorked = sc.nextInt();
    }
    
    void weeklySalary()
    {
        weeklySal=hourlyRate*hoursWorked;
        calculateBonus(weeklySal);
    }

    public void calculateBonus(double weeklySal)
    {
        super.calculateBonus();
        bonus=(weeklySal*0.05)+weeklySal;
    }

    public void display()
    {
        super.display();
        System.out.println("The compensation per hour of the employee           " + hourlyRate);
        System.out.println("The total hours worked in a week by the employee    " + hoursWorked);
        System.out.println("The weekly salary of the employee is                " + weeklySal);
        System.out.println("The total salary(with bonus) of the employee is     " + bonus);
    }

}

class SalariedEmployee extends Employee
{
    double monthlySal;
    double EmpmonthlySal;
    double bonus;
    
    double insert1()
    {
        System.out.println("Enter the fixed monthly compensation");
        monthlySal=sc.nextDouble();
        return monthlySal;
    }
    
    void EmpmonthlySalary()
    {
        EmpmonthlySal=monthlySal/4;
        calculateBonus(EmpmonthlySal);
    }

    public void calculateBonus(double EmpmonthlySal)
    {
        bonus=(EmpmonthlySal*0.10)+EmpmonthlySal;
    }

    public void display()
    {
        System.out.println("The fixed monthly compensation of the employee      " + monthlySal);
        System.out.println("The monthly salary of the employee is               " + EmpmonthlySal);
        System.out.println("The monthly salary(with bonus) of the employee is   " + bonus);
    }
}

class ExecutiveEmployee extends SalariedEmployee
{
    double bonusPercentage;
    double AnnualSal;
    double bonus;
    public void calculateBonus(double EmpmonthlySal)
    {
        super.calculateBonus(EmpmonthlySal);
        AnnualSal=(EmpmonthlySal * 12.00);
        bonusPercentage=0.05*AnnualSal;   
        bonus=bonusPercentage+AnnualSal;
    }

    public void display()
    {
        super.display();
        System.out.println("The annual salary(with bonus) of the employee is    " + bonus);
    }
}