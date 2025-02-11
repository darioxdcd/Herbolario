package org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEstadisticas extends JFrame{
	
	public VentanaEstadisticas() {
		
		setSize(700,700);
		setLayout(new BorderLayout());
		
		//panel que muestra el mensaje estadistica
		
		JPanel menu = new JPanel();
		add(menu,BorderLayout.NORTH);

		
		Font font = new Font("Arial", Font.PLAIN, 50);
		
		JLabel esta = new JLabel("Estadistica");
		esta.setFont(font);
		menu.add(esta);
		
		//panel que muestra las estadisticas
		
		JPanel estadisticas = new JPanel();
		add(estadisticas,BorderLayout.CENTER);
		estadisticas.setLayout(new GridBagLayout());
		
		GridBagConstraints constraint = new  GridBagConstraints();
		constraint.insets = new Insets(30, 200, 400, 200);
		
		
		Font font3 = new Font("Arial", Font.PLAIN, 30);
		
		JLabel productos = new JLabel("Nombre: ");
		productos.setFont(font3);
		
		
		constraint.gridx = 0; 
		constraint.gridy = 0; 
		constraint.gridwidth = 1; 
		constraint.gridheight = 1;
		
		estadisticas.add(productos,constraint);
		
		JLabel porcentajes = new JLabel("%");
		porcentajes.setFont(font3);
		
		constraint.gridx = 1; 
		constraint.gridy = 0; 
		constraint.gridwidth = 1; 
		constraint.gridheight = 1;
		
		
		estadisticas.add(porcentajes, constraint);
			
		
		//panel botones
		JPanel botones = new JPanel();
		botones.setLayout(new GridBagLayout());
		add(botones,BorderLayout.SOUTH);
		
		constraint.insets = new Insets(30, 50, 10, 50);
		
	
		
		Font font2 = new Font("Arial", Font.PLAIN, 25);
		
		JButton guardar = new JButton("Guardar");
		
		constraint.gridx = 0; 
		constraint.gridy = 0; 
		constraint.gridwidth = 1; 
		constraint.gridheight = 1;
		
		botones.add(guardar,constraint);
		
		guardar.setFont(font2);
		
		JButton inicio = new JButton("Inicio");
		
		constraint.gridx = 1; 
		constraint.gridy = 0; 
		constraint.gridwidth = 1; 
		constraint.gridheight = 1;
		
		botones.add(inicio, constraint);
		
		inicio.setFont(font2);
		
		
		
		setVisible(true);
		
	}

}
