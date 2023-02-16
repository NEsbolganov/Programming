import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    User user;

    ImageIcon breakfast = new ImageIcon("breakfast1.png");
    private JTextField weight = new JTextField();
    private JButton radio1 = new JButton(breakfast);
    private JButton radio2 = new JButton("Lunch");
    private JButton radio3 = new JButton("Dinner");
    public SimpleGUI(User user) {
        super("Simple Example");
        this.user =user;
        this.setBounds(100,100,450,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,1,2,2));
        container.add(new JLabel("Hello, "+user.name+", your ideal weight is "+user.idealWeight));

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        if (user.needLose==false)radio1.addActionListener(new Button2add());
        if(user.needLose==true)radio1.addActionListener(new Button2());
        if(user.needLose==false)radio2.addActionListener(new Button3());
        if(user.needLose==true)radio2.addActionListener(new Button3lose());
        if(user.needLose==false)radio3.addActionListener(new ButtonDin1());
        if(user.needLose==true)radio3.addActionListener(new ButtonDin2());
    }

    class Button2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "You need to lose some weight, your ideal weight is" + String.valueOf(user.idealWeight)+ "and here's your diet\n ";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Breakfast.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class Button2add implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "You need to add some weight,and your ideal weight is"+ String.valueOf(user.idealWeight)+ "and here's your diet\n";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Breakfastadd.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class Button3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "You need to add some weight,and your ideal weight is"+ String.valueOf(user.idealWeight)+ "and here's your Lunch\n";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Lunch1"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class Button3lose implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "You need to lose some weight,and your ideal weight is"+ String.valueOf(user.idealWeight)+ "and here's your Lunch\n";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Lunchlose.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonDin1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "You need to add some weight, your ideal weight is" + String.valueOf(user.idealWeight)+ "and here's your Dinner\n ";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Dinner1.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonDin2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) throws RuntimeException{
            String message = "You need to lose some weight, your ideal weight is" + String.valueOf(user.idealWeight)+ "and here's your Dinner\n ";
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\Kitchen\\Dinner2.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String buff = null;
            try {
                buff = reader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            while(buff!=null){
                message+=buff+"\n";
                try {
                    buff=reader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}