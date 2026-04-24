import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class Home extends JFrame implements ActionListener {
    private JButton aboutButton;
    private JButton popularPetsButton;
    private JButton adminLoginButton;
    private JButton logInButton;
    private JButton registrationButton;
    private JButton adoptPetsButton;
    private JLabel label,label1,imgLabel;
	private ImageIcon icon;
    private ImageIcon logo, img1;
	

    Home() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setResizable(false);
        setLocationRelativeTo(null);
		
		

        JPanel panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.WHITE);
		panel.setBackground(Color.decode("#AFF2DD"));
		//panel.setBackground(Color.decode("#8a2be2"));
		


        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		// Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());

		
		label = new JLabel("The most important thing you can do for an animal is to love it.");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setForeground(Color.BLACK);
        label.setBounds(245, 38, 800, 30);
        panel.add(label);
		
		label1 = new JLabel("- Michael Franti-");
        label1.setFont(new Font("Arial", Font.BOLD, 25));
        label1.setForeground(Color.BLACK);
        label1.setBounds(470, 85, 800, 30);
        panel.add(label1);
		

        aboutButton = new JButton("About");
        aboutButton.setBounds(30, 80, 200, 40);
        aboutButton.addActionListener(this);
        aboutButton.setFont(buttonFont);
        aboutButton.setForeground(Color.WHITE);
        aboutButton.setBackground(Color.decode("#C00000"));
        aboutButton.setCursor(cursor);
        panel.add(aboutButton);

        logInButton = new JButton("Login");
        logInButton.setBounds(30, 180, 200, 40);
        logInButton.addActionListener(this);
        logInButton.setFont(buttonFont);
        logInButton.setForeground(Color.WHITE);
        logInButton.setBackground(Color.decode("#C00000"));
        logInButton.setCursor(cursor);
        panel.add(logInButton);

        registrationButton = new JButton("Register");
        registrationButton.setBounds(30, 280, 200, 40);
        registrationButton.addActionListener(this);
        registrationButton.setFont(buttonFont);
        registrationButton.setForeground(Color.WHITE);
        registrationButton.setBackground(Color.decode("#C00000"));
        registrationButton.setCursor(cursor);
        panel.add(registrationButton);

        adminLoginButton = new JButton("Admin Login");
        adminLoginButton.setBounds(30, 380, 200, 40);
        adminLoginButton.addActionListener(this);
        adminLoginButton.setFont(buttonFont);
        adminLoginButton.setForeground(Color.WHITE);
        adminLoginButton.setBackground(Color.decode("#C00000"));
        adminLoginButton.setCursor(cursor);
        panel.add(adminLoginButton);

        /*popularPetsButton = new JButton("Popular Pets");
        popularPetsButton.setBounds(30, 480, 200, 40);
        popularPetsButton.addActionListener(this);
        popularPetsButton.setFont(buttonFont);
        popularPetsButton.setForeground(Color.WHITE);
        popularPetsButton.setBackground(Color.decode("#C00000"));
        popularPetsButton.setCursor(cursor);
        panel.add(popularPetsButton);*/
        adoptPetsButton = new JButton("Adopt Pets");
        adoptPetsButton.setBounds(30, 480, 200, 40);
        adoptPetsButton.addActionListener(this);
        adoptPetsButton.setFont(buttonFont);
        adoptPetsButton.setForeground(Color.WHITE);
        adoptPetsButton.setBackground(Color.decode("#C00000"));
        adoptPetsButton.setCursor(cursor);
        panel.add(adoptPetsButton);
		
		
		
		img1 = new ImageIcon(getClass().getResource("/Image/Adopt.png"));
		imgLabel = new JLabel(img1);
        imgLabel.setBounds(690, 150, img1.getIconWidth(), img1.getIconHeight());
        panel.add(imgLabel);

		
    

        add(panel);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == logInButton) {
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    } else if (e.getSource() == registrationButton) {
        Registration registration = new Registration(); // Fixed typo
        this.setVisible(false);
        registration.setVisible(true);
    } else if (e.getSource() == adminLoginButton) {
        AdminLogins adminLogins = new AdminLogins();
        this.setVisible(false);
        adminLogins.setVisible(true);
    } else if (e.getSource() == aboutButton) {
        About ab = new About();
        this.setVisible(false);
        ab.setVisible(true);
    } else if (e.getSource() == adoptPetsButton) {
        AdoptPet AP = new AdoptPet();
        this.setVisible(false);
        AP.setVisible(true);
    }
}

    

    public static void main(String[] args) {
        Home home = new Home();
    }
}
