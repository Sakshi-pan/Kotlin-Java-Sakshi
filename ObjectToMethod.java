package MethodAndConstructor;
interface MyInterface {
    void someMethod();
}
public class ObjectToMethod {
	public void printMessage() {
        System.out.println("Hello, World!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectToMethod myObject = new ObjectToMethod();

		// Using a method reference to call the instance method printMessage
		MyInterface myInterface = myObject::printMessage;
		myInterface.someMethod();
	}

}
