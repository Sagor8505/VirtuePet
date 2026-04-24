import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Siberian extends JFrame implements ActionListener
{
	private JLabel imgLabel;
	private JButton btn1,btn2,btn3,btn4;
	private Cursor cursor;
	private ImageIcon icon;
    private ImageIcon logo, img1;
	
	 Siberian() {
        setTitle(" Siberian-1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
		//panel.setBackground(Color.decode("#288BA8"));
		
		img1 = new ImageIcon(getClass().getResource("/Image/siberian_husky1.jpg"));
		imgLabel = new JLabel(img1);
        imgLabel.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        panel.add(imgLabel);
		
		btn1 = new JButton("Adopt");
        btn1.setBounds(710, 520, 100, 30);
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);
        panel.add(btn1);
		
		
		btn3 = new JButton("Back");
        btn3.setBounds(440, 520, 100, 30);
        btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn3.setBackground(Color.decode("#C00000"));
        btn3.setForeground(Color.WHITE);
        btn3.addActionListener(this);
        panel.add(btn3);
		
		
		btn4 = new JButton("Next");
        btn4.setBounds(1040, 520, 100, 30);
        btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn4.setBackground(Color.decode("#C00000"));
        btn4.setForeground(Color.WHITE);
        btn4.addActionListener(this);
        panel.add(btn4);
		 
	
	
	
	
	    add(panel);
        setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn3) {
            AdoptPet Ap = new AdoptPet();
            this.setVisible(false);
            Ap.setVisible(true);
        } else if (e.getSource() == btn4) {
            Dog2 D = new Dog2();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Siberian D = new Siberian ();
        D.setVisible(true);
    }
}
