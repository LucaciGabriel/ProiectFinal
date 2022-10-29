import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import AutoVehiculPackage.*;
public class Screen2 extends JFrame {
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton salveazaCamioaneButton;
    private JPanel panel1;
    private ArrayList<Camion> arrCamion;

    public Screen2() {
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        arrCamion = new ArrayList<Camion>();

        salveazaCamioaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model= textField1.getText();
                String pret = textField2.getText();
                String an = textField3.getText();
                String proprietar = textField4.getText();
                if(!model.isEmpty() && !pret.isEmpty()  && !proprietar.isEmpty()){
                    int tempPret = Integer.parseInt(textField2.getText());
                    int tempAn = Integer.parseInt(textField3.getText());

                    Motocicleta moto = new Motocicleta(model,proprietar,tempPret,tempAn);
                    arrCamion.add();
                    refreshList();
                    labelModel.setText("adaugare reusita");
                    //System.out.println(arr.toString());
                }
                else{
                    labelModel.setText("Campul nume nu poate fi gol");
                }
            }
        });


    }

    private void refreshList(){

        list1.setListData(arrCamion.toArray());
    }
    public void adaugaAutovehicul(Motocicleta moto){
        arrCamion.add(moto);
    }

}