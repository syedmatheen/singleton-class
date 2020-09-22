public class SingletonClass {

	private static SingletonClass singletonClass = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {

		return singletonClass;
	}

	protected static void demoMethod() {

		System.out.println("Learning and demoMethod of Singleton");
	}
}
