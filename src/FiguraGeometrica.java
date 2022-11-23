public abstract class FiguraGeometrica { //Cria classe abstrata FiguraGeometrica que será sobreposta pelas classes Filhas

	private String nome; // cria variável nome dentro da classe
	
	
	public abstract double getArea(); // cria classe metodo abstrato que será sobreposto pelas classes filhas
	
	public String getNome(){  //cria metodo que retorna o valor armazenado na variável nome
		return nome;
	}
	
	public void setNome(String nome){ //cria metodo que atribui o valor à variável nome dentro da classe
		this.nome = nome;
	}
	
	public String getDescricao() { //Cria metodo para retornar a descrição, nesse caso, ela chama a função getNome, retornando o nome da FiguraGeometrica
		String texto = getNome();
		return texto;
	}

}

class Retangulo extends FiguraGeometrica { //Cria classe Retangulo que herda de FiguraGeometrica e sobrepoe os metodos para funções específicas dessa classe filha
	
	private double base;  // cria variável base dentro da classe
	private double altura; // cria variável altura dentro da classe
	
	public double getBase(){ //cria metodo que retorna o valor armazenado na variável base
		return base;
	}
	
	public void setBase(Double base){ //cria metodo que atribui o valor à variável base dentro da classe
		this.base = base;
	}
	
	public double getAltura(){ //cria metodo que retorna o valor armazenado na variável altura
		return altura;
	}
	
	public void setAltura(Double altura){  //cria metodo que atribui o valor à variável altura dentro da classe
		this.altura = altura;
	}
	
	public double getArea() { //cria metodo que retorna o valor do cálculo da área para um Retangulo (base * altura)
		double area = base * altura;
		return area;
	}
	
	public String getDescricao() { //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Retangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Triangulo extends FiguraGeometrica { //Cria classe Triangulo que herda de FiguraGeometrica e sobrepoe os metodos para funções específicas dessa classe filha
	
	private double base;// cria variável base dentro da classe
	private double altura;// cria variável altura dentro da classe
	
	public double getBase(){//cria metodo que retorna o valor armazenado na variável base
		return base;
	}
	
	public void setBase(Double base){ //cria metodo que atribui o valor à variável base dentro da classe
		this.base = base;
	}
	
	public double getAltura(){//cria metodo que retorna o valor armazenado na variável altura
		return altura;
	}
	
	public void setAltura(Double altura){ //cria metodo que atribui o valor à variável altura dentro da classe
		this.altura = altura;
	}
	
	public double getArea() {  //cria metodo que retorna o valor do cálculo da área para um Triangulo (base * altura)/2
		double area = (base * altura)/2;
		return area;
	}
	
	public String getDescricao() {  //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Triangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Circulo extends FiguraGeometrica {//Cria classe Circulo que herda de FiguraGeometrica e sobrepoe os metodos para funções específicas dessa classe filha
	
	private double raio; // cria variável raio dentro da classe
	
	public double getRaio(){ //cria metodo que retorna o valor armazenado na variável raio
		return raio;
	}
	
	public void setRaio(Double raio){ //cria metodo que atribui o valor à variável raio dentro da classe
		this.raio = raio;
	}
	
	
	public double getArea() { //cria metodo que retorna o valor do cálculo da área para um Circulo (pi * raio * raio), pi = 3.14
		double area = 3.14 * raio * raio;
		return area;
	}
	
	public String getDescricao() { //Cria metodo que retorna uma string concatenada contendo o tipo de Figura, sua base e sua altura
		String texto = "Circulo: Raio = "+getRaio();
		return texto;
	}
	
	
}
