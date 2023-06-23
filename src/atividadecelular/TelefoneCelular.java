package atividadecelular;

public class TelefoneCelular {

	public static void main(String[] args) {
		Celular c1 = new Celular();
		c1.setMarca("Sansumg");
		c1.setModelo("Galaxy A31");
		c1.setAno(2022);
		c1.setPreco(1999.99f);
		c1.setMemoria(256);
		c1.status();
	}

}
