import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Poodle extends JFrame implements ActionListener
{
	private JLabel imgLabel;
	private JButton btn1,btn3;
	private Cursor cursor;
	private ImageIcon icon;
    private ImageIcon logo, img1;
	
	Poodle() {
        setTitle("Poodle-1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
		//panel.setBackground(Color.decode("#288BA8"));
		
		 // Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());
		
		img1 = new ImageIcon(getClass().getResource("/Image/Poodle!.jpg"));
		imgLabel = new JLabel(img1);
        imgLabel.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        panel.add(imgLabel);
		
		btn1 = new JButton("Adopt");
        btn1.setBounds(1058, 520, 100, 30);
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);
        panel.add(btn1);
		
		
		btn3 = new JButton("Back");
        btn3.setBounds(510, 520, 100, 30);
        btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn3.setBackground(Color.decode("#C00000"));
        btn3.setForeground(Color.WHITE);
        btn3.addActionListener(this);
        panel.add(btn3);
	
	
	    add(panel);
        setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn3) {
            AdoptPet Ap = new AdoptPet();
            this.setVisible(false);
            Ap.setVisible(true);
        }
		else if (e.getSource()==btn1)  {
			 Price p2 = new Price();
            this.setVisible(false);
			p2.setVisible(true);
    }
    }

    public static void main(String[] args) {
        Poodle D = new Poodle();
        D.setVisible(true);
    }
}
