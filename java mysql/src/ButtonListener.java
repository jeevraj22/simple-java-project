import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
public class ButtonListener {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Listener Home");
        JDialog d = new JDialog(jf,"Home",true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("Add New Data");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s[]={};
                Collect.main(s);
                d.dispose(); }         });
        b.setBounds(20, 200, 120, 25);		


  JButton b1 = new JButton("View Data");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s[]={}; 
                JTable.main(s);
                d.dispose(); }         });
        b1.setBounds(160, 200, 100, 25);

JButton b2 = new JButton("Log out");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s[]={};
                AdminLogin.main(s);
                d.dispose(); }         });
        b2.setBounds(280, 200, 85, 25);

        
        d.add(b);
        d.add(b1);
        d.add(b2);
        d.setBounds(100, 100, 400, 300);
        d.setLayout(null);
        d.setResizable(false);
        d.setVisible(true);
    }}
