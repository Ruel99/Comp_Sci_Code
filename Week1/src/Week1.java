import java.util.Scanner;

public class Week1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your quantity");

        int quantity = sc.nextInt();

        if(quantity < 100){
            System.out.println("No Discount");
        }else if(quantity >= 100 && quantity <= 120){
            System.out.println("you get 10%");
        }else{
            System.out.println("You get 15%");
        }//end of if else statement

        /*
        int num1;
        int num2;
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter your first number");
            num1 = sc.nextInt();

            System.out.println("Please enter your second number");
            num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of  the two numbers are: " + sum);
   */
    }//end of main
}//end of class
