package praktikum_240605;

import javax.swing.JOptionPane;

public class Transfer extends javax.swing.JFrame {
    private TransaksiLain transaksiLain;
    private double saldo;

    public Transfer() {
        initComponents();
    }
    
    public Transfer(TransaksiLain transaksiLain, double saldo) {
        this.transaksiLain = transaksiLain; // Pastikan inisialisasi
        this.saldo = saldo;
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldNomorRekening = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldJumlah = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Nama Penerima");

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Nomor Rekening");

        fieldNomorRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomorRekeningActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText("Jumlah");

        fieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
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
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldNama)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldNomorRekening)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldJumlah)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fieldNomorRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void fieldNomorRekeningActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void fieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double jumlah = Double.parseDouble(fieldJumlah.getText().trim());
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah transfer harus positif", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (saldo < jumlah + 50000) {
                JOptionPane.showMessageDialog(this, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                saldo -= jumlah;
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
        if (transaksiLain != null) {
            transaksiLain.setSaldo(saldo); // Pastikan metode ini ada di TransaksiLain
            transaksiLain.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Kembali gagal, kontak dukungan", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Transfer().setVisible(true));
    }

    private javax.swing.JToggleButton btnTransfer;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNomorRekening;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}