package USPG.EDU.GT.Menu;

import java.util.ArrayList;
import java.util.List;

import USPG.EDU.GT.Inter.Articulo;

public class Menu1 {
	   private List<Articulo> articulos = new ArrayList<Articulo>();	

	   public void addItem(Articulo articulo){
	      articulos.add(articulo);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Articulo articulo : articulos) {
	         cost += articulo.precio();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Articulo articulo : articulos) {
	         System.out.print("Articulo : " + articulo.nombre());
	         System.out.print(", Embalaje : " + articulo.embalaje().pack());
	         System.out.println(", Precio : " + articulo.precio());
	      }		
	   }	

}
