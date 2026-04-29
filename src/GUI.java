import javax.swing.*;
public class GUI extends JFrame {
    GUI(String s){
super(s);
    }
    void setcomponents(){
JLabel j=new JLabel("welcome");
JTextField j1=new JTextField(100);
setLayout(null);
j.setBounds(200,100,20,30);
j1.setBounds(200,500,100,50);
add(j1);
add(j);
j.setSize(200,300);

    }
    public static void main(String[] args) {
//        JFrame j1=new JFrame("welcome");
//        j1.setVisible(true);
//        j1.setSize(500,500);
//        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI g=new GUI("coding");
        g.setVisible(true);
        g.setSize(500,500);
        g.setcomponents();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
