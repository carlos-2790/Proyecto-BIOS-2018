/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;


import Excepciones.OBException;
import Logica.Paciente;
import Logica.Persona;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Carlos
 */
public class Registrar_Paciente extends javax.swing.JFrame {

    private final static Scanner sc= new Scanner(System.in);
    
    public Registrar_Paciente() {
        initComponents();
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_ci = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_mutualista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PACIENTE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDO");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setText("CI");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIRECCION");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO");

        jLabel7.setText("Mutualista");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_mutualista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ci, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btn_guardar)
                        .addGap(187, 187, 187)
                        .addComponent(btn_salir)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir)
                    .addComponent(btn_guardar))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       
        System.exit(0);
        
        
        
    }//GEN-LAST:event_btn_salirActionPerformed
     
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        try {
           
           String nombre =txt_nombre.getText();
           String apellido= txt_apellido.getText();
           Integer ci= Integer.parseInt(txt_ci.getText());
           String direccion= txt_direccion.getText();
           Integer telefon= Integer.parseInt(txt_telefono.getText());
           String mutualista= txt_mutualista.getText();
          
            
           if(nombre==null ||  nombre.isEmpty()){
               JOptionPane.showMessageDialog(null,"Debe ingresar el Nombre");
           }
          else if( nombre.matches("[0-9]*")){
               JOptionPane.showMessageDialog(null,"Debe ingresar el nombre , no se admiten numeros.");
           }
           
          else if( apellido==null ||  apellido.isEmpty() ){
               JOptionPane.showMessageDialog(null,"Debe ingresar el apellido");
           }
          else if(apellido.matches("[0-9]*")){
              JOptionPane.showMessageDialog(null,"Debe ingresar el apellido, no se admiten numeros. ");
          }
           
          else if(direccion==null || direccion.isEmpty()){
               JOptionPane.showMessageDialog(null,"Debe ingresar Contraseña");
           }
          else if(direccion.matches("[0-9]*")){
              JOptionPane.showMessageDialog(null,"Debe ingresar la direccion, no se admiten numeros. ");
          }
         else  if(mutualista==null || mutualista.isEmpty()){
               JOptionPane.showMessageDialog(null,"Debe ingresar mutualista");
           }
         else if(mutualista.matches("[0-9]*")){
             JOptionPane.showMessageDialog(null,"Debe ingresar la mutualista, no se admiten numeros. ");
         }
        
          else if(telefon<=0){
               JOptionPane.showMessageDialog(null,"Debe ingresar telefono");
           }
         
         else  if(ci<=0){
               JOptionPane.showMessageDialog(null,"Debe ingresar CI");
           }
           
           else{
                Persona per= new Persona(nombre, apellido, ci, direccion, telefon);
                Paciente pa= new Paciente(nombre, apellido, ci, direccion, telefon, mutualista);
           
                Persistencia.PersistenciaPersona.Alta(per);
                Persistencia.PersistenciaPaciente.Alta(pa);
          
            limpiar();
            JOptionPane.showMessageDialog(null,"Se guardo correctamente");
            Iniciar_Sesion sesion=new Iniciar_Sesion();
            sesion.setVisible(true);
            this.dispose();
           }
                 
        } catch (OBException|SQLException  e) {
            JOptionPane.showMessageDialog(null,"Error, no se pudo guardar los datos");            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null," Debe ingresar caracteres numericos para Telefono y/o CI");
        }
  
        
              
    }//GEN-LAST:event_btn_guardarActionPerformed

    /**
     * @param args the command line arguments
     */
/* */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_ci;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mutualista;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables


    
    
    
public void limpiar(){
    
    txt_nombre.setText("");
    txt_apellido.setText("");
    txt_ci.setText("");
    txt_direccion.setText("");
    txt_telefono.setText("");
    txt_mutualista.setText("");
    

}








}

