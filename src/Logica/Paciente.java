
package Logica;




public class Paciente extends Persona{
    
    private String mutualista;
    
    
    
    
    public Paciente(String nombre,String apellido,Integer ci,String direccion,Integer telefono,String mutualista){
    super(nombre, apellido, ci, direccion, telefono);
    this.mutualista=mutualista;
    
    
    }
    
    
            
    public String getMutualista(){
        
        return mutualista;
    }
    
    public void setMutualista(String mutualista){
        
        this.mutualista=mutualista;
    }
    
    
    
    
    @Override
    public String toString(){
        return super.toString()+" Mutualista "+mutualista;
        
    }
    
    
    
}
