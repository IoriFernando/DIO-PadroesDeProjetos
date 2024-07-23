package dio.gof.strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();	
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		
		robo.setStrategy(normal);
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
	}

}
