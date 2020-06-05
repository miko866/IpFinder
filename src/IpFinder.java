
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class IpFinder extends JFrame implements ActionListener {
	JLabel l;
	JTextField tf;
	JButton b;
	IpFinder() {
		super("Ip finder in this Section");
		l = new JLabel("Enter your Address / URL");
		l.setBounds(50, 70, 150, 20);
		tf = new JTextField();
		tf.setBounds(50, 100, 200, 20);
		b = new JButton("Find your IP address");
		b.setBounds(50, 150, 159,30); 
		b.addActionListener(this);
		add(l);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String url = tf.getText();
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(this,  ip);
			
		} catch(UnknownHostException el) {
			JOptionPane.showMessageDialog(this, el.toString());
		}
	}
	

	public static void main(String[] args) {
		new IpFinder();
	}

}
