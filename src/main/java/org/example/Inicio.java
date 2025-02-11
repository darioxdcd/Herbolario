package org.example;
import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
	
    public Inicio() {
    	
    	//caracteristicas de la ventana
        setTitle("Inicio");
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(new Color(90, 202, 30)); //Color de fondo verde
        
        //separacion entre botones
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        
        //titulo interfz y caracteristicas
        JLabel titulo = new JLabel("Registro de Herbolario", SwingConstants.CENTER);//posicion del centro
        titulo.setFont(new Font("Serif", Font.BOLD, 48));//tipo de letra y tamaño
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(titulo, gbc);
        //boton nueva semana
        JButton nuevaSemana = new JButton("Nueva Semana");
        nuevaSemana.setFont(new Font("Serif", Font.BOLD, 24));
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;//posicion del boton y separacion en hhorizontal
        add(nuevaSemana, gbc);
        //boton semana anterior
        JButton semanaAnterior = new JButton("Semana Anterior");
        semanaAnterior.setFont(new Font("Serif", Font.BOLD, 24));
        gbc.gridy = 2;
        add(semanaAnterior, gbc);
        
        
        setVisible(true);
    }
}
