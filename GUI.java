import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
	
	JFrame window;
	JButton[] button;
	Admin admin;
	
	public GUI(Admin admin) {
		window = new JFrame("Student Management System");
		button = new JButton[3];
		button[0] = new JButton();
		this.admin=admin;
		
		button[0].setSize(500, 500);
		button[0].setLocation(100, 100);
		window.setSize(1300, 700);
		window.add(button[0]);
		
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button[0]) {
			System.out.println(admin.getStudent(1));
		}
		
	}
}
