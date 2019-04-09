/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdtienda;

import static bdtienda.VentanaTienda.txtDescripcion;
import static bdtienda.VentanaTienda.txtId;
import static bdtienda.VentanaTienda.txtPrecio;
import static bdtienda.VentanaTienda.txtTotal;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Omar
 */
public class ConexionBD {
    
    static Connection conexion;
    
    public Connection ConectaBD() throws SQLException {
        
        String driver = "jdbc:postgresql://localhost/bdtienda";
        conexion = DriverManager.getConnection(driver, "postgres", "zmur300");
        System.out.println("Conexion Establecida!! :D");
        return conexion;
        
    }
    
    public void SeleccionaBD(Connection conexion) throws SQLException {
        
        int id = Integer.parseInt(txtId.getText());
        
        String query = "SELECT * FROM productos WHERE id = " + id;
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            txtId.setText(rs.getString("id"));
            txtDescripcion.setText(rs.getString("descripcion"));
            txtPrecio.setText(rs.getString("precio"));
            txtTotal.setText(rs.getString("total"));
        }
        
    }
    
    public void InsertaBD(Connection conexion) throws SQLException, Exception {
        
        int id = Integer.parseInt(txtId.getText());
        String descripcion = txtDescripcion.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        int total = Integer.parseInt(txtTotal.getText());
        
        String query = "INSERT INTO productos VALUES (" + id + ", '" + descripcion + "', " + precio + ", " + total + ");";
        PreparedStatement stmt = conexion.prepareStatement(query);
        stmt.executeUpdate();
        // Statement stmt = conexion.createStatement();
        // ResultSet rs = stmt.executeQuery(query);
        
        System.out.println("Se ha insertado el producto");
        
    }
    
    public void EliminaBD(Connection conexion) throws SQLException {
        
        int id = Integer.parseInt(txtId.getText());
        
        String query = "DELETE FROM productos WHERE id = " + id;
        PreparedStatement stmt = conexion.prepareStatement(query);
        stmt.executeUpdate();
        // Statement stmt = conexion.createStatement();
        //ResultSet rs = stmt.executeQuery(query);
        
        System.out.println("Se ha eliminado el producto");
        
        txtId.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtTotal.setText("");
        
    }
    
}
