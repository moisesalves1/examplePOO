import java.util.ArrayList;
import java.util.List;

public class ExemploEntidade{
  public static void main (String args[]){    
	  Retangulo ret = new Retangulo();
	  
	  ret.setAltura(20.0);
	  ret.setBase(10.0);
	  
	  Triangulo tri = new Triangulo();
	  
	  tri.setAltura(10.0);
	  tri.setBase(10.0);
	  
	  Circulo cir = new Circulo();
	  
	  cir.setRaio(36.0);
	  
	// Adiciona as figuras geometricas em uma lista 
	    List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ; 
	    listaFigurasGeometricas.add( ret );    
	    listaFigurasGeometricas.add( tri ); 
	    listaFigurasGeometricas.add( cir ); 

	// Mostra dados das figuras geometricas 
	   for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) { 
	       System.out.println( figuraGeometrica.getDescricao() ); 
	       System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() ); 
	   } 
  } 
}
