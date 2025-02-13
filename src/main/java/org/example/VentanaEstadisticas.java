package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEstadisticas extends JFrame {
	 String[] productos = new String[6];
	 int[] cantidades = new int[6];
	 double[] precios = new double[6];
	    
	 public VentanaEstadisticas() {
	        
	        setSize(900, 900);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());
	        
	        Color verde = new Color(90, 202, 30);
	        
	        JPanel panel = new JPanel();
	        add(panel);
	        panel.setLayout(new BorderLayout());
	         
	        
	        leer_fichero();
	        
	       
	        // Calcular total
	        int total = 0;
	        for (int i = 0; i < cantidades.length; i++) {
	            total += cantidades[i] * precios[i];
	        }
	        
	        // Calcular porcentajes
	        double[] porcentajes = new double[cantidades.length];
	        for (int i = 0; i < cantidades.length; i++) {
	            porcentajes[i] = ((cantidades[i] * precios[i]) / (double) total) * 100;
	        }

	        // Panel que muestra el mensaje de estadística
	        JPanel menu = new JPanel();
	        panel.add(menu, BorderLayout.NORTH);
	        menu.setBackground(verde);

	        Font font = new Font("Calibri", Font.PLAIN, 50);

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
	        for (int i = 0; i < productos.length; i++) {
	            // Verifica si el producto es null o vacío antes de agregar la etiqueta
	            if (productos[i] != null && !productos[i].isEmpty()) {
	                JLabel label = new JLabel(productos[i] + ": ");
	                label.setFont(font3);
	                constraint.gridx = 0;
	                constraint.gridy = i;
	                estadisticas.add(label, constraint);

	                // Asegurarse de que el porcentaje no sea 0 o nulo
	                if (cantidades[i] > 0 && precios[i] > 0) {
	                    JLabel porcentaje = new JLabel(String.format("%.2f%%", porcentajes[i]));
	                    porcentaje.setFont(font3);
	                    constraint.gridx = 1;
	                    estadisticas.add(porcentaje, constraint);
	                }
	            }
	        }
    	
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
    
    
    //leer estadisticas precargadas
    
    public void leer_fichero() {
    	
  		
  			 try {  
  	            BufferedReader br = new BufferedReader(new FileReader("estadisticas.txt"));
  	            String line;
  	            int i = 0;
  	            
  	            while ((line = br.readLine()) != null) {
  	                String[] partes = line.split(",");
  	                productos[i] = partes[0];
  	                cantidades[i] = Integer.parseInt(partes[1]);            
  	                precios[i] = Double.parseDouble(partes[2]);
  	                i++;
  	            }
  	            br.close();
  	        } catch (IOException a) {
  	            a.printStackTrace();
  	        }
  			

   		 
  
   	
   }
}

