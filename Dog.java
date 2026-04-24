import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dog extends JFrame implements ActionListener {

    private Container c;
    private Font f1;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6;
    private JLabel imgLabel;
    private ImageIcon icon;
    private ImageIcon logo, img1;

    Dog() {
        // Frame Layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Initialize container
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));
		
		 // Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());

        // Load and add image
        img1 = new ImageIcon(getClass().getResource("/Image/dog.jpg"));
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 16);

        // Cursor for JButtons
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = createButton("BULLDOG", 60, 468, Color.decode("#2E75B6"));
        btn2 = createButton("POODLE", 340, 468, Color.decode("#2E75B6"));
        btn3 = createButton("AMERICAN", 620, 468, Color.decode("#2E75B6"));
        btn4 = createButton("SIBERIAN", 913, 468, Color.decode("#2E75B6"));
        btn5 = createButton("Exit", 913, 515, Color.decode("#C00000"));
        btn6 = createButton("Back", 60, 515, Color.decode("#C00000"));

        // Adding ActionListener to buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);

        // Adding buttons to the container
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
    }

    // Method to create JButton with common properties
    private JButton createButton(String text, int x, int y, Color bgColor) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 200, 40);
        button.setFont(f1);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        return button;
    }

    	public void actionPerformed(ActionEvent e){
		
		 if (e.getSource() == btn1) {
                Bulldog B = new Bulldog();
                B.setVisible(true);
                setVisible(false);
        }else if (e.getSource() == btn2) {
                Poodle P = new Poodle();
                P.setVisible(true);
                setVisible(false);
        }else if (e.getSource() == btn3) {
                American A = new American();
			    setVisible(false);
                A.setVisible(true);
        }else if (e.getSource() == btn4) {
                setVisible(false);
                Siberian S = new Siberian();
                S.setVisible(true);
        }else if (e.getSource() == btn5) {
                System.exit(0);
        }else if (e.getSource() == btn6) {
                AdoptPet Ap = new AdoptPet();
                Ap.setVisible(true);
                setVisible(false);
        }
	}

    public static void main(String[] args) {
        // Create an instance of Dog
        Dog D = new Dog();
        D.setVisible(true);
    }
}
