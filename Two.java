import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Two extends JFrame implements ActionListener
{
JFrame a=new JFrame("DETAILS");
JButton B1,B2;
JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10;
JTextField Sno,Name,Age,Pno,Em;
JComboBox Gender,Dpt,Dt,State;
JTextArea Add;

public Two()
{
a.setTitle("PERSONAL INFORMATION");
a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

JPanel jp1;
jp1=new JPanel(new GridLayout(0,2));
L1=new JLabel("Register Number");
L2=new JLabel("Student Name");
L3=new JLabel("Gender");
L4=new JLabel("Age");
L5=new JLabel("Department");
L6=new JLabel("Phone Number");
L7=new JLabel("EMail");
L8=new JLabel("Address");
L9=new JLabel("District");
L10=new JLabel("State");

Sno=new JTextField(7);
Name=new JTextField(20);
Age=new JTextField(3);
Pno=new JTextField(12);
Em=new JTextField(25);
Gender=new JComboBox();
Gender.addItem("Male");
Gender.addItem("Female");
Gender.addItem("TransGender");
Dpt=new JComboBox();
Dpt.addItem("Computer Science Engineering");
Dpt.addItem("Agricultural Engineeing");
Dpt.addItem("Chemical Engineering");
Dpt.addItem("Software Engineering");
Dpt.addItem("Electronics And Communication Engineering");
Dpt.addItem("BioTechnology Engineering");
Dpt.addItem("Nuclear Engineering");
Dpt.addItem("Textile Engineering");
Dpt.addItem("Computer Engineering");
Dpt.addItem("Mechanical Engineering");
Dpt.addItem("Civil Engineering");
Dpt.addItem("Marine Engineering");
Dpt.addItem("Aerospace Engineering");
Dpt.addItem("Electrical And Electronics Engineering");
Dpt.addItem("Information Technology");
Dpt.addItem("Pertoleum Engineering");
Dpt.addItem("Minig Engineering");
Dpt.addItem("Aeronautical Engineering");
Dpt.addItem("Agricultural And Food Engineering");
Dpt.addItem("Food Technology");
Dt=new JComboBox();
Dt.addItem("Ariyalur");
Dt.addItem("ChengalPattu");
Dt.addItem("Chennai");
Dt.addItem("Coimbatore");
Dt.addItem("Cuddalore");
Dt.addItem("Dharmapuri");
Dt.addItem("Dindugal");
Dt.addItem("Erode");
Dt.addItem("Kallakurichi");
Dt.addItem("Kancheepuram");
Dt.addItem("Karur");
Dt.addItem("Krishnagiri");
Dt.addItem("Madurai");
Dt.addItem("Mayilaaduthurai");
Dt.addItem("Nagapattinam");
Dt.addItem("Kanniyakumari");
Dt.addItem("Namakkal");
Dt.addItem("Perambalur");
Dt.addItem("Pudukottai");
Dt.addItem("Ramanathapuram");
Dt.addItem("Raniput");
Dt.addItem("Salem");
Dt.addItem("Sivagangai");
Dt.addItem("Tenkasi");
Dt.addItem("Thanjavur");
Dt.addItem("Theni");
Dt.addItem("Thiruvallur");
Dt.addItem("Thiruvarur");
Dt.addItem("Thoothukudi");
Dt.addItem("Trichy");
Dt.addItem("Thirunelveli");
Dt.addItem("Tirupathur");
Dt.addItem("Tiruppur");
Dt.addItem("Thiruvannamalai");
Dt.addItem("The Nilgiris");
Dt.addItem("Vellore");
Dt.addItem("Villupuram");
Dt.addItem("Virudhunagar");
State=new JComboBox();
State.addItem("Andhra Pradesh");
State.addItem("Arunachal Pradesh");
State.addItem("Assam");
State.addItem("Bihar");
State.addItem("chhattisgarh");
State.addItem("Goa");
State.addItem("Gujarat");
State.addItem("Haryana");
State.addItem("Himachal Pradesh");
State.addItem("Jharkhand");
State.addItem("Karnataka");
State.addItem("Kerala");
State.addItem("Madhya Pradesh");
State.addItem("Maharastra");
State.addItem("Manipur");
State.addItem("Meghalaya");
State.addItem("Mizoram");
State.addItem("Nagaland");
State.addItem("Odisha");
State.addItem("Punjab");
State.addItem("Rajasthan");
State.addItem("Sikkim");
State.addItem("Tamil Nadu");
State.addItem("Telungana");
State.addItem("Tripura");
State.addItem("Uttar Pradesh");
State.addItem("Uttarkhand");
State.addItem("West Bengal");
Add=new JTextArea();
jp1.add(L1);
jp1.add(Sno);
jp1.add(L2);
jp1.add(Name);
jp1.add(L3);
jp1.add(Gender);
jp1.add(L4);
jp1.add(Age);
jp1.add(L5);
jp1.add(Dpt);
jp1.add(L6);
jp1.add(Pno);
jp1.add(L7);
jp1.add(Em);
jp1.add(L8);
jp1.add(Add);
jp1.add(L9);
jp1.add(Dt);
jp1.add(L10);
jp1.add(State);
B1=new JButton("Back");
B1.setMnemonic('B');
B1.addActionListener(this);
jp1.add(B1);
B2=new JButton("Next");
B2.setMnemonic('N');
B2.addActionListener(this);
jp1.add(B2);
a.add(jp1,BorderLayout.CENTER);
a.setSize(500,650);
a.setVisible(true);
}
public void actionPerformed (ActionEvent e)
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
new One();
}
public void NextPage()
{
a.dispose();
new Three();
}
public static void main(String a[]) throws Exception
{
new Two();
}
}