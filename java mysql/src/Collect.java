import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Collect extends JFrame {

        static Collect frame;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Collect frame = new Collect();
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
	public Collect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setResizable(false);
                setTitle("Registration Form");
		
                JLabel l0 = new JLabel("STUDENT DETAILS");
		l0.setBounds(140, 5, 150, 40);
		contentPane.add(l0);

		JLabel l1 = new JLabel("Name");
		l1.setBounds(20, 40, 49, 14);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Class");
		l2.setBounds(20, 80, 49, 14);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Rollno.");
		l3.setBounds(18, 120, 49, 14);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(15, 160, 49, 16);
		contentPane.add(l4);
		
// string for DOB
        String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sep", "Oct", "Nov", "Dec" };
	String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };

                JLabel dob = new JLabel("DOB");
		dob.setBounds(170, 40,40,20);
		contentPane.add(dob);

		JComboBox date = new JComboBox(dates);
		date.setBounds(200,40,39,20);
		contentPane.add(date);

		JComboBox month = new JComboBox(months);
		month.setBounds(240,40,59,20);
		contentPane.add(month);

		JComboBox year = new JComboBox(years);
		year.setBounds(300,40,55,20);
		contentPane.add(year);

		t1 = new JTextField();
		t1.setBounds(66, 40, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(66, 80, 96, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(66, 120, 96, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(66, 160, 96, 20);
		contentPane.add(t4);
		t4.setColumns(10);
                
                JCheckBox term = new JCheckBox("Accept Terms & Conditions!");
		term.setBounds(20,200,220,20);
		contentPane.add(term);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             if(term.isSelected()){				

                                String name=t1.getText();
				String class1=t2.getText();
				String rollno=t3.getText();
				String gender=t4.getText();
                                String dob
					=(String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem();

// creating one object 
				my_update obj=new my_update();
				obj.my_db_update(name, class1, rollno, gender, dob);
//message box when record is saved in database  
  
                JOptionPane.showMessageDialog(null,
                "Record saved successfully",
                "details",
                JOptionPane.INFORMATION_MESSAGE);

//clearing the textfield after record is saved 
	
               String def ="";
               t1.setText(def);
               t2.setText(def);
               t3.setText(def);
               t4.setText(def);
               date.setSelectedIndex(0);
	       month.setSelectedIndex(0);
	       year.setSelectedIndex(0);
               term.setSelected(false);
           }
//message box if T&C checkbox is not selected

              else{
                 JOptionPane.showMessageDialog(null,
                "Please accept terms & condition !!",
                "error",
                JOptionPane.INFORMATION_MESSAGE);
              }

           }
	});
		b1.setBounds(280, 200, 85, 25);
		contentPane.add(b1);

// code for reset button
JButton b2 = new JButton("Reset");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             if(e.getSource() == b2)
{
               String def1 ="";
               t1.setText(def1);
               t2.setText(def1);
               t3.setText(def1);
               t4.setText(def1);
               date.setSelectedIndex(0);
               month.setSelectedIndex(0);
	       year.setSelectedIndex(0);
               term.setSelected(false);
}
     }
       });

           b2.setBounds(280, 230, 85, 25);
		contentPane.add(b2);

// code for home button
JButton b3 = new JButton("Home");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             if(e.getSource() == b3)
{
                        String s[]={};
                        home.main(s);
                        frame.dispose();
}
     }
       });

           b3.setBounds(180, 230, 85, 25);
		contentPane.add(b3);



	}
}