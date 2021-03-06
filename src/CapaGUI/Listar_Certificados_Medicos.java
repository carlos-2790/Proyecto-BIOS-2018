/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import Excepciones.OBException;
import Logica.Certificado;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Liam
 */
public class Listar_Certificados_Medicos extends javax.swing.JFrame {

    /**
     * Creates new form Listar_Certificados_Medicos
     */
    public Listar_Certificados_Medicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_certificados = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matricula");

        jLabel2.setText("Fecha");

        tabla_certificados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "CI", "Mutualista", "Detalle", "Dias de Reposo", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tabla_certificados);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado Certificados de Medico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(btn_buscar)
                                .addGap(168, 168, 168)
                                .addComponent(btn_borrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_borrar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       
        
        Date fechComp=null;
        Date fechActual=new Date();
        Date fecha=null;
        Integer matricula=null;
        Certificado certificado=null;
        DefaultTableModel modelo= new DefaultTableModel();
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        modelo.setColumnIdentifiers(new Object[]{"Matricula","CI","Detalle","Dias de Reposo","Mutualista","Fecha"});
        try {
                fechActual.getTime();
                fechComp=formato.parse("01/01/1900");
                fecha=formato.parse(txt_fecha.getText());
                matricula=Integer.parseInt(txt_matricula.getText());
            if(txt_fecha.getText()==null || txt_fecha.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la fecha");
            }
            else if(txt_matricula.getText()==null || txt_matricula.getText().isEmpty() || Integer.parseInt(txt_matricula.getText())<=0){
                JOptionPane.showMessageDialog(null,"Debe Ingresar la Matricula");
            }
            else if(fecha.before(fechComp)){
                JOptionPane.showMessageDialog(null,"La fecha Ingresada debe ser mayor al año '1900' ");
            }
            else if(fecha.after(fechActual)){
                JOptionPane.showMessageDialog(null,"La fecha ingresada no debe ser mayor que la de hoy.");
            }
            else{
                
            certificado=Persistencia.PersistenciaCertificado.Buscar_X_DIA_CertMedico(matricula, fecha);
            modelo.addRow(new Object[]{certificado.getMatricula(),certificado.getCI(),certificado.getDetalle(),certificado.getDiasReposo(),certificado.getMutualista(),certificado.getFecha()});
            tabla_certificados.setModel(modelo);
            }
            
            
            
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar el formato de fecha.  ej: dd/MM/yyyy");
        }catch(OBException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error al ingresar la matricula, solo caracteres numericos");
        }catch(NullPointerException e){
            
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        
        txt_fecha.setText("");
        txt_matricula.setText("");
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_certificados;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_matricula;
    // End of variables declaration//GEN-END:variables
}
