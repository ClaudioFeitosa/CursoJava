package secao12Exercicios;

public class Quadrado {
	private int lado;
	private int area;
	private int perimetro;

	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	
public int getLado() {
	return this.lado;
}

public void setLado(int lado) {
	this.lado = lado;
}

public int getArea() {
	return this.area;
}
public void setArea(int area) {
	this.area = area;
}

public int getPerimetro() {
	return this.perimetro;
}

public void setPerimetro(int perimetro) {
	this.perimetro = perimetro;
}

public int  calcularArea() {
	this.area =  (this.lado * this.lado);
	return this.area;
}

public int calcularPerimetro() {
	this.perimetro =  (this.lado * 4);
	return this.perimetro;
}

public void imprimeArea() {
	System.out.println("Area do quadrado: " +calcularArea());
}

public void imprimePerimetro() {
	System.out.println("o perimetro do Quadrado é : " +calcularPerimetro());
}

}
