package dio.gof.Singleton;

public class SingletonEager {


	private static SingletonEager instacia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstacia() {		
		return instacia;
	}
}
