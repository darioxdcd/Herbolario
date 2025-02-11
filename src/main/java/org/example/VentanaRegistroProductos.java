package org.example;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.DatosPrecargados.operacion;

public class VentanaRegistroProductos extends JFrame {

    public VentanaRegistroProductos(){
        //Creamos la ventana y establecemos el Layout
        setSize(900,900);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets (10,10,10,10);
        gbc.fill = GridBagConstraints.BOTH;
        //Creamos la fuente
        Font fonttitulo = new Font("Calibri",Font.PLAIN,50);
        Font fontresumen = new Font("Calibri",Font.BOLD,16);
        //Creamos los elementos
        JLabel titulo = new JLabel("Añadir registros");
        JLabel producto = new JLabel ("Producto: ");
        JComboBox<Producto> productoJComboBox = new JComboBox<>();
        for(int i=0;i<DatosPrecargados.listaProductos.size();i++){
            productoJComboBox.addItem(DatosPrecargados.listaProductos.get(i));
        }



        JLabel cantidad = new JLabel("Cantidad: ");
        JComboBox<Integer> cantidadJComboBox = new JComboBox<>();
        for (int i =1;i<=10;i++){
            cantidadJComboBox.addItem(i);
        }



        JButton aceptar = new JButton("Aceptar");
        JButton borrar = new JButton ("Borrar");

        JButton imagen = new JButton("Imagen");
        JTextArea resumen = new JTextArea(20,40);
        resumen.setFont(fontresumen);
        resumen.setEditable(false);

        JLabel total1 = new JLabel("TOTAL: ");
        JLabel total2 = new JLabel("0");

        JButton estadistica = new JButton("Estadistica");
        titulo.setFont(fonttitulo);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        //Ahora los colocamos
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=6;
        gbc.gridheight=3;
        gbc.weightx=1;
        gbc.weighty=1;
        add(titulo,gbc);

        gbc.weighty=0;
        gbc.weightx=0;

        gbc.gridy=3;
        gbc.gridheight=2;
        gbc.gridwidth=1;
        add(producto,gbc);

        gbc.gridx = 1;
        add(productoJComboBox,gbc);

        gbc.gridx=2;
        add(cantidad,gbc);

        gbc.gridx=3;
        add(cantidadJComboBox,gbc);

        gbc.gridx=4;
        add(aceptar,gbc);

        gbc.gridx=5;
        add(borrar,gbc);

        gbc.weighty=1;
        gbc.weightx=1;
        gbc.gridwidth=3;
        gbc.gridheight=6;
        gbc.gridx=0;
        gbc.gridy=5;

        add(imagen,gbc);

        gbc.gridx=3;
        add(resumen,gbc);

        gbc.weighty=0;
        gbc.weightx=0;

        gbc.gridy=11;
        gbc.gridx=0;
        gbc.gridheight=2;
        gbc.gridwidth=4;

        add(total1,gbc);

        gbc.gridwidth=2;
        gbc.gridx=4;

        add(total2,gbc);


        gbc.gridheight=1;
        gbc.gridwidth=4;
        gbc.gridx=1;
        gbc.gridy=13;

        add(estadistica,gbc);

        //Ahora le damos las funcionalidades

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(productoJComboBox.getSelectedIndex()== 0){
                    JOptionPane.showMessageDialog(null, "No ha elegido ningun producto", "Advertencia", JOptionPane.WARNING_MESSAGE);

                }
                else{
                DatosPrecargados.getTotalfinal();
                Producto productop = (Producto) productoJComboBox.getSelectedItem();


                int numeroSeleccionado = (Integer) cantidadJComboBox.getSelectedItem();
                float operacion = productop.getPrecio()*numeroSeleccionado;
                DatosPrecargados.setOperacion(operacion);
                DatosPrecargados.setTotalfinal(DatosPrecargados.getOperacion()+DatosPrecargados.getTotalfinal());
                String texto = String.valueOf(DatosPrecargados.getTotalfinal());
                total2.setText(texto);

                String seleccion =(productoJComboBox.getSelectedItem().toString()+"----"+cantidadJComboBox.getSelectedItem().toString()+"-----"+DatosPrecargados.getOperacion());
                resumen.append(seleccion + "\n");

                productoJComboBox.setSelectedIndex(0);
                cantidadJComboBox.setSelectedIndex(0);
                }
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resumen.getText().trim().isEmpty()) { // Verifica si está vacío (sin espacios en blanco)
                    JOptionPane.showMessageDialog(null, "No hay nada que borrar", "Advertencia", JOptionPane.WARNING_MESSAGE);

                }
                else{

                    int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todo?","Advertencia",JOptionPane.YES_NO_OPTION);
                        if (opcion == JOptionPane.YES_OPTION){
                            DatosPrecargados.setTotalfinal(0);
                            DatosPrecargados.setOperacion(0);
                            resumen.setText(null);
                            total2.setText("0");

                        }


                }
            }
        });









        setVisible(true);
    }


}
