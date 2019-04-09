/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdtienda;

import static bdtienda.ConexionBD.conexion;
import static bdtienda.VentanaTienda.btnBuscar;
import static bdtienda.VentanaTienda.btnEliminar;
import static bdtienda.VentanaTienda.btnRegistrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class EventosTienda implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnRegistrar)) {
            System.out.println("Registrar Works!");
            try {
                new ConexionBD().ConectaBD();
            } catch (SQLException ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                new ConexionBD().InsertaBD(conexion);
            } catch (Exception ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource().equals(btnEliminar)) {
            System.out.println("Eliminar Works!");
            try {
                new ConexionBD().ConectaBD();
            } catch (SQLException ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                new ConexionBD().EliminaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource().equals(btnBuscar)) {
            System.out.println("Buscar Works!");
            try {
                new ConexionBD().ConectaBD();
            } catch (SQLException ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                new ConexionBD().SeleccionaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
