package USPG.EDU.GT.Menu;

import USPG.EDU.GT.Items.Bebida_fría;

public class Coca extends Bebida_fría {

	@Override
	public String nombre() {
		return "Coca";
	}

	@Override
	public float precio() {
		return 20.0f;
	}

}
