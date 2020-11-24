package app;

import model.Persona;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Principal extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTextField txt_Rut;
    private JTextField txt_Nombre;
    private JComboBox cbo_Civil;
    private JComboBox cbo_Sexo;
    private JCheckBox check_Java;
    private JCheckBox check_C;
    private JCheckBox check_SQL;
    private JCheckBox check_PHP;
    private JCheckBox check_CSS;
    private JCheckBox check_JavaScript;
    private JCheckBox check_Mongo;
    private JCheckBox check_Redis;
    private JCheckBox check_Spring;
    private JCheckBox check_Django;
    private JComboBox cbo_Ciudad;
    private JTextField txt_Sueldo;
    private JButton btn_Registrar;
    private JTable tbl_Info;
    private JPanel panelP;

    private Persona oPersona;
    private List<Persona> list_Persona=new ArrayList<>();

    private DefaultTableModel modeloTabla;


    public Principal() {

        super("Informativo");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panelP);

        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Rut");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Estado Civil");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Especialidad");
        modeloTabla.addColumn("Ciudad");
        modeloTabla.addColumn("Sueldo Liquido");

        tbl_Info.setModel(modeloTabla);


        btn_Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                oPersona=new Persona();
                oPersona.setRut(txt_Rut.getText());
                oPersona.setNombre(txt_Nombre.getText());
                oPersona.setEstado_Civil(cbo_Civil.getSelectedItem().toString());
                oPersona.setSexo(cbo_Sexo.getSelectedItem().toString());
                oPersona.setEspecialidad(check_Java.getText().toString());
                oPersona.setCiudad(cbo_Ciudad.getSelectedItem().toString());
                oPersona.setSueldo(Integer.parseInt(txt_Sueldo.getText()));

                list_Persona.add(oPersona);
            }
        });
    }
}
