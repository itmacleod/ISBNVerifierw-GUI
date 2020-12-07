import java.util.Scanner;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main extends JFrame{
	private JTextField txtVerify;
	private JLabel lblOutput;
	private String isbn;
	
	public void verify() {
		String isbn = txtVerify.getText();
		String answer = " ";
		int sum = 0;
		if(isbn.length() == 10) {
			int position = 10;
			for(int i = 0; i < 10; i++) {
				sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * position);
				position--;
			}
			
			if(sum % 11 == 0) {
				answer = "Valid!";
			}else {
				answer = "Invalid!";
			}
		}else if(isbn.length() == 13) {
			int index = 1;
			for(int i = 0; i < 13; i++) {
				if(index % 2 == 0) {
					sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * 3);
				}else {
					sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * 1);
				}
				index++;
				
			}
			
			if(sum % 10 == 0) {
				answer = "Valid!";
			}else {
				answer = "Invalid!";
			}
		}else {
			answer = "Invalid!";
		}
		
		lblOutput.setText(answer);
		txtVerify.requestFocus();
		txtVerify.selectAll();
		
	}
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ISBN Verifier");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ISBN Verifier");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(144, 37, 135, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an ISBN number: ");
		lblNewLabel_1.setBounds(109, 93, 170, 25);
		getContentPane().add(lblNewLabel_1);
		
		txtVerify = new JTextField();
		txtVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verify();
			}
		});
		txtVerify.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVerify.setBounds(271, 92, 130, 26);
		getContentPane().add(txtVerify);
		txtVerify.setColumns(10);
		
		JButton btnNewButton = new JButton("Verify!\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verify();
			}
		});
		btnNewButton.setBounds(162, 155, 117, 29);
		getContentPane().add(btnNewButton);
		
		lblOutput = new JLabel("Enter an ISBN number and click the button to verify!\n");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(50, 221, 351, 19);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		Main verifier = new Main();
		
		verifier.setSize(450,300);
		verifier.setVisible(true);
		
		
		
		
		
	}
}
