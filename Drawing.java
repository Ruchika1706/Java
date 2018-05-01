import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Drawing extends Thread{
	JFrame ob;
	JButton b1;
	JPanel p1;
	public Drawing() {
		this.ob = new JFrame();
		this.ob.setSize(400,400);
		this.ob.setLayout(new GridLayout(2,1));
		this.ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.b1 = new JButton("Change Color");
		PanelExtend p1  = new PanelExtend();
		this.ob.add(p1);
		
		this.b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println(e);
					/*
					Container temp = ob.getContentPane();
					Component c1[] = temp.getComponents();
					for(Component each: c1) {
						if(each instanceof JPanel) {
							PanelExtend.f1 = true;
						}
					}
					*/
					PanelExtend.f1 = true;
					ob.repaint();
				}
				});
		ob.add(this.b1);	
		this.ob.setVisible(true);
		//ob.repaint(5);
	}
	public static void main(String args[]) {
		Drawing ob = new Drawing();
		ob.start();
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			this.ob.repaint();
		}
	}
}
class PanelExtend extends JPanel {
	static int flag=1;
	static int x = 100;
	static boolean f1 = false;
	static Color c1 = new Color(130,140,150);
	protected void paintComponent(Graphics g) {
		if(f1 == true) {
			f1 = false;
			if (c1.equals(Color.BLACK))
				c1 = new Color(130,140,150);
			else
				c1 = Color.BLACK;
			g.setColor(c1);
			g.fillOval(x,100,40,40);
			x = x + 1;
		}
		else {
			g.setColor(c1);
			g.fillOval(x,100,40,40);
			x = x + 1;	
		}
	}
	public PanelExtend() {
		super();
	}
}	

