package atividadefesta;

public class Festa {

    private String nomeparticipante;
    private String data;
	private int participantes;
    private String tema;
    private boolean tembolo;    

	
	public Festa() {
		this.simbolo();
		
	}
	
	public String getNomeparticipante() {
		return this.nomeparticipante;
	}
	
	public void setNomeparticipante(String n) {
		this.nomeparticipante = n;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String d) {
		this.data = d;
	}
	
	public int getParticipantes() {
		return this.participantes;
	}
	
	public void setParticipantes(int p) {
		this.participantes = p;
	}
	
	public String getTema() {
		return this.tema;
	}
	
	public void setTema(String t) {
		this.tema = t;
	}
		
	public void simbolo() {
		this.tembolo = true;
	}
	
	public void naobolo() {
		this.tembolo = false;
	}
	
	public void status() {
		System.out.println("SOBRE A FESTA ");
		System.out.println("Aniversariante: " + this.nomeparticipante);
		System.out.println("Data: " + this.data);
		System.out.println("Participantes: " + this.participantes);
		System.out.println("Tema: " + this.tema);
		System.out.println("Tem bolo?: " + this.tembolo);
	}
}
