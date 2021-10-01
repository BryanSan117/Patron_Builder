package USPG.EDU.GT.Menu;

import USPG.EDU.GT.Items.Bebida_fría;

public class Pepsi extends Bebida_fría {

	@Override
	public String nombre() {
		return "Pepsi";
	}

	@Override
	public float precio() {
		return 20.0f;
	}

}
