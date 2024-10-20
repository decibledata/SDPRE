import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5;
    int sum = num1 + num2 + num3;
    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3;
    double dubsum = dub1 + dub2 + dub3;

    System.out.println("Please enter the first whole number you would like to add.");
    int intInput = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    int intInput2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    int intInput3 = keyboard.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    double doubleInput = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    double doubleInput2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    double doubleInput3 = keyboard.nextDouble();
    System.out.println("The sum of " + num1 + "+" + num2 + "+" + num3 + "=" + sum);
    System.out.println("The sum of " + dub1 + "+" + dub2 + "+" + dub3 + "=" + dubsum);







    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
