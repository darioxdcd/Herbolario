package org.example;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroProductos extends JFrame {

    public VentanaRegistroProductos(){
        //Creamos la ventana y establecemos el Layout
        setSize(1280,720);
        //setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets (0,10,0,0);
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
        titulo.setFont(font);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=6;
        gbc.gridheight=3;
        gbc.weightx=1;
        gbc.weighty=1;
        add(titulo,gbc);


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






        setVisible(true);
    }


}
