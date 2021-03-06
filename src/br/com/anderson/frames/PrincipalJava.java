/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.anderson.frames;

import br.com.anderson.objeto.Aluno;
import br.com.anderson.objeto.Nota;
import br.com.anderson.objeto.TipoAvaliacao;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class PrincipalJava extends javax.swing.JFrame {
     Aluno a;
    /**
     * Creates new form PrincipalJava
     */
    public PrincipalJava() {
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

        jLTitulo = new javax.swing.JLabel();
        jPNotas = new javax.swing.JPanel();
        jBCalcular = new javax.swing.JButton();
        jLNotas = new javax.swing.JLabel();
        jTFN1 = new javax.swing.JTextField();
        jTFN2 = new javax.swing.JTextField();
        jTFN3 = new javax.swing.JTextField();
        jTFN4 = new javax.swing.JTextField();
        jLN1 = new javax.swing.JLabel();
        jLN2 = new javax.swing.JLabel();
        jLN3 = new javax.swing.JLabel();
        jLN4 = new javax.swing.JLabel();
        jPSeparador = new javax.swing.JPanel();
        jLDisciplina = new javax.swing.JLabel();
        jTFDisciplina = new javax.swing.JTextField();
        JCBTipoAvailacao = new javax.swing.JComboBox<>();
        jPAluno = new javax.swing.JPanel();
        jLAluno = new javax.swing.JLabel();
        jLMatricula = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLTitulo.setText("Calculo de Média");

        jPNotas.setBackground(new java.awt.Color(0, 153, 153));
        jPNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jLNotas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNotas.setText("Notas");

        jLN1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLN1.setText("N1");

        jLN2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLN2.setText("N2");

        jLN3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLN3.setText("N3");

        jLN4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLN4.setText("N4");

        jPSeparador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPSeparadorLayout = new javax.swing.GroupLayout(jPSeparador);
        jPSeparador.setLayout(jPSeparadorLayout);
        jPSeparadorLayout.setHorizontalGroup(
            jPSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPSeparadorLayout.setVerticalGroup(
            jPSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLDisciplina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDisciplina.setText("Nome da Disciplina ");

        JCBTipoAvailacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prova", "Trabalho", "Seminário" }));

        javax.swing.GroupLayout jPNotasLayout = new javax.swing.GroupLayout(jPNotas);
        jPNotas.setLayout(jPNotasLayout);
        jPNotasLayout.setHorizontalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDisciplina)
                    .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBTipoAvailacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCalcular)
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLN3)
                            .addComponent(jLN4)
                            .addComponent(jLN1))
                        .addGap(18, 18, 18)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFN4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFN3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFN2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(jLNotas)
                                .addGap(33, 33, 33))
                            .addComponent(jTFN1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLN2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPNotasLayout.setVerticalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                        .addComponent(jLNotas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jBCalcular))
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addComponent(jLDisciplina)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JCBTipoAvailacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPAluno.setBackground(new java.awt.Color(0, 153, 153));
        jPAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLAluno.setText("Aluno");

        jLMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMatricula.setText("Matrícula");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLMatricula))
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLNome))
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBCadastrar))
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLAluno)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMatricula)
                            .addComponent(jTFNome))))
                .addContainerGap())
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAluno)
                .addGap(18, 18, 18)
                .addComponent(jLMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jBCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLTitulo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = jTFNome.getText();
        int matricula = 0;
        try{
        matricula = Integer.parseInt(jTFMatricula.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Você digitou um caracter inválido."+nfe);
            throw new RuntimeException();
        }
        a = new Aluno(nome, matricula);
        JOptionPane.showMessageDialog(this, a.toString());
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        Aluno a = new Aluno(jTFNome.getText(), Integer.parseInt(jTFMatricula.getText()));
        TipoAvaliacao tipo = null;
        switch(JCBTipoAvailacao.getSelectedIndex()){
            case 0:{
                tipo = TipoAvaliacao.PROVA;
                break;
            }
            case 1:{
                tipo = TipoAvaliacao.TRABALHO;
                break;
            }
            case 2:{
                tipo = TipoAvaliacao.SEMINARIO;
                break;
            }
        }
        try{
        a.getNotas().add(new Nota(jTFDisciplina.getText(), tipo, Float.parseFloat((jTFN1.getText()))));
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou um caracter inválido."+nfe);
            throw new RuntimeException();
        }
        try{
        a.getNotas().add(new Nota(jTFDisciplina.getText(), tipo, Float.parseFloat((jTFN2.getText()))));
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou um caracter inválido."+nfe);
            throw new RuntimeException();
        }
        try {
        a.getNotas().add(new Nota(jTFDisciplina.getText(), tipo, Float.parseFloat((jTFN3.getText()))));
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou um caracter inválido."+nfe);
            throw new RuntimeException();
        }
        try{
        a.getNotas().add(new Nota(jTFDisciplina.getText(), tipo, Float.parseFloat((jTFN4.getText()))));
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou um caracter inválido."+nfe);
            throw new RuntimeException();
        }       
        
        JOptionPane.showMessageDialog(null, a.toString()+"\n" + "Média: " + a.calcularMedia());
    }//GEN-LAST:event_jBCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBTipoAvailacao;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JLabel jLAluno;
    private javax.swing.JLabel jLDisciplina;
    private javax.swing.JLabel jLMatricula;
    private javax.swing.JLabel jLN1;
    private javax.swing.JLabel jLN2;
    private javax.swing.JLabel jLN3;
    private javax.swing.JLabel jLN4;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNotas;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPNotas;
    private javax.swing.JPanel jPSeparador;
    private javax.swing.JTextField jTFDisciplina;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFN1;
    private javax.swing.JTextField jTFN2;
    private javax.swing.JTextField jTFN3;
    private javax.swing.JTextField jTFN4;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
