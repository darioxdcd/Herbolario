package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaEstadisticasPrecargadas extends JFrame {
	
    String[] productos = new String[6];
    int[] cantidades = new int[6];
    int[] precios = new int[6];
    
    public VentanaEstadisticasPrecargadas() {
        
        setSize(900, 900);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        Color verde = new Color(90, 202, 30);
        
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridBagLayout());
        panel.setBackground(verde);

        
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


        Font font = new Font("Arial", Font.PLAIN, 50);
        
        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(0, 10, 10, 150);  

        JLabel esta = new JLabel("Estadisticas");
        esta.setFont(font);
        constraint.gridx = 1;
        constraint.gridy = 0;
        panel.add(esta,constraint);
        
        
        Font font3 = new Font("Arial", Font.PLAIN, 20);
        
        ImageIcon[] imagenes = new ImageIcon[7];  

        imagenes[0] = new ImageIcon("images/1.png");
        imagenes[1] = new ImageIcon("images/2.png");
        imagenes[2] = new ImageIcon("images/3.png");
        imagenes[3] = new ImageIcon("images/4.png");
        imagenes[4] = new ImageIcon("images/5.png");
        imagenes[5] = new ImageIcon("images/6.png");
        imagenes[6] = new ImageIcon("images/0.png");
        
        // Crear las etiquetas para las estadísticas
        for (int i = 0; i < productos.length; i++) {
        	
        	ImageIcon iherbolaria = imagenes[i];
    		Image oherbolaria = iherbolaria.getImage();
    		Image rherbolaria = oherbolaria.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    		ImageIcon herbolaria = new ImageIcon(rherbolaria);
        	
        	JLabel label1 = new JLabel(herbolaria);
            label1.setFont(font3);
            constraint.gridx = 0;
            constraint.gridy = i+1;
            panel.add(label1, constraint);
        	
            JLabel label = new JLabel(productos[i] + ": ");
            label.setFont(font3);
            constraint.gridx = 1;
            constraint.gridy = i+1;
            panel.add(label, constraint);

            JLabel porcentaje = new JLabel(String.format("%.2f%%", porcentajes[i]));
            porcentaje.setFont(font3);
            constraint.gridx = 2;
            constraint.gridy = i+1;
            panel.add(porcentaje, constraint);
        }
        

        
        Font font2 = new Font("Arial", Font.PLAIN, 25);
        
        // Botón Inicio
        JButton inicio = new JButton("Inicio");
        constraint.gridx = 1;
        constraint.gridy = 7;
        panel.add(inicio, constraint);
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
                 dispose();
 		
 	}
 	}
 	 });
    	
    	
    }
    
    
    //funcion leer fichero
    
    
    public void leer_fichero() {
    	
    	 try {
             BufferedReader br = new BufferedReader(new FileReader("estadisticasPrecargadas.txt"));
             String line;
             int i = 0;
             
             while ((line = br.readLine()) != null) {
                 String[] partes = line.split(",");
                 productos[i] = partes[0];
                 cantidades[i] = Integer.parseInt(partes[1]);
                 precios[i] = Integer.parseInt(partes[2]);
                 i++;
             }
             br.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
         
    	
    }
    
}
    
 
