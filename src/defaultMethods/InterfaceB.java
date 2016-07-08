package defaultMethods;

public interface InterfaceB{

	default void print() {
		System.out.println("Hello from Interface B");
	}
}
