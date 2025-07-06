package praktikum_240605;

import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {
    private double saldo = 10000000;
    private ATM atm;

    public MainMenu() {
        initComponents();
    }
    
    public MainMenu(ATM atm) {
        this.atm = atm;
        initComponents();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        btn50k = new javax.swing.JToggleButton();
        btn100k = new javax.swing.JToggleButton();
        btnTransaksiLain = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Pilih Nominal Penarikan");

        btn50k.setText("50.000");
        btn50k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50kActionPerformed(evt);
            }
        });

        btn100k.setText("100.000");
        btn100k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100kActionPerformed(evt);
            }
        });

        btnTransaksiLain.setText("Transaksi Lain");
        btnTransaksiLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiLainActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn50k, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn100k, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTransaksiLain, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn50k)
                .addGap(18, 18, 18)
                .addComponent(btn100k)
                .addGap(18, 18, 18)
                .addComponent(btnTransaksiLain)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btn50kActionPerformed(java.awt.event.ActionEvent evt) {
        double tarikTunai = 50000;
        if (saldo < tarikTunai + 50000) {
            JOptionPane.showMessageDialog(this, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            saldo -= tarikTunai;
            Saldo frm = new Saldo(this);
            frm.setSisaSaldo(saldo);
            frm.setVisible(true);
            this.dispose();
        }
    }

    private void btn100kActionPerformed(java.awt.event.ActionEvent evt) {
        double tarikTunai = 100000;
        if (saldo < tarikTunai + 50000) {
            JOptionPane.showMessageDialog(this, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            saldo -= tarikTunai;
            Saldo frm = new Saldo(this);
            frm.setSisaSaldo(saldo);
            frm.setVisible(true);
            this.dispose();
        }
    }

    private void btnTransaksiLainActionPerformed(java.awt.event.ActionEvent evt) {
        TransaksiLain frm = new TransaksiLain(this, saldo);
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
        if (atm != null) {
            atm.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }

    private javax.swing.JToggleButton btn50k;
    private javax.swing.JToggleButton btn100k;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JToggleButton btnTransaksiLain;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JLabel jLabel1;
}