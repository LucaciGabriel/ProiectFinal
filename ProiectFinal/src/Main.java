import javax.swing.*;

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
       //this.setVisible(true);
    }

    public static void main(String args[]){


        Screen1 screen = new Screen1();

        //screen.setVisible(true);
        Main main = new Main();
        main.setVisible(true);


    }

}
