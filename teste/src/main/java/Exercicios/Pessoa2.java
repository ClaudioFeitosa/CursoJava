package Exercicios;

public class Pessoa2 {
	
	
	public class Pessoa {
		static String nome;
		int idade;
		float altura;

		
		public Pessoa(String nome, int idade, float altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
		}
			
		public String getNome() {
		return this.nome;
		}

		public int getIdade() {
		return this.idade;
		}
		
		public float getAltura() {
		return this.altura;
		}

		// Set
		
		public String SetNome(String nome) {
			return nome;
		}
		
		public int SetIdade( int idade) {
			return idade;
			}
		
		public int SetAltura( int altura) {
			return altura;
			
		}
	}
		