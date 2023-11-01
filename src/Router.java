import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Router extends JFrame implements ActionListener
{
	JPanel p1;
	ImageIcon a1,a2,a3,a4,a5,a6,a7,a8,a9,a1g,a2g,a3g,a4g,a5g,a6g,a7g,a8g,a9g,a1r,a2r,a3r,a4r,a5r,a6r,a7r,a8r,a9r;
	ImageIcon b2,b3,b4,b5,b6,b7,b8,b2g,b3g,b4g,b5g,b6g,b7g,b8g,b1r,b2r,b3r,b4r,b5r,b6r,b7r,b8r;
	ImageIcon c2,c3,c4,c5,c6,c7,c8,c2g,c3g,c4g,c5g,c6g,c7g,c8g,c1r,c2r,c3r,c4r,c5r,c6r,c7r,c8r;
	ImageIcon black,green,red;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38;
	
	JLabel up,downd,down1,up1,aa,d2,d3,d4,d5,d6,d7,d22,d33,d44,d55,d66,d77,d88;
	JLabel e2,e3,e4,e5,e6,e7,e8,e22,e33,e44,e55,e66,e77,e88;
	JLabel f2,f3,f4,f5,f6,f7;
	
	ImageIcon up9,down9,down19,up19,aa9,d29,d39,d49,d59,d69,d79,d229,d339,d449,d559,d669,d779,d889;
	ImageIcon e29,e39,e49,e59,e69,e79,e89,e229,e339,e449,e559,e669,e779,e889;
	ImageIcon f29,f39,f49,f59,f69,f79;
	
	JLabel a11,a22,a33,a44,a55,a66,a77,a88,a99;
	JLabel b11,b22,b33,b44,b55,b66,b77,b88;
	JLabel c11,c22,c33,c44,c55,c66,c77,c88;
	
	String CHead1,CHead2,CHead3,CHead4;
	String CHp1,CHp2,CHp3,CHp4;


	
	MenuBar mbr;
	MenuItem i1,i2,i3,i4,i5;
	Menu m1;
	Dbcon db = new Dbcon();
	Connection connect=db.getConnection();
	
	public Font f = new Font("Times new roman", Font.BOLD, 25);
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	public Font f21 = new Font("Times new roman", Font.BOLD, 16);
	public Font f31 = new Font("Times new roman", Font.BOLD, 23);
	public Font f41 = new Font("Times new roman", Font.BOLD, 11);
	
	
	String node1="Node1",node2="Node2",node3="Node3" ,node4="Node4",node5="Node5",node6="Node6",node7="Node7",node8="Node8";
	String node9="Node9",node10="Node10",node11="Node11" ,node12="Node12",node13="Node13",node14="Node14",node15="Node15",node16="Node16";
	String node17="Node17",node18="Node18",node19="Node19" ,node20="Node20",node21="Node21",node22="Node22",node23="Node23",node24="Node24";
	String node25="Node25",node26="Node26",node27="Node27" ,node28="Node28",node29="Node29",node30="Node30",node31="Node31",node32="Node32";
	
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
	String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="",dis17="",dis18="",dis19="",dis20="";
	String dis21="",dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="",dis29="",dis30="";
	String dis31="",dis32="";
	
	String mac=""; String fname=""; 
	String mac2="";String mac3="";String mac4="";String mac5="";String mac6="";String mac7="";String mac8="";
	String mac9="";String mac10="";String mac11="";String mac12="";String mac13="";String mac14="";String mac15="";String mac16="";
	String mac17="";String mac18="";String mac19="";String mac20="";String mac21="";String mac22="";String mac23="";String mac24="";
	String mac25="";String mac26="";String mac27="";String mac28="";String mac29="";String mac30="";String mac31="";String mac32="";
	
	String ene="";String ene2="";String ene3="";String ene4="";String ene5="";String ene6="";String ene7="";String ene8="";
	String ene9="";String ene10="";String ene11="";String ene12="";String ene13="";String ene14="";String ene15="";String ene16="";
	String ene17="";String ene18="";String ene19="";String ene20="";String ene21="";String ene22="";String ene23="";String ene24="";
	String ene25="";String ene26="";String ene27="";String ene28="";String ene29="";String ene30="";String ene31="";String ene32="";
	
	String no1="";String no2="";String no3="";String no4="";String no5="";String no6="";String no7="";String no8="";
	String no9="";String no10="";String no11="";String no12="";String no13="";String no14="";String no15="";String no16="";
	String no17="";String no18="";String no19="";String no20="";String no21="";String no22="";String no23="";String no24="";
	String no25="";String no26="";String no27="";String no28="";String no29="";String no30="";String no31="";String no32="";
	String path;

	
	String Degree;
	ThreadMXBean threadBean;
	long start;
	String s;
	StringBuffer sb1;
	int fsize=0;
	ImageIcon nod,border,down,ids;
	JLabel nodl,borderl,downl,idsl,text;
	
	
	Router() throws SQLException
	{
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Router ::");
		p1.setBackground(Color.white);
		
		mbr=new MenuBar();
		setMenuBar(mbr);
		m1=new Menu("File");
		i1=new MenuItem("Update Bandwidth");
		i2=new MenuItem("View Router Details");
		i3=new MenuItem("View Attackers");
		i4=new MenuItem("View Time Delay");
		i5=new MenuItem("View Dropped Packets");
		
		nod=new ImageIcon(this.getClass().getResource("node.jpg"));
		nodl = new JLabel("LINK FAILURE");
		nodl.setIcon(nod);
		nodl.setBounds(240, 260, 300, 300);
		nodl.setForeground(Color.GREEN);
		p1.add(nodl);
		
//		down=new ImageIcon(this.getClass().getResource("down.png"));
//		downl = new JLabel();
//		downl.setIcon(down);
//		downl.setBounds(450, 330, 300, 300);
//		downl.setForeground(Color.GREEN);
//		p1.add(downl);
		
		ids=new ImageIcon(this.getClass().getResource("ids.jpg"));
		idsl = new JLabel("NODE FAILURE");
		idsl.setIcon(ids);
		idsl.setBounds(540, 260, 300, 300);
		idsl.setForeground(Color.GREEN);
		p1.add(idsl);
		
		
		a1=new ImageIcon(this.getClass().getResource("black.jpg"));
		a11=new JLabel("Node1");
		a11.setIcon(a1);
		a11.setBounds(50, 100, 500,200);
		p1.add(a11);
		
		l1=new JLabel();
		l1.setBounds(120, 30, 500,200);
		p1.add(l1);
		l2=new JLabel();
		l2.setBounds(120, 100, 500,200);
		p1.add(l2);
		l3=new JLabel();
		l3.setBounds(120, 170, 500,200);
		p1.add(l3);
		
		a2=new ImageIcon(this.getClass().getResource("black.jpg"));
		a22=new JLabel("Node2");
		a22.setIcon(a2);
		a22.setBounds(150, 30, 500,200);
		p1.add(a22);
		
		l4=new JLabel();
		l4.setBounds(220, 30, 500,200);
		p1.add(l4);
		l5=new JLabel();
		l5.setBounds(165, 65, 500,200);
		p1.add(l5);
		
		a3=new ImageIcon(this.getClass().getResource("black.jpg"));
		a33=new JLabel("Node5");
		a33.setIcon(a3);
		a33.setBounds(250, 30, 500,200);
		p1.add(a33);
		
		l6=new JLabel();
		l6.setBounds(320, 30, 500,200);
		p1.add(l6);
		l7=new JLabel();
		l7.setBounds(265, 65, 500,200);
		p1.add(l7);
		
		a4=new ImageIcon(this.getClass().getResource("black.jpg"));
		a44=new JLabel("Node8");
		a44.setIcon(a4);
		a44.setBounds(350, -20, 500,200);
		p1.add(a44);
		
		l8=new JLabel();
		l8.setBounds(420, -20, 500,200);
		p1.add(l8);
		l9=new JLabel();
		l9.setBounds(365, 45, 500,200);
		p1.add(l9);
		
		a5=new ImageIcon(this.getClass().getResource("black.jpg"));
		a55=new JLabel("Node11");
		a55.setIcon(a5);
		a55.setBounds(450, -20, 500,200);
		p1.add(a55);
		
		l10=new JLabel();
		l10.setBounds(520, -20, 500,200);
		p1.add(l10);
		l11=new JLabel();
		l11.setBounds(465, 45, 500,200);
		p1.add(l11);
		
		a6=new ImageIcon(this.getClass().getResource("black.jpg"));
		a66=new JLabel("Node14");
		a66.setIcon(a6);
		a66.setBounds(550, -20, 500,200);
		p1.add(a66);
		
		l12=new JLabel();
		l12.setBounds(610, 10, 500,200);
		p1.add(l12);
		l13=new JLabel();
		l13.setBounds(565, 45, 500,200);
		p1.add(l13);
		
		a7=new ImageIcon(this.getClass().getResource("black.jpg"));
		a77=new JLabel("Node17");
		a77.setIcon(a7);
		a77.setBounds(650, 30, 500,200);
		p1.add(a77);
		
		l14=new JLabel();
		l14.setBounds(710, 30, 500,200);
		p1.add(l14);
		l15=new JLabel();
		l15.setBounds(660, 65, 500,200);
		p1.add(l15);
		
		a8=new ImageIcon(this.getClass().getResource("black.jpg"));
		a88=new JLabel("Node20");
		a88.setIcon(a8);
		a88.setBounds(750, 30, 500,200);
		p1.add(a88);
		
		l16=new JLabel();
		l16.setBounds(810, 60, 500,200);
		p1.add(l16);
		l17=new JLabel();
		l17.setBounds(760, 65, 500,200);
		p1.add(l17);
		
		a9=new ImageIcon(this.getClass().getResource("black.jpg"));
		a99=new JLabel("Node23");
		a99.setIcon(a9);
		a99.setBounds(850, 100, 500,200);
		p1.add(a99);
		
		b2=new ImageIcon(this.getClass().getResource("black.jpg"));
		b22=new JLabel("Node3");
		b22.setIcon(b2);
		b22.setBounds(150, 100, 500,200);
		p1.add(b22);
		
		l18=new JLabel();
		l18.setBounds(220, 100, 500,200);
		p1.add(l18);
		l19=new JLabel();
		l19.setBounds(165, 135, 500,200);
		p1.add(l19);
		
		b3=new ImageIcon(this.getClass().getResource("black.jpg"));
		b33=new JLabel("Node6");
		b33.setIcon(b3);
		b33.setBounds(250, 100, 500,200);
		p1.add(b33);
		
		l20=new JLabel();
		l20.setBounds(320, 100, 500,200);
		p1.add(l20);
		l21=new JLabel();
		l21.setBounds(265, 135, 500,200);
		p1.add(l21);
		
		b4=new ImageIcon(this.getClass().getResource("black.jpg"));
		b44=new JLabel("Node9");
		b44.setIcon(b4);
		b44.setBounds(350, 100, 500,200);
		p1.add(b44);
		
		l22=new JLabel();
		l22.setBounds(420, 100, 500,200);
		p1.add(l22);
		l23=new JLabel();
		l23.setBounds(365, 155, 500,200);
		p1.add(l23);
		
		b5=new ImageIcon(this.getClass().getResource("black.jpg"));
		b55=new JLabel("Node12");
		b55.setIcon(b5);
		b55.setBounds(450, 100, 500,200);
		p1.add(b55);
		
		l24=new JLabel();
		l24.setBounds(520, 100, 500,200);
		p1.add(l24);
		l25=new JLabel();
		l25.setBounds(465, 155, 500,200);
		p1.add(l25);
		
		b6=new ImageIcon(this.getClass().getResource("black.jpg"));
		b66=new JLabel("Node15");
		b66.setIcon(b6);
		b66.setBounds(550, 100, 500,200);
		p1.add(b66);
		
		l26=new JLabel();
		l26.setBounds(620, 100, 500,200);
		p1.add(l26);
		l27=new JLabel();
		l27.setBounds(565, 155, 500,200);
		p1.add(l27);
		
		b7=new ImageIcon(this.getClass().getResource("black.jpg"));
		b77=new JLabel("Node18");
		b77.setIcon(b7);
		b77.setBounds(650, 100, 500,200);
		p1.add(b77);
		
		l28=new JLabel();
		l28.setBounds(720, 100, 500,200);
		p1.add(l28);
		l29=new JLabel();
		l29.setBounds(665, 135, 500,200);
		p1.add(l29);
		
		b8=new ImageIcon(this.getClass().getResource("black.jpg"));
		b88=new JLabel("Node21");
		b88.setIcon(b8);
		b88.setBounds(750, 100, 500,200);
		p1.add(b88);
		
		l30=new JLabel();
		l30.setBounds(820, 100, 500,200);
		p1.add(l30);
		l31=new JLabel();
		l31.setBounds(765, 135, 500,200);
		p1.add(l31);
		
		c2=new ImageIcon(this.getClass().getResource("black.jpg"));
		c22=new JLabel("Node4");
		c22.setIcon(c2);
		c22.setBounds(150, 170, 500,200);
		p1.add(c22);
		
		l32=new JLabel();
		l32.setBounds(220, 170, 500,200);
		p1.add(l32);
		
		c3=new ImageIcon(this.getClass().getResource("black.jpg"));
		c33=new JLabel("Node7");
		c33.setIcon(c3);
		c33.setBounds(250, 170, 500,200);
		p1.add(c33);
		
		l33=new JLabel();
		l33.setBounds(320, 190, 500,200);
		p1.add(l33);
		
		c4=new ImageIcon(this.getClass().getResource("black.jpg"));
		c44=new JLabel("Node10");
		c44.setIcon(c4);
		c44.setBounds(350, 220, 500,200);
		p1.add(c44);
		
		l34=new JLabel();
		l34.setBounds(420, 220, 500,200);
		p1.add(l34);
		
		c5=new ImageIcon(this.getClass().getResource("black.jpg"));
		c55=new JLabel("Node13");
		c55.setIcon(c5);
		c55.setBounds(450, 220, 500,200);
		p1.add(c55);
		
		l35=new JLabel();
		l35.setBounds(520, 220, 500,200);
		p1.add(l35);
		
		c6=new ImageIcon(this.getClass().getResource("black.jpg"));
		c66=new JLabel("Node16");
		c66.setIcon(c6);
		c66.setBounds(550, 220, 500,200);
		p1.add(c66);
		
		l36=new JLabel();
		l36.setBounds(620, 200, 500,200);
		p1.add(l36);
		
		c7=new ImageIcon(this.getClass().getResource("black.jpg"));
		c77=new JLabel("Node19");
		c77.setIcon(c7);
		c77.setBounds(650, 170, 500,200);
		p1.add(c77);
		
		l37=new JLabel();
		l37.setBounds(720, 170, 500,200);
		p1.add(l37);
		
		c8=new ImageIcon(this.getClass().getResource("black.jpg"));
		c88=new JLabel("Node22");
		c88.setIcon(c8);
		c88.setBounds(750, 170, 500,200);
		p1.add(c88);
		
		l38=new JLabel();
		l38.setBounds(820, 150, 500,200);
		p1.add(l38);
		
		
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		mbr.add(m1);
		
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);

		setSize(980,500);
		setVisible(true);
		add(p1);
		
		int[] ports = new int[]
			              		{12345,3939,1412,4445,4444,1111,2222};

			              		for (int i = 0; i < 7; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if(ae.getSource()==i1)
		{
			try
			{
			String nname="";
			
				String cn4[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7","Node8","Node9","Node10","Node11","Node12","Node13","Node14","Node15","Node16","Node17","Node18","Node19","Node20","Node21","Node22","Node23"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update Bandwidth",JOptionPane.QUESTION_MESSAGE);
				
				nname=clust4.getSelectedItem().toString();
					
				String Ener=JOptionPane.showInputDialog(null,"Enter Bandwidth");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String cname="NodesInfo";
				String n1="update "+cname+" set bw="+dis+" where node='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Bandwidth Updated Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if(ae.getSource()==i2)
		{
				try
				{
					ViewRouter r = new ViewRouter();
					r.setSize(700, 400);
					r.setVisible(true);
				
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
		if(ae.getSource()==i3)
		{
			ViewAttackers r = new ViewAttackers();
			r.setSize(750, 400);
			r.setVisible(true);
		}
		
		if(ae.getSource()==i4)
		{
			ViewTimeDelay r1 = new ViewTimeDelay();
			r1.setSize(750, 400);
			r1.setVisible(true);
		}
		if(ae.getSource()==i5)
		{
			ViewDropped r1 = new ViewDropped();
			r1.setSize(750, 400);
			r1.setVisible(true);
		}

	}	
	public static void main(String[] args) throws SQLException
	{
		new Router();
	}

	
	class PortListener implements Runnable
	{
		int port;

		public PortListener(int port)
		{
			this.port = port;
		}

		public void run()
		{
			Dbcon db = new Dbcon();
			Connection connect=db.getConnection();
			
			if(this.port==12345)
			{
				try
				{
					ServerSocket ss = new ServerSocket(12345);
					Socket cn;
					while(true) 
					{
					cn = ss.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					
					fname=in3.readUTF();
					mac=in3.readUTF();
					String ct=in3.readUTF();
					String sp1=in3.readUTF();
					String sp2=in3.readUTF();
					String sp3=in3.readUTF();
					String sp4=in3.readUTF();
					String sp5=in3.readUTF();
					String dest=in3.readUTF();
					String destip=in3.readUTF();
					
					int fsize=ct.length();
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				    String dt=dateFormat.format(date);

					int len = fname.length();
					String file = fname.substring(0, len-5);
					
					PrintStream out99 = null;
					try {
					    out99 = new PrintStream(new FileOutputStream("Router\\"+file+".txt"));
					    out99.print(ct);
					    
					}
					finally {
					    if (out99 != null) out99.close();
					}
					
					PrintStream out = null;
					try {
					    out = new PrintStream(new FileOutputStream("Router\\"+file+"1"+".txt"));
					    out.print(sp1);
					    
					}
					finally {
					    if (out != null) out.close();
					}
					
					PrintStream out1 = null;
					try {
					    out1 = new PrintStream(new FileOutputStream("Router\\"+file+"2"+".txt"));
					    out1.print(sp2);
					    
					}
					finally {
					    if (out1 != null) out1.close();
					}
					
					PrintStream out2 = null;
					try {
					    out2 = new PrintStream(new FileOutputStream("Router\\"+file+"3"+".txt"));
					    out2.print(sp3);
					    
					}
					finally {
					    if (out2 != null) out2.close();
					}
					
					
					PrintStream out3 = null;
					try {
					    out3 = new PrintStream(new FileOutputStream("Router\\"+file+"4"+".txt"));
					    out3.print(sp4);
					    
					}
					finally {
					    if (out3 != null) out3.close();
					}
					
					PrintStream out4 = null;
					try {
					    out4 = new PrintStream(new FileOutputStream("Router\\"+file+"5"+".txt"));
					    out4.print(sp5);
					    
					}
					finally {
					    if (out4 != null) out4.close();
					}
					
					Statement stmt = connect.createStatement();
					String query1 = "insert into Router values('"+fname+"','"+mac+"','"+dest+"','"+dt+"')";
					stmt.executeUpdate(query1);

					getband();
					getmac();
				    
					start = System.currentTimeMillis();
					
					Thread.sleep(2000);
					a1g=new ImageIcon(this.getClass().getResource("green.png"));
					a11.setIcon(a1g);
					no1="Node1->";
		
					
					Thread.sleep(2000);
						a2g=new ImageIcon(this.getClass().getResource("green.png"));
						a22.setIcon(a2g);
						no2="Node2->";
						
						Thread.sleep(2000);
						a3g=new ImageIcon(this.getClass().getResource("green.png"));
						a33.setIcon(a3g);
						no5="Node5->";
						
						if(Integer.parseInt(ene8)>fsize)
						{
							if(mac.equalsIgnoreCase(mac8))
							{
								Thread.sleep(2000);
								a4g=new ImageIcon(this.getClass().getResource("green.png"));
								a44.setIcon(a4g);
								no8="Node8->";
								
								Thread.sleep(2000);
								a5g=new ImageIcon(this.getClass().getResource("green.png"));
								a55.setIcon(a5g);
								no11="Node11->";
							
							if(Integer.parseInt(ene14)>fsize)
							{
								if(mac.equalsIgnoreCase(mac14))
								{
									
								Thread.sleep(2000);
								a6g=new ImageIcon(this.getClass().getResource("green.png"));
								a66.setIcon(a6g);
								no14="Node14->";
								
								Thread.sleep(2000);
								a7g=new ImageIcon(this.getClass().getResource("green.png"));
								a77.setIcon(a7g);
								no17="Node17->";
								
								if(Integer.parseInt(ene20)>fsize)
								{
									if(mac.equalsIgnoreCase(mac20))
									{
										
									
									Thread.sleep(2000);
									a8g=new ImageIcon(this.getClass().getResource("green.png"));
									a88.setIcon(a8g);
									no20="Node20->";
									
									Thread.sleep(2000);
									a9g=new ImageIcon(this.getClass().getResource("green.png"));
									a99.setIcon(a9g);
									no23="Node23->";
									
									send(cn,dest,destip,ct);
									refresh();
									
								}
								else
								{

									Thread.sleep(2000);
									a8r=new ImageIcon(this.getClass().getResource("red.png"));
									a88.setIcon(a8r);
									no20="Node20->";
									
									a7g=new ImageIcon(this.getClass().getResource("black.jpg"));
									a77.setIcon(a7g);
									
									Thread.sleep(1000);
									nodl.setForeground(Color.red);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									Thread.sleep(1000);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									
									int a=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
									audit(no20,mac20);
									
									if(a==0)
									{
										connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"' where node='"+node20+"'");
										System.out.println("Yes");
									}
									if(a==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";
									
									if(Integer.parseInt(ene21)>fsize)
									{
										if(mac.equalsIgnoreCase(mac21))
										{
											
										
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("green.png"));
										b88.setIcon(b8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
									}
									else
									{

										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no21,mac21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									
									}
								}
									else
									{
										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no21,ene21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									}
								
								}
							}
								else
								{

									Thread.sleep(2000);
									a8r=new ImageIcon(this.getClass().getResource("red.png"));
									a88.setIcon(a8r);
									no20="Node20->";
									
									a7g=new ImageIcon(this.getClass().getResource("black.jpg"));
									a77.setIcon(a7g);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no20,ene20);
									
									if(a==0)
									{
										connect.createStatement().executeUpdate("update NodesInfo set bw='"+fsize+"' where node='"+node20+"'");
										System.out.println("Yes");
									}
									if(a==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";
									
									if(Integer.parseInt(ene21)>fsize)
									{
										if(mac.equalsIgnoreCase(mac21))
										{
											
										
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("green.png"));
										b88.setIcon(b8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
									}
									else
									{

										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no21,mac21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									
									}
								}
									else
									{
										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no21,ene21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									}
								
								
								
								}
							}
							else
							{

								Thread.sleep(2000);
								a6r=new ImageIcon(this.getClass().getResource("red.png"));
								a66.setIcon(a6r);
								no14="Node14->";
								
								a5g=new ImageIcon(this.getClass().getResource("black.jpg"));
								a55.setIcon(a5g);
								
								Thread.sleep(1000);
								nodl.setForeground(Color.red);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								Thread.sleep(1000);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								
								int a=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
								audit(no14,mac14);
								
								if(a==0)
								{
									connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"' where node='"+node14+"'");
									System.out.println("Yes");
								}
								if(a==1)
								{
									System.out.println("No");
								}
								
								Thread.sleep(2000);
								a5g=new ImageIcon(this.getClass().getResource("green.png"));
								a55.setIcon(a5g);
								no11="Node11->";
								
								if(Integer.parseInt(ene12)>fsize)
								{
									if(mac.equalsIgnoreCase(mac12))
									{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("green.png"));
									b55.setIcon(b5g);
									no12="Node12->";
									
									Thread.sleep(2000);
									b6g=new ImageIcon(this.getClass().getResource("green.png"));
									b66.setIcon(b6g);
									no15="Node15->";
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";

									if(Integer.parseInt(ene21)>fsize)
									{
										if(mac.equalsIgnoreCase(mac21))
										{
											
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("green.png"));
										b88.setIcon(b8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
									}
									else
									{

										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no21,mac21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no22="Node22->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no21="Node21->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									
									}
								}
									else
									{
										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no21,ene21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene21)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac21))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no22="Node22->";
												audit(no22,mac);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no22="Node22->";
											audit(no22,ene22);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									}
									
								}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
									b44.setIcon(b4r);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no12,ene12);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no9="Node9->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no9="Node9->";
									
									if(Integer.parseInt(ene13)>fsize)
									{
										if(mac.equalsIgnoreCase(mac13))
										{
											
										
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no13="Node13->";
										
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no16="Node16->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											if(Integer.parseInt(ene19)>fsize)
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
										
											
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19,mac19);
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19,ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no13="Node13->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}	
									}
									else
									{
										
									}
							
								}
							}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
									b44.setIcon(b4r);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no12,ene12);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no9="Node9->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no9="Node9->";
									
									if(Integer.parseInt(ene13)>fsize)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no13="Node13->";
										
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no16="Node16->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
									//		send(cn,dest,destip,ct);
											refresh();
											
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
										
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no13="Node13->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}	
									
							}
							
							
							if(!mac.equalsIgnoreCase(mac14))
							{

								Thread.sleep(2000);
								a6r=new ImageIcon(this.getClass().getResource("red.png"));
								a66.setIcon(a6r);
								no14="Node14->";
								
								a5g=new ImageIcon(this.getClass().getResource("black.jpg"));
								a55.setIcon(a5g);
								no11="Node11->";
								
								Thread.sleep(1000);
								nodl.setForeground(Color.red);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								Thread.sleep(1000);
								nodl.setVisible(false);
								Thread.sleep(1000);
								nodl.setVisible(true);
								
								int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
								audit(no11,ene11);
								
								if(a1==0)
								{
									connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"' where node='"+node11+"'");
									System.out.println("Yes");
								}
								if(a1==1)
								{
									System.out.println("No");
								}
								
								Thread.sleep(2000);
								a5g=new ImageIcon(this.getClass().getResource("green.png"));
								a55.setIcon(a5g);
								no11="Node11->";
								
								if(Integer.parseInt(ene12)>fsize)
								{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("green.png"));
									b55.setIcon(b5g);
									no12="Node12->";
									
									Thread.sleep(2000);
									b6g=new ImageIcon(this.getClass().getResource("green.png"));
									b66.setIcon(b6g);
									no15="Node15->";
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";
									
									if(Integer.parseInt(ene21)>fsize)
									{
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("green.png"));
										b88.setIcon(b8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
									}
									else
									{
										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a11=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no21,ene21);
										
										
										if(a11==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a11==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene21)>fsize)
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no22="Node22->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no21="Node21->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no22="Node22->";
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
									b44.setIcon(b4r);
									no9="Node9->";
									
									Thread.sleep(1000);
									nodl.setForeground(Color.red);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									Thread.sleep(1000);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									
									int a11=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
									audit(no12,ene12);
									
									
									if(a11==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node12+"'");
										System.out.println("Yes");
									}
									if(a11==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no9="Node9->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no9="Node9->";
									
									if(Integer.parseInt(ene13)>fsize)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no13="Node13->";
										
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no16="Node16->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
									//		send(cn,dest,destip,ct);
											refresh();
											
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
										
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no13="Node13->";
										
										JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}	
									
							}
							
							
							}
						
							}
							}
							else
							{
									Thread.sleep(2000);
									a6r=new ImageIcon(this.getClass().getResource("red.png"));
									a66.setIcon(a6r);
									no14="Node14->";
									
									a5g=new ImageIcon(this.getClass().getResource("black.jpg"));
									a55.setIcon(a5g);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no14,ene14);
									
									if(a==0)
									{
										connect.createStatement().executeUpdate("update NodesInfo set bw='"+fsize+"' where node='"+node14+"'");
										System.out.println("Yes");
									}
									if(a==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("green.png"));
									a55.setIcon(a5g);
									no11="Node11->";
									
									if(Integer.parseInt(ene12)>fsize)
									{
										if(mac.equalsIgnoreCase(mac12))
										{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										b55.setIcon(b5g);
										no12="Node12->";
										
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("green.png"));
										b66.setIcon(b6g);
										no15="Node15->";
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";

										if(Integer.parseInt(ene21)>fsize)
										{
											if(mac.equalsIgnoreCase(mac21))
											{
												
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("green.png"));
											b88.setIcon(b8g);
											no21="Node21->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
										}
										else
										{

											Thread.sleep(2000);
											b8r=new ImageIcon(this.getClass().getResource("red.png"));
											b88.setIcon(b8r);
											no21="Node21->";
											
											b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
											b77.setIcon(b7g);
											
											Thread.sleep(1000);
											nodl.setForeground(Color.red);
											nodl.setVisible(false);
											Thread.sleep(1000);
											nodl.setVisible(true);
											Thread.sleep(1000);
											nodl.setVisible(false);
											Thread.sleep(1000);
											nodl.setVisible(true);
											
											int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
											audit(no21,mac21);
											
											
											if(a1==0)
											{
												connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
												System.out.println("Yes");
											}
											if(a1==1)
											{
												System.out.println("No");
											}
											
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no18="Node18->";
											
											if(Integer.parseInt(ene19)>fsize)
											{
												
												if(mac.equalsIgnoreCase(mac19))
												{
													
												
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no22="Node22->";
												
												Thread.sleep(2000);
												c8g=new ImageIcon(this.getClass().getResource("green.png"));
												c88.setIcon(c8g);
												no21="Node21->";
												
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("green.png"));
												a99.setIcon(a9g);
												no23="Node23->";
												
												send(cn,dest,destip,ct);
												refresh();
												
												}
												else
												{
													Thread.sleep(2000);
													c7r=new ImageIcon(this.getClass().getResource("red.png"));
													c77.setIcon(c7r);
													no19="Node19->";
													audit(no19, mac19);
													
													JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
													connect.createStatement().executeUpdate("delete from dropped");
													connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
													DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
													dout.writeUTF("dropped");
													//send(cn,dest,destip,ct);
													refresh();
												}
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, ene19);
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
												
											}
										
										}
									}
										else
										{
											Thread.sleep(2000);
											b8r=new ImageIcon(this.getClass().getResource("red.png"));
											b88.setIcon(b8r);
											no21="Node21->";
											
											b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
											b77.setIcon(b7g);
											
											Thread.sleep(1000);
											idsl.setForeground(Color.red);
											idsl.setVisible(false);
											Thread.sleep(1000);
											idsl.setVisible(true);
											Thread.sleep(1000);
											idsl.setVisible(false);
											Thread.sleep(1000);
											idsl.setVisible(true);
											
											int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
											audit(no21,ene21);
											
											
											if(a1==0)
											{
												connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
												System.out.println("Yes");
											}
											if(a1==1)
											{
												System.out.println("No");
											}
											
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no18="Node18->";
											
											if(Integer.parseInt(ene21)>fsize)
											{
												
												if(mac.equalsIgnoreCase(mac21))
												{
													
												
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c8g=new ImageIcon(this.getClass().getResource("green.png"));
												c88.setIcon(c8g);
												no22="Node22->";
												
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("green.png"));
												a99.setIcon(a9g);
												no23="Node23->";
												
												send(cn,dest,destip,ct);
												refresh();
												
												}
												else
												{
													Thread.sleep(2000);
													c7r=new ImageIcon(this.getClass().getResource("red.png"));
													c77.setIcon(c7r);
													no22="Node22->";
													audit(no22,mac);
													
													JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
													connect.createStatement().executeUpdate("delete from dropped");
													connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
													DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
													dout.writeUTF("dropped");
													//send(cn,dest,destip,ct);
													refresh();
												}
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no22="Node22->";
												audit(no22,ene22);
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
												
											}
										}
										
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										b55.setIcon(b5r);
										no12="Node12->";
										
										b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
										b44.setIcon(b4r);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no12,ene12);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("green.png"));
										b44.setIcon(b4g);
										no9="Node9->";
										
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("green.png"));
										c44.setIcon(c4g);
										no9="Node9->";
										
										if(Integer.parseInt(ene13)>fsize)
										{
											if(mac.equalsIgnoreCase(mac13))
											{
												
											
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no13="Node13->";
											
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no16="Node16->";
											
											if(Integer.parseInt(ene19)>fsize)
											{
												if(Integer.parseInt(ene19)>fsize)
												{
													
												
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
										//		send(cn,dest,destip,ct);
												refresh();
												
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
											//	send(cn,dest,destip,ct);
												refresh();
											}
											}
											else
											{
												
											}
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no13="Node13->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}	
										}
										else
										{
											
										}
								
									}
								}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										b55.setIcon(b5r);
										no12="Node12->";
										
										b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
										b44.setIcon(b4r);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no12,ene12);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("green.png"));
										b44.setIcon(b4g);
										no9="Node9->";
										
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("green.png"));
										c44.setIcon(c4g);
										no9="Node9->";
										
										if(Integer.parseInt(ene13)>fsize)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no13="Node13->";
											
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no16="Node16->";
											
											if(Integer.parseInt(ene19)>fsize)
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
										//		send(cn,dest,destip,ct);
												refresh();
												
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
											//	send(cn,dest,destip,ct);
												refresh();
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no13="Node13->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}	
										
								}
								
								
								if(!mac.equalsIgnoreCase(mac14))
								{

									Thread.sleep(2000);
									a6r=new ImageIcon(this.getClass().getResource("red.png"));
									a66.setIcon(a6r);
									no14="Node14->";
									
									a5g=new ImageIcon(this.getClass().getResource("black.jpg"));
									a55.setIcon(a5g);
									no11="Node11->";
									
									Thread.sleep(1000);
									nodl.setForeground(Color.red);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									Thread.sleep(1000);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
									audit(no11,ene11);
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"' where node='"+node11+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("green.png"));
									a55.setIcon(a5g);
									no11="Node11->";
									
									if(Integer.parseInt(ene12)>fsize)
									{
										Thread.sleep(2000);
										b5g=new ImageIcon(this.getClass().getResource("green.png"));
										b55.setIcon(b5g);
										no12="Node12->";
										
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("green.png"));
										b66.setIcon(b6g);
										no15="Node15->";
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene21)>fsize)
										{
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("green.png"));
											b88.setIcon(b8g);
											no21="Node21->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
										}
										else
										{
											Thread.sleep(2000);
											b8r=new ImageIcon(this.getClass().getResource("red.png"));
											b88.setIcon(b8r);
											no21="Node21->";
											
											b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
											b77.setIcon(b7g);
											no18="Node18->";
											
											Thread.sleep(1000);
											nodl.setForeground(Color.red);
											nodl.setVisible(false);
											Thread.sleep(1000);
											nodl.setVisible(true);
											Thread.sleep(1000);
											nodl.setVisible(false);
											Thread.sleep(1000);
											nodl.setVisible(true);
											
											int a11=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
											audit(no21,ene21);
											
											
											if(a11==0)
											{
												connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
												System.out.println("Yes");
											}
											if(a11==1)
											{
												System.out.println("No");
											}
											
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("green.png"));
											b77.setIcon(b7g);
											no18="Node18->";
											
											if(Integer.parseInt(ene21)>fsize)
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no22="Node22->";
												
												Thread.sleep(2000);
												c8g=new ImageIcon(this.getClass().getResource("green.png"));
												c88.setIcon(c8g);
												no21="Node21->";
												
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("green.png"));
												a99.setIcon(a9g);
												no23="Node23->";
												
												send(cn,dest,destip,ct);
												refresh();
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no22="Node22->";
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
												
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										b5r=new ImageIcon(this.getClass().getResource("red.png"));
										b55.setIcon(b5r);
										no12="Node12->";
										
										b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
										b44.setIcon(b4r);
										no9="Node9->";
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a11=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no12,ene12);
										
										
										if(a11==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node12+"'");
											System.out.println("Yes");
										}
										if(a11==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("green.png"));
										b44.setIcon(b4g);
										no9="Node9->";
										
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("green.png"));
										c44.setIcon(c4g);
										no9="Node9->";
										
										if(Integer.parseInt(ene13)>fsize)
										{
											Thread.sleep(2000);
											c5g=new ImageIcon(this.getClass().getResource("green.png"));
											c55.setIcon(c5g);
											no13="Node13->";
											
											Thread.sleep(2000);
											c6g=new ImageIcon(this.getClass().getResource("green.png"));
											c66.setIcon(c6g);
											no16="Node16->";
											
											if(Integer.parseInt(ene19)>fsize)
											{
												Thread.sleep(2000);
												c7g=new ImageIcon(this.getClass().getResource("green.png"));
												c77.setIcon(c7g);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
										//		send(cn,dest,destip,ct);
												refresh();
												
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
											//	send(cn,dest,destip,ct);
												refresh();
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c5r=new ImageIcon(this.getClass().getResource("red.png"));
											c55.setIcon(c5r);
											no13="Node13->";
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}	
										
								}
								
								
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							a4r=new ImageIcon(this.getClass().getResource("red.png"));
							a44.setIcon(a4r);
							no8="Node8->";
							
							a3g=new ImageIcon(this.getClass().getResource("black.jpg"));
							a33.setIcon(a3g);
							
							Thread.sleep(1000);
							nodl.setForeground(Color.red);
							nodl.setVisible(false);
							Thread.sleep(1000);
							nodl.setVisible(true);
							Thread.sleep(1000);
							nodl.setVisible(false);
							Thread.sleep(1000);
							nodl.setVisible(true);
							
							int a=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
							audit(no8,mac8);
							
							if(a==0)
							{
								connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"' where node='"+node8+"'");
								System.out.println("Yes");
							}
							if(a==1)
							{
								System.out.println("No");
							}
							
							
							Thread.sleep(2000);
							a3g=new ImageIcon(this.getClass().getResource("green.png"));
							a33.setIcon(a3g);
							no5="Node5->";
							
							Thread.sleep(2000);
							b3g=new ImageIcon(this.getClass().getResource("green.png"));
							b33.setIcon(b3g);
							no6="Node6->";
						
							Thread.sleep(2000);
							b4g=new ImageIcon(this.getClass().getResource("green.png"));
							b44.setIcon(b4g);
							no9="Node9->";
						
							
							if(Integer.parseInt(ene12)>fsize)
							{
								if(mac.equalsIgnoreCase(mac12))
								{
								Thread.sleep(2000);
								b5g=new ImageIcon(this.getClass().getResource("green.png"));
								b55.setIcon(b5g);
								no12="Node12->";
								
								Thread.sleep(2000);
								b6g=new ImageIcon(this.getClass().getResource("green.png"));
								b66.setIcon(b6g);
								no15="Node15->";
								
								Thread.sleep(2000);
								b7g=new ImageIcon(this.getClass().getResource("green.png"));
								b77.setIcon(b7g);
								no18="Node18->";

								if(Integer.parseInt(ene21)>fsize)
								{
									if(mac.equalsIgnoreCase(mac21))
									{
										
									Thread.sleep(2000);
									b8g=new ImageIcon(this.getClass().getResource("green.png"));
									b88.setIcon(b8g);
									no21="Node21->";
									
									Thread.sleep(2000);
									a9g=new ImageIcon(this.getClass().getResource("green.png"));
									a99.setIcon(a9g);
									no23="Node23->";
									
									send(cn,dest,destip,ct);
									refresh();
									
								}
								else
								{

									Thread.sleep(2000);
									b8r=new ImageIcon(this.getClass().getResource("red.png"));
									b88.setIcon(b8r);
									no21="Node21->";
									
									b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
									b77.setIcon(b7g);
									
									Thread.sleep(1000);
									nodl.setForeground(Color.red);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									Thread.sleep(1000);
									nodl.setVisible(false);
									Thread.sleep(1000);
									nodl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
									audit(no21,mac21);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";
									
									if(Integer.parseInt(ene19)>fsize)
									{
										
										if(mac.equalsIgnoreCase(mac19))
										{
											
										
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no22="Node22->";
										
										Thread.sleep(2000);
										c8g=new ImageIcon(this.getClass().getResource("green.png"));
										c88.setIcon(c8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, mac19);
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
										}
									}
									else
									{
										Thread.sleep(2000);
										c7r=new ImageIcon(this.getClass().getResource("red.png"));
										c77.setIcon(c7r);
										no19="Node19->";
										audit(no19, ene19);
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
										//send(cn,dest,destip,ct);
										refresh();
										
									}
								
								}
							}
								else
								{
									Thread.sleep(2000);
									b8r=new ImageIcon(this.getClass().getResource("red.png"));
									b88.setIcon(b8r);
									no21="Node21->";
									
									b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
									b77.setIcon(b7g);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no21,ene21);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";
									
									if(Integer.parseInt(ene21)>fsize)
									{
										
										if(mac.equalsIgnoreCase(mac21))
										{
											
										
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c8g=new ImageIcon(this.getClass().getResource("green.png"));
										c88.setIcon(c8g);
										no22="Node22->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no22="Node22->";
											audit(no22,mac);
											
											JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
										}
									}
									else
									{
										Thread.sleep(2000);
										c7r=new ImageIcon(this.getClass().getResource("red.png"));
										c77.setIcon(c7r);
										no22="Node22->";
										audit(no22,ene22);
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
										//send(cn,dest,destip,ct);
										refresh();
										
									}
								}
								
							}
							else
							{
								Thread.sleep(2000);
								b5r=new ImageIcon(this.getClass().getResource("red.png"));
								b55.setIcon(b5r);
								no12="Node12->";
								
								b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
								b44.setIcon(b4r);
								
								Thread.sleep(1000);
								idsl.setForeground(Color.red);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								Thread.sleep(1000);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								
								int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
								audit(no12,ene12);
								
								
								if(a1==0)
								{
									connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
									System.out.println("Yes");
								}
								if(a1==1)
								{
									System.out.println("No");
								}
								
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("green.png"));
								b44.setIcon(b4g);
								no9="Node9->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("green.png"));
								c44.setIcon(c4g);
								no9="Node9->";
								
								if(Integer.parseInt(ene13)>fsize)
								{
									if(mac.equalsIgnoreCase(mac13))
									{
										
									
									Thread.sleep(2000);
									c5g=new ImageIcon(this.getClass().getResource("green.png"));
									c55.setIcon(c5g);
									no13="Node13->";
									
									Thread.sleep(2000);
									c6g=new ImageIcon(this.getClass().getResource("green.png"));
									c66.setIcon(c6g);
									no16="Node16->";
									
									if(Integer.parseInt(ene19)>fsize)
									{
										if(Integer.parseInt(ene19)>fsize)
										{
											
										
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c8g=new ImageIcon(this.getClass().getResource("green.png"));
										c88.setIcon(c8g);
										no22="Node22->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
									
										
									}
									else
									{
										Thread.sleep(2000);
										c7r=new ImageIcon(this.getClass().getResource("red.png"));
										c77.setIcon(c7r);
										no19="Node19->";
										audit(no19,mac19);
										
										JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}
									}
									else
									{
										Thread.sleep(2000);
										c7r=new ImageIcon(this.getClass().getResource("red.png"));
										c77.setIcon(c7r);
										no19="Node19->";
										audit(no19,ene19);
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}
								}
								else
								{
									Thread.sleep(2000);
									c5r=new ImageIcon(this.getClass().getResource("red.png"));
									c55.setIcon(c5r);
									no13="Node13->";
									
									JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
									connect.createStatement().executeUpdate("delete from dropped");
									connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
									DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
									dout.writeUTF("dropped");
								//	send(cn,dest,destip,ct);
									refresh();
								}	
								}
								else
								{
									
								}
						
							}
						}
							else
							{
								Thread.sleep(2000);
								b5r=new ImageIcon(this.getClass().getResource("red.png"));
								b55.setIcon(b5r);
								no12="Node12->";
								
								b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
								b44.setIcon(b4r);
								
								Thread.sleep(1000);
								idsl.setForeground(Color.red);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								Thread.sleep(1000);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								
								int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
								audit(no12,ene12);
								
								
								if(a1==0)
								{
									connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
									System.out.println("Yes");
								}
								if(a1==1)
								{
									System.out.println("No");
								}
								
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("green.png"));
								b44.setIcon(b4g);
								no9="Node9->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("green.png"));
								c44.setIcon(c4g);
								no9="Node9->";
								
								if(Integer.parseInt(ene13)>fsize)
								{
									Thread.sleep(2000);
									c5g=new ImageIcon(this.getClass().getResource("green.png"));
									c55.setIcon(c5g);
									no13="Node13->";
									
									Thread.sleep(2000);
									c6g=new ImageIcon(this.getClass().getResource("green.png"));
									c66.setIcon(c6g);
									no16="Node16->";
									
									if(Integer.parseInt(ene19)>fsize)
									{
										Thread.sleep(2000);
										c7g=new ImageIcon(this.getClass().getResource("green.png"));
										c77.setIcon(c7g);
										no19="Node19->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
								//		send(cn,dest,destip,ct);
										refresh();
										
									}
									else
									{
										Thread.sleep(2000);
										c7r=new ImageIcon(this.getClass().getResource("red.png"));
										c77.setIcon(c7r);
										no19="Node19->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}
									
								}
								else
								{
									Thread.sleep(2000);
									c5r=new ImageIcon(this.getClass().getResource("red.png"));
									c55.setIcon(c5r);
									no13="Node13->";
									
									JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
									connect.createStatement().executeUpdate("delete from dropped");
									connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
									DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
									dout.writeUTF("dropped");
								//	send(cn,dest,destip,ct);
									refresh();
								}	
								
						}
						
					
						
						}
						}
						else
						{
								Thread.sleep(2000);
								a4r=new ImageIcon(this.getClass().getResource("red.png"));
								a44.setIcon(a4r);
								no8="Node8->";
								
								a3g=new ImageIcon(this.getClass().getResource("black.jpg"));
								a33.setIcon(a3g);
								no5="Node5->";
								
								Thread.sleep(1000);
								idsl.setForeground(Color.red);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								Thread.sleep(1000);
								idsl.setVisible(false);
								Thread.sleep(1000);
								idsl.setVisible(true);
								
								int a=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
								audit(no8,ene8);
								
								if(a==0)
								{
									connect.createStatement().executeUpdate("update NodesInfo set bw='"+fsize+"' where node='"+node8+"'");
									System.out.println("Yes");
								}
								if(a==1)
								{
									System.out.println("No");
								}
								
								
								Thread.sleep(2000);
								a3g=new ImageIcon(this.getClass().getResource("green.png"));
								a33.setIcon(a3g);
								no5="Node5->";
								
								Thread.sleep(2000);
								b3g=new ImageIcon(this.getClass().getResource("green.png"));
								b33.setIcon(b3g);
								no3="Node3->";
							
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("green.png"));
								b44.setIcon(b4g);
								no9="Node9->";
							
								if(Integer.parseInt(ene12)>fsize)
								{
									if(mac.equalsIgnoreCase(mac12))
									{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("green.png"));
									b55.setIcon(b5g);
									no12="Node12->";
									
									Thread.sleep(2000);
									b6g=new ImageIcon(this.getClass().getResource("green.png"));
									b66.setIcon(b6g);
									no15="Node15->";
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("green.png"));
									b77.setIcon(b7g);
									no18="Node18->";

									if(Integer.parseInt(ene21)>fsize)
									{
										if(mac.equalsIgnoreCase(mac21))
										{
											
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("green.png"));
										b88.setIcon(b8g);
										no21="Node21->";
										
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("green.png"));
										a99.setIcon(a9g);
										no23="Node23->";
										
										send(cn,dest,destip,ct);
										refresh();
										
									}
									else
									{

										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										nodl.setForeground(Color.red);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										Thread.sleep(1000);
										nodl.setVisible(false);
										Thread.sleep(1000);
										nodl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "MAC Attacked!!! \n Do you want to Update it?");
										audit(no21,mac21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set mac='"+mac+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac19))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no22="Node22->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no21="Node21->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no19="Node19->";
												audit(no19, mac19);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											audit(no19, ene19);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no19+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									
									}
								}
									else
									{
										Thread.sleep(2000);
										b8r=new ImageIcon(this.getClass().getResource("red.png"));
										b88.setIcon(b8r);
										no21="Node21->";
										
										b7g=new ImageIcon(this.getClass().getResource("black.jpg"));
										b77.setIcon(b7g);
										
										Thread.sleep(1000);
										idsl.setForeground(Color.red);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										Thread.sleep(1000);
										idsl.setVisible(false);
										Thread.sleep(1000);
										idsl.setVisible(true);
										
										int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
										audit(no21,ene21);
										
										
										if(a1==0)
										{
											connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node21+"'");
											System.out.println("Yes");
										}
										if(a1==1)
										{
											System.out.println("No");
										}
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("green.png"));
										b77.setIcon(b7g);
										no18="Node18->";
										
										if(Integer.parseInt(ene21)>fsize)
										{
											
											if(mac.equalsIgnoreCase(mac21))
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c8g=new ImageIcon(this.getClass().getResource("green.png"));
											c88.setIcon(c8g);
											no22="Node22->";
											
											Thread.sleep(2000);
											a9g=new ImageIcon(this.getClass().getResource("green.png"));
											a99.setIcon(a9g);
											no23="Node23->";
											
											send(cn,dest,destip,ct);
											refresh();
											
											}
											else
											{
												Thread.sleep(2000);
												c7r=new ImageIcon(this.getClass().getResource("red.png"));
												c77.setIcon(c7r);
												no22="Node22->";
												audit(no22,mac);
												
												JOptionPane.showMessageDialog(null, "MAC Attacked!!! \n No Alternative Paths Left");
												connect.createStatement().executeUpdate("delete from dropped");
												connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
												DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
												dout.writeUTF("dropped");
												//send(cn,dest,destip,ct);
												refresh();
											}
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no22="Node22->";
											audit(no22,ene22);
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no22+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
											//send(cn,dest,destip,ct);
											refresh();
											
										}
									}
									
								}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
									b44.setIcon(b4r);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no12,ene12);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no9="Node9->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no9="Node9->";
									
									if(Integer.parseInt(ene13)>fsize)
									{
										if(mac.equalsIgnoreCase(mac13))
										{
											
										
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no13="Node13->";
										
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no16="Node16->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											if(Integer.parseInt(ene19)>fsize)
											{
												
											
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
									//		send(cn,dest,destip,ct);
											refresh();
											
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
										}
										else
										{
											
										}
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no13="Node13->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}	
									}
									else
									{
										
									}
							
								}
							}
								else
								{
									Thread.sleep(2000);
									b5r=new ImageIcon(this.getClass().getResource("red.png"));
									b55.setIcon(b5r);
									no12="Node12->";
									
									b4r=new ImageIcon(this.getClass().getResource("black.jpg"));
									b44.setIcon(b4r);
									
									Thread.sleep(1000);
									idsl.setForeground(Color.red);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									Thread.sleep(1000);
									idsl.setVisible(false);
									Thread.sleep(1000);
									idsl.setVisible(true);
									
									int a1=JOptionPane.showConfirmDialog(null, "Less Energy Found In The Node!!! \n Do you want to Update it?");
									audit(no12,ene12);
									
									
									if(a1==0)
									{
										connect.createStatement().executeUpdate("Update NodesInfo set bw='"+fsize+"' where node='"+node12+"'");
										System.out.println("Yes");
									}
									if(a1==1)
									{
										System.out.println("No");
									}
									
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("green.png"));
									b44.setIcon(b4g);
									no9="Node9->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("green.png"));
									c44.setIcon(c4g);
									no9="Node9->";
									
									if(Integer.parseInt(ene13)>fsize)
									{
										Thread.sleep(2000);
										c5g=new ImageIcon(this.getClass().getResource("green.png"));
										c55.setIcon(c5g);
										no13="Node13->";
										
										Thread.sleep(2000);
										c6g=new ImageIcon(this.getClass().getResource("green.png"));
										c66.setIcon(c6g);
										no16="Node16->";
										
										if(Integer.parseInt(ene19)>fsize)
										{
											Thread.sleep(2000);
											c7g=new ImageIcon(this.getClass().getResource("green.png"));
											c77.setIcon(c7g);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
									//		send(cn,dest,destip,ct);
											refresh();
											
										}
										else
										{
											Thread.sleep(2000);
											c7r=new ImageIcon(this.getClass().getResource("red.png"));
											c77.setIcon(c7r);
											no19="Node19->";
											
											JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
											connect.createStatement().executeUpdate("delete from dropped");
											connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
											DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
											dout.writeUTF("dropped");
										//	send(cn,dest,destip,ct);
											refresh();
										}
										
									}
									else
									{
										Thread.sleep(2000);
										c5r=new ImageIcon(this.getClass().getResource("red.png"));
										c55.setIcon(c5r);
										no13="Node13->";
										
										JOptionPane.showMessageDialog(null, "Less Energy Found In The Node!!! \n No Alternative Paths Left");
										connect.createStatement().executeUpdate("delete from dropped");
										connect.createStatement().executeUpdate("insert into dropped values('"+no13+"','"+fname+"','"+dt+"')");
										DataOutputStream dout = new DataOutputStream(cn.getOutputStream());
										dout.writeUTF("dropped");
									//	send(cn,dest,destip,ct);
										refresh();
									}	
									
							}
							
						}							
											

					
					
					
					   
					
					
					
					
						
					}
					
					
					
				}catch (Exception e) {

				}
		}
			if(this.port==3939)
			{


				try
				{
					ServerSocket server909 = new ServerSocket(3939);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					mac	= dis.readUTF();
					fname	= dis.readUTF();
					
					String att="No";
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node1+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node2+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node3+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node4+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node5+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node6+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node7+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node8+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node9+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node10+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node11+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node12+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node13+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node14+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node15+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node16+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node17+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node18+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node19+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node20+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node21+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node22+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"' where node='"+node23+"'");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("success");
						   
					
					
					}
					}catch (Exception e34) {
						// TODO: handle exception
					}
					
}
			if(this.port==4445)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4445);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String node1	= dis.readUTF();
				
					String attack="Yes";
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
					String energy="";
					
				    if(node1.equalsIgnoreCase("Node8"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node12"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node13"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node14"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node19"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node20"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node21"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(3);
				    	}
				    }
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("success");	
					ds.writeUTF(energy);			
					}
					
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			
			if(this.port==1111)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1111);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String msg	= dis.readUTF();
					System.out.println(msg);
					
					ResultSet rss=connect.createStatement().executeQuery("select * from Dropped");
					
					if(rss.next()==true)
					{
						String file=rss.getString(2);
						String node=rss.getString(1);
						
						if(node.equalsIgnoreCase("Node13->"))
						{
							String[] dsname = { "Select Destination", "A", "B", "C", "D", "E" };
							
							 String dataname = (String) JOptionPane.showInputDialog(null,"Select Destination", "Destination Name",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
							 
							 String destip = JOptionPane.showInputDialog(null,
										"Please Enter the IP Address Of "+dataname);
							 
							 	Thread.sleep(2000);
								c5g=new ImageIcon(this.getClass().getResource("green.png"));
								c55.setIcon(c5g);
								no13="Node13->";
								
								Thread.sleep(2000);
								c6g=new ImageIcon(this.getClass().getResource("green.png"));
								c66.setIcon(c6g);
								no16="Node16->";
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								String f = file.substring(0, file.indexOf("."));
								String cname = "Router\\";
								MergeFile mf = new MergeFile();
								mf.mergeFiles(f, cname);
								
								FileInputStream fs = new FileInputStream(cname + f + "x.txt");
								byte bs1[] = new byte[fs.available()];
								fs.read(bs1);
								String cont = new String(bs1);
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}
						
						if(node.equalsIgnoreCase("Node19->"))
						{
							String[] dsname = { "Select Destination", "A", "B", "C", "D", "E" };
							
							 String dataname = (String) JOptionPane.showInputDialog(null,"Select Destination", "Destination Name",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
							 
							 String destip = JOptionPane.showInputDialog(null,
										"Please Enter the IP Address Of "+dataname);
							 
							 	
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								String f = file.substring(0, file.indexOf("."));
								String cname = "Router\\";
								MergeFile mf = new MergeFile();
								mf.mergeFiles(f, cname);
								
								FileInputStream fs = new FileInputStream(cname + f + "x.txt");
								byte bs1[] = new byte[fs.available()];
								fs.read(bs1);
								String cont = new String(bs1);
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}
					}
					else
					{
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("nofile");
					}
				   
									
					}
					
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			if(this.port==2222)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(2222);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String fname	= dis.readUTF();
					String dataname	= dis.readUTF();
					String destip	= dis.readUTF();
						
					String f = fname.substring(0, fname.indexOf("."));
					String cname = "Router\\";
					MergeFile mf = new MergeFile();
					mf.mergeFiles(f, cname);
					
					FileInputStream fs = new FileInputStream(cname + f + "x.txt");
					byte bs1[] = new byte[fs.available()];
					fs.read(bs1);
					String cont = new String(bs1);
					
					ResultSet rss=connect.createStatement().executeQuery("select * from Dropped");
					
					if(rss.next()==true)
					{
						String node=rss.getString(1);
						if(node.equalsIgnoreCase("Node13->"))
						{
							 	Thread.sleep(2000);
								c5g=new ImageIcon(this.getClass().getResource("green.png"));
								c55.setIcon(c5g);
								no13="Node13->";
								
								Thread.sleep(2000);
								c6g=new ImageIcon(this.getClass().getResource("green.png"));
								c66.setIcon(c6g);
								no16="Node16->";
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
							
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}
						
						if(node.equalsIgnoreCase("Node19->"))
						{
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}	
						}
					}
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			if(this.port==4444)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4444);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String node1	= dis.readUTF();
					String mem	= dis.readUTF();
					String ip	= dis.readUTF();
					
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
					
					ResultSet rr=connect.createStatement().executeQuery("select * from Attacker where ip='"+ip+"'");
				    int count=0;
				    
					if(rr.next()==true)
					{
						count=rr.getInt(4);
						
						if(count>=2)
						{
							DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
							ds.writeUTF("block");
							
						}
						else if(count<2)
						{
							String cnt="2";
							connect.createStatement().executeUpdate("update Attacker set count='"+cnt+"' where ip='"+ip+"'");
							
							DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
							ds.writeUTF("attack");
						}
						else
						{
							String attack="Yes";
							connect.createStatement().executeUpdate("update NodesInfo set bw='"+mem+"',attack2='"+attack+"' where node='"+node1+"'");
							String cont="2";
							connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node1+"','"+mem+"','"+cont+"','"+dt+"')");
						
							DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
							ds.writeUTF("attack");
							
						}
					}
					if(rr.next()!=true)
					{
						String attack="Yes";
						connect.createStatement().executeUpdate("update NodesInfo set bw='"+mem+"',attack2='"+attack+"' where node='"+node1+"'");
						String cont="1";
						connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node1+"','"+mem+"','"+cont+"','"+dt+"')");
					
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");
					}
					}
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			
			
			
			if(this.port==1412)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1412);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String node	= dis.readUTF();
					String filename	= dis.readUTF();
					String text	= dis.readUTF();
					String ip	= dis.readUTF(); 
					
					String file=filename.substring(0, filename.indexOf("."));
					
//					ResultSet rss=connect.createStatement().executeQuery("select * from Attacker where ip='"+ip+"'");
//					
//					if(rss.next()==true)
//					{
//						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
//						ds.writeUTF("block");
//						
//					}
//					else
//					{
						ResultSet r1=connect.createStatement().executeQuery("select * from Router where fname='"+filename+"'");
						SimpleDateFormat dateFormat = new SimpleDateFormat();
					    Date date = new Date();
					    String dt=dateFormat.format(date);
					    
						if(r1.next()==true)
						{
							FileInputStream fs = new FileInputStream("Router\\"+file+".txt");
							byte bs1[] = new byte[fs.available()];
							fs.read(bs1);
							String content = new String(bs1);
							
							StringBuffer sb = new StringBuffer(content);
							String maldata = sb.append(text).toString();
							System.out.println("Malicious Data : "+text);
						 
							PrintStream out = new PrintStream(new FileOutputStream("Router\\"+file+".txt"));
						    out.print(maldata);
							out.close();
							
							MessageDigest md = MessageDigest.getInstance("SHA1");
							FileInputStream in1 = new FileInputStream("Router\\" + file+".txt");
							DigestInputStream dis2 = new DigestInputStream(in1, md);
							BufferedInputStream bd = new BufferedInputStream(dis2);

							while (true) {
								int b2 = bd.read();
								if (b2 == -1)
									break;
							}

							BigInteger bi2 = new BigInteger(md.digest());
							String mac = bi2.toString(16);
							System.out.println("New MAC : "+mac);
							
							ResultSet r12=connect.createStatement().executeQuery("select * from Attacker where ip='"+ip+"'");
						    int count=0;
						    
							if(r12.next()==true)
							{
								count=r12.getInt(4);
								
								if(count>=2)
								{
									DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
									ds.writeUTF("block");
									
								}
								else if(count<2)
								{
									String cnt="2";
									connect.createStatement().executeUpdate("update Attacker set count='"+cnt+"' where ip='"+ip+"'");
									
									DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
									ds.writeUTF("attack");
								}
								else
								{
									String attack="Yes";
									connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
									String cont="2";
									connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node+"','"+text+"','"+cont+"','"+dt+"')");
								
									DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
									ds.writeUTF("attack");
									
								}
							}
							if(r12.next()!=true)
							{
								String attack="Yes";
								connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
								String cont="1";
								connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node+"','"+text+"','"+cont+"','"+dt+"')");
								
								
							
								DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
								ds.writeUTF("attack");
							}
							
						
						}
						else
						{
							DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
							ds.writeUTF("nofile");
						}
					}	
					
					}catch (Exception e) {
								e.printStackTrace();
						}
						
					 }
			
		}

		   void ref() throws InterruptedException {

			   Thread.sleep(2000);
				c5g=new ImageIcon(this.getClass().getResource("black.jpg"));
				c55.setIcon(c5g);
				
				c6g=new ImageIcon(this.getClass().getResource("black.jpg"));
				c66.setIcon(c6g);
				
				c7g=new ImageIcon(this.getClass().getResource("black.jpg"));
				c77.setIcon(c7g);
				
				c8g=new ImageIcon(this.getClass().getResource("black.jpg"));
				c88.setIcon(c8g);
				
				a9g=new ImageIcon(this.getClass().getResource("black.jpg"));
				a99.setIcon(a9g);
			
		}

		void getmac() throws SQLException {
			  
			  	ResultSet r2=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node2+"'");
				if(r2.next()==true){ mac2=r2.getString(4);}
				ResultSet r3=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node3+"'");
				if(r3.next()==true){ mac3=r3.getString(4);}
				ResultSet r4=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node4+"'");
				if(r4.next()==true){ mac4=r4.getString(4);}
				ResultSet  r5=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node5+"'");
				if(r5.next()==true){ mac5=r5.getString(4);}
				ResultSet  r6=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node6+"'");
				if(r6.next()==true){ mac6=r6.getString(4);}
				ResultSet r7=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node7+"'");
				if(r7.next()==true){ mac7=r7.getString(4);}
				ResultSet r8=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node8+"'");
				if(r8.next()==true){ mac8=r8.getString(4);}
				ResultSet  r9=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node9+"'");
				if(r9.next()==true){ mac9=r9.getString(4);}
				ResultSet r10=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node10+"'");
				if(r10.next()==true){ mac10=r10.getString(4);}
				ResultSet  r11=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node11+"'");
				if(r11.next()==true){ mac11=r11.getString(4);}
				ResultSet  r12=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node12+"'");
				if(r12.next()==true){ mac12=r12.getString(4);}
				ResultSet  r13=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node13+"'");
				if(r13.next()==true){ mac13=r13.getString(4);}
				ResultSet  r14=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node14+"'");
				if(r14.next()==true){ mac14=r14.getString(4);}
				ResultSet  r15=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node15+"'");
				if(r15.next()==true){ mac15=r15.getString(4);}
				ResultSet  r16=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node16+"'");
				if(r16.next()==true){ mac16=r16.getString(4);}
				ResultSet  r17=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node17+"'");
				if(r17.next()==true){ mac17=r17.getString(4);}
				ResultSet  r18=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node18+"'");
				if(r18.next()==true){ mac18=r18.getString(4);}
				ResultSet  r19=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node19+"'");
				if(r19.next()==true){ mac19=r19.getString(4);}
				ResultSet r20=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node20+"'");
				if(r20.next()==true){ mac20=r20.getString(4);}
				ResultSet r21=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node21+"'");
				if(r21.next()==true){ mac21=r21.getString(4);}
				ResultSet r22=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node22+"'");
				if(r22.next()==true){ mac22=r22.getString(4);}
			  
		}

		void audit(String nod, String ene) throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				
				String node = nod.substring(0, nod.indexOf("-"));
				
//					JOptionPane.showMessageDialog(null,"Congestion Occured At " +node);
				
					Socket sc = new Socket("localhost",309);
					
					DataOutputStream dd = new DataOutputStream(sc.getOutputStream());
					dd.writeUTF(node);
					dd.writeUTF(ene);
					
					DataInputStream din = new DataInputStream(sc.getInputStream());
					
					String mes = din.readUTF();
					System.out.println(mes);
				}

		void send(Socket cn,String dest,String destip,String ct) throws UnknownHostException, IOException, SQLException {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat();
		    Date date = new Date();
		    String dt=dateFormat.format(date);
			long  end = System.currentTimeMillis();
			System.out.println("The Ending Time "+end);


			String timeDelay = Long.toString(end-start)+ct.length();

			System.out.println("Total Time Delay "+timeDelay);
			String path=no1+no2+no3+no4+no5+no6+no7+no8+no9+no10+no11+no12+no13+no14+no15+no16+no17+no18+no19+no20+no21+no22+no23+no24+no25+no26+no27+no28+no29+no30+no31+no32;
			Statement fin2=connect.createStatement();
			String sin2="insert into TimeDelay values('"+fname+"','"+dest+"','"+dt+"','"+timeDelay+"','"+path+"')";
			fin2.executeUpdate(sin2);
			System.out.println("Table Delay Updated");
			
			String f = fname.substring(0, fname.indexOf("."));
			String cname = "Router\\";
			MergeFile mf = new MergeFile();
			mf.mergeFiles(f, cname);
			
			FileInputStream fs = new FileInputStream(cname + f + "x.txt");
			byte bs1[] = new byte[fs.available()];
			fs.read(bs1);
			String content = new String(bs1);
			
			 if(dest.equalsIgnoreCase("A"))
				{
					Socket dest1=new Socket(destip,9991);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d1=new DataOutputStream(cn.getOutputStream());
					d1.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("B"))
				{
					Socket dest1=new Socket(destip,9992);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d2=new DataOutputStream(cn.getOutputStream());
					d2.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("C"))
				{
					Socket dest1=new Socket(destip,9993);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d3=new DataOutputStream(cn.getOutputStream());
					d3.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("D"))
				{
					Socket dest1=new Socket(destip,9994);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d4=new DataOutputStream(cn.getOutputStream());
					d4.writeUTF("success");
				}
				if(dest.equalsIgnoreCase("E"))
				{
					Socket dest1=new Socket(destip,9995);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d5=new DataOutputStream(cn.getOutputStream());
					d5.writeUTF("success");
				}
			
		}
		}
			
				
	
//Run Method

		     private void getband() throws SQLException {
			

					
					ResultSet r2=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node2+"'");
					if(r2.next()==true){ ene2=r2.getString(3);}
					ResultSet r3=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node3+"'");
					if(r3.next()==true){ ene3=r3.getString(3);}
					ResultSet r4=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node4+"'");
					if(r4.next()==true){ ene4=r4.getString(3);}
					ResultSet  r5=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node5+"'");
					if(r5.next()==true){ ene5=r5.getString(3);}
					ResultSet  r6=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node6+"'");
					if(r6.next()==true){ ene6=r6.getString(3);}
					ResultSet r7=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node7+"'");
					if(r7.next()==true){ ene7=r7.getString(3);}
					ResultSet r8=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node8+"'");
					if(r8.next()==true){ ene8=r8.getString(3);}
					ResultSet  r9=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node9+"'");
					if(r9.next()==true){ ene9=r9.getString(3);}
					ResultSet r10=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node10+"'");
					if(r10.next()==true){ ene10=r10.getString(3);}
					ResultSet  r11=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node11+"'");
					if(r11.next()==true){ ene11=r11.getString(3);}
					ResultSet  r12=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node12+"'");
					if(r12.next()==true){ ene12=r12.getString(3);}
					ResultSet  r13=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node13+"'");
					if(r13.next()==true){ ene13=r13.getString(3);}
					ResultSet  r14=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node14+"'");
					if(r14.next()==true){ ene14=r14.getString(3);}
					ResultSet  r15=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node15+"'");
					if(r15.next()==true){ ene15=r15.getString(3);}
					ResultSet  r16=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node16+"'");
					if(r16.next()==true){ ene16=r16.getString(3);}
					ResultSet  r17=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node17+"'");
					if(r17.next()==true){ ene17=r17.getString(3);}
					ResultSet  r18=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node18+"'");
					if(r18.next()==true){ ene18=r18.getString(3);}
					ResultSet  r19=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node19+"'");
					if(r19.next()==true){ ene19=r19.getString(3);}
					ResultSet r20=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node20+"'");
					if(r20.next()==true){ ene20=r20.getString(3);}
					ResultSet r21=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node21+"'");
					if(r21.next()==true){ ene21=r21.getString(3);}
					ResultSet r22=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node22+"'");
					if(r22.next()==true){ ene22=r22.getString(3);}
					
		}

			

			void refresh() throws InterruptedException {

				Thread.sleep(4000);
				a1=new ImageIcon(this.getClass().getResource("black.jpg"));
				a11.setIcon(a1);
				a2=new ImageIcon(this.getClass().getResource("black.jpg"));
				a22.setIcon(a2);
				a3=new ImageIcon(this.getClass().getResource("black.jpg"));
				a33.setIcon(a3);
				a4=new ImageIcon(this.getClass().getResource("black.jpg"));
				a44.setIcon(a4);
				a5=new ImageIcon(this.getClass().getResource("black.jpg"));
				a55.setIcon(a5);
				a6=new ImageIcon(this.getClass().getResource("black.jpg"));
				a66.setIcon(a6);
				a7=new ImageIcon(this.getClass().getResource("black.jpg"));
				a77.setIcon(a7);
				a8=new ImageIcon(this.getClass().getResource("black.jpg"));
				a88.setIcon(a8);
				a9=new ImageIcon(this.getClass().getResource("black.jpg"));
				a99.setIcon(a9);
				b2=new ImageIcon(this.getClass().getResource("black.jpg"));
				b22.setIcon(b2);
				b3=new ImageIcon(this.getClass().getResource("black.jpg"));
				b33.setIcon(b3);
				b4=new ImageIcon(this.getClass().getResource("black.jpg"));
				b44.setIcon(b4);
				b5=new ImageIcon(this.getClass().getResource("black.jpg"));
				b55.setIcon(b5);
				b6=new ImageIcon(this.getClass().getResource("black.jpg"));
				b66.setIcon(b6);
				b7=new ImageIcon(this.getClass().getResource("black.jpg"));
				b77.setIcon(b7);
				b8=new ImageIcon(this.getClass().getResource("black.jpg"));
				b88.setIcon(b8);
				c2=new ImageIcon(this.getClass().getResource("black.jpg"));
				c22.setIcon(c2);
				c3=new ImageIcon(this.getClass().getResource("black.jpg"));
				c33.setIcon(c3);
				c4=new ImageIcon(this.getClass().getResource("black.jpg"));
				c44.setIcon(c4);
				c5=new ImageIcon(this.getClass().getResource("black.jpg"));
				c55.setIcon(c5);
				c6=new ImageIcon(this.getClass().getResource("black.jpg"));
				c66.setIcon(c6);
				c7=new ImageIcon(this.getClass().getResource("black.jpg"));
				c77.setIcon(c7);
				c8=new ImageIcon(this.getClass().getResource("black.jpg"));
				c88.setIcon(c8);
				
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
			
		}

}