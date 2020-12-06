import java.util.Scanner;
import javax.swing.*;
import java.awt.Font;
public class Main extends JFrame{
	private JTextField txtVerify;
	private JLabel lblOutput;
	private String isbn;
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
		txtVerify.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVerify.setBounds(271, 92, 130, 26);
		getContentPane().add(txtVerify);
		txtVerify.setColumns(10);
		
		JButton btnNewButton = new JButton("Verify!\n");
		btnNewButton.setBounds(162, 155, 117, 29);
		getContentPane().add(btnNewButton);
		
		lblOutput = new JLabel("Enter an ISBN number and click the button to verify!\n");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(50, 221, 351, 19);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		/**
		Scanner stdin = new Scanner(System.in);
	
		System.out.println("Welcome to the ISBN verifier");
		System.out.println("Please enter an ISBN number to be checked: ");
		
		String isbn = stdin.next();
		Verifier verifier = new Verifier();
		boolean isValid = verifier.verify(isbn);
		
		if(isValid == true) {
			System.out.println(isbn + " is a valid isbn number!");
		}else {
			System.out.println(isbn + " is not a valid isbn number!");
		}
		*/
		
		JFrame myFrame = new JFrame("Verifier");
		JPanel myPanel = new JPanel();
		JButton button = new JButton("Click!");
		myPanel.add(button);
		myFrame.getContentPane().add(myPanel);
		
		button.addActionListener(e -> System.out.println("Click!"));
		myFrame.setSize(600,600);
		myFrame.setVisible(true);
	}
}
