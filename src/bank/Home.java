/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;

/**
 *
 * @author Moklet
 */
public class Home extends javax.swing.JFrame {

    int saldo1 = 500000,hasil,saldo2;
    
    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        penarikan = new javax.swing.JButton();
        saldo = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        setor = new javax.swing.JButton();
        bantuan = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penarikan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 240, 70, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Exit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 240, 70, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transfer");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 170, 70, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TRANSAKSI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 10, 150, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penyetoran");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 100, 70, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bantuan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 70, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cek Saldo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 100, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 0, 400, 380);

        penarikan.setBackground(new java.awt.Color(0, 0, 0));
        penarikan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        penarikan.setForeground(new java.awt.Color(255, 255, 255));
        penarikan.setText(">");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        getContentPane().add(penarikan);
        penarikan.setBounds(520, 230, 60, 50);

        saldo.setBackground(new java.awt.Color(0, 0, 0));
        saldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saldo.setForeground(new java.awt.Color(255, 255, 255));
        saldo.setText(">");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(520, 90, 60, 50);

        transfer.setBackground(new java.awt.Color(0, 0, 0));
        transfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transfer.setForeground(new java.awt.Color(255, 255, 255));
        transfer.setText(">");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer);
        transfer.setBounds(520, 160, 60, 50);
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 90, 60, 50);
        getContentPane().add(jButton5);
        jButton5.setBounds(520, 160, 60, 50);
        getContentPane().add(jButton6);
        jButton6.setBounds(520, 230, 60, 50);

        setor.setBackground(new java.awt.Color(255, 255, 255));
        setor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setor.setText("<");
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        getContentPane().add(setor);
        setor.setBounds(30, 90, 60, 50);

        bantuan.setBackground(new java.awt.Color(255, 255, 255));
        bantuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bantuan.setText("<");
        bantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bantuanActionPerformed(evt);
            }
        });
        getContentPane().add(bantuan);
        bantuan.setBounds(30, 160, 60, 50);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("<");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(30, 230, 60, 50);

        setSize(new java.awt.Dimension(630, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
       
        getsaldo();
        
                
        transfer1 tfs = new transfer1() ;
        hasil = tfs.gethasil() ;
        saldo1 += hasil ; 
    
        int z;
       JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + hasil); //informasi saldo
        z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?", "",JOptionPane.YES_NO_OPTION, 3);
    }//GEN-LAST:event_saldoActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
       transfer1 a = new transfer1(); 
       a.setVisible(true);
       dispose();

    }//GEN-LAST:event_transferActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
        penarikan1 a = new penarikan1(); 
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_penarikanActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        setor1 a = new setor1(); 
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_setorActionPerformed

    private void bantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bantuanActionPerformed
       bantuan1 a = new bantuan1(); 
       a.setVisible(true);
       dispose();
       
       
       
    }//GEN-LAST:event_bantuanActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bantuan;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton saldo;
    private javax.swing.JButton setor;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
   
    public int getsaldo(){


        return saldo1;
      
        
    }

   

}
