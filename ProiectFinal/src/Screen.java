import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Screen extends JFrame{
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRigth;
    private JList listaMasini;
    private JButton salveazaNouButton;
    private JButton editButton;
    private JTextField textModel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel panelMain;
    private JLabel labelModel;
    private ArrayList<AutoVehicul> arr;

    Screen(){
            this.setContentPane(this.panelMain);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            arr = new ArrayList<AutoVehicul>();

        salveazaNouButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model= textModel.getText();
                String pret = textField2.getText();
                String an = textField3.getText();
                String proprietar = textField4.getText();
                if(!model.isEmpty() && !pret.isEmpty() && !an.isEmpty() && !proprietar.isEmpty()){
                    AutoVehicul m = new AutoVehicul(model,proprietar,pret,an);
                    arr.add(m);
                    refreshList();
                    labelModel.setText("adaugare reusita");
                    //System.out.println(arr.toString());
                }
                else{
                    labelModel.setText("Campul nume nu poate fi gol");
                }

            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listaMasini.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });

    }
    private void refreshList(){

        listaMasini.setListData(arr.toArray());
    }

    public void adaugaAutoVehicul(AutoVehicul m){
        arr.add(m);
    }

        public static void main(String args[]){
        Screen screen = new Screen();
        screen.setVisible(true);


        }
}
