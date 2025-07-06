package praktikum_240605;

import javax.swing.JOptionPane;

public class JumlahLain extends javax.swing.JFrame {
    private MainMenu utama;
    private double saldo;

    public JumlahLain() {
        initComponents();
    }
    
    public JumlahLain(MainMenu utama, double saldo) {
        this.utama = utama;
        this.saldo = saldo;
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        fieldJumlah = new javax.swing.JTextField();
        btnProses = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Masukkan Jumlah Penarikan");

        fieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahActionPerformed(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
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
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldJumlah)
                    .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProses)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void fieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double tarikTunai = Double.parseDouble(fieldJumlah.getText().trim());
            if (tarikTunai <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah penarikan harus positif", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (saldo < tarikTunai + 50000) {
                JOptionPane.showMessageDialog(this, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                saldo -= tarikTunai;
                Saldo frm = new Saldo(this);
                frm.setSisaSaldo(saldo);
                frm.setVisible(true);
                this.dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(JumlahLain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new JumlahLain().setVisible(true));
    }

    private javax.swing.JToggleButton btnProses;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JLabel jLabel1;
}