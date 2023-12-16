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

//SalariedEmployee empl new SalariedEmployee();

ExecutiveEmployee emp1=new ExecutiveEmployee();

emp.insert();

emp.input();

emp.weeklySalary(); 
emp1.insert1();

emp1.Empmonthlysalary();

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
System.out.println("\n\nThe id of the employee " + employeeId);
System.out.println("The name of the employee   " + employeeName);

System.out.println("The designation of the employee " + designation);
}
}
class HourlyEmployee extends Employee
{
double hourlyRate; int hoursworked;

double weeklysal;

double bonus;

void input()
{

System.out.println("Enter the compensation per hour of the employee");

hourlyRate=sc.nextDouble();

System.out.println("Enter the total hours worked in a wisek by the employee");

hoursworked=sc.nextInt();

}
void weeklySalary()
{
weeklysal=hourlyRate*hoursworked; 
calculateBonus(weeklysal); 
}
public void calculateBonus(double weeklysal)
{
super.calculateBonus();
bonus=(weeklysal*0.05)*weeklysal;
}

public void display()
{
super.display();

System.out.println("The compensation per hour of the employee " + hourlyRate);
System.out.println("The total hours worked in a week by the employee " + hoursworked);
System.out.println("The weekly salary of the employee is" + weeklysal); 
System.out.println("The total salary(with bonus) of the employee is " + bonus);

System.out.println("The total salary (with bonus) of the employee is  "  + bonus);
}
}

class SalariedEmployee extends Employee
{
double monthlysal;

double EmpmonthlySal;

double bonus;

double insert1()
{
System.out.println("Enter the fixed monthly compensation");

monthlysal=sc.nextDouble();

return monthlysal;
}
void Empmonthlysalary()
{
EmpmonthlySal=monthlysal/4;

calculateBonus(EmpmonthlySal);

}

public void calculateBonus(double EmpmonthlySal)
{
bonus=(EmpmonthlySal*0.10)+EmpmonthlySal;
}
public void display()
{
System.out.println("The fixed monthly compensation of the employee " + monthlysal);
System.out.println("The monthly salary of the employee is          " + EmpmonthlySal);

System.out.println("the monthly salary(with bonus) of the employee is " + bonus);
}
}
class ExecutiveEmployee extends SalariedEmployee
{
double bonusPercentage;

double Annualsal; 
double bonus;

public void calculateBonus(double EmpmonthlySal)
{
super.calculateBonus (EmpmonthlySal);

Annualsal = (EmpmonthlySal*12.00); 
bonusPercentage=0.05*Annualsal;

bonus=bonusPercentage+Annualsal;
}
public void display()
{
super.display();

System.out.println("The annual salary(with bonus) of the employee is " + bonus);
}
}