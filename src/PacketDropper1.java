import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import javax.swing.*;


public class PacketDropper1 extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	JComboBox c1,n;
	JTextField c2;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 25);
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	
	PacketDropper1()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(192,92,70));
		setTitle("Packet Drop Attacker1 ::Privacy-Preserving and Truthful Detection of Packet Dropping Attacks");
		
//		 ImageIcon banner = new ImageIcon(this.getClass().getResource("Attacker1.png"));
//		 JLabel title = new JLabel();
//		 title.setIcon(banner);
//		 title.setBounds(0, 0,400,400);
		
		
		l1=new JLabel("Select Node");
		l1.setFont(f2);
		l1.setForeground(Color.white);
		l1.setBounds(80,100,110,30);
		
		
		l2=new JLabel("File Name");
		l2.setFont(f2);
		l2.setForeground(Color.white);
		l2.setBounds(80,150,100,30);
		
		l3=new JLabel("Malicious Data ");
		l3.setFont(f2);
		l3.setForeground(Color.white);
		l3.setBounds(80,200,120,30);
		
		t1=new JTextField();
		t1.setBounds(210,200,100,25);
		
//		c1.setBounds(210,100,100,25);
		
		c2=new JTextField();
//		c1.addActionListener(this);
		
		c2.setBounds(210,150,100,25);
		
		b1=new JButton("Get Energy");
		b1.setBounds(100,335,100,25);
		
		b2=new JButton("Attack");
		b2.setBounds(150,335,100,25);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		n=new JComboBox();
		n.addItem("Node8");
		n.addItem("Node12");
		n.addItem("Node13");
		n.addItem("Node14");
		n.addItem("Node19");
		n.addItem("Node20");
		n.addItem("Node21");
		
		n.setBounds(210,100,100,30);
		n.addActionListener(this);
		
		p1.add(l1);
		p1.add(l2);
		p1.add(n);
		p1.add(t1);
//		p1.add(b1);
		p1.add(l3);
		p1.add(c2);
		p1.add(b2);
//		p1.add(title);
		add(p1);
		setSize(410,460);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new PacketDropper1();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception es){System.out.println(es);}
		
	}
	
	
	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b2)
		{
			try
			{
				InetAddress ia = InetAddress.getLocalHost();
				String ip1 = ia.getHostAddress();
				String node=(n.getSelectedItem()).toString();

					Socket s12=new Socket("localhost",1412);
					DataOutputStream dos5=new DataOutputStream(s12.getOutputStream());
					dos5.writeUTF(node);
					dos5.writeUTF(c2.getText());
					dos5.writeUTF(t1.getText());
					dos5.writeUTF(ip1);
					
					DataInputStream in5=new DataInputStream(s12.getInputStream());
					String msg=in5.readUTF();
					
					if(msg.equalsIgnoreCase("attack"))
					{
						JOptionPane.showMessageDialog(null,"Successfully Attacked");
					}
					if(msg.equalsIgnoreCase("block"))
					{
						JOptionPane.showMessageDialog(null,"You Are Blocked");
					}
					if(msg.equalsIgnoreCase("nofile"))
					{
						JOptionPane.showMessageDialog(null,"File Not Found");
					}
					
			}catch(Exception es){System.out.println(es);}
		}
	}
}
