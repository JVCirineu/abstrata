package calculosCerto;

public class Principal {

	public static void main(String[] args) {
		Calculando valor = new Calculando();
		System.out.println(valor.somar(10, 10));
		System.out.println(valor.sub(13, 10));
		System.out.println(valor.mult(10, 10));
		System.out.println(valor.div(50, 2));
		System.out.println(valor.exp(10, 2));
	
	}

}
