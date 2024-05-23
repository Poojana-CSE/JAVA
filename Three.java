import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Three extends JFrame implements ActionListener
{
JFrame a=new JFrame("DETAILS");
JButton B1,B2,B3,B4;
JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
JTextField M1,M2,M3,M4,M5,M6,Tot,Avg,Cutoff;
public Three()
{
a.setTitle("Student Informations");
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel jp1;
jp1=new JPanel(new GridLayout(0,2));
L1=new JLabel("TAMIL");
L2=new JLabel("ENGLISH");
L3=new JLabel("MATHS");
L4=new JLabel("PHYSICS");
L5=new JLabel("CHEMISTRY");
L6=new JLabel("BIOLOGY OR COMPUTER SCIENCE");
L7=new JLabel("TOTAL");
L8=new JLabel("AVERAGE");
L9=new JLabel("Cut Off");
M1=new JTextField(3);
M2=new JTextField(3);
M3=new JTextField(3);
M4=new JTextField(3);
M5=new JTextField(3);
M6=new JTextField(3);
Tot=new JTextField(4);
Avg=new JTextField(5);
Cutoff=new JTextField(5);
jp1.add(L1);
jp1.add(M1);
jp1.add(L2);
jp1.add(M2);
jp1.add(L3);
jp1.add(M3);
jp1.add(L4);
jp1.add(M4);
jp1.add(L5);
jp1.add(M5);
jp1.add(L6);
jp1.add(M6);
jp1.add(L7);
jp1.add(Tot);
jp1.add(L8);
jp1.add(Avg);
jp1.add(L9);
jp1.add(Cutoff);
B1=new JButton("Calculate");
B1.setMnemonic('C');
B1.addActionListener(this);
jp1.add(B1);
B2=new JButton("Cut Off");
B2.setMnemonic('O');
B2.addActionListener(this);
jp1.add(B2);
B3=new JButton("Back");
B3.setMnemonic('B');
B3.addActionListener(this);
jp1.add(B3);
B4=new JButton("Next");
B4.setMnemonic('N');
B4.addActionListener(this);
jp1.add(B4);
a.add(jp1,BorderLayout.CENTER);
a.setSize(500,650);
a.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B1)
{
Calc();
}
else if(e.getSource()==B2)
{
Cutoff();
}
else if(e.getSource()==B3)
{
PreviousPage();
}
else if(e.getSource()==B4)
{
NextPage();
}
}
public void Calc()
{
int N1=Integer.parseInt(M1.getText());
int N2=Integer.parseInt(M2.getText());
int N3=Integer.parseInt(M3.getText());
int N4=Integer.parseInt(M4.getText());
int N5=Integer.parseInt(M5.getText());
int N6=Integer.parseInt(M6.getText());
int I=N1+N2+N3+N4+N5+N6;
float F=(float)I/6.0f;
Tot.setText(Integer.toString(I));
Avg.setText(Float.toString(F));
}
public void Cutoff()
{
int C1=Integer.parseInt(M3.getText());
int C2=Integer.parseInt(M4.getText());
int C3=Integer.parseInt(M5.getText());
float F1=(float)C1+(C2+C3)/2.0f;
Cutoff.setText(Float.toString(F1));
}
public void PreviousPage()
{
a.dispose();
new Two();
}
public void NextPage()
{
a.dispose();
new Four();
}
public static void main(String a[]) throws Exception
{
new Three();
}
}