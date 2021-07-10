package menuform;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btncetak = new javax.swing.JButton();
        txtoutput = new javax.swing.JLabel();
        btnpindah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        btncetak.setText("Submit");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        txtoutput.setText("Nama Saya ");

        btnpindah.setText("Pindah Form");
        btnpindah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpindahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtoutput)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpindah))
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncetak)
                    .addComponent(btnpindah))
                .addGap(36, 36, 36)
                .addComponent(txtoutput)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }
	
    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {
        txtoutput.setText(txtnama.getText());
    }

    private void btnpindahActionPerformed(java.awt.event.ActionEvent evt) {
        CreditForm fromCred = new credit(txtoutput.getText());
        fromCred.setVisible(true);
        this.dispose();
    }
    public String getnama(){
        return txtoutput.getText();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnpindah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JLabel txtoutput;
}