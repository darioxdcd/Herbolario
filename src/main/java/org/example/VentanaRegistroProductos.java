package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaRegistroProductos extends JFrame {

    public VentanaRegistroProductos() {
        //Creamos la ventana y establecemos el Layout
        setSize(900, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(90, 202, 30));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;
        //Creamos la fuente
        Font fonttitulo = new Font("Calibri", Font.PLAIN, 50);
        Font fontresumen = new Font("Calibri", Font.BOLD, 16);
        Font fonttotal = new Font("Calibri", Font.BOLD, 30);
        //Creamos los elementos
        JLabel titulo = new JLabel("Añadir registros");
        JLabel producto = new JLabel("Producto: ");
        JComboBox<Producto> productoJComboBox = new JComboBox<>();
        for (int i = 0; i < DatosPrecargados.listaProductos.size(); i++) {
            productoJComboBox.addItem(DatosPrecargados.listaProductos.get(i));
        }


        JLabel cantidad = new JLabel("Cantidad: ");
        JComboBox<Integer> cantidadJComboBox = new JComboBox<>();
        for (int i = 1; i <= 10; i++) {
            cantidadJComboBox.addItem(i);
        }


        ImageIcon imagen1 = new ImageIcon("images/1.png");
        ImageIcon imagen2 = new ImageIcon("images/2.png");
        ImageIcon imagen3 = new ImageIcon("images/3.png");
        ImageIcon imagen4 = new ImageIcon("images/4.png");
        ImageIcon imagen5 = new ImageIcon("images/5.png");
        ImageIcon imagen6 = new ImageIcon("images/6.png");
        ImageIcon imagen0 = new ImageIcon("images/0.png");
        Image fondo = new ImageIcon("images/fondo.png").getImage();


        JButton aceptar = new JButton("Aceptar");
        JButton borrar = new JButton("Borrar");

        JButton imagen = new JButton(imagen0);


        JTextArea resumen = new JTextArea(20, 40);
        resumen.setFont(fontresumen);
        resumen.setEditable(false);


        JLabel total1 = new JLabel("TOTAL: ");
        total1.setFont(fonttotal);

        JLabel total2 = new JLabel("0 €");
        total2.setFont(fonttotal);

        JButton estadistica = new JButton("Estadistica");
        estadistica.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(fonttitulo);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        //Ahora los colocamos
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.gridheight = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        add(titulo, gbc);

        gbc.weighty = 0;
        gbc.weightx = 0;

        gbc.gridy = 3;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        add(producto, gbc);

        gbc.gridx = 1;
        add(productoJComboBox, gbc);

        gbc.gridx = 2;
        add(cantidad, gbc);

        gbc.gridx = 3;
        add(cantidadJComboBox, gbc);

        gbc.gridx = 4;
        add(aceptar, gbc);

        gbc.gridx = 5;
        add(borrar, gbc);

        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 3;
        gbc.gridheight = 6;
        gbc.gridx = 0;
        gbc.gridy = 5;

        add(imagen, gbc);

        gbc.gridx = 3;
        add(resumen, gbc);

        gbc.weighty = 0;
        gbc.weightx = 0;

        gbc.gridy = 11;
        gbc.gridx = 4;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;

        add(total1, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 5;

        add(total2, gbc);


        gbc.gridheight = 1;
        gbc.gridwidth = 6;
        gbc.gridx = 0;
        gbc.gridy = 13;

        add(estadistica, gbc);

        //Ahora le damos las funcionalidades

        aceptar.addActionListener(e -> {

            Producto produc = (Producto) productoJComboBox.getSelectedItem();
            int numeroSelec = (Integer) cantidadJComboBox.getSelectedItem();


            // Guardar en el archivo


            if (productoJComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "No ha elegido ningun producto", "Advertencia", JOptionPane.WARNING_MESSAGE);

            } else {

                Producto productop = (Producto) productoJComboBox.getSelectedItem();

                int numeroSeleccionado = (Integer) cantidadJComboBox.getSelectedItem();
                float operacion = productop.getPrecio() * numeroSeleccionado;
                DatosPrecargados.setOperacion(operacion);
                DatosPrecargados.setTotalfinal(DatosPrecargados.getOperacion() + DatosPrecargados.getTotalfinal());
                String texto = String.valueOf(DatosPrecargados.getTotalfinal());
                total2.setText(texto + " €");
                if (productoJComboBox.getSelectedIndex() > 0 && productoJComboBox.getSelectedIndex() <= 6) {
                    switch (productoJComboBox.getSelectedIndex()) {
                        case 1:
                            DatosPrecargados.setTotalop1(operacion + DatosPrecargados.getTotalop1());
                            break;
                        case 2:
                            DatosPrecargados.setTotalop2(operacion + DatosPrecargados.getTotalop2());
                            break;
                        case 3:
                            DatosPrecargados.setTotalop3(operacion + DatosPrecargados.getTotalop3());
                            break;
                        case 4:
                            DatosPrecargados.setTotalop4(operacion + DatosPrecargados.getTotalop4());
                            break;
                        case 5:
                            DatosPrecargados.setTotalop5(operacion + DatosPrecargados.getTotalop5());
                            break;
                        case 6:
                            DatosPrecargados.setTotalop6(operacion + DatosPrecargados.getTotalop6());
                            break;
                    }
                }
                String seleccion = (productoJComboBox.getSelectedItem().toString() + "----" + cantidadJComboBox.getSelectedItem().toString() + "-----" + DatosPrecargados.getOperacion() + " €");
                resumen.append(seleccion + "\n");

                productoJComboBox.setSelectedIndex(0);
                cantidadJComboBox.setSelectedIndex(0);


            }
        });
        borrar.addActionListener(e -> {
            if (resumen.getText().trim().isEmpty()) { // Verifica si está vacío (sin espacios en blanco)
                JOptionPane.showMessageDialog(null, "No hay nada que borrar", "Advertencia", JOptionPane.WARNING_MESSAGE);

            } else {

                int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todo?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    DatosPrecargados.setTotalfinal(0);
                    DatosPrecargados.setOperacion(0);
                    resumen.setText(null);
                    total2.setText("0 €");
                    DatosPrecargados.setTotalop1(0);
                    DatosPrecargados.setTotalop2(0);
                    DatosPrecargados.setTotalop3(0);
                    DatosPrecargados.setTotalop4(0);
                    DatosPrecargados.setTotalop5(0);
                    DatosPrecargados.setTotalop6(0);
                }
                // Limpiar el archivo


            }
        });
        productoJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (productoJComboBox.getSelectedIndex() <= 6) {

                    switch (productoJComboBox.getSelectedIndex()) {
                        case 1:
                            imagen.setIcon(imagen1);

                            break;
                        case 2:
                            imagen.setIcon(imagen2);
                            break;
                        case 3:
                            imagen.setIcon(imagen3);
                            break;
                        case 4:
                            imagen.setIcon(imagen4);
                            break;
                        case 5:
                            imagen.setIcon(imagen5);
                            break;
                        case 6:
                            imagen.setIcon(imagen6);
                            break;
                        default:
                            imagen.setIcon(imagen0);
                    }

                }
            }
        });


        setVisible(true);
    }
}




