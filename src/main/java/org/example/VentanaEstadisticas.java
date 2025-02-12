package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEstadisticas extends JFrame {
    
    public VentanaEstadisticas() {
        
        setSize(900, 900);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        Color verde = new Color(90, 202, 30);
        
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new BorderLayout());
        
        
        // Panel que muestra el mensaje de estadística
        JPanel menu = new JPanel();
        panel.add(menu, BorderLayout.NORTH);
        menu.setBackground(verde);

        Font font = new Font("Arial", Font.PLAIN, 50);

        JLabel esta = new JLabel("Estadistica");
        esta.setFont(font);
        menu.add(esta);
        
        // Panel que muestra las estadísticas
        JPanel estadisticas = new JPanel();
        panel.add(estadisticas, BorderLayout.CENTER);
        estadisticas.setLayout(new GridBagLayout());
        estadisticas.setBackground(verde);
        
        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(0, 0, 80, 150);
        
        Font font3 = new Font("Arial", Font.PLAIN, 30);
        
        // Crear las etiquetas para las estadísticas
        JLabel infusiones = new JLabel("Infusiones: ");
        infusiones.setFont(font3);
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        estadisticas.add(infusiones, constraint);
        
        JLabel aceites = new JLabel("Aceite esencial: ");
        aceites.setFont(font3);
        constraint.gridy = 1;
        estadisticas.add(aceites, constraint);
        
        JLabel jabon = new JLabel("Jabon artesanal: ");
        jabon.setFont(font3);
        constraint.gridy = 2;
        estadisticas.add(jabon, constraint);
        
        JLabel cremas = new JLabel("Cremas y ungüentos naturales: ");
        cremas.setFont(font3);
        constraint.gridy = 3;
        estadisticas.add(cremas, constraint);
        
        JLabel complementos = new JLabel("Complementos alimenticios: ");
        complementos.setFont(font3);
        constraint.gridy = 4;
        estadisticas.add(complementos, constraint);
        
        JLabel miel = new JLabel("Miel natural: ");
        miel.setFont(font3);
        constraint.gridy = 5;
        estadisticas.add(miel, constraint);
        
        // Etiqueta de porcentaje
        JLabel porcentajes = new JLabel("%");
        porcentajes.setFont(font3);
        constraint.gridx = 1;  // Esta etiqueta se coloca en la columna 1
        constraint.gridy = 0;  // Se alinea con la primera fila
        estadisticas.add(porcentajes, constraint);
        
        // Panel de botones
        JPanel botones = new JPanel();
        botones.setLayout(new GridBagLayout());
        panel.add(botones, BorderLayout.SOUTH);
        botones.setBackground(verde);
        
        constraint.insets = new Insets(30, 50, 10, 50);
        
        Font font2 = new Font("Arial", Font.PLAIN, 25);
        
        // Botón Guardar
        JButton guardar = new JButton("Guardar");
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        botones.add(guardar, constraint);
        guardar.setFont(font2);
        
        // Botón Inicio
        JButton inicio = new JButton("Inicio");
        constraint.gridx = 1;
        constraint.gridy = 0;
        botones.add(inicio, constraint);
        inicio.setFont(font2);
        
        inicio(inicio);
        
        setVisible(true);
    }
    
    
    //funcion para ir a la ventana de inicio
    public void inicio(JButton boton) {
    	
    	 boton.addActionListener(new ActionListener(){ public void actionPerformed (){ 		
 	 		
 		}
 	@Override
 	public void actionPerformed(ActionEvent e) {
 		
 		if(boton == e.getSource()) {
 		
 			
 				Inicio inicio = new Inicio();

 	}
 	}
 	 });
    	
    	
    }
}

