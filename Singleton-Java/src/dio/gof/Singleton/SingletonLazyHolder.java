package dio.gof.Singleton;

public class SingletonLazyHolder {

	public static class InstaceHolder {

		private static SingletonLazyHolder instacia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
	}

	public static SingletonLazyHolder getInstacia() {
		return InstaceHolder.instacia;
	}
}
