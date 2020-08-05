
package Persistencia;

import BasedeDatos.Conexion;
import Excepciones.OBException;
import Logica.Paciente;
import Logica.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public abstract class PersistenciaPaciente {
    
    private static final String Select_Paciente="Select*from Persona, Pacientes where persona.CI=pacientes.CI and  pacientes.CI=?";
    private static final String Insertar_Paciente="INSERT INTO Pacientes VALUES(?,?);";
    private static final String Actualizar_Paciente= "UPDATE persona INNER JOIN pacientes SET persona.Nombre=?,persona.Apellido=?,persona.Direccion=?,persona.Telefono=?,pacientes.Mutualista=? WHERE persona.CI=pacientes.CI and persona.CI=?;"; 
    private static final String EliminarPaciente="DELETE persona,pacientes from persona join pacientes on persona.CI= pacientes.CI where persona.CI=?";
    private static final String Control_de_Usuario="SELECT*FROM pacientes WHERE ci=?;";
    
    
    
    
    public static Paciente obtenerPorCI(Integer ci)throws SQLException,OBException{
        
        PreparedStatement ps=null;
        Connection con = null;
        ResultSet rs = null;
        Paciente p=null;
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Select_Paciente);
            ps.setInt(1, ci);
            rs=ps.executeQuery();
            if(rs.next())
            {
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Apellido");
                Integer CI=rs.getInt("CI");
                String direccion=rs.getString("Direccion");
                int telefono=rs.getInt("Telefono");
                String Mutualista=rs.getString("Mutualista");
                
                p=new Paciente(nombre, apellido, CI, direccion, telefono,Mutualista);
                
            }else{
                throw new OBException("No se encontro la cedula ingresada: "+ci);
            }
            return p;          
            
        } catch (SQLException e) {
            throw new SQLException("Error al obtener datos "+e.getMessage());
        }
    }
               
        public static void Alta(Paciente pa)throws OBException,SQLException{
            
            PreparedStatement ps=null;
            Connection con=null;
            
            try {
                
                con=Conexion.Conectar();
                ps=con.prepareStatement(Insertar_Paciente);
                ps.setInt(1,pa.getCI());
                ps.setString(2,pa.getMutualista());
                ps.executeUpdate();             
                
            } catch (SQLException e) {
                throw  new OBException("ERROR "+e.getMessage());
            }
       }
        
       public static void Actualizar(Paciente pa)throws OBException,SQLException{
           PreparedStatement ps=null;
           Connection con=null;
           
           try {
               con=Conexion.Conectar();
               ps=con.prepareStatement(Actualizar_Paciente);
               ps.setString(1,pa.getNombre());
               ps.setString(2,pa.getApellido());
               ps.setString(3,pa.getDireccion());
               ps.setInt(4,pa.getTelefono());
               ps.setString(5,pa.getMutualista());
               ps.setInt(6,pa.getCI());
               ps.executeUpdate();                 
               
           } catch (SQLException e) {
               throw new OBException(e.getMessage());              
           }
                             
       }
        
       
      public static void Baja(Integer CI)throws OBException,SQLException{
          
          PreparedStatement ps=null;
          Connection con=null;
          try {
                con=Conexion.Conectar();
                ps=con.prepareStatement(EliminarPaciente);
                ps.setInt(1,CI);
                int cambios=ps.executeUpdate();
                if(cambios!=1){
                    throw  new OBException("No se encontro la Cedula "+CI+" seleccionada");
                }             
          } catch (SQLException e) {
              throw new OBException("Error al borrar Paciente "+e.getMessage());            
          }
                 
      }
      
          
      
}         
            
            
            
            
        
           
   
 

    
    
    
    
    

