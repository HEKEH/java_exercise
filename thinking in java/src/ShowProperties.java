/**
 * 
 * @author hk
 *
 */
public class ShowProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("1user.name"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println("branch");
	}
}
