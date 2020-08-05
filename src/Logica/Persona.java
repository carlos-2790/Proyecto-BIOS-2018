
package Logica;




public  class Persona  {
    
   private String nombre;
   private String apellido;
   private Integer ci;
   private String direccion;
   private Integer telefono;
   
   public Persona(String nombre,String apellido,Integer ci,String direccion,Integer telefono){
          this.nombre=nombre;
          this.apellido= apellido;
          this.ci=ci;
          this.direccion=direccion;
          this.telefono=telefono;   
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public void setNombre(String nombre){
      this.nombre=nombre;
   }

   public String getApellido(){
     return apellido;
   }
   
   public void setApellido(String apellido){
      this.apellido=apellido;
   }
   
   public Integer getCI(){
     return ci;
   }
   
   public void setCI(Integer ci){
      this.ci=ci;
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
    
   @Override
   public String toString(){
       
       return "Nombre "+nombre+" Apellido "+apellido+" CI "+ci+" Direccion "+direccion+" Telefono"+telefono;
       
   }
   
   
   
   
    
}
