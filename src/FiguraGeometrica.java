public abstract class FiguraGeometrica {

	private String nome;
	
	
	public abstract double getArea();
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getDescricao() {
		String texto = getNome();
		return texto;
	}

}

class Retangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public double getBase(){
		return base;
	}
	
	public void setBase(Double base){
		this.base = base;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setAltura(Double altura){
		this.altura = altura;
	}
	
	public double getArea() {
		double area = base * altura;
		return area;
	}
	
	public String getDescricao() {
		String texto = "Retangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Triangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public double getBase(){
		return base;
	}
	
	public void setBase(Double base){
		this.base = base;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setAltura(Double altura){
		this.altura = altura;
	}
	
	public double getArea() {
		double area = (base * altura)/2;
		return area;
	}
	
	public String getDescricao() {
		String texto = "Triangulo: Base = "+getBase()+", Altura = "+getAltura();
		return texto;
	}
	
	
}

class Circulo extends FiguraGeometrica {
	
	private double raio;
	
	public double getRaio(){
		return raio;
	}
	
	public void setRaio(Double raio){
		this.raio = raio;
	}
	
	
	public double getArea() {
		double area = 3.14 * raio * raio;
		return area;
	}
	
	public String getDescricao() {
		String texto = "Circulo: Raio = "+getRaio();
		return texto;
	}
	
	
}
