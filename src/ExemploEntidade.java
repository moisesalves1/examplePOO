import java.util.ArrayList; //Importa package ArrayList 
import java.util.List; //Importa package List

public class ExemploEntidade{ //Cria classe, nesse caso, com o nome ExemploEntidade
  public static void main (String args[]){    //Classe Main, onde o código roda
	  Retangulo ret = new Retangulo();  //Instanciado o objeto Retangulo e referenciando a variavel RET
	  
	  ret.setAltura(20.0);  //Método que define o valor de Altura dentro do objeto Retangulo armazenado na variavel ret
	  ret.setBase(10.0); //Método que define o valor da Base dentro do objeto Retangulo armazenado na variavel ret
	  
	  Triangulo tri = new Triangulo(); //Instanciado o objeto Triangulo e referenciando a variavel TRI
	  
	  tri.setAltura(10.0); //Método que define o valor de Altura dentro do objeto Triangulo armazenado na variavel tri
	  tri.setBase(10.0); //Método que define o valor da Base dentro do objeto Triangulo armazenado na variavel tri
	  
	  Circulo cir = new Circulo(); //Instanciado o objeto Circulo e referenciando a variavel CIR
	  
	  cir.setRaio(36.0); //Método que define o valor do raio dentro do objeto Circulo armazenado na variavel cir
	  
	// Adiciona as figuras geometricas em uma lista 
	    List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ; //Cria uma lista de Objetos do tipo FiguraGeometrica e armazena na variável listaFigurasGeometricas (não sabemos até então o número de items)
	    listaFigurasGeometricas.add( ret );    //Adiciona a Lista, o objeto Retangulo armazenado na variável ret
	    listaFigurasGeometricas.add( tri );    //Adiciona a Lista, o objeto Triangulo armazenado na variável tri
	    listaFigurasGeometricas.add( cir );    //Adiciona a Lista, o objeto Circulo armazenado na variável cir

	// Mostra dados das figuras geometricas 
	   for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {  //Loop for é executado para cada item em listaFigurasGeometricas (nesse caso, 3 vezes)
	       System.out.println( figuraGeometrica.getDescricao() );  //imprime na tela a descrição retornada pelo método definido dentro do objeto que estiver sendo acessado (um por vez)
	       System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() );  //imprime na tela o valor da area retornada pelo metodo definido na classe
	   } 
  } 
}

