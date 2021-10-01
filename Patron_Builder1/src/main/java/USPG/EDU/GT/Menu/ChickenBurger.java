package USPG.EDU.GT.Menu;

import USPG.EDU.GT.Items.Hamburguesa;

public class ChickenBurger extends Hamburguesa {

	@Override
	public String nombre() {
		return "Chicken Burger";
	}

	@Override
	public float precio() {
		return 50.5f;
	}

}
