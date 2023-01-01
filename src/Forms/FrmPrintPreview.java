package Forms;

import Classes.ConnectionMySQL;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FrmPrintPreview extends javax.swing.JFrame {
    
    ConnectionMySQL db = new ConnectionMySQL();
    
    int b_ID;
    String b_title;
    String m_name;
    
    int posX = 0;
    int posY = 0;
    
    public FrmPrintPreview() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(161,57,65)));
        undecoratedMovableForm();
        this.b_ID = 0;
        this.b_title = null;
        this.m_name = null;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerContainer3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPAllBooks = new javax.swing.JButton();
        btnPUnvBooks = new javax.swing.JButton();
        btnPBookByIDISBN = new javax.swing.JButton();
        btnPBookByTitle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPAllMembers = new javax.swing.JButton();
        btnPMemberByID = new javax.swing.JButton();
        btnPMemberByName = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnPAllReturnBooks = new javax.swing.JButton();
        btnPAllLostBooks = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnPAllIssueBooks = new javax.swing.JButton();
        btnPIssueBookByID = new javax.swing.JButton();
        btnPIssueBookByBookID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(189, 116, 122));

        headerContainer3.setBackground(new java.awt.Color(161, 57, 65));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmPrint/back_button.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackbtnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackbtnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackbtnBackMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_print_50px_1.png")); // NOI18N
        jLabel4.setText("Print Preview");
        jLabel4.setIconTextGap(10);

        javax.swing.GroupLayout headerContainer3Layout = new javax.swing.GroupLayout(headerContainer3);
        headerContainer3.setLayout(headerContainer3Layout);
        headerContainer3Layout.setHorizontalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerContainer3Layout.setVerticalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(189, 116, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(161, 57, 65), null), "Print Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnPAllBooks.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPAllBooks.setText("Print All Books");
        btnPAllBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPAllBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAllBooksActionPerformed(evt);
            }
        });

        btnPUnvBooks.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPUnvBooks.setText("Print Unavailable Books");
        btnPUnvBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPUnvBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPUnvBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPUnvBooksActionPerformed(evt);
            }
        });

        btnPBookByIDISBN.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPBookByIDISBN.setText("Print Book By ID/ISBN");
        btnPBookByIDISBN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPBookByIDISBN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPBookByIDISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPBookByIDISBNActionPerformed(evt);
            }
        });

        btnPBookByTitle.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPBookByTitle.setText("Print Book By Title");
        btnPBookByTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPBookByTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPBookByTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPBookByTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPAllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPUnvBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPBookByIDISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPBookByTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPAllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPUnvBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPBookByIDISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPBookByTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(189, 116, 122));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(161, 57, 65), null), "Print Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnPAllMembers.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPAllMembers.setText("Print All Members");
        btnPAllMembers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPAllMembers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPAllMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAllMembersActionPerformed(evt);
            }
        });

        btnPMemberByID.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPMemberByID.setText("Print Member By ID");
        btnPMemberByID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPMemberByID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPMemberByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMemberByIDActionPerformed(evt);
            }
        });

        btnPMemberByName.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPMemberByName.setText("Print Member By Name");
        btnPMemberByName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPMemberByName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPMemberByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMemberByNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPAllMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPMemberByID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPMemberByName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPAllMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPMemberByID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPMemberByName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(189, 116, 122));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(161, 57, 65), null), "Print Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnPAllReturnBooks.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPAllReturnBooks.setText("Print All Return Books");
        btnPAllReturnBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPAllReturnBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPAllReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAllReturnBooksActionPerformed(evt);
            }
        });

        btnPAllLostBooks.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPAllLostBooks.setText("Print All Lost Books");
        btnPAllLostBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPAllLostBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPAllLostBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAllLostBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPAllReturnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(575, 575, 575))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPAllLostBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnPAllReturnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPAllLostBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(189, 116, 122));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(161, 57, 65), null), "Print Issue Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnPAllIssueBooks.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPAllIssueBooks.setText("Print All Issue Books");
        btnPAllIssueBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPAllIssueBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPAllIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAllIssueBooksActionPerformed(evt);
            }
        });

        btnPIssueBookByID.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPIssueBookByID.setText("Print Issue Book By ID");
        btnPIssueBookByID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPIssueBookByID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPIssueBookByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIssueBookByIDActionPerformed(evt);
            }
        });

        btnPIssueBookByBookID.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPIssueBookByBookID.setText("Print Issue Book By Book ID");
        btnPIssueBookByBookID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPIssueBookByBookID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPIssueBookByBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIssueBookByBookIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPAllIssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPIssueBookByID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPIssueBookByBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPAllIssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPIssueBookByID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPIssueBookByBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerContainer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackbtnBackMouseClicked

    private void btnBackbtnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseEntered
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmPrint/back_button_hover.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseEntered

    private void btnBackbtnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseExited
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmPrint/back_button.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseExited

    private void btnPAllReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAllReturnBooksActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllReturnBooks.jrxml");
    }//GEN-LAST:event_btnPAllReturnBooksActionPerformed

    private void btnPAllLostBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAllLostBooksActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllLostBooks.jrxml");
    }//GEN-LAST:event_btnPAllLostBooksActionPerformed

    private void btnPAllMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAllMembersActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllMember.jrxml");
    }//GEN-LAST:event_btnPAllMembersActionPerformed

    private void btnPAllIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAllIssueBooksActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllIssueBooks.jrxml");
    }//GEN-LAST:event_btnPAllIssueBooksActionPerformed

    private void btnPAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAllBooksActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllBooks.jrxml");
    }//GEN-LAST:event_btnPAllBooksActionPerformed

    private void btnPUnvBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPUnvBooksActionPerformed
        showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportUnavBooks.jrxml");
    }//GEN-LAST:event_btnPUnvBooksActionPerformed

    private void btnPBookByIDISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPBookByIDISBNActionPerformed
        String id = JOptionPane.showInputDialog(null,"Print by Book ID/ISBN","Print Preview",
                      JOptionPane.INFORMATION_MESSAGE);
        if(id == null || id.length() == 0){
        }else{
            b_ID = Integer.valueOf(id);
            showReportBookByID();
        }
    }//GEN-LAST:event_btnPBookByIDISBNActionPerformed

    private void btnPBookByTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPBookByTitleActionPerformed
        String title = (JOptionPane.showInputDialog(null,"Print by Book Title","Print Preview",
                   JOptionPane.INFORMATION_MESSAGE));
        if(title == null || title.length() == 0){
        }else{
            b_title = title;
            showReportBookByTitle();
        }
    }//GEN-LAST:event_btnPBookByTitleActionPerformed

    private void btnPMemberByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMemberByIDActionPerformed
        String id = JOptionPane.showInputDialog(null,"Print by Member ID","Print Preview",
                      JOptionPane.INFORMATION_MESSAGE);
        if(id == null || id.length() == 0){
        }else{
            b_ID = Integer.valueOf(id);
            showReportMemberByID();
        }
    }//GEN-LAST:event_btnPMemberByIDActionPerformed

    private void btnPMemberByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMemberByNameActionPerformed
        String name = (JOptionPane.showInputDialog(null,"Print by Member Name","Print Preview",
                   JOptionPane.INFORMATION_MESSAGE));
        if(name == null || name.length() == 0){
        }else{
            m_name = name;
            showReportMemberByName();
        }
    }//GEN-LAST:event_btnPMemberByNameActionPerformed

    private void btnPIssueBookByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIssueBookByIDActionPerformed
        String id = JOptionPane.showInputDialog(null,"Print by Issue ID","Print Preview",
                      JOptionPane.INFORMATION_MESSAGE);
        if(id == null || id.length() == 0){
        }else{
            b_ID = Integer.valueOf(id);
            showReportIssueBookByID();
        }
    }//GEN-LAST:event_btnPIssueBookByIDActionPerformed

    private void btnPIssueBookByBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIssueBookByBookIDActionPerformed
        String id = JOptionPane.showInputDialog(null,"Print by Book ID","Print Preview",
                      JOptionPane.INFORMATION_MESSAGE);
        if(id == null || id.length() == 0){
        }else{
            b_ID = Integer.valueOf(id);
            showReportIssueBookByBookID();
        }
    }//GEN-LAST:event_btnPIssueBookByBookIDActionPerformed
    
    void undecoratedMovableForm(){
        this.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter()
        {
            public void mouseDragged(MouseEvent evt)
            {
                //sets frame position when mouse dragged
                setLocation (evt.getXOnScreen() - posX,evt.getYOnScreen() - posY);
            }
        });
    }
    
    void showReport(String reportFile){
        try {
            JasperDesign jasperDesign = JRXmlLoader.load(reportFile);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,db.con);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportBookByID(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportBookByIDISBN.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_bid", b_ID);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportMemberByID(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportMemberByID.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_mid", b_ID);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportIssueBookByID(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllIssueBookByID.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_id", b_ID);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportIssueBookByBookID(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllIssueBookByBookID.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_id", b_ID);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportBookByTitle(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportBookByTitle.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_bt", b_title);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showReportMemberByName(){
        try {
            JasperReport pathReport = 
                    JasperCompileManager.compileReport
            ("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportMemberByName.jrxml");
            //prepare parameter
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("p_mn", m_name);
            //fill the report
            JasperPrint jPrint = JasperFillManager.fillReport(pathReport, para, db.con);
            JasperViewer.viewReport(jPrint,false);//if true close the form
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrmPrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrintPreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnPAllBooks;
    private javax.swing.JButton btnPAllIssueBooks;
    private javax.swing.JButton btnPAllLostBooks;
    private javax.swing.JButton btnPAllMembers;
    private javax.swing.JButton btnPAllReturnBooks;
    private javax.swing.JButton btnPBookByIDISBN;
    private javax.swing.JButton btnPBookByTitle;
    private javax.swing.JButton btnPIssueBookByBookID;
    private javax.swing.JButton btnPIssueBookByID;
    private javax.swing.JButton btnPMemberByID;
    private javax.swing.JButton btnPMemberByName;
    private javax.swing.JButton btnPUnvBooks;
    private javax.swing.JPanel headerContainer3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
