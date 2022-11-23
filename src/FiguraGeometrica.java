public abstract class FiguraGeometrica { //Cria classe abstrata FiguraGeometrica que ser� sobreposta pelas classes Filhas

	private String nome; // cria vari�vel nome dentro da classe
	
	
	public abstract double getArea(); // cria classe metodo abstrato que ser� sobreposto pelas classes filhas
	
	public String getNome(){  //cria metodo que retorna o valor armazenado na vari�vel nome
		return nome;
	}
	
	public void setNome(String nome){ //cria metodo que atribui o valor � vari�vel nome dentro da classe
		this.nome = nome;
	}
	
	public String getDescricao() { //Cria metodo para retornar a descri��o, nesse caso, ela chama a fun��o getNome, retornando o nome da FiguraGeometrica
		String texto = getNome();
		return texto;
	}

}

class Retangulo extends FiguraGeometrica { //Cria classe Retangulo que herda de FiguraGeometrica e sobrepoe os metodos para fun��es espec�ficas dessa classe filha
	
	private double base;  // cria vari�vel base dentro da classe
	private double altura; // cria vari�vel altura dentro da classe
	
	public double getBase(){ //cria metodo que retorna o valor armazenado na vari�vel base
		return base;
	}
	
	public void setBase(Double base){ //cria metodo que atribui o valor � vari�vel base dentro da classe
		this.base = base;
	}
	
	public double getAltura(){ //cria metodo que retorna o valor armazenado na vari�vel altura
		return altura;
	}
	
	public void setAltura(Double altura){  //cria metodo que atribui o valor � vari�vel altura dentro da classe
		this.altura = altura;
	}
	
	public double getArea() { //cria metodo que retorna o valor do c�lculo da �rea para um Retangulo (base * altura)
		double area = base * altura;
		return area;
	}
	
	public String getDescricao() { //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Retangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Triangulo extends FiguraGeometrica { //Cria classe Triangulo que herda de FiguraGeometrica e sobrepoe os metodos para fun��es espec�ficas dessa classe filha
	
	private double base;// cria vari�vel base dentro da classe
	private double altura;// cria vari�vel altura dentro da classe
	
	public double getBase(){//cria metodo que retorna o valor armazenado na vari�vel base
		return base;
	}
	
	public void setBase(Double base){ //cria metodo que atribui o valor � vari�vel base dentro da classe
		this.base = base;
	}
	
	public double getAltura(){//cria metodo que retorna o valor armazenado na vari�vel altura
		return altura;
	}
	
	public void setAltura(Double altura){ //cria metodo que atribui o valor � vari�vel altura dentro da classe
		this.altura = altura;
	}
	
	public double getArea() {  //cria metodo que retorna o valor do c�lculo da �rea para um Triangulo (base * altura)/2
		double area = (base * altura)/2;
		return area;
	}
	
	public String getDescricao() {  //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Triangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Circulo extends FiguraGeometrica {//Cria classe Circulo que herda de FiguraGeometrica e sobrepoe os metodos para fun��es espec�ficas dessa classe filha
	
	private double raio; // cria vari�vel raio dentro da classe
	
	public double getRaio(){ //cria metodo que retorna o valor armazenado na vari�vel raio
		return raio;
	}
	
	public void setRaio(Double raio){ //cria metodo que atribui o valor � vari�vel raio dentro da classe
		this.raio = raio;
	}
	
	
	public double getArea() { //cria metodo que retorna o valor do c�lculo da �rea para um Circulo (pi * raio * raio), pi = 3.14
		double area = 3.14 * raio * raio;
		return area;
	}
	
	public String getDescricao() { //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Circulo: Raio = "+getRaio();
		return texto;
	}
	
	
}
