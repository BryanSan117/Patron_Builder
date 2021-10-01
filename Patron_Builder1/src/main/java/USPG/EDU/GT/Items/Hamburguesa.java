package USPG.EDU.GT.Items;

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties.Packages;

import USPG.EDU.GT.Implements.Envoltura;
import USPG.EDU.GT.Inter.Articulo;
import USPG.EDU.GT.Inter.Embalaje;

public abstract class Hamburguesa implements Articulo {


	@Override
	public Embalaje embalaje() {
		return new Envoltura();
	}

	@Override
	public abstract float precio();
	
	

}
