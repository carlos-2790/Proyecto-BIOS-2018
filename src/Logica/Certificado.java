
package Logica;

import java.util.ArrayList;
import java.util.Date;


public class Certificado{
    
    
    
    private String detalle;
    private Integer diasReposo;
    private Date fecha;
    private String mutualista;
    private Integer matricula;
    private Integer ci;
    
   
  
    
   /* public Certificado(String nombre,String apellido,Integer ci,String direccion,Integer telefono,Integer matricula,String contraseña,String nomMut ,String detalle,Integer diasReposo,Date fecha){
    super(nombre, apellido, ci, direccion, telefono, matricula, contraseña, nomMut);
    this.detalle=detalle;
    this.diasReposo=diasReposo;
    this.fecha=fecha;
    }*/
    
    
     
    public Certificado(String detalle,Integer diasReposo,Date fecha,String mutualista,Integer matricula ,Integer ci){
     super();
     this.detalle=detalle;
     this.diasReposo=diasReposo;
     this.fecha=fecha;
     this.matricula=matricula;
     this.ci=ci;
     this.mutualista=mutualista;
     
    }
    
   
  
    
    public String getDetalle(){
    return detalle;
    }
    
    public void setDetalle(String detalle){
    this.detalle=detalle;
    }
    
    public Integer getDiasReposo(){
    return diasReposo;
    }
    
    public void setDiasReposo(int diasReposo){
        this.diasReposo=diasReposo;
    }
    
    public Date getFecha(){
         
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    
    public String getMutualista(){
       return mutualista;
    }
    public void setMutualista(String mutualista){
        this.mutualista=mutualista;
    }
    
    public Integer getMatricula(){
        return matricula;
    }
    public void setMatricula(Integer matricula){
        this.matricula=matricula;
    }
    
    public Integer getCI(){
        return ci;
    }
    public void setCI(Integer ci){
        this.ci=ci;
    }
    
    
    
    
    
    
    
    
}
