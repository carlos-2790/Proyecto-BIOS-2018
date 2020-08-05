
package CapaGUI;

import Excepciones.OBException;
import Logica.Mutualista;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Modificar_Datos_Mutualista extends javax.swing.JFrame {

   
    public Modificar_Datos_Mutualista() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_mutualista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 19, 41));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Datos de Mutualista");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_mutualista.setEnabled(false);

        jLabel2.setText("Mutualista");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Contraseña");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("  EJ: casmu");

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btn_modificar)
                                .addGap(77, 77, 77)
                                .addComponent(btn_eliminar)))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_menu)
                .addGap(32, 32, 32)
                .addComponent(btn_borrar)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_borrar)
                    .addComponent(btn_menu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        try {
            
            if(txt_buscar.getText() ==null || txt_buscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar el nombre de la  mutualista");
            }
            else if( txt_buscar.getText().matches("[0-9]*")){
                JOptionPane.showMessageDialog(null, "No van numeros en este campo");
                
            }else{
            
            Mutualista mu=Persistencia.PersistenciaMutualista.Buscar_Mutualista(txt_buscar.getText());
            
            txt_mutualista.setText(mu.getNomMut());
            txt_direccion.setText(mu.getDireccion());
            txt_telefono.setText(mu.getTelefono().toString());
            txt_contraseña.setText(mu.getContraseña().toString());
            }
            
        } catch (OBException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
       
       limpiar();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
       
        
        try {
            if(txt_direccion.getText()==null || txt_direccion.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la direccion");
            }
            else if (txt_direccion.getText().matches("[0-9]*")){
                JOptionPane.showMessageDialog(null,"El campo direccion no puede contener solo numeros.");
            }
            else if(txt_telefono.getText()==null || txt_telefono.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Debe ingresar el campo telefono, no puede estar vacio");
            }
            else if(Integer.parseInt(txt_telefono.getText())<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar un numero valido para el campo telefono, sin cero al principio");
            }
            else if(txt_contraseña.getText()==null || txt_contraseña.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"debe ingresar la Contraseña");
            }else if(Integer.parseInt(txt_contraseña.getText())<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña valida, sin ceros al principio ");
            }
            else{
            
             String mutualista=txt_mutualista.getText();
             String direccion=txt_direccion.getText();
             Integer telefono=Integer.parseInt(txt_telefono.getText());
             Integer contraseña= Integer.parseInt(txt_contraseña.getText());
            
            Mutualista mut= new Mutualista(mutualista, direccion, telefono, contraseña);
            Persistencia.PersistenciaMutualista.Actualizar(mut);
            JOptionPane.showMessageDialog(null,"Se modifico correctamente");
            limpiar();
            }
        } catch (OBException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar solo numeros"+e);
        }
        
        
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      
        try {
             if(txt_buscar.getText() ==null || txt_buscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar el nombre de la  mutualista");
            }
            else if( txt_buscar.getText().matches("[0-9]*")){
                JOptionPane.showMessageDialog(null, "No van numeros en este campo");
                
            }else{
                String nombre=txt_buscar.getText();
                Persistencia.PersistenciaMutualista.Eliminar(nombre);
                limpiar();
                JOptionPane.showMessageDialog(null,"Se Elimino correctamente");
                
            }
        } catch (OBException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        Menu_mutualista mutualista= new Menu_mutualista();
        mutualista.setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mutualista;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables


private void limpiar(){
        txt_buscar.setText("");
        txt_contraseña.setText("");
        txt_direccion.setText("");
        txt_mutualista.setText("");
        txt_telefono.setText("");
}







}
