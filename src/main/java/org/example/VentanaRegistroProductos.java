package org.example;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroProductos extends JFrame {

    public VentanaRegistroProductos(){
        //Creamos la ventana y establecemos el Layout
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets (0,10,0,0);
        gbc.fill = GridBagConstraints.BOTH;
        //Creamos la fuente
        Font font = new Font("Calibri",Font.PLAIN,50);
        //Creamos los elementos
        JLabel titulo = new JLabel("Añadir registros");
        JLabel producto = new JLabel ("Producto");

        JComboBox<Producto> productoJComboBox = new JComboBox<>();
        productoJComboBox.ad
        titulo.setFont(font);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=6;
        gbc.gridheight=3;
        gbc.weightx=1;
        gbc.weighty=1;
        add(titulo,gbc);


        gbc.gridy=4;
        gbc.gridheight=1;
        gbc.gridwidth=1;
        add(producto,gbc);

        gbc.gridx = 1;
        add(productoJComboBox,gbc);





    }


}
