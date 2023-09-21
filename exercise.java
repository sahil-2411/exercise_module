import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
import javax.swing.*;



public class exercise extends JFrame implements ActionListener {
    
    JLabel heading ,age ,personal, gender , cal,weight,underline;
    JTextField tage,tcal,tweight;
    JRadioButton male,female;
    ButtonGroup group;
    JButton calculate;
    
    
    
    exercise(){
        
    
        
    
        
    getContentPane().setBackground(Color.LIGHT_GRAY);
    setLayout(null);
    setBounds(300,200,900,506 );
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("txt1.jpg"));
    JLabel image= new JLabel(i1);
    image.setBounds(0,0,900,506);
    add(image);
    
    
    
    
    
    
    JLabel heading = new JLabel ("Exercise");
    heading.setBounds(50,40,600,45);
    heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
    heading.setForeground(Color.BLACK);
   
    image.add(heading);
    
   /* JLabel exc = new JLabel("EXERCISE SECTION ");
    exc.setBounds(300,80,600,45);
    exc.setFont(new Font("STENCIL",Font.BOLD,30));
    exc.setForeground(new Color(0,10,254));
    add(exc);*/
    
    personal = new JLabel("Personal   Information ");
    personal.setBounds(45,90,600,45);
    personal.setFont(new Font("Playfair",Font.BOLD,30));
    personal.setForeground(Color.BLACK);
    personal.setBackground(Color.BLACK);
    underline = new JLabel("______________________________");
    underline.setFont(new Font("Arial",Font.BOLD,20));
    underline.setBounds(45,99,600,45);
    image.add(underline);
    image.add(personal);
    
    gender = new JLabel("Gender: ");
    gender.setBounds(50,170,600,45);
    gender.setFont(new Font("Playfair",Font.BOLD,22));
    gender.setForeground(Color.BLACK);
    image.add(gender);
    
    male = new JRadioButton("MALE");
    male.setBounds(270,170,100,30);
    male.setForeground(Color.BLACK);
   //male.setBackground(null);
   male.setOpaque(false);
    male.setFont(new Font("Playfair",Font.PLAIN,20));
   //male.setOpaque(true);
    image.add(male);
        
    female = new JRadioButton("FEMALE");
    female.setBounds(380,170,150,30);
    female.setForeground(Color.BLACK);
    female.setFont(new Font("Playfair",Font.PLAIN,20));
   female.setOpaque(false);
    image.add(female);
        
    group = new ButtonGroup();
    group.add(male);
    group.add(female);
    
    age = new JLabel("Age: ");
    age.setBounds(50,220,600,45);
    age.setFont(new Font("Playfair",Font.BOLD,22));
    age.setForeground(Color.BLACK);
    image.add(age);
    
    tage = new JTextField();
    tage.setBounds(300,220,150,35);
    tage.setFont(new Font("Playfair",Font.BOLD,20));
    image.add(tage);
    
    
    weight = new JLabel("Weight(Kg): ");
    weight.setBounds(50,270,600,45);
    weight.setFont(new Font("Playfair",Font.BOLD,22));
    weight.setForeground(Color.BLACK);
    image.add(weight);
    
    tweight = new JTextField();
    tweight.setBounds(300,270,150,35);
    tweight.setFont(new Font(" Times New Roman",Font.BOLD,20));
    image.add(tweight);
    
    
    
    cal = new JLabel("Calories to be burnt : ");
    cal.setBounds(50,320,600,45);
    cal.setFont(new Font("Playfair",Font.BOLD,22));
    cal.setForeground(Color.BLACK);
    image.add(cal);
    
    tcal = new JTextField();
    tcal.setBounds(300,320,150,35);
    tcal.setFont(new Font(" Times New Roman",Font.BOLD,20));
    image.add(tcal);
    
    calculate = new JButton("EXERCISE");
    calculate.setBounds(50,400,100,45);
    calculate.setBackground(Color.LIGHT_GRAY);
    calculate.addActionListener(this);
    //calculate.setForeground(Color.WHITE);
   // calculate.addActionListener(this);
    image.add(calculate);
    
    
    
    
    /*JPanel panel = new JPanel();
    panel.setBounds(50,70,880,550);
    panel.setBackground(Color.ORANGE);
    add(panel);*/
        
    
    setVisible(true);
    
    }
 
    

    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()== calculate)
    {
     
     int age,cal,weight;
     
     String Male = male.getText();
     String Female = female.getText();
     age = Integer.parseInt(tage.getText());
     cal = Integer.parseInt(tcal.getText());
     weight = Integer.parseInt(tweight.getText());
     
     Exercise1 ex1 = new Exercise1(Male,Female,age,cal,weight);
     ex1.setVisible(true);
     
    
     
    }
    } 
    public static void main(String[] args)
    {
     
        new exercise();
    }
 
}