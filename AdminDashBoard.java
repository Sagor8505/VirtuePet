import javax.swing.*;  
import java.awt.event.*;  
public class AdminDashBoard implements ActionListener{  
      
   
	JButton AUrbtn,Aadminbtn,UrInbtn,Exitbtn;
    JLabel l1,l2,l3;
	JFrame frame;
	ImageIcon AddUserIcon;
    ImageIcon AddDeveloperIcon;
    ImageIcon UserInfoIcon;
	
    AdminDashBoard(){

        AddUserIcon = new ImageIcon("/Image/AddUser.png");
        AddDeveloperIcon = new ImageIcon("/Image/AddDeveloper.png");
        UserInfoIcon = new ImageIcon("/Image/UserInfo.png");		
        
		//create frame
		frame = new JFrame ("Admin Dashboard");
		
        //construct components
        AUrbtn = new JButton (AddUserIcon);
		UrInbtn = new JButton (UserInfoIcon);
		Aadminbtn = new JButton (AddDeveloperIcon);
		Exitbtn = new JButton ("Exit");
        l1 = new JLabel ("Add User");
		l2 = new JLabel ("Add Admin");
		l3 = new JLabel ("User Info");
       
        //add components
        frame.add (AUrbtn);
        frame.add (UrInbtn);
        frame.add (Aadminbtn);
        frame.add (Exitbtn);
        frame.add (l1);
        frame.add (l2);
        frame.add (l3);
        

        //set component bounds (only needed by Absolute Positioning)
        AUrbtn.setBounds (100,190,215,215);
        UrInbtn.setBounds (480,190,215,215);
        Aadminbtn.setBounds (830,190,215,215);
        Exitbtn.setBounds (1000, 500, 100, 25);
        l1.setBounds (170, 110, 250, 80);
        l2.setBounds (900, 110, 250, 80);
        l3.setBounds (560, 110, 250, 80);
        
		
		//addActionListener
		Exitbtn.addActionListener(this);
		AUrbtn.addActionListener(this);
		UrInbtn.addActionListener(this);
		Aadminbtn.addActionListener(this);
		
		
        //frame properties
		//adjust size and set layout
        frame.setSize (1200, 600);
		frame.setLocationRelativeTo(null);//to center screen gui
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);  
    }     


      public void actionPerformed(ActionEvent e) {
		/*  
	   if(ae.getSource()==UrInbtn)
		{
			
			this.setVisible(false);
			new UserInfoPage();
			
		}
	   else if(ae.getSource()==AUrbtn)
		{
			
			this.setVisible(false);
			new AddingNewUser();
			
		}
	   else if(ae.getSource()==Aadminbtn)
		{
			
			this.setVisible(false);
			new AddAdmin();
			
		}
       else
*/		   if(e.getSource()==Exitbtn)
		{  
			//new Login();
			//frame.setVisible(false);
			System.exit(0);
			
        }		
    }
    public static void main(String[] args) {
        new AdminDashBoard();
    }	
      
}