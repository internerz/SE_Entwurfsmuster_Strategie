package hausaufgabe;

public class ReverseStrategie implements MusterStragegie {

	public String encrypt(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	public String decrypt(String input) {
		return new StringBuilder(input).reverse().toString();
	}

}
