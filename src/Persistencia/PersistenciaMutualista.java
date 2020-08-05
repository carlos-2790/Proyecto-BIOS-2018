/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import BasedeDatos.Conexion;
import Excepciones.OBException;
import Logica.Mutualista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Liam
 */
public abstract class PersistenciaMutualista {
    private static final String Buscar="SELECT*FROM mutualistas WHERE NomMutualista=?;";
    private static final String Seleccionar_Mutualista="SELECT*FROM mutualistas WHERE Contraseña=?;";
    private static final String Insertar_Mutualista="INSERT INTO Mutualistas VALUES(?,?,?,?); ";
    private static final String Modificar_Mutualista="UPDATE Mutualistas SET direccion=?,telefono=?, contraseña=? where NomMutualista=?;";
    private static final String Eliminar_Mutualista="DELETE FROM Mutualistas WHERE NomMutualista=?; ";
    
    
    public static void Alta(Mutualista mut)throws SQLException{
        
        PreparedStatement ps=null;
        Connection con=null;
        try {
            
            con=Conexion.Conectar();
            ps=con.prepareStatement(Insertar_Mutualista);
            ps.setString(1,mut.getNomMut());
            ps.setString(2,mut.getDireccion());
            ps.setInt(3,mut.getTelefono());
            ps.setInt(4,mut.getContraseña());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error "+e);
        }
    }
    
    public static Mutualista Buscar_Mutualista(String nombre)throws OBException,SQLException{
        
        PreparedStatement ps=null;
        Connection con=null;
        ResultSet rs=null;
        Mutualista m=null;
        try {
            con=Conexion.Conectar();
            ps=con.prepareStatement(Buscar);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            if(rs.next()){
                
              String mutualista=rs.getString("NomMutualista");
              String direccion=rs.getString("direccion");
              Integer telefono=rs.getInt("telefono");
              Integer contraseña=rs.getInt("Contraseña"); 
              m=new Mutualista(mutualista, direccion, telefono, contraseña);
            }
            else{
            throw new OBException("La mutualista '"+nombre+"' no se encuentra registrada, verifique... ");
        }
            return m;
        } catch (SQLException e) {
            throw  new OBException("Erro al obtener los datos");
        }
                        
    }
    
    
    
        public static  Mutualista listar(Integer cont)throws OBException,SQLException{
            PreparedStatement ps=null;
            Connection con=null;
            ResultSet rs= null;
            Mutualista mu= null;
            try {
                con=Conexion.Conectar();
                ps=con.prepareStatement(Seleccionar_Mutualista);
                ps.setInt(1, cont);
                rs=ps.executeQuery();
                if(rs.next()){
                    String mutua=rs.getString("NomMutualista");
                    String direccion=rs.getString("direccion");
                    Integer telefono=rs.getInt("telefono");
                    Integer contraseña=rs.getInt("Contraseña");
                    mu= new Mutualista(mutua, direccion, telefono,contraseña);
                }
                else{
                    throw new OBException("Mutualista no se encuentra registrada");
                }
                return mu;
                       
            } catch (SQLException e) {
                throw new OBException("Error ");
            }
            
            
        }
        
        public static void Actualizar(Mutualista mu)throws SQLException, OBException{
            
            PreparedStatement ps= null;
            Connection con=null;
            try {
                con=Conexion.Conectar();
                ps=con.prepareStatement(Modificar_Mutualista);
                ps.setString(1,mu.getDireccion());
                ps.setInt(2,mu.getTelefono());
                ps.setInt(3,mu.getContraseña());
                 ps.setString(4,mu.getNomMut());
                ps.executeUpdate();
                               
            } catch (SQLException e) {
                throw  new OBException("Error al querer modificar los datos");
            }
        }
        
        public static void Eliminar(String nombre)throws SQLException,OBException{
            
            PreparedStatement ps= null;
            Connection con=null;
            try {
                
                con=Conexion.Conectar();
                ps=con.prepareStatement(Eliminar_Mutualista);
                ps.setString(1, nombre);
                int cambios=ps.executeUpdate();
                if(cambios!=1){
                    throw  new OBException("No se encontro la mutualista: "+ nombre+".");
                }               
            } catch (SQLException e) {
                    throw new OBException("Error al querer borrar la mutualista");
            }
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

