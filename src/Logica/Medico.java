
package Logica;




public class Medico extends Persona{
   // private Integer ci;
    private Integer matricula;
    private String nomMut;
    
    
   public Medico(String nombre,String apellido,Integer ci,String direccion,Integer telefono,Integer matricula,String nomMut ){
        super(nombre, apellido, ci, direccion, telefono);
        this.matricula=matricula;
        this.nomMut=nomMut;   
    }

  

   
    
/*public Integer getCI(){
    return ci;
}
public void setCI(Integer ci){
    this.ci=ci;
}
*/
public Integer getMatricula(){
return matricula;
}

public void setMatricula(Integer matricula){

    this.matricula=matricula;
}


public String getNomMut(){
return nomMut;
}
 

public void setNomMut(String nomMut){
    this.nomMut=nomMut;
    
}

    
@Override
public String toString(){
    
    return super.toString()+" Matricula "+matricula+" Mutualista"+nomMut;
}

}
