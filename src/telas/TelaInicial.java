/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas;

/**
 *
 * @author mozart
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        btnDisciplinas = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnEquipes = new javax.swing.JButton();
        btnTurmas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTrabalho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");

        btnDisciplinas.setText("Disciplinas");
        btnDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinasActionPerformed(evt);
            }
        });

        btnAlunos.setText("Alunos");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });

        btnEquipes.setText("Equipes");
        btnEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipesActionPerformed(evt);
            }
        });

        btnTurmas.setText("Turmas");
        btnTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurmasActionPerformed(evt);
            }
        });

        jButton1.setText("Turma x Aluno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTrabalho.setText("Trabalho");
        btnTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabalhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEquipes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnDisciplinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTurmas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEquipes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrabalho)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinasActionPerformed
        // abre a janela para cadastro de disciplinas
        this.setEnabled(false);
        new Disciplinas(this).setVisible(true);
    }//GEN-LAST:event_btnDisciplinasActionPerformed

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        // abre a janela para cadastro de alunos
        this.setEnabled(false);
        new Alunos(this).setVisible(true);
    }//GEN-LAST:event_btnAlunosActionPerformed

    private void btnEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipesActionPerformed
        // abre a janela para cadastro de equipes
        this.setEnabled(false);
        new Equipes(this).setVisible(true);
    }//GEN-LAST:event_btnEquipesActionPerformed

    private void btnTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurmasActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new Turmas(this).setVisible(true);
    }//GEN-LAST:event_btnTurmasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new TurmasAlunos(this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabalhoActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new Trabalhos(this).setVisible(true);
    }//GEN-LAST:event_btnTrabalhoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnDisciplinas;
    private javax.swing.JButton btnEquipes;
    private javax.swing.JButton btnTrabalho;
    private javax.swing.JButton btnTurmas;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
