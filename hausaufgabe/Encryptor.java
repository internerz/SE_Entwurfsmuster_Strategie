package hausaufgabe;

public class Encryptor {
	
	private MusterStragegie strategie;

	public String encrypt(String input) {
		return strategie.encrypt(input);
	}

	public String decrypt(String input) {
		return strategie.decrypt(input);
	}
	
	public void setEncryptionStrategie(MusterStragegie strategie) {
		this.strategie = strategie;
	}
	
}
