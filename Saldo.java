package praktikum_240605;

import javax.swing.JOptionPane;

public class Saldo extends javax.swing.JFrame {
    private MainMenu utama;
    private JumlahLain jumlah;
    private TransaksiLain transaksi;
    private Transfer transfer;

    public Saldo() {
        initComponents();
    }
    
    public Saldo(MainMenu utama) {
        this.utama = utama;
        initComponents();
    }
    
    public Saldo(JumlahLain jumlah) {
        this.jumlah = jumlah;
        initComponents();
    }
    
    public Saldo(TransaksiLain transaksi) {
        this.transaksi = transaksi;
        initComponents();
    }
    
    public Saldo(Transfer transfer) {
        this.transfer = transfer;
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        fieldSaldo = new javax.swing.JLabel();
        btnExit = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Sisa Saldo");

        fieldSaldo.setText("Rp 0.00");

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
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fieldSaldo))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
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

    public void setSisaSaldo(double saldo) {
        fieldSaldo.setText("Rp " + String.format("%,.2f", saldo));
    }

    public void backToPrevious() {
        if (utama != null) {
            utama.setVisible(true);
        } else if (jumlah != null) {
            jumlah.setVisible(true);
        } else if (transaksi != null) {
            transaksi.setVisible(true);
        } else if (transfer != null) {
            transfer.setVisible(true);
        }
        this.dispose();
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
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Saldo().setVisible(true));
    }

    private javax.swing.JToggleButton btnExit;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JLabel fieldSaldo;
    private javax.swing.JLabel jLabel1;
}