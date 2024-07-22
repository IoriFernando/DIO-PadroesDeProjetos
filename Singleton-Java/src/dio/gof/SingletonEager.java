package dio.gof;

public class SingletonEager {


	private static SingletonEager instacia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstacia() {		
		return instacia;
	}
}
