
package Persistencia;

import BasedeDatos.Conexion;
import Excepciones.OBException;
import Logica.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public abstract class PersistenciaMedico {
    
    private static final String Mostrar_Todos="SELECT COUNT(NomMutualista )FROM medicos WHERE NomMutualista=?;";
    private static final String Mostrar_Medico_x_CI="select* from persona, medicos where persona.CI= medicos.CI and medicos.CI=?;";
    private static final String Mostrar_Medico_x_CI_AND_Mutualista="select persona.Nombre,persona.Apellido,persona.CI,persona.Direccion,persona.Telefono,medicos.Matricula,medicos.NomMutualista  from Medicos inner join persona on Persona.CI=? and medicos.NomMutualista=? ;";
    private static final String Insertar_Medico="INSERT INTO Medicos VALUE(?,?,?);";
    private static final String Modificar_Medico="UPDATE persona INNER JOIN medicos SET persona.Nombre=?,persona.Apellido=?,persona.Direccion=?,persona.Telefono=?,medicos.Matricula=?,medicos.NomMutualista=? WHERE persona.CI=medicos.CI and persona.CI=?;";
    private static final String Eliminar_Medico="DELETE persona, medicos FROM persona join medicos on persona.CI= medicos.CI where persona.CI=?;";

    public static int ContarMutualistas(String mutualista)throws OBException,SQLException{
        
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
       
            try {
                int numero=0;
                con=Conexion.Conectar();
                ps=con.prepareStatement(Mostrar_Todos);
                ps.setString(1, mutualista);
                rs=ps.executeQuery();
                if(rs.next())
                {
                    numero=rs.getInt(1);
                }
                return numero;
            } catch (SQLException e) {
                throw new OBException("Error al obtner los datos");
            }
        }
    
    
    
    public static Medico Listar_x_CI(Integer ci)throws OBException, SQLException{
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        Medico medico=null;        
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Mostrar_Medico_x_CI);
            ps.setInt(1,ci);
            rs=ps.executeQuery();
            if(rs.next()){
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Apellido");
                Integer CI=rs.getInt("CI");
                String direccion=rs.getString("Direccion");
                Integer telefono=rs.getInt("Telefono");
                Integer matricula=rs.getInt("Matricula");
                String nomMutualista=rs.getString("NomMutualista");
                medico=new Medico(nombre, apellido, CI, direccion, telefono, matricula, nomMutualista);
            }
            else{
                throw new OBException("No se encontro la Cedula ingresada: "+ci);
                }
           return medico;
        } catch ( SQLException e) {
            throw new OBException("Error al obtener los datos "+e.getMessage());
        }
        
        
    }
    
    
    public static Medico Listar_X_CI_AND_Mutualista(Integer ci,String Mutualista)throws OBException,SQLException{
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        Medico med=null;
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Mostrar_Medico_x_CI_AND_Mutualista);
            rs=ps.executeQuery();
            while(rs.next()){
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Apellido");
                Integer CI=rs.getInt("CI");
                String direccion=rs.getString("Direccion");
                Integer telefono=rs.getInt("Telefono");
                Integer matricula=rs.getInt("Matricula");
                String nomMutualista=rs.getString("NomMutualista");
                
                med=new Medico(nombre, apellido, CI, direccion, telefono,matricula, nomMutualista);
                
        }
        return med;
                
        } catch (SQLException e) {
            throw new OBException("Error al obtener los datos ");
        }
    }
    
    public static void Alta (Medico med)throws OBException, SQLException{
        
      PreparedStatement ps=null;
      Connection con= null;
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Insertar_Medico);
            ps.setInt(1,med.getMatricula());
            ps.setInt(2,med.getCI());
            ps.setString(3,med.getNomMut());
            ps.executeUpdate();
                
        } catch (SQLException e) {
            throw new OBException("Error al ejecutar la consulta ");
        }
    }
    
    public static void Actualizar(Medico m)throws SQLException , OBException{
            
          PreparedStatement ps=null;
          Connection con=null;
          try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Modificar_Medico);
            ps.setString(1,m.getNombre());
            ps.setString(2,m.getApellido());
            ps.setString(3,m.getDireccion());
            ps.setInt(4,m.getTelefono());
            ps.setInt(5,m.getMatricula());
            ps.setString(6,m.getNomMut());
            ps.setInt(7,m.getCI());
            ps.executeUpdate();   
           
        } catch (SQLException e) {
            throw new OBException("Error al querer modificar datos");
        }
    }
    
    
    public static void Eliminar(Integer ci)throws SQLException,OBException{
        PreparedStatement ps=null;
        Connection con=null;
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Eliminar_Medico);
            ps.setInt(1,ci);
            int cambios =ps.executeUpdate();
            if(cambios!=1)
            {throw new OBException("No se encontro el medico con CI: "+ci);}
        } catch (SQLException e) {
            throw new OBException("Error al borrar el medico. "+e.getMessage());
        }
        
        
        
    }
    
   
    
    
    
    
    
    


}
            