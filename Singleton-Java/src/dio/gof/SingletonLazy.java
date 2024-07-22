package dio.gof;


public class SingletonLazy {

	private static SingletonLazy instacia;
	
	private SingletonLazy() {}
	
	public static SingletonLazy getInstacia() {
		if(instacia == null) {
			instacia = new SingletonLazy();
		}
		
		return instacia;
	}
}
