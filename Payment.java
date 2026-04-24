import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Payment extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private ImageIcon logo, img1, img2;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
    private JButton btn1, btn2, btn3, btn5, btn6, nBtn;
    private Cursor cursor;

    Payment() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("VirtuAdopt");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());

        /*// Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/payment.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		*/

        img1 = new ImageIcon(getClass().getResource("/Image/VisaCard.png"));
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(620, 90, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);

        img2 = new ImageIcon(getClass().getResource("/Image/MasterCard.png"));
        imgLabel = new JLabel(img2);
        imgLabel.setBounds(705, 90, img2.getIconWidth(), img2.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);


        label2 = new JLabel("Pay Method");
        label2.setBounds(420, 85, 500, 50);
        label2.setFont(f2);
        c.add(label2);

        label2 = new JLabel("Card Details");
        label2.setBounds(600, 140, 500, 50);
        label2.setFont(f2);
        c.add(label2);

        // Name On Card
        label3 = new JLabel("Holder Name:");
        label3.setBounds(430, 180, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(570, 190, 235, 30);
        tf1.setFont(f4);
        c.add(tf1);

        // Card Number
        label3 = new JLabel("Card Number:");
        label3.setBounds(430, 220, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(570, 230, 235, 30);
        tf2.setFont(f4);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        // Valid On
        label3 = new JLabel("Valid On");
        label3.setBounds(430, 260, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf3 = new JTextField();
        tf3.setBounds(520, 270, 90, 30);
        tf3.setFont(f4);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf3);

        // CVV Code
        label3 = new JLabel("CVV Code");
        label3.setBounds(620, 260, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        pf = new JPasswordField();
        pf.setBounds(725, 270, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
        pf.setFont(f5);
        c.add(pf);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

       

        btn3 = new JButton("Pay Now");
        btn3.setBounds(460, 400, 300, 50);
        btn3.setFont(f6);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);
		
		btn5 = new JButton("Exit");
        btn5.setBounds(1050, 500, 100, 30);
        btn5.setFont(f4);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
		//back button
	    btn6 = new JButton("Home");
        btn6.setBounds(80, 500, 100, 30);
        btn6.setFont(f4);
        btn5.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
		
		
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

        // To limit characters
        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf1.getText().length() >= 10 )
                    e.consume();
            }
        });

        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf2.getText().length() >= 19 )
                    e.consume();
            }
        });

        tf3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf3.getText().length() >= 7 )
                    e.consume();
            }
        });

        pf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pf.getText().length() >= 3 )
                    e.consume();
            }
        });

       

     // Confirm Payment Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = tf1.getText();
                String cardNumber = tf2.getText();
                String validOn = tf3.getText();
                String cvvCode = pf.getText();
                
                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaySuccess frame = new PaySuccess();
                    frame.setVisible(true);
                }
            }
        });
		
		
		// Logo and Images
        logo = new ImageIcon(getClass().getResource("/Image/white background .jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		
		
    }

    public static void main(String[] args) {

        Payment frame = new Payment();
        frame.setVisible(true);
    }
}