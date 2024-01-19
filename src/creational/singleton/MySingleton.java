package creational.singleton;
/**
 * This is the example for lazy initialization 
 * @author mohammad.miyan
 *
 */
public class MySingleton {
	private static volatile MySingleton instance;

	private MySingleton() {
	}

	public static MySingleton instance() {

		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}

		}
		return instance;

	}
}
