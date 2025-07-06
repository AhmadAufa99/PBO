package praktikum_240605;

import javax.swing.JOptionPane;

public class TransaksiLain extends javax.swing.JFrame {
    private MainMenu utama;
    private double saldo;

    public TransaksiLain() {
        initComponents();
    }
    
    public TransaksiLain(MainMenu utama, double saldo) {
        this.utama = utama;
        this.saldo = saldo;
        initComponents();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        btnTransfer = new javax.swing.JToggleButton();
        btnCekSaldo = new javax.swing.JToggleButton();
        btnCekRekening = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Pilih Transaksi Lain");

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnCekSaldo.setText("Cek Saldo");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });

        btnCekRekening.setText("Cek Rekening");
        btnCekRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekRekeningActionPerformed(evt);
            }
        });

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
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCekRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer)
                .addGap(18, 18, 18)
                .addComponent(btnCekSaldo)
                .addGap(18, 18, 18)
                .addComponent(btnCekRekening)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {
        Transfer frm = new Transfer(this, saldo);
        frm.setVisible(true);
        this.dispose();
    }

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {
        Saldo frm = new Saldo(this);
        frm.setSisaSaldo(saldo);
        frm.setVisible(true);
        this.dispose();
    }

    private void btnCekRekeningActionPerformed(java.awt.event.ActionEvent evt) {
        CekRekening frm = new CekRekening(this);
        frm.setVisible(true);
        this.dispose();
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
        if (utama != null) {
            utama.setSaldo(saldo);
            utama.setVisible(true);
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
            java.util.logging.Logger.getLogger(TransaksiLain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TransaksiLain().setVisible(true));
    }

    private javax.swing.JToggleButton btnTransfer;
    private javax.swing.JToggleButton btnCekSaldo;
    private javax.swing.JToggleButton btnCekRekening;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JLabel jLabel1;
}