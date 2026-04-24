import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Admin() {
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
        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Secret Dashboard");
        label1.setBounds(380, 200, 900, 50);
        label1.setFont(f1);
        c.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("User Data");
        btn1.setBounds(500, 450, 207, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

       
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // User Data
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);
            }
        });

        /*// Exit Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

        // Admin Password
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdminPassword frame = new AdminPassword();
                frame.setVisible(true);
            }
        });
		*/
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
    }
}
