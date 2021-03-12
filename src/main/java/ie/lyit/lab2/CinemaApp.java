/**
 * PACKAGE COMMENTS GO HERE
 * This is an important
 * sentence
 * watch 
 * what happens
 * here!
 * <p>
 * Now we have a new line 
 */
package ie.lyit.lab2;

/**
 * @author Stephen.Mailey
 *
 */
public class CinemaApp {

	/**
	 * @param args  need some explanation here
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to the Cinema!");
		System.out.println("Please select your Snacks & Movie. Enjoy!!");
		
		
		Snack snack = new Snack("Popcorn", 007, 3.50, "Salted");
		System.out.println("The price of " + snack.getSnackName() + " is $" + snack.getPrice());

	}

}
