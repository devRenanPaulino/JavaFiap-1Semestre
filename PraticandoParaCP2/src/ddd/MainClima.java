package ddd;

public class MainClima {
	public static void main(String[] args) {
		Clima c1 = new Clima();
		
		c1.RegistrarTemperaturas(5);
		c1.mediaTemperatura();
		c1.maiorTemperatura();
		c1.menorTemperatura();
	}
}
