import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdoptPet extends JFrame implements ActionListener {
    private JButton catButton;
    private JButton dogButton,backbtn;
    private JLabel label, catImgLabel, dogImgLabel;
	private ImageIcon icon;

    AdoptPet() {
        setTitle("AdoptPet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.WHITE);
		panel.setBackground(Color.decode("#AFF2DD"));

        Font buttonFont = new Font("Arial", Font.BOLD, 16);
		
		
		 // Icon
        icon = new ImageIcon(getClass().getResource("/Image/ICON1.jpg"));
        this.setIconImage(icon.getImage());

        catButton = new JButton("Cat");
        catButton.setBounds(300, 470, 100, 40);
        catButton.addActionListener(this);
        catButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        catButton.setFont(buttonFont);
        catButton.setBackground(Color.decode("#C00000"));
        catButton.setForeground(Color.WHITE);
        panel.add(catButton);

        dogButton = new JButton("Dog");
        dogButton.setBounds(780, 470, 100, 40);
        dogButton.addActionListener(this);
        dogButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dogButton.setFont(buttonFont);
        dogButton.setBackground(Color.decode("#C00000"));
        dogButton.setForeground(Color.WHITE);
        panel.add(dogButton);
		
		backbtn = new JButton("Back");
        backbtn.setBounds(540, 470, 100, 40);
        backbtn.addActionListener(this);
        backbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backbtn.setFont(buttonFont);
        backbtn.setBackground(Color.decode("#C00000"));
        backbtn.setForeground(Color.WHITE);
        panel.add(backbtn);

        label = new JLabel("Adopt Your Favourite Pet!!");
        label.setFont(new Font("Arial", Font.BOLD, 35));
        label.setForeground(Color.BLUE);
        label.setBounds(340, 20, 600, 80);
        panel.add(label);

        ImageIcon catImg = new ImageIcon(getClass().getResource("Image/cat.jpeg"));
        catImgLabel = new JLabel(catImg);
        catImgLabel.setBounds(210, 150, catImg.getIconWidth(), catImg.getIconHeight());
        panel.add(catImgLabel);

        ImageIcon dogImg = new ImageIcon(getClass().getResource("Image/doggg.jpg"));
        dogImgLabel = new JLabel(dogImg);
        dogImgLabel.setBounds(660, 150, dogImg.getIconWidth(), dogImg.getIconHeight());
        panel.add(dogImgLabel);

        add(panel);
        setVisible(true);
    }

   /* public void actionPerformed(ActionEvent e) {
        if (e.getSource() == catButton) {
            label.setText("You selected a Cat!");
        } else if (e.getSource() == dogButton) {
            label.setText("You selected a Dog!");
        }
		 
    }*/
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dogButton) {
            Dog D = new Dog();
				this.setVisible(false);
				D.setVisible(true);
        }else if (e.getSource() == catButton) {
            Cat C = new Cat();
				this.setVisible(false);
				C.setVisible(true);
        }else if (e.getSource() == backbtn) {
                Home H = new Home();
				this.setVisible(false);
				H.setVisible(true);
        }
		
        
		 
    }

    public static void main(String[] args) {
        new AdoptPet();
    }
}
