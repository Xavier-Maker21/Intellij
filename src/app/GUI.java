package app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JPanel panelP;
    private JList list1;
    private JTextField txtAñadir;
    private JButton btnAñadir;
    private JTable tblInfo;
    private JTextField txtNombre;
    private JTextField txtCorreo;
    private JTextField txtEdad;

    //private DefaultListModel<String> modeloLista;
    private DefaultTableModel modeloTabla;

    public GUI() {
        super("Titulo");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panelP);
        //mis componentes
        //modeloLista = new DefaultListModel<>();
        //list1.setModel(modeloLista);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Edad");

        //btnAñadir.addActionListener(this::añadirlista);
        tblInfo.setModel(modeloTabla);
        btnAñadir.addActionListener(this::añadirFila);
    }
    //public void añadirlista(ActionEvent e){
    //    String a=txtAñadir.getText();
    //    //modeloLista.addElement(a);
    //    txtAñadir.setText("");
    //    txtAñadir.requestFocus();
    //}
    public void añadirFila(ActionEvent e){
        String[] nuevaFila=  {txtNombre.getText(),txtCorreo.getText(),txtEdad.getText()};
        modeloTabla.addRow(nuevaFila);
        txtNombre.setText("");
        txtCorreo.setText("");
        txtEdad.setText("");
        txtNombre.requestFocus();
    }


    public static void main(String[] args) {
        GUI oGui=new GUI();
    }


}
