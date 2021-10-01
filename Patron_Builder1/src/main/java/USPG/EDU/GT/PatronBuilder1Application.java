package USPG.EDU.GT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import USPG.EDU.GT.Menu.Menu1;

@SpringBootApplication
public class PatronBuilder1Application {

	public static void main(String[] args) {
	
	      Menu1Builder menu1Builder = new Menu1Builder();

	      Menu1 vegMenu1 = menu1Builder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMenu1.showItems();
	      System.out.println("Total Cost: " + vegMenu1.getCost());

	      Menu1 nonVegMenu1 = menu1Builder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMenu1.showItems();
	      System.out.println("Total Cost: " + nonVegMenu1.getCost());
	   }
		
		


}
