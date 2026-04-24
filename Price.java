import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Price extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel imgLabel;
    private Font f4, f5;
    private ImageIcon logo;
    private JButton btn3, btn5, btn6, nBtn;
    private Cursor cursor;
    private ButtonGroup radioButtonGroup;
    private JRadioButton pack1, pack2, pack3,pack4, pack5, pack6,pack7, pack8;
    private int selected = 0;

    Price() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PetAdopt");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));
		
		// Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());


        // Icon
       // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Fonts
        //f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        //f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
        //f3 = new Font("Segoe UI", Font.PLAIN, 25);
        f4 = new Font("Segoe UI", Font.PLAIN, 14);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

        /*// Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 82, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		*/

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        

        // Pack 1 Details
        pack1 = new JRadioButton("Select");
        pack1.setBounds(230, 200, 100, 30);
        pack1.setFont(f4);
        pack1.setBackground(Color.decode("#F2F2F2"));
        pack1.setCursor(cursor);
        c.add(pack1);



        // Pack 2 Details
        pack2 = new JRadioButton("Select");
        pack2.setBounds(445, 200, 100, 30);
        pack2.setFont(f4);
        pack2.setBackground(Color.decode("#F2F2F2"));
        pack2.setCursor(cursor);
        c.add(pack2);
		
		pack3 = new JRadioButton("Select");
        pack3.setBounds(665, 200, 100, 30);
        pack3.setFont(f4);
        pack3.setBackground(Color.decode("#F2F2F2"));
        pack3.setCursor(cursor);
        c.add(pack3);
		
		
		pack4 = new JRadioButton("Select");
        pack4.setBounds(885, 200, 100, 30);
        pack4.setFont(f4);
        pack4.setBackground(Color.decode("#F2F2F2"));
        pack4.setCursor(cursor);
        c.add(pack4);
		
		
		pack5 = new JRadioButton("Select");
        pack5.setBounds(230, 400, 100, 30);
        pack5.setFont(f4);
        pack5.setBackground(Color.decode("#F2F2F2"));
        pack5.setCursor(cursor);
        c.add(pack5);
		
		
		pack6 = new JRadioButton("Select");
        pack6.setBounds(445, 400, 100, 30);
        pack6.setFont(f4);
        pack6.setBackground(Color.decode("#F2F2F2"));
        pack6.setCursor(cursor);
        c.add(pack6);
		
		
		pack7 = new JRadioButton("Select");
        pack7.setBounds(665, 400, 100, 30);
        pack7.setFont(f4);
        pack7.setBackground(Color.decode("#F2F2F2"));
        pack7.setCursor(cursor);
        c.add(pack7);
		
		
		pack8 = new JRadioButton("Select");
        pack8.setBounds(885, 400, 100, 30);
        pack8.setFont(f4);
        pack8.setBackground(Color.decode("#F2F2F2"));
        pack8.setCursor(cursor);
        c.add(pack8);
		

        

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(pack1);
        radioButtonGroup.add(pack2);
        radioButtonGroup.add(pack3);
		radioButtonGroup.add(pack4);
	    radioButtonGroup.add(pack5);
		radioButtonGroup.add(pack6);
		radioButtonGroup.add(pack7);
		radioButtonGroup.add(pack8);

        

        btn3 = new JButton("Pay");
        btn3.setBounds(520, 500, 215, 50);
        btn3.setFont(f5);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		btn5 = new JButton("Exit");
        btn5.setBounds(1000, 500, 100, 30);
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

        Handler handler = new Handler();
        pack1.addActionListener(handler);
        pack2.addActionListener(handler);
        pack3.addActionListener(handler);
        pack4.addActionListener(handler);
        pack5.addActionListener(handler);
        pack6.addActionListener(handler);
		pack7.addActionListener(handler);
        pack8.addActionListener(handler);
        


        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (selected == 0) {
                    JOptionPane.showMessageDialog(null, "You did not select any packs.", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    Payment frame = new Payment();
                    frame.setVisible(true);
                }
            }
			
			
			
        });
		
		
		
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
		
		
		
		
		        // Logo
        logo = new ImageIcon(getClass().getResource("/Image/price.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
	
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == pack1) {
                selected = 1;
            } else if (e.getSource() == pack2) {
                selected = 2;
            } else if (e.getSource() == pack3) {
                selected = 3;
            }else if (e.getSource() == pack4) {
                selected = 4;
            }else if (e.getSource() == pack5) {
                selected = 5;
            }else if (e.getSource() == pack6) {
                selected = 6;
            }else if (e.getSource() == pack7) {
                selected = 7;
            }else if (e.getSource() == pack8) {
                selected = 8;
            }
        }
    }

    public static void main(String[] args) {
        Price P = new Price();
        P.setVisible(true);
    }
}