package org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEstadisticas extends JFrame{
	
	public VentanaEstadisticas() {
		
		setSize(1280,720);
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
		
		//panel botones
		JPanel botones = new JPanel();
		botones.setLayout(new FlowLayout());
		add(botones,BorderLayout.SOUTH);
	
		
		Font font2 = new Font("Arial", Font.PLAIN, 25);
		
		JButton guardar = new JButton("Guardar");
		botones.add(guardar);
		guardar.setFont(font2);
		
		JButton inicio = new JButton("Inicio");
		botones.add(inicio);
		inicio.setFont(font2);
		
		
		
		setVisible(true);
		
	}

}
