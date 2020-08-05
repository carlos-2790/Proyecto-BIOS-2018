
package Logica;


public class Mutualista{
    private String nomMut;
    private String direccion;
    private Integer telefono;
    private Integer contraseña;
   
    
    public Mutualista(String nomMut,String direccion,Integer telefono,Integer contraseña){
        this.nomMut=nomMut;
        this.direccion=direccion;
        this.telefono=telefono;
        this.contraseña=contraseña;
    }
 
    public String getNomMut(){
     return nomMut;
    }
    
    public void setNomMut(String nomMut){
    
        this.nomMut=nomMut;
    }
    
    public String getDireccion(){
    return direccion;    
    }
    
    public void setDireccion(String direccion){
    this.direccion=direccion;
    }
    
    public Integer getTelefono(){
    return telefono;
    }
    
    public void setTelefono(Integer telefono){
    this.telefono=telefono;
    }
    public Integer getContraseña(){
        return contraseña;
    }
    public void setContraseña(Integer contraseña){
        this.contraseña=contraseña;
    }
       
    
}
