
package Persistencia;

import BasedeDatos.Conexion;
import Excepciones.OBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Logica.Certificado;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;


public abstract class PersistenciaCertificado {
    
    
    private static final String Existe_Certificado="SELECT COUNT(*) FROM certificados WHERE Matricula=? AND fecha=?;";
    private static final String Seleccionar_Certificado_X_Dia_Medico="SELECT*FROM certificados WHERE Matricula=? and fecha=?;";
    private static final String Seleccionar_Certificado_Paciente="SELECT*FROM pacientes, certificados WHERE pacientes.CI= certificados.CI AND certificados.CI=? AND Fecha BETWEEN ? AND ? ORDER BY fecha ASC ;";
    private static final String Alta_Certificado="INSERT INTO Certificados VALUES(?,?,?,?,?,?)";
    
    
    
    public static int Existe_Certificado(Integer matr, Date fechas)throws OBException,SQLException,ParseException{
        
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        try {
            int cambios=0;
            con=Conexion.Conectar();
            ps=con.prepareStatement(Existe_Certificado);
            ps.setInt(1,matr);
            ps.setDate(2,new java.sql.Date(fechas.getTime()));
            rs=ps.executeQuery();
            if(rs.next()){
                cambios=rs.getInt(1);
            }
             return cambios;
        } catch (SQLException e) {
            throw new OBException("Error al buscar el certificado");
        }       
       
    }
       
    public static Certificado Buscar_X_DIA_CertMedico(Integer mat, Date fechas)throws OBException,SQLException{
        
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        Certificado c=null;
        try {
            
            con=Conexion.Conectar();
            ps=con.prepareStatement(Seleccionar_Certificado_X_Dia_Medico);
            ps.setInt(1,mat);
            ps.setDate(2,new java.sql.Date(fechas.getTime()));
            rs=ps.executeQuery();
            if(rs.next()){
              Integer ci=rs.getInt("CI");
              Integer matricula= rs.getInt("Matricula");
              String mutualista=rs.getString("Mutualista");
              String detalle=rs.getString("Detalle");
              Integer diasReposo=rs.getInt("diasReposo");
              Date fecha=rs.getDate("Fecha");
              c=new Certificado(detalle, diasReposo, fecha, mutualista, matricula, ci);
              
            }else{
                throw  new OBException("No se encontro certificado con la matricula: "+mat);
            }
            return c;
        } catch (SQLException e) {
            throw new OBException("No se pueden obtener los datos "+e.getMessage());
      }
    
    }
    
        
    public static Certificado Listar_Certificados_Paciente(Integer cedula,Date fecha1,Date fecha2)throws OBException,SQLException{
        
        PreparedStatement ps =null;
        Connection con=null;
        ResultSet rs=null;
        Certificado c=null;
        
        try {
            
            con=Conexion.Conectar();
            ps=con.prepareStatement(Seleccionar_Certificado_Paciente);
            ps.setInt(1,cedula);
            ps.setDate(2,new java.sql.Date(fecha1.getTime()));
            ps.setDate(3,new java.sql.Date(fecha2.getTime()));
            rs=ps.executeQuery();
            if(rs.next())
            {
              Integer ci=rs.getInt("CI");
              String mutualista=rs.getString("Mutualista");
              String detalle=rs.getString("Detalle");
              Integer diasResposo=rs.getInt("DiasReposo");
              Integer matricula=rs.getInt("Matricula");
              Date fecha=rs.getDate("Fecha");
              c= new Certificado(detalle, diasResposo, fecha, mutualista, matricula, ci);
              
            }else{
                throw  new OBException("NO se encontro certificado para  la cedula: "+cedula);
            }
            return c;
        } catch (SQLException e) {
            throw new OBException("Error al obtener datos "+e.getMessage());
        }
             
    }
    
    
    public static void Alta(Certificado c)throws OBException,SQLException{
        
        PreparedStatement ps=null;
        Connection con=null;
        try {
            
            con=Conexion.Conectar();
            ps=con.prepareStatement(Alta_Certificado);
            ps.setInt(1,c.getMatricula());
            ps.setInt(2,c.getCI());
            ps.setString(3, c.getDetalle());
            ps.setInt(4,c.getDiasReposo());
            ps.setString(5,c.getMutualista());
            ps.setDate(6,new java.sql.Date( c.getFecha().getTime()));
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new OBException(e.getMessage());
        }
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
    
    
}
