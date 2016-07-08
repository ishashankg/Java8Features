package defaultMethods;

public interface InterfaceA {

	default void print() {
		System.out.println("Hello from Interface A");
	}

}
