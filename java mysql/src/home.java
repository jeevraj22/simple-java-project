import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {
        static home frame;
	JPanel contentPane;

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


/**
	 * Create the frame.
	 */
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setResizable(false);
                setTitle("Home");



JButton b1 = new JButton("Add New Data");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        String s[]={};
                        Collect.main(s);
                        frame.dispose();
  }
	});
                b1.setBounds(60, 200, 120, 25);
		contentPane.add(b1);

JButton b2 = new JButton("View Data");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                      String s[]={}; 
                        JTable.main(s);
                         frame.dispose();
  }
	});
                b2.setBounds(180, 200, 100, 25);
		contentPane.add(b2);


JButton b3 = new JButton("Log out");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        String s[]={};
                        AdminLogin.main(s);
                        frame.dispose();
                        
  }
	});
                b3.setBounds(280, 200, 85, 25);
		contentPane.add(b3);

}
}
