/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdtienda;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class VentanaTienda {
    
    static JLabel lblId, lblDescripcion, lblPrecio, lblTotal;
    static JTextField txtId, txtDescripcion, txtPrecio, txtTotal;
    static JButton btnRegistrar, btnEliminar, btnBuscar;
    
    VentanaTienda() {
        
        JFrame f = new JFrame("Mi Tienda");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblId = c.getLabel("ID Venta");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblId, restricciones);
        
        p.add(lblId);
        
        txtId = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtId, restricciones);
        
        p.add(txtId);
        
        lblDescripcion = c.getLabel("Descripcion");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblDescripcion, restricciones);
        
        p.add(lblDescripcion);
        
        txtDescripcion = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtDescripcion, restricciones);
        
        p.add(txtDescripcion);
        
        lblPrecio = c.getLabel("Precio");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblPrecio, restricciones);
        
        p.add(lblPrecio);
        
        txtPrecio = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtPrecio, restricciones);
        
        p.add(txtPrecio);
        
        lblTotal = c.getLabel("Total + IVA:");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblTotal, restricciones);
        
        p.add(lblTotal);
        
        txtTotal = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtTotal, restricciones);
        
        p.add(txtTotal);
        
        btnRegistrar = c.getButton("Registrar");
        btnRegistrar.addActionListener(new EventosTienda());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnRegistrar, restricciones);
        
        p.add(btnRegistrar);
        
        btnEliminar = c.getButton("Eliminar");
        btnEliminar.addActionListener(new EventosTienda());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnEliminar, restricciones);
        
        p.add(btnEliminar);
        
        btnBuscar = c.getButton("Buscar");
        btnBuscar.addActionListener(new EventosTienda());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnBuscar, restricciones);
        
        p.add(btnBuscar);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
