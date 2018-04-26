import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DemoFrame extends JFrame { //bydefault border layout
	JLabel nameLabel;
	JLabel passLabel;
	JTextField nameField;
	JPasswordField passField;
	JButton submit;
	public DemoFrame() {
		nameLabel = new JLabel("Name");
		nameField = new JTextField(20);
		passLabel = new JLabel("Password");
		passField = new JPasswordField();
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				  System.out.print("Hello World");
				}
				});
		submit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
				System.out.println(e.getClickCount());
				}
				});
		JPanel p1 = new JPanel(new GridLayout(0,2));
		p1.add(nameLabel);
		p1.add(nameField);
		p1.add(passLabel);
		p1.add(passField);
		super.add(p1, BorderLayout.NORTH);
		//super.add(nameLabel);
		//super.add(nameField);
		super.add(submit, BorderLayout.SOUTH);
	}
	public static void main(String args[]) {
		DemoFrame ob = new DemoFrame();
		ob.setLayout(new GridLayout(2,2));
 		ob.setSize(400,400);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
	

