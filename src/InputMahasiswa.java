import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nilam
 */
public class InputMahasiswa extends javax.swing.JFrame {
    public InputMahasiswa(){
        initComponents();
        setFakultas();
        btnSubmit.requestFocusInWindow();
        
        try {
            BufferedImage beam = ImageIO.read(getClass().getResource("library.png"));
            setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Mahasiswa");
    } 
   

    
    private void setFakultas(){
        cbProdi.setEnabled(false);
        cbFakultas.addItem("Kedokteran");
        cbFakultas.addItem("Kedokteran Gigi");
        cbFakultas.addItem("Kesehatan Masyarakat");
        cbFakultas.addItem("Ilmu Keperawatan");
        cbFakultas.addItem("Farmasi");
        cbFakultas.addItem("MIPA");
        cbFakultas.addItem("Teknik");
        cbFakultas.addItem("Ilmu Komputer");
        cbFakultas.addItem("Hukum");
        cbFakultas.addItem("Ekonomi & Bisnis");
        cbFakultas.addItem("Ilmu Pengetahuan Budaya");
        cbFakultas.addItem("Psikologi");
        cbFakultas.addItem("Ilmu Sosial dan Ilmu Politik");
        cbFakultas.addItem("Ilmu Administrasi");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNPM = new javax.swing.JTextField();
        cbFakultas = new javax.swing.JComboBox<>();
        cbProdi = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        lblid.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        txtNPM.setText("NPM");
        txtNPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNPMMouseClicked(evt);
            }
        });
        txtNPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPMActionPerformed(evt);
            }
        });
        txtNPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNPMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPMKeyTyped(evt);
            }
        });

        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas" }));
        cbFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFakultasActionPerformed(evt);
            }
        });

        cbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi" }));

        btnSubmit.setBackground(new java.awt.Color(0, 102, 204));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 102, 204));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtNama.setText("Nama");
        txtNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNamaMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FORM INPUT DATA MAHASISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Backk.png"))); // NOI18N
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("BACK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel)
                            .addComponent(btnSubmit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNPMMouseClicked
        txtNPM.setText(null);
    }//GEN-LAST:event_txtNPMMouseClicked
    Connection conn = Koneksi.connectDB();
    private void cbFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFakultasActionPerformed
        if(cbFakultas.getSelectedItem().equals("Fakultas")){
            cbProdi.setSelectedItem("Prodi");
            cbProdi.setEnabled(false);
            } else if(cbFakultas.getSelectedItem().equals("Kedokteran")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kedokteran");
            } else if(cbFakultas.getSelectedItem().equals("Kedokteran Gigi")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kedokteran Gigi");
            } else if(cbFakultas.getSelectedItem().equals("Kesehatan Masyarakat")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kesehatan Masyarakat");
                cbProdi.addItem("Kesehatan Lingkungan");
                cbProdi.addItem("Studi Gizi");
                cbProdi.addItem("Keselamatan & Kesehatan Kerja");
                cbProdi.addItem("Ilmu Keperawatan");
            } else if(cbFakultas.getSelectedItem().equals("Farmasi")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Farmasi");
            } else if(cbFakultas.getSelectedItem().equals("MIPA")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Matematika");
                cbProdi.addItem("Fisika");
                cbProdi.addItem("Biologi");
                cbProdi.addItem("Kimia");
                cbProdi.addItem("Geografi");
            } else if(cbFakultas.getSelectedItem().equals("Teknik")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Teknik Sipil");
                cbProdi.addItem("Teknik Mesin");
                cbProdi.addItem("Teknik Elektro");
                cbProdi.addItem("Teknik Metalurgi dan Material");
                cbProdi.addItem("Arsitektur");
                cbProdi.addItem("Arsitektur Interior");
                cbProdi.addItem("Teknik Kimia");
                cbProdi.addItem("Teknik Industri");
                cbProdi.addItem("Teknik Perkapalan");
                cbProdi.addItem("Teknik Lingkungan");
                cbProdi.addItem("Teknik Komputer");
                cbProdi.addItem("Teknologi Bioproses");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Komputer")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Komputer");
                cbProdi.addItem("Sistem Informasi");
            } else if(cbFakultas.getSelectedItem().equals("Hukum")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Hukum");
            } else if(cbFakultas.getSelectedItem().equals("Ekonomi & Bisnis")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Ekonomi");
                cbProdi.addItem("Ekonomi Islam dan Bisnis Islam");
                cbProdi.addItem("Akutansi");
                cbProdi.addItem("Management");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Pengetahuan Budaya")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Bahasa dan Kebudayaan Korea");
                cbProdi.addItem("Bahasa dan Sastra Belanda");
                cbProdi.addItem("Arkeologi");
                cbProdi.addItem("Ilmu Filsafat");
                cbProdi.addItem("Ilmu Perpustakaan");
                cbProdi.addItem("Ilmu Sejarah");
                cbProdi.addItem("Sastra Arab");
                cbProdi.addItem("Sastra Cina");
                cbProdi.addItem("Sastra Daerah/Jawa");
                cbProdi.addItem("Sastra Indonesia");
                cbProdi.addItem("Sastra Inggris");
                cbProdi.addItem("Sastra Jepang");
                cbProdi.addItem("Sastra Jerman");
                cbProdi.addItem("Sastra Prancis");
                cbProdi.addItem("Sastra Slavia");
            } else if(cbFakultas.getSelectedItem().equals("Psikologi")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Psikologi");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Sosial dan Ilmu Politik")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Politik");
                cbProdi.addItem("Ilmu Komunikasi");
                cbProdi.addItem("Sosiologi");
                cbProdi.addItem("Antropologi Sosial");
                cbProdi.addItem("Kriminologi");
                cbProdi.addItem("Ilmu Hubungan Internasional");
                cbProdi.addItem("Ilmu Kesejahteraan Sosial");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Administrasi")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Niaga");
                cbProdi.addItem("Negara");
                cbProdi.addItem("Fiskal");
            }      
    }//GEN-LAST:event_cbFakultasActionPerformed
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String npm      = (String) txtNPM.getText();
        String nama     = (String) txtNama.getText();
        String fakultas = (String) cbFakultas.getSelectedItem();
        String prodi    = (String) cbProdi.getSelectedItem();
        
        if (npm.equals("NPM")||npm.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Kolom NPM!");
        } else if (nama.equals("Nama")||nama.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Nama!");
        } else if (fakultas.equals("Fakultas")) {
            JOptionPane.showMessageDialog(null, "Pilih Fakultas!");
        } else if (prodi.equals("Prodi")) {
            JOptionPane.showMessageDialog(null, "Pilih Prodi!");
        } else{
            try {
                String sql1 = "INSERT INTO mahasiswa"
                        + " VALUES ('"+txtNPM.getText()+"','" + txtNama.getText() + "','" + cbFakultas.getSelectedItem()
                        + "','" + cbProdi.getSelectedItem() + "')";
                
                PreparedStatement pdt = conn.prepareStatement(sql1);
                pdt.execute();
               JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
               new DataMahasiswa().setVisible(true);
               dispose();
            } catch (Exception b) {
                JOptionPane.showMessageDialog(this, b.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamaMouseClicked
        txtNama.setText(null);
    }//GEN-LAST:event_txtNamaMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new DataMahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new DataMahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNPMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        } 
    }//GEN-LAST:event_txtNPMKeyTyped

    private void txtNPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPMActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtNPMActionPerformed

    private void txtNPMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPMKeyPressed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbFakultas;
    private javax.swing.JComboBox<String> cbProdi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
