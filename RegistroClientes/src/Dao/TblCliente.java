
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import registroclientes.Cliente;


public class TblCliente
{
    
     private Conexion conex;
    private Connection conn;
    private PreparedStatement mostrarCliente;
    
    
     private List<Cliente> libreros = new ArrayList();
    
    public TblCliente(List<Cliente> lista)
    {
        
       this.libreros = lista;
       conn = conex.obtenerConexion();
        try {
            mostrarCliente = conn.prepareStatement("Select * from Librero");
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(TblCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
  
        
        
    }
    
    
    
    
    
}
