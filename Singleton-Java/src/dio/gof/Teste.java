package dio.gof;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Teste Singleton lazy");
		
		SingletonLazy lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		
		
		System.out.println("Teste Singleton Eager");
		
		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		
		eager = SingletonEager.getInstacia();
		System.out.println(eager);
		
		
		System.out.println("Teste Singleton Lazy Holder");
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);
		
		lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);	
		
	}

}
