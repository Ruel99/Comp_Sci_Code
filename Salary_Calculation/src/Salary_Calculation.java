import java.util.Scanner;
public class Salary_Calculation {
    public static void main (String args[]) {
        String name;
        int hours;
        float pay, salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates your salary, please enter the following information.");

        System.out.println("Please enter your name");
        name = sc.next();

        System.out.println("Please enter your Hours worked");
        hours = sc.nextInt();

        System.out.println("Please enter your Pay Rate");
        pay = sc.nextFloat();

        salary = pay * hours;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: " + pay);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Salary: $" + salary);
    }
}//end of class
