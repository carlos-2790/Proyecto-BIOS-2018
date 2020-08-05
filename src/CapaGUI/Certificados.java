
package CapaGUI;

import BasedeDatos.Conexion;
import Excepciones.OBException;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Logica.Certificado;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Certificados extends javax.swing.JFrame {

    
    public Certificados() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_mutualista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_diasReposo = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_detalle = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matricula");

        jLabel2.setText("Paciente CI.");

        jLabel3.setText("Mutualista");

        jLabel4.setText("Fecha");

        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        jLabel5.setText("Dias de Reposo");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        txt_detalle.setColumns(20);
        txt_detalle.setRows(5);
        jScrollPane1.setViewportView(txt_detalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_mutualista)
                                    .addComponent(txt_diasReposo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_diasReposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btn_aceptar)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
         
        try {
           SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
           Date fecha=formato.parse(txt_fecha.getText());
           Integer matricula=Integer.parseInt(txt_matricula.getText());
           Integer ci=Integer.parseInt(txt_ci.getText());
           String detalle= txt_detalle.getText();
           Integer diaReposo=Integer.parseInt(txt_diasReposo.getText());
           String mutualista=txt_mutualista.getText();
           Integer numero=null;
           numero=Persistencia.PersistenciaCertificado.Existe_Certificado(matricula, fecha);
        
          
          if(fecha==null){
               JOptionPane.showMessageDialog(null,"Debe ingresar la fecha");
            }
           else if(detalle==null|| detalle.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar el Detalle");
            }
           else if(mutualista==null||mutualista.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la mutualista");
            }
           else if(matricula<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar la matricula");
            }
           else if(ci<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar la Cedula");
            }
           else if(diaReposo<0){
                JOptionPane.showMessageDialog(null,"Debe ingresar los dias certificados");
            
           } else if(numero==1){
             JOptionPane.showMessageDialog(null,"No se puede ingresar este certificado, el medico con matricula: "+matricula+" ya realizo una certificacion con la misma fecha ingresada");
            
            }else{
                Certificado cer= new Certificado(detalle, diaReposo, fecha, mutualista, matricula, ci);
                Persistencia.PersistenciaCertificado.Alta(cer);
                JOptionPane.showMessageDialog(null,"Se guardo correctamente");
                limpiar();
            }
               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al querer guardar datos");
        }catch(OBException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar caracteres numericos en  Dias de Reposo , CI y Matricula. Verifique por favor...");
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
}
              
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        Iniciar_Sesion ini= new Iniciar_Sesion();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ci;
    private javax.swing.JTextArea txt_detalle;
    private javax.swing.JTextField txt_diasReposo;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_mutualista;
    // End of variables declaration//GEN-END:variables



private void limpiar(){
    
    txt_ci.setText("");
    txt_detalle.setText("");
    txt_diasReposo.setText("");
    txt_fecha.setText("");
    txt_matricula.setText("");
    txt_mutualista.setText("");
    
    
    
    
}

private  void  buscarCertificado() throws ParseException{
    SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
    Date fecha=formato.parse(txt_fecha.getText());
    Certificado certificado=null;
    Integer matricula=Integer.parseInt(txt_matricula.getText());
    try {
         certificado=Persistencia.PersistenciaCertificado.Buscar_X_DIA_CertMedico(matricula,fecha);
         if(certificado.getMatricula()==matricula && certificado.getFecha()==fecha){
             JOptionPane.showMessageDialog(null,"No se puede ingresar este certificado, el medico con matricula: "+matricula+" ya realizo una certificacion en la fecha: "+fecha+".");
         }
    }catch(SQLException | OBException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
 }






}
