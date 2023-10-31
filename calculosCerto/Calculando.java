package calculosCerto;

public class Calculando implements Calculos{
	
	@Override
	public double somar(double v1, double v2) {
		return v1 + v2;
	}
	
	@Override
	public double sub(double v1, double v2) {
		return v1 - v2;
	}
	
	@Override
	public double mult(double v1, double v2) {
		return v1 * v2;
	}
	
	@Override
	public int div(int v1, int v2) {
		return v1 / v2;
	}
	
	@Override
	public int exp(int base , int expoente) {
		return base ^ expoente;
	}
}
