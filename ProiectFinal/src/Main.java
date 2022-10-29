import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
   private JPanel panel;
    private JPanel panel1;
    private JList list1;
    private JList list2;
    private JList list3;
    private JButton adaugaMasinaButton;
    private JButton pretMinimButton;
    private JButton mediePretButton;
    private JButton adaugaMotocicletaButton;
    private JButton pretMaximButton;
    private JButton mediePretButton1;
    private JButton adaugaCamionButton;
    private JButton pretMinimButton1;
    private JButton mediePretButton2;

    public Main(){
        this.setContentPane(panel1);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(800,800);

       adaugaMasinaButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Screen screen = new Screen();
               screen.setSize(900,900);
               screen.setVisible(true);
           }
       });

       adaugaCamionButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

           }
       });

       adaugaMotocicletaButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

           }
       });


    }

    public static void main(String args[]){


        //Screen screen = new Screen();

        //screen.setVisible(true);
        Main main = new Main();
        main.setVisible(true);


    }

}
