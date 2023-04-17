import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class JTable extends JFrame {

	private JPanel contentPane;
	private javax.swing.JTable jt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable frame = new JTable();
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
public JTable() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(150, 150, 400, 305);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(20, 70, 400, 120);
	contentPane.add(scrollPane);
	my_mysql obj=new my_mysql();
		
	String[] column= {"ID","Name","Class","Rollno","Gender","DOB"};
	
//jt1=new javax.swing.JTable(obj.my_test_select(),column);//test data
	jt1 = new javax.swing.JTable(obj.my_db_select(),column);
	scrollPane.setViewportView(jt1);
	}
}