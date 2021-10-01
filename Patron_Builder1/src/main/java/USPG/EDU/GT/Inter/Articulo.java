package USPG.EDU.GT.Inter;

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties.Packages;

public interface Articulo {

	   public String nombre();
	   public Embalaje embalaje();
	   public float precio();
	
}
