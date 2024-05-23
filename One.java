import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class One implements ActionListener
{
JFrame s=new JFrame("LOGIN");
JButton B1,B2;
JLabel L1,L2;
JTextField uname;
JPasswordField pwd;

public One()
{
s.setTitle("LOGIN");
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel j1;
j1=new JPanel(new GridLayout(3,1));
L1=new JLabel("USER NAME");
L2=new JLabel("PASSWORD");
uname=new JTextField(20);
pwd=new JPasswordField(15);
j1.add(L1);
j1.add(uname);
j1.add(L2);
j1.add(pwd);
B1=new JButton("Login");
B1.setMnemonic('L');
B1.addActionListener(this);
j1.add(B1);
B2=new JButton("Cancel");
B2.setMnemonic('C');
B2.addActionListener(this);
j1.add(B2);
s.add(j1,BorderLayout.CENTER);
s.setSize(500,250);
s.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B1)
{
LoginMe();
}
else if(e.getSource()==B2)
{
System.exit(0);
}
}
public void LoginMe()
{
if((uname.getText().equals("Poojanakiruesh"))&&(pwd.getText().equals("Poojana2202")))
{
s.dispose();
new Two();
}
else
{
JOptionPane.showMessageDialog(s,"Invalid User","Login",JOptionPane.WARNING_MESSAGE);
}
}
public static void main(String a[])
{
new One();
}
}