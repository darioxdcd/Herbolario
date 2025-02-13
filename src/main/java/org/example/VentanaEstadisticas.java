package org.example;

import java.awt.Color;
import java.awt.FlowLayout;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaEstadisticas extends JFrame {
	 String[] productos = new String[6];
	 int[] cantidades = new int[6];
	 double[] precios = new double[6];
	    
	 public VentanaEstadisticas() {
	        
	        setSize(900, 900);
	        setLocationRelativeTo(null);
	        setLayout(new GridBagLayout());
	        
	        Color verde = new Color(90, 202, 30);
	        
	        JPanel panel = new JPanel();
	        add(panel);
	        panel.setLayout(new GridBagLayout());
	        panel.setBackground(verde);
	         
	        
	       // leer_fichero();
	        
	        GridBagConstraints constraint = new GridBagConstraints();
	        constraint.insets = new Insets(0, 40, 20, 150);

	        Font font = new Font("Calibri", Font.PLAIN, 50);

	        JLabel esta = new JLabel("Estadisticas");
	        esta.setFont(font);
	        
	        constraint.gridx = 1;
            constraint.gridy = 0;
	        panel.add(esta,constraint);
	        

	        Font font3 = new Font("Calibri", Font.PLAIN, 20);
	        
	     // Primer Producto
	        ImageIcon i1 = new ImageIcon("images/1.png");
	        Image o1 = i1.getImage();
	        Image r1 = o1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im1 = new ImageIcon(r1);
	        JLabel img = new JLabel(im1);
	        constraint.gridx = 0;
	        constraint.gridy = 1;
	        panel.add(img, constraint);

	        JLabel nombre = new JLabel("Infusiones");
	        nombre.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 1;
	        panel.add(nombre, constraint);

	        Float porcentaje1 = (DatosPrecargados.getTotalop1() / DatosPrecargados.getTotalfinal());
	        porcentaje1 = porcentaje1 * 100;
	        JLabel porcentaje1t = new JLabel(String.format("%.2f%%", porcentaje1));
	        porcentaje1t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 1;
	        panel.add(porcentaje1t, constraint);

	        // Segundo Producto
	        ImageIcon i2 = new ImageIcon("images/2.png");
	        Image o2 = i2.getImage();
	        Image r2 = o2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im2 = new ImageIcon(r2);
	        JLabel img2 = new JLabel(im2);
	        constraint.gridx = 0;
	        constraint.gridy = 2;
	        panel.add(img2, constraint);

	        JLabel nombre2 = new JLabel("Aceites esenciales");
	        nombre2.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 2;
	        panel.add(nombre2, constraint);

	        Float porcentaje2 = (DatosPrecargados.getTotalop2() / DatosPrecargados.getTotalfinal());
	        porcentaje2 = porcentaje2 * 100;
	        JLabel porcentaje2t = new JLabel(String.format("%.2f%%", porcentaje2));
	        porcentaje2t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 2;
	        panel.add(porcentaje2t, constraint);

	        // Tercer Producto
	        ImageIcon i3 = new ImageIcon("images/3.png");
	        Image o3 = i3.getImage();
	        Image r3 = o3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im3 = new ImageIcon(r3);
	        JLabel img3 = new JLabel(im3);
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        panel.add(img3, constraint);

	        JLabel nombre3 = new JLabel("Jabones artesanales");
	        nombre3.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 3;
	        panel.add(nombre3, constraint);

	        Float porcentaje3 = (DatosPrecargados.getTotalop3() / DatosPrecargados.getTotalfinal());
	        porcentaje3 = porcentaje3 * 100;
	        JLabel porcentaje3t = new JLabel(String.format("%.2f%%", porcentaje3));
	        porcentaje3t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 3;
	        panel.add(porcentaje3t, constraint);

	        // Cuarto Producto
	        ImageIcon i4 = new ImageIcon("images/4.png");
	        Image o4 = i4.getImage();
	        Image r4 = o4.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im4 = new ImageIcon(r4);
	        JLabel img4 = new JLabel(im4);
	        constraint.gridx = 0;
	        constraint.gridy = 4;
	        panel.add(img4, constraint);

	        JLabel nombre4 = new JLabel("Cremas y ungüentos naturales");
	        nombre4.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 4;
	        panel.add(nombre4, constraint);

	        Float porcentaje4 = (DatosPrecargados.getTotalop4() / DatosPrecargados.getTotalfinal());
	        porcentaje4 = porcentaje4 * 100;
	        JLabel porcentaje4t = new JLabel(String.format("%.2f%%", porcentaje4));
	        porcentaje4t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 4;
	        panel.add(porcentaje4t, constraint);

	        // Quinto Producto
	        ImageIcon i5 = new ImageIcon("images/5.png");
	        Image o5 = i5.getImage();
	        Image r5 = o5.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im5 = new ImageIcon(r5);
	        JLabel img5 = new JLabel(im5);
	        constraint.gridx = 0;
	        constraint.gridy = 5;
	        panel.add(img5, constraint);

	        JLabel nombre5 = new JLabel("Complementos alimenticios");
	        nombre5.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 5;
	        panel.add(nombre5, constraint);

	        Float porcentaje5 = (DatosPrecargados.getTotalop5() / DatosPrecargados.getTotalfinal());
	        porcentaje5 = porcentaje5 * 100;
	        JLabel porcentaje5t = new JLabel(String.format("%.2f%%", porcentaje5));
	        porcentaje5t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 5;
	        panel.add(porcentaje5t, constraint);

	        // Sexto Producto
	        ImageIcon i6 = new ImageIcon("images/6.png");
	        Image o6 = i6.getImage();
	        Image r6 = o6.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        ImageIcon im6 = new ImageIcon(r6);
	        JLabel img6 = new JLabel(im6);
	        constraint.gridx = 0;
	        constraint.gridy = 6;
	        panel.add(img6, constraint);

	        JLabel nombre6 = new JLabel("Miel natural");
	        nombre6.setFont(font3);
	        constraint.gridx = 1;
	        constraint.gridy = 6;
	        panel.add(nombre6, constraint);

	        Float porcentaje6 = (DatosPrecargados.getTotalop6() / DatosPrecargados.getTotalfinal());
	        porcentaje6 = porcentaje6 * 100;
	        JLabel porcentaje6t = new JLabel(String.format("%.2f%%", porcentaje6));
	        porcentaje6t.setFont(font3);
	        constraint.gridx = 2;
	        constraint.gridy = 6;
	        panel.add(porcentaje6t, constraint);
	        
        
        Font font2 = new Font("Arial", Font.PLAIN, 25);
        
        
        JPanel botones = new JPanel();
        botones.setBackground(verde);
        constraint.gridx = 0;
        constraint.gridy = 7;
        constraint.gridwidth = 3;
        constraint.gridheight = 1;
        panel.add(botones,constraint);
        
        botones.setLayout(new FlowLayout(20));
        
        // Botón Guardar
        JButton guardar = new JButton("Guardar");
        botones.add(guardar);
        guardar.setFont(font2);
        
        // Botón Inicio
        JButton inicio = new JButton("Inicio");
        botones.add(inicio);
        inicio.setFont(font2);
        
        inicio(inicio);
        guardar(guardar);
       
        
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
    
    
    
    
    //boton guardar
    
    public void guardar(JButton boton) {
    	
   	 boton.addActionListener(new ActionListener(){ public void actionPerformed (){ 		
	 		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(boton == e.getSource()) {
		
			JOptionPane.showMessageDialog(null, "Los datos han sido guardados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);	
				

	}
	}
	 });
  		
  			

   		 
  
   	
   }
}

