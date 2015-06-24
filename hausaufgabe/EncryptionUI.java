package hausaufgabe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class EncryptionUI extends JFrame {
	
	private Encryptor encryptor;
 
	public EncryptionUI() {
		encryptor = new Encryptor();
		encryptor.setEncryptionStrategie(new ReverseStrategie());
		createUi();
	}
	
	private void createUi() {
		Box box = Box.createVerticalBox();
		add(box);
		
		int textAreaRows = 5;
		int textAreaColumns = 25;
		
		JTextArea textAreaOriginal = new JTextArea("dies ist ein geheimer Text", textAreaRows, textAreaColumns);
		textAreaOriginal.setBorder(new TitledBorder("Original"));
		box.add(textAreaOriginal);
		
		JTextArea textAreaEncrypted = new JTextArea(textAreaRows, textAreaColumns);
		textAreaEncrypted.setBorder(new TitledBorder("Encrypted"));
		box.add(textAreaEncrypted);
		
		Box buttonBox = Box.createHorizontalBox();
		box.add(buttonBox);
		
		JButton buttonEncrypt = new JButton("Encrypt");
		buttonEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaEncrypted.setText(encryptor.encrypt(textAreaOriginal.getText()));
			}
		});
		buttonBox.add(buttonEncrypt);
		
		JButton buttonDecrypt = new JButton("Decrypt");
		buttonDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaEncrypted.setText(encryptor.decrypt(textAreaEncrypted.getText()));
			}
		});
		buttonBox.add(buttonDecrypt);
	}
	
	
	public static void main(String[] args) {
		EncryptionUI e = new EncryptionUI();
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.pack();
	}
}
