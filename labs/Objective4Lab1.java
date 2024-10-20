import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "What is your first name?";
    String lname = "What is your last name?";
    String favoriteAnimal = "What is your favorite animal?";
    String favoriteFood = "What is your favorite food?";
    String favoriteSong = "What is your favoritesong?";
    System.out.println(fname);
    String fname2 = keyboard.nextLine();

    System.out.println(lname);
    String lname2 = keyboard.nextLine();

    System.out.println(favoriteAnimal);
    String favoriteAnimal2 = keyboard.nextLine();

    System.out.println(favoriteFood);
    String favoriteFood2 = keyboard.nextLine();


    System.out.println(favoriteSong);
    String favoriteSong2 = keyboard.nextLine();

    System.out.println("My name is "+ fname2 + lname2);
    System.out.println("My favorite animal is a "+ favoriteAnimal2);
    System.out.println("My favorite food is "+ favoriteFood2);
    System.out.println("My favorite song is "+ favoriteSong2);


    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}