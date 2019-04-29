package secao12Exercicios;

public class Retangulo {
	private int area;
	private int perimetro;
	private int comprimento;
	private int largura;
	

	public Retangulo(int comprimento, int largura) {
		this.comprimento = comprimento;
		this.largura = largura;
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
	
public int getComprimento() {
	return this.comprimento;
}

public void setComprimento(int comprimento) {
	this.comprimento = comprimento;
}

public int getLargura() {
	return this.largura;
}
public void setLargura(int largura) {
	this.largura = largura;
}


public int  calcularArea() {
	this.area =  (this.comprimento * this.largura);
	return this.area;
}

public int calcularPerimetro() {
	this.perimetro =  ((this.comprimento*2) + (this.largura*2));;
	return this.perimetro;
}

public void imprimeArea() {
	System.out.println("Area do retangulo: " +calcularArea());
}

public void imprimePerimetro() {
	System.out.println("o perimetro do retangulo é : " +calcularPerimetro());
}

}
