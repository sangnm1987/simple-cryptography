
public class Test {
	public static void main(String[] args) {
		Crypter c = new Crypter("key.png"); // Key picture.
		
		//Crypt
		//c.encrypt("Hello, there", "path to photo");
		
		//Decrypt
		System.out.println(c.deCrypt("path to photo"));
		
	}
}


