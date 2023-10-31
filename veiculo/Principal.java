package veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro("01020", "F1","Vermelho",2022);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.virar();
	
		System.out.println("------");
		
		Onibus marcopolo = new Onibus ("12151", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
	}

}
