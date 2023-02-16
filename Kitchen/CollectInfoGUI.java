import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CollectInfoGUI extends JFrame implements  ActionListener{
    User user;
    JLabel label = new JLabel("Enter Name");
    JTextField username = new JTextField(10);
    JLabel label2 = new JLabel("Your height(in cm):");
    JTextField height =new JTextField(5);
    JLabel label3 =new JLabel("Your weight (in kilos)");
    JLabel space =new JLabel();
    JTextField weight = new JTextField(5);
    JLabel label1 = new JLabel("Choose your sex:\n");
    JRadioButton man = new JRadioButton("Man");
    JRadioButton woman = new JRadioButton("Woman");
    JButton choise = new JButton("Check");

    public CollectInfoGUI(){
        super("Fitness");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,250);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,2));
        ButtonGroup group = new ButtonGroup();
        group.add(man);
        group.add(woman);
        container.add(label);
        container.add(username);
        container.add(label2);
        container.add(height);
        container.add(label3);
        container.add(weight);
        container.add(man);
        container.add(woman);
        container.add(choise);
        choise.addActionListener(new Gogo());
        height.addActionListener(new HeightUser());
        weight.addActionListener(new WeightUser());
        username.addActionListener(new NameUser());
        man.addActionListener(new SetGender());
//        container.setBackground(Color.white);
        choise.setBackground(new Color(1,249,255));
        weight.setBackground(new Color(175,238,238));
        height.setBackground(new Color(175,238,238));
        username.setBackground(new Color(175,238,238));
        man.setBackground(new Color(1,165,220));
        woman.setBackground(new Color(255,52,46));

    }
    public void actionPerformed(ActionEvent event){
        String name = username.getText();
        height.addActionListener(new HeightUser());
        weight.addActionListener(new WeightUser());
        username.addActionListener(new NameUser());
        double h = Double.parseDouble(height.getText());
        double w = Double.parseDouble(weight.getText());
        if(man.isSelected()==true)this.user.isMan=true;
        if(woman.isSelected()==true)this.user.isMan=false;
        this.user = new User(name,h,w,user.isMan);
        choise.addActionListener(new Gogo());
    }
    class HeightUser implements ActionListener{
        Double h;
        @Override
        public void actionPerformed(ActionEvent e) {
            Double h = Double.parseDouble(height.getText());
            user.height=h;
        }
    }
    class SetGender implements ActionListener{
        boolean isman;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(man.isSelected()==true)isman=true;
            else isman=false;
        }
        public boolean getMan(){
            return this.isman;
        }
    }
    class Gogo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            User acc = setUser(username.getText(),Double.parseDouble(height.getText()),Double.parseDouble(weight.getText()),true);
            System.out.println(acc.toString());
            SimpleGUI app = new SimpleGUI(acc);
            app.setVisible(true);
        }
    }
    class WeightUser implements ActionListener{
        double w;
        @Override
        public void actionPerformed(ActionEvent e) {
            double w = Double.parseDouble(weight.getText());
            user.weight=w;
        }
        public double getW(){
            return this.w;
        }
    }
    class NameUser implements ActionListener{
        String name;
        @Override
        public void actionPerformed(ActionEvent e) {
            String name=username.getText();
            user.name=name;
        }
        public String getName(){
            return this.name;
        }
    }
    public User setUser(String name,double height,double weight,boolean isman){
        User acc = new User(name,height,weight,isman);
        acc.setIdealWeight();
        acc.setNeedLose();
        return acc;
    }
}
