/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import Excepciones.OBException;
import Logica.Medico;
import Logica.Mutualista;
import Logica.Paciente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Iniciar_Sesion extends javax.swing.JFrame {

   
    public Iniciar_Sesion() {
        initComponents();
    }
    
              
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_contraseña = new javax.swing.JTextPane();
        lbl_mensaje = new javax.swing.JLabel();
        btn_iniciar_sesion = new javax.swing.JButton();
        btn_reg_paciente = new javax.swing.JButton();
        btn_reg_mutualista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO de SESION");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO");

        jScrollPane1.setViewportView(txt_contraseña);

        btn_iniciar_sesion.setText("ENTRAR");
        btn_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_sesionActionPerformed(evt);
            }
        });

        btn_reg_paciente.setText("Reg.Paciente");
        btn_reg_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg_pacienteActionPerformed(evt);
            }
        });

        btn_reg_mutualista.setText("Reg.Mutualista");
        btn_reg_mutualista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg_mutualistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btn_reg_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_iniciar_sesion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btn_reg_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btn_iniciar_sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reg_paciente)
                    .addComponent(btn_reg_mutualista))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reg_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg_pacienteActionPerformed
        
        Registrar_Paciente regPac=new Registrar_Paciente();
        regPac.setVisible(true);
        
        
    }//GEN-LAST:event_btn_reg_pacienteActionPerformed

    private void btn_reg_mutualistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg_mutualistaActionPerformed
        Registrar_Mutualista regMut=new Registrar_Mutualista();
        regMut.setVisible(true);
    }//GEN-LAST:event_btn_reg_mutualistaActionPerformed

    private void btn_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionActionPerformed
       
        
        
              
               try {
             if(txt_contraseña.getText()==null || txt_contraseña.getText().isEmpty()||Integer.parseInt(txt_contraseña.getText())<=0  ){
                 JOptionPane.showMessageDialog(null,"Debe ingresar un Usuario");
                 
              }       
             else {        
             
                 ControlUsuarioPaciente();
                 ControlUsuarioMedico();
                 ControlMutualista();
                 
             }
                
        
        }catch(OBException |SQLException e){
            JOptionPane.showMessageDialog(null,"Usuario no registrado");
            
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"El usuario debe contener caracteres solo numericos");
            txt_contraseña.setText("");
           
        }    
      
    }//GEN-LAST:event_btn_iniciar_sesionActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar_sesion;
    private javax.swing.JButton btn_reg_mutualista;
    private javax.swing.JButton btn_reg_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTextPane txt_contraseña;
    // End of variables declaration//GEN-END:variables



private void ControlUsuarioPaciente()throws OBException,SQLException
{
    try {
        Paciente pa=Persistencia.PersistenciaPaciente.obtenerPorCI(Integer.parseInt(txt_contraseña.getText()));
              
              if(pa.getCI()==Integer.parseInt(txt_contraseña.getText())){
                  Menu_Usuarario usuario= new Menu_Usuarario();
                  usuario.setVisible(true);
                  this.dispose();
              }
    } catch (Exception e) {
    }
         
} 

private void ControlUsuarioMedico()throws OBException ,SQLException{
    
       try {
         Medico medico=Persistencia.PersistenciaMedico.Listar_x_CI(Integer.parseInt(txt_contraseña.getText()));
         if(medico.getCI()==Integer.parseInt(txt_contraseña.getText())){
             Certificados cer= new Certificados();
             cer.setVisible(true);
             this.dispose();}
    } catch (Exception e) {
    }
       
             }

private void ControlMutualista()throws OBException,SQLException{
        try {
        Mutualista mutualista= Persistencia.PersistenciaMutualista.listar(Integer.parseInt(txt_contraseña.getText()));
        if(mutualista.getContraseña()==Integer.parseInt(txt_contraseña.getText())){
             Menu_mutualista menu= new Menu_mutualista();
             menu.setVisible(true);
             this.dispose();}
    } catch (Exception e) {
        txt_contraseña.setText("No se encontro el usuario");
    }
        
       
         
    }
}









     

