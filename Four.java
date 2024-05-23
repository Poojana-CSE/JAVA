import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Four extends JFrame implements ActionListener
{
JFrame a=new JFrame("PERSONAL INFORMATIONS");
JButton B1,B2;
JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10;
JTextField Fn,Mn,Fpno,Mpno,Fmail,Mmail,Fo,Mo;
JComboBox Fwi,Mwi;
public Four()
{
a.setTitle("Personal Informations");
a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
JPanel jp1;
jp1=new JPanel(new GridLayout(0,2));
L1=new JLabel("Father Name");
L2=new JLabel("Father Mobile Number");
L3=new JLabel("Father Email");
L4=new JLabel("Father Work Info");
L5=new JLabel("Father Occupation");
L6=new JLabel("Mother Name");
L7=new JLabel("Mother Mobile Number");
L8=new JLabel("Mother Email");
L9=new JLabel("Mother Work Info");
L10=new JLabel("Mother Occupation");
Fn=new JTextField(20);
Mn=new JTextField(20);
Fpno=new JTextField(12);
Mpno=new JTextField(12);
Fmail=new JTextField(25);
Mmail=new JTextField(25);
Fo=new JTextField(10);
Mo=new JTextField(10);
Fwi=new JComboBox();
Fwi.addItem("Private");
Fwi.addItem("Government");
Fwi.addItem("Business");
Fwi.addItem("Others");
Mwi=new JComboBox();
Mwi.addItem("Private");
Mwi.addItem("Government");
Mwi.addItem("Business");
Mwi.addItem("Others");
jp1.add(L1);
jp1.add(Fn);
jp1.add(L2);
jp1.add(Fpno);
jp1.add(L3);
jp1.add(Fmail);
jp1.add(L4);
jp1.add(Fwi);
jp1.add(L5);
jp1.add(Fo);
jp1.add(L6);
jp1.add(Mn);
jp1.add(L7);
jp1.add(Mpno);
jp1.add(L8);
jp1.add(Mmail);
jp1.add(L9);
jp1.add(Mwi);
jp1.add(L10);
jp1.add(Mo);
B1=new JButton("Back");
B1.setMnemonic('B');
B1.addActionListener(this);
jp1.add(B1);
B2=new JButton("Next");
B2.setMnemonic('N');
B2.addActionListener(this);
jp1.add(B2);
a.add(jp1,BorderLayout.CENTER);
a.setSize(550,700);
a.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B1)
{
PreviousPage();
}
else if(e.getSource()==B2)
{
NextPage();
}
}
public void PreviousPage()
{
a.dispose();
new Three();
}
public void NextPage()
{
a.dispose();
}
public static void main(String a[])
{
new Four();
}
}