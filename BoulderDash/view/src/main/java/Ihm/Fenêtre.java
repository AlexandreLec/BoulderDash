package Ihm;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.imageio.ImageIO;
import javax.swing.*;


public class Fenêtre extends JFrame {

	public static void main(String[] args) {
		
		/**
		 * Creation of a frame
		 */
		JFrame fenetre = new JFrame();
		fenetre.setTitle("BoulderDash");
		fenetre.setSize(800,480);
		
		/**
		 * Create a label and add into the frame
		 */
		
		JLabel label = new JLabel("BoulderDash");
		fenetre.getContentPane().add(label);
		
	
		/**
		 * Show the frame
		 */
		
		fenetre.setVisible(true);
	}

	public class Background extends JPanel {
		public void paintComponent(Graphics g){
			try {
				//Image img = ImageIO.read(new File(""));
				int x = 0;
				int y = 0;
				g.drawImage(img, x, y, this);
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
	}
}
