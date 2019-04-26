package secao12Exercicios;

public class Retangulo {
	private int area;
	private int Perimetro;
	private int comprimento;
	private int largura;
	

	public Retangulo(int comprimento, int largura) {
		this.comprimento = comprimento;
		this.largura = largura;
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
