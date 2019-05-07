package sobrecarga;

public class Pessoa  {
	private int codigo;
	private String nome;
	private int idade;
	
	public Pessoa (int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
	public void exibe() {
		System.out.println("Codigo: " + getCodigo()+ " Nome: " + getNome() + " idade: " +getIdade());
	}
	
	public void exibe(int num) {
		if (num ==1) {
			System.out.println("Codigo: " + getCodigo()+ " Nome: " + getNome() + " idade: " +getIdade());
		} else {
			System.out.println("Codigo: " + getCodigo()+ " Nome: " + getNome());
		}
		
	}
}
