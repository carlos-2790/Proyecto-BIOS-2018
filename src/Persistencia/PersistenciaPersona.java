
package Persistencia;

import BasedeDatos.Conexion;
import Excepciones.OBException;

import Logica.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public abstract class PersistenciaPersona {
    
     private static final String Mostrar_Persona="SELECT*FROM Persona where ci=?";
     private static final String Insertar_Persona="INSERT INTo Persona VALUES(?,?,?,?,?);";
     private static final String Actualizar_Persona="UPDATE Persona SET Nombre=?,Apellido=?,Direccion=?,Telefono=? WHERE CI=?";
     private static final String Eliminar_Persona="DELETE FROM Persona WHERE CI=?"; 
     
     
     
    public static Persona ListarPersona(Integer cedula)throws SQLException, OBException{
        
         PreparedStatement ps=null;
         Connection con = null;
         ResultSet rs = null;
         Persona p=null;
         try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Mostrar_Persona);
            ps.setInt(1,cedula);
            rs=ps.executeQuery();
            if(rs.next())
            {
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Apellido");
                int ci=rs.getInt("CI");
                String direccion=rs.getString("Direccion");
                int telefono=rs.getInt("Telefono");
                p=new Persona(nombre, apellido, ci, direccion, telefono);
                                        
            }else{
                throw new OBException("No se encontro la cedula ingresada "+cedula);
            }
            return p;
            
        } catch (SQLException e) {
            throw new SQLException("Error al obtener datos "+e.getMessage());
        }
    } 
    
      
     public static void Alta(Persona p)throws OBException, SQLException{            
           PreparedStatement ps=null;
           Connection con=null;
           
            try {
                
                con=Conexion.Conectar();
                ps=con.prepareStatement(Insertar_Persona);
                ps.setString(1,p.getNombre());
                ps.setString(2,p.getApellido());
                ps.setInt(3,p.getCI());
                ps.setString(4,p.getDireccion());
                ps.setInt(5,p.getTelefono());
                ps.executeUpdate();
                
                    
                }catch(SQLException e){
                    throw new OBException("ERROR AL INGRESAR DATOS .");
                }
                     
            }
     
     public static void baja(Integer ci)throws OBException, SQLException{
         
         PreparedStatement ps = null;
         Connection con=null;
         try {
             con=Conexion.Conectar();
             ps=con.prepareStatement(Eliminar_Persona);
             ps.setInt(1,ci);
             int cambios=ps.executeUpdate();
             if(cambios!=1){
                 throw  new OBException("No se encuentra el padron "+ci);
             }            
         } catch (SQLException e) {
             throw  new OBException("Error al encontrar la persona");
         }
     }
     
     public static void actualizar(Persona persona)throws OBException,SQLException{
         PreparedStatement ps=null;
         Connection con= null;
         try {
             con=Conexion.Conectar();
             ps=con.prepareStatement(Actualizar_Persona);
             ps.setString(1,persona.getNombre());
             ps.setString(2,persona.getApellido());
             ps.setInt(3,persona.getCI());
             ps.setString(4,persona.getDireccion());
             ps.setInt(5,persona.getTelefono());
             ps.executeUpdate();
         } catch (SQLException e) {
             throw  new OBException("Error Persna"+e.getMessage());
         }
         
     }
     
     
     
     
     
     
     
     
     
     
     
     
    
}
