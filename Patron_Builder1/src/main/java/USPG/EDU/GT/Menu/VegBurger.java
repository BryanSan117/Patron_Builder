package USPG.EDU.GT.Menu;

import USPG.EDU.GT.Items.Hamburguesa;

public class VegBurger extends Hamburguesa {

	@Override
	public String nombre() {
		return "Veg Burger";
	}

	@Override
	public float precio() {
		return 25.0f;
	}

}
