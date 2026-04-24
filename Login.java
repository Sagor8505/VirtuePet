import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class Login extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, btn5, btn6, btn7, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;
	

    Login() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AdoptPet");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));
		
		 // Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());

        

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 30);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Login Here");
        label1.setBounds(450, 50, 500, 90);
        label1.setFont(f1);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(410, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(600, 155, 200, 35);
        tf1.setFont(f5);
        c.add(tf1);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(410, 205, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(600, 215, 200, 35);
        tf2.setFont(f2);
        tf2.setEchoChar('*');
        c.add(tf2);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        

        btn3 = new JButton("Login");
        btn3.setBounds(500, 350, 215, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		btn5 = new JButton("Exit");
        btn5.setBounds(1000, 500, 100, 30);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
		//back button
	    btn6 = new JButton("Home");
        btn6.setBounds(80, 500, 100, 30);
        btn6.setFont(f2);
        btn5.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		
		btn7 = new JButton("Register");
        btn7.setBounds(500, 450, 215, 50);
        btn7.setFont(f2);
        btn7.setCursor(cursor);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#C00000"));
        c.add(btn7);
		
		

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);



// Action Listener for JButtons
        // Exit Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });


		
		// Back Button
        btn6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
		
		btn7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });
        

        // Login Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name 
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Adopt Pet!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    AdoptPet frame = new AdoptPet();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
		
		// Logo
        logo = new ImageIcon(getClass().getResource("/Image/reg (2).jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
    }

    public static void main(String[] args) {

        Login frame = new Login();
        frame.setVisible(true);
    }
}
