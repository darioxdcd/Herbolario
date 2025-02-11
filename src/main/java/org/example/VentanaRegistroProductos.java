package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaRegistroProductos extends JFrame {

    public VentanaRegistroProductos(){
        //Creamos la ventana y establecemos el Layout
        setSize(900,900);
        //setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets (10,10,10,10);
        gbc.fill = GridBagConstraints.BOTH;
        //Creamos la fuente
        Font font = new Font("Calibri",Font.PLAIN,50);
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
        cantidadJComboBox.setPreferredSize(new Dimension(202,25));


        JButton aceptar = new JButton("Aceptar");
        JButton borrar = new JButton ("Borrar");

        JButton imagen = new JButton("Imagen");
        JTextArea resumen = new JTextArea(20,40);
        resumen.setEditable(false);

        JLabel total1 = new JLabel("TOTAL: ");
        JLabel total2 = new JLabel(" ");

        JButton estadistica = new JButton("Estadistica");
        titulo.setFont(font);
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

        









        setVisible(true);
    }


}
