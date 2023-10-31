package abstrata;

public class Principal {

	public static void main(String[] args) {
		 
		Cachorro dog = new Cachorro("Apollo", "M", "Golden");
		dog.emitirSom();
		
		Gato miau = new Gato("Mingau", "M", "qualquer");
		miau.emitirSom();

		
		Leao leao = new Leao("josé", "M", "qualquer");
		leao.emitirSom();

		
		Lobo lobo = new Lobo("joão", "M", "qualquer");
		lobo.emitirSom();

		
		Tigre tigre = new Tigre("rafael", "M", "qualquer");
		tigre.emitirSom();


	}

}
