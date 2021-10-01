package USPG.EDU.GT;

import USPG.EDU.GT.Menu.ChickenBurger;
import USPG.EDU.GT.Menu.Coca;
import USPG.EDU.GT.Menu.Menu1;
import USPG.EDU.GT.Menu.Pepsi;
import USPG.EDU.GT.Menu.VegBurger;

public class Menu1Builder {
	
	   public Menu1 prepareVegMeal (){
		      Menu1 menu1 = new Menu1();
		      menu1.addItem(new VegBurger());
		      menu1.addItem(new Coca());
		      return menu1;
		   }   

		   public Menu1 prepareNonVegMeal (){
		      Menu1 menu1 = new Menu1();
		      menu1.addItem(new ChickenBurger());
		      menu1.addItem(new Pepsi());
		      return menu1;
		   }

}
