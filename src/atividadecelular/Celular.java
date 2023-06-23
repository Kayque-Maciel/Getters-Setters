package atividadecelular;

public class Celular {
	private String marca;
	private String modelo;
	private int ano;
	private float preco;
	private int memoria;
	private String cor;
	private boolean ligado;
	
	public Celular() {
		this.ligar();
		this.cor = "Preto";
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String md) {
		this.modelo = md;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setPreco(float p) {
		this.preco = p;
	}
	
	public int getMemoria() {
		return this.memoria;
	}
	
	public void setMemoria(int mm) {
		this.memoria = mm;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void status() {
		System.out.println("SOBRE O CELULAR ");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Preço: " + this.preco + "R$");
		System.out.println("Memória: " + this.memoria + "GB");
		System.out.println("Cor: " + this.cor);
		System.out.println("ligado: " + this.ligado);
	}
}
