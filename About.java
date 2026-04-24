import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    private JLabel imgLabel,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
    private ImageIcon img1,img2,img3,img4,img5;
    private JButton btn1;
	private ImageIcon icon;
	private JLabel label,label12,label13;

    About() {
        setTitle("About");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.WHITE);
		panel.setBackground(Color.decode("#AFF2DD"));
		
		// Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());
		
		
		label = new JLabel("Adopting a pet can bring immense joy and companionship into your life.");
        label.setFont(new Font("Arial", Font.BOLD, 22));
        label.setForeground(Color.BLACK);
        label.setBounds(250, 30, 900, 30);
        panel.add(label);
		
		label12 = new JLabel("It's crucial to ensure you're ready for the responsibility and commitment.");
        label12.setFont(new Font("Arial", Font.BOLD, 22));
        label12.setForeground(Color.BLACK);
        label12.setBounds(250, 60, 900, 30);
        panel.add(label12);
		
		label13 = new JLabel("Consider visiting local shelters or rescue organizations to find your perfect");
        label13.setFont(new Font("Arial", Font.BOLD, 22));
        label13.setForeground(Color.BLACK);
        label13.setBounds(250, 90, 900, 30);
        panel.add(label13);


        
		
		label1 = new JLabel("INSTRUCTOR:MD. NAZMUL HOSSAIN");
        label1.setFont(new Font("Arial", Font.BOLD, 15));
        label1.setForeground(Color.BLACK);
        label1.setBounds(40, 220, 500, 100); // Adjusted label position and width
        panel.add(label1);
		
		label2 = new JLabel("ID: 2001-2044-2");
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        label2.setForeground(Color.BLACK);
        label2.setBounds(40, 240, 500, 100); // Adjusted label position and width
        panel.add(label2);
		
		label3 = new JLabel("LECTURER,CS");
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        label3.setForeground(Color.BLACK);
        label3.setBounds(40, 260, 500, 100); // Adjusted label position and width
        panel.add(label3);
		

 
		label4 = new JLabel("EMAIL:nazmul@aiub.edu");
        label4.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setForeground(Color.BLACK);
        label4.setBounds(40, 280, 500, 100); // Adjusted label position and width
        panel.add(label4);
		
		label5 = new JLabel("Sagor Chandra");
        label5.setFont(new Font("Arial", Font.BOLD, 18));
        label5.setForeground(Color.BLUE);
        label5.setBounds(350,370 , 500, 100); // Adjusted label position and width
        panel.add(label5);
		
		label6 = new JLabel("ID:22-49847-3");
        label6.setFont(new Font("Arial", Font.BOLD, 18));
        label6.setForeground(Color.BLUE);
        label6.setBounds(350, 390, 500, 100); // Adjusted label position and width
        panel.add(label6);
		
		label7 = new JLabel("Basudeb Kundu");
        label7.setFont(new Font("Arial", Font.BOLD, 18));
        label7.setForeground(Color.BLUE);
        label7.setBounds(600, 370, 500, 100); // Adjusted label position and width
        panel.add(label7);
		
		
		label8 = new JLabel("ID:23-50856-1");
        label8.setFont(new Font("Arial", Font.BOLD, 18));
        label8.setForeground(Color.BLUE);
        label8.setBounds(600, 390, 500, 100); // Adjusted label position and width
        panel.add(label8);
		
		label9 = new JLabel("Mahmudul Hassan Mafi");
        label9.setFont(new Font("Arial", Font.BOLD, 18));
        label9.setForeground(Color.BLUE);
        label9.setBounds(850, 370, 500, 100); // Adjusted label position and width
        panel.add(label9);
		
		label10 = new JLabel("ID:23-50171-1");
        label10.setFont(new Font("Arial", Font.BOLD, 18));
        label10.setForeground(Color.BLUE);
        label10.setBounds(850, 390, 500, 100); // Adjusted label position and width
        panel.add(label10);
		
		
		/*label4 = new JLabel("EMAIL:nazmul@aiub.edu");
        label4.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setForeground(Color.BLACK);
        label4.setBounds(40, 280, 500, 100); // Adjusted label position and width
        panel.add(label4);
		
		label4 = new JLabel("EMAIL:nazmul@aiub.edu");
        label4.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setForeground(Color.BLACK);
        label4.setBounds(40, 280, 500, 100); // Adjusted label position and width
        panel.add(label4);*/
		

        btn1 = new JButton("Back");
        btn1.setBounds(560, 510, 160, 40);
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);
		btn1.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(btn1); // Added missing semicolon here

        img1 = new ImageIcon(getClass().getResource("/Image/Sir1.jpg"));
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(40, 40, img1.getIconWidth(), img1.getIconHeight());
        panel.add(imgLabel);
		
		/*img2 = new ImageIcon(getClass().getResource("/Image/AdoptPet describe2.png"));
        imgLabel = new JLabel(img2);
        imgLabel.setBounds(1000, 0, img2.getIconWidth(), img2.getIconHeight());
        panel.add(imgLabel);*/
		
		
		img3 = new ImageIcon(getClass().getResource("/Image/Sagor.jpg"));
        imgLabel = new JLabel(img3);
        imgLabel.setBounds(350, 200, img3.getIconWidth(), img3.getIconHeight());
        panel.add(imgLabel);
		
		img4 = new ImageIcon(getClass().getResource("/Image/Basudeb.jpg"));
        imgLabel = new JLabel(img4);
        imgLabel.setBounds(600, 200, img4.getIconWidth(), img4.getIconHeight());
        panel.add(imgLabel);
		
		img5 = new ImageIcon(getClass().getResource("/Image/mafi.jpg"));
        imgLabel = new JLabel(img5);
        imgLabel.setBounds(850, 200, img5.getIconWidth(), img5.getIconHeight());
        panel.add(imgLabel);
		
		

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            Home hp = new Home();
            this.setVisible(false);
            hp.setVisible(true);
        }
    }

    public static void main(String[] args) {
        About about = new About();
    }
}
