package USPG.EDU.GT.Items;

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties.Packages;

import USPG.EDU.GT.Implements.Botella;
import USPG.EDU.GT.Inter.Articulo;
import USPG.EDU.GT.Inter.Embalaje;

public abstract class Bebida_fría implements Articulo {


	@Override
	public Embalaje embalaje() {
		return new Botella();
	}

	@Override
	public abstract float precio();

}
