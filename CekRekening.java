package praktikum_240605;

import javax.swing.JOptionPane;

public class CekRekening extends javax.swing.JFrame {
    private TransaksiLain transaksiLain;

    public CekRekening() {
        initComponents();
    }
    
    public CekRekening(TransaksiLain transaksiLain) {
        this.transaksiLain = transaksiLain;
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        fieldRekening = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Nomor Rekening");

        fieldRekening.setText("1234567890");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldRekening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldRekening)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        int pil = JOptionPane.showConfirmDialog(this, "Apakah anda ingin keluar?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if (pil == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        backToPrevious();
    }

    public void backToPrevious() {
        if (transaksiLain != null) {
            transaksiLain.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new CekRekening().setVisible(true));
    }

    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JLabel fieldRekening;
    private javax.swing.JLabel jLabel1;
}