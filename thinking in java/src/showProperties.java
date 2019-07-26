//: object/Documentation2.java
/**
* <pre>
* System.out.println(new Date());
* </pre>
*/
///:~
public class showProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user1.name"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println("hehe");
	}
}
