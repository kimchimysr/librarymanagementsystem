package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.temporal.ChronoUnit;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FrmReturnBook extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    DefaultTableModel tm;

    boolean verification = false;
    boolean isLost = false;
    boolean issueExist = false;
    int posX = 0;
    int posY = 0;

    public FrmReturnBook() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(126,127,154)));
        undecoratedMovableForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentContainer = new javax.swing.JPanel();
        headerContainer3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIssueID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMemID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDCIssueDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jDCDueDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDCReturnDate = new com.toedter.calendar.JDateChooser();
        btnLost = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIssueBook = new javax.swing.JTable();
        jCBStatus = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        txtFine = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        parentContainer.setBackground(new java.awt.Color(249, 248, 248));
        parentContainer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        headerContainer3.setBackground(new java.awt.Color(126, 127, 154));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmIssueBook/back_button.png"))); // NOI18N
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
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_borrow_book_64px_1.png")); // NOI18N
        jLabel4.setText("Return Book");
        jLabel4.setIconTextGap(10);

        javax.swing.GroupLayout headerContainer3Layout = new javax.swing.GroupLayout(headerContainer3);
        headerContainer3.setLayout(headerContainer3Layout);
        headerContainer3Layout.setHorizontalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE))
        );
        headerContainer3Layout.setVerticalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtIssueID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtIssueID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIssueID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIssueIDFocusGained(evt);
            }
        });
        txtIssueID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIssueIDKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Issue ID:");

        txtBookID.setEditable(false);
        txtBookID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBookID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Book ID:");

        txtMemID.setEditable(false);
        txtMemID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMemID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Member ID:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Issue Date:");

        jDCIssueDate.setBackground(new java.awt.Color(249, 248, 248));
        jDCIssueDate.setDateFormatString("yyyy-MM-dd");
        jDCIssueDate.setEnabled(false);
        jDCIssueDate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Due Date:");

        jDCDueDate.setBackground(new java.awt.Color(249, 248, 248));
        jDCDueDate.setDateFormatString("yyyy-MM-dd");
        jDCDueDate.setEnabled(false);
        jDCDueDate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Return Date:");

        jDCReturnDate.setBackground(new java.awt.Color(249, 248, 248));
        jDCReturnDate.setDateFormatString("yyyy-MM-dd");
        jDCReturnDate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jDCReturnDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCReturnDatePropertyChange(evt);
            }
        });

        btnLost.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnLost.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_close_window_30px.png")); // NOI18N
        btnLost.setText("Lost");
        btnLost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLostActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_trash_24px_6.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTableIssueBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Book ID", "Member ID", "Status", "Issue Date", "Due Date", "Return Date", "Fine"
            }
        ));
        jTableIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIssueBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIssueBook);

        jCBStatus.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Issued", "Returned", "Lost" }));
        jCBStatus.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCBStatusPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Select Status:");

        btnPrint.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_print_24px_1.png")); // NOI18N
        btnPrint.setText("Print Preview");
        btnPrint.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txtFine.setEditable(false);
        txtFine.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtFine.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fine($):");

        btnInfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_box_important_24px.png")); // NOI18N
        btnInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReturn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_return_24px_1.png")); // NOI18N
        btnReturn.setText("Return");
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_refresh_24px_9.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parentContainerLayout = new javax.swing.GroupLayout(parentContainer);
        parentContainer.setLayout(parentContainerLayout);
        parentContainerLayout.setHorizontalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(parentContainerLayout.createSequentialGroup()
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBookID)
                                .addComponent(txtMemID)
                                .addComponent(txtIssueID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(parentContainerLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jDCIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(parentContainerLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jDCDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(parentContainerLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jDCReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLost, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(txtFine, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        parentContainerLayout.setVerticalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addComponent(headerContainer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIssueID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jDCIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jDCDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jDCReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLost, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackbtnBackMouseClicked

    private void btnBackbtnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseEntered
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmIssueBook/back_button_hover.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseEntered

    private void btnBackbtnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseExited
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmIssueBook/back_button.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showRecord();
        fc.getDateNow(jDCReturnDate);
        disableJDCTextField(jDCReturnDate);
        centerjDateChooserText(jDCIssueDate);
        centerjDateChooserText(jDCDueDate);
        centerjDateChooserText(jDCReturnDate);
    }//GEN-LAST:event_formWindowOpened

    private void txtIssueIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssueIDKeyTyped
        if(evt.getKeyChar() == 10 && !txtIssueID.getText().isEmpty())
            searchIssueID();
    }//GEN-LAST:event_txtIssueIDKeyTyped

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if(this.txtIssueID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter issue ID!","Empty ID Field",0);
        else {
            issueExist = fc.checkEntryExist("tblissuebooks","issue_id",txtIssueID);
            if(!issueExist) JOptionPane.showMessageDialog(rootPane, "Issue with this ID does not exist!","No Entry",0);
            else inputsChecking();
            if(issueExist){
                if(verification && !isLost){ 
                    fc.updateRecord("tblissuebooks", "issue_id", txtIssueID, "status", "return_date", "fine",
                            "Returned",jDCReturnDate,txtFine,txtBookID,"Returned");
                    showRecord();
                }
                else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnLostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLostActionPerformed
        if(this.txtIssueID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter issue ID!","Empty ID Field",0);
        else {
            issueExist = fc.checkEntryExist("tblissuebooks","issue_id",txtIssueID);
            if(!issueExist) JOptionPane.showMessageDialog(rootPane, "Issue with this ID does not exist!","No Entry",0);
            else {
                inputsChecking();
                checkBookLost();
            }
            if(issueExist){
                if(verification && isLost){
                    fc.updateRecord("tblissuebooks", "issue_id", txtIssueID, "status", "return_date", "fine",
                            "Lost",jDCReturnDate,txtFine,txtBookID,"Lost");
                    showRecord();
                    isLost = false;
                }
                else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
            }
        }
    }//GEN-LAST:event_btnLostActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(this.txtIssueID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter issue ID!","Empty ID Field",0);
        else {
            issueExist = fc.checkEntryExist("tblissuebooks","issue_id",txtIssueID);
            if(issueExist){
                fc.deleteRecord("tblissuebooks", "issue_id", txtIssueID);
                showRecord();
                resetFields();
            }
            else JOptionPane.showMessageDialog(rootPane, "Issue with this ID does not exist!","No Entry",0);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIssueIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIssueIDFocusGained
        checkJTextFieldFocusGained(txtIssueID);
    }//GEN-LAST:event_txtIssueIDFocusGained

    private void jDCReturnDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCReturnDatePropertyChange
        if(jDCDueDate.getDate() != null && jDCReturnDate.getDate() != null)
            calculateFine();
    }//GEN-LAST:event_jDCReturnDatePropertyChange

    private void jCBStatusPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBStatusPopupMenuWillBecomeInvisible
        if(jCBStatus.getSelectedItem().equals("Issued"))
            showRecord("Issued");
        else if(jCBStatus.getSelectedItem().equals("Returned"))
            showRecord("Returned");
        else if(jCBStatus.getSelectedItem().equals("Lost"))
            showRecord("Lost");
        else showRecord();
    }//GEN-LAST:event_jCBStatusPopupMenuWillBecomeInvisible

    private void jTableIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIssueBookMouseClicked
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableIssueBookMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if(jCBStatus.getSelectedItem().equals("Issued"))
            showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllIssueBooks.jrxml");
        else if(jCBStatus.getSelectedItem().equals("Returned"))
            showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllReturnBooks.jrxml");
        else if(jCBStatus.getSelectedItem().equals("Lost"))
            showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllLostBooks.jrxml");
        else showReport("I:\\Study Materials\\Year III\\Semester II\\Java Programming II\\LibraryManagementSystem\\src\\Reports\\reportAllIssBooks.jrxml");
    }//GEN-LAST:event_btnPrintActionPerformed

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

    void centerjDateChooserText(JDateChooser jdc){
        JTextFieldDateEditor dateEditor = (JTextFieldDateEditor)jdc.getDateEditor();
        dateEditor.setHorizontalAlignment(JTextField.CENTER);
    }

    void headerColumn(){
        tm = new DefaultTableModel(0,0);
        String s[] = new String[]{"Issue ID","Book ID","Member ID","Status","Issue Date","Due Date","Return Date",
                                  "Fine"};
        tm.setColumnIdentifiers(s);
        jTableIssueBook.setModel(tm);
        jTableIssueBook.setAutoCreateRowSorter(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < s.length; i++)
            jTableIssueBook.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    void showRecord(){
        try {
            headerColumn();
            customizeJtable();
            db.rs = db.st.executeQuery("Select * From tblissuebooks");
            while(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3));
                v.add(db.rs.getString(4));
                v.add(db.rs.getString(5));
                v.add(db.rs.getString(6));
                v.add(db.rs.getString(7));
                v.add(db.rs.getString(8));
                tm.addRow(v);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
    void showRecord(String filter){
        try {
            headerColumn();
            customizeJtable();
            db.rs = db.st.executeQuery("Select * From tblissuebooks Where status='"+filter+"'");
            while(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3));
                v.add(db.rs.getString(4));
                v.add(db.rs.getString(5));
                v.add(db.rs.getString(6));
                v.add(db.rs.getString(7));
                v.add(db.rs.getString(8));
                tm.addRow(v);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }

    public void customizeJtable(){
        //customize jtable
        jTableIssueBook.setSelectionBackground(new Color(110,174,222));
        jTableIssueBook.setSelectionForeground(Color.white);
        jTableIssueBook.setRowHeight(30);
        jTableIssueBook.setShowGrid(false);
        jTableIssueBook.setBackground(new Color(193,221,242));
        //customize jtable header row
        ((DefaultTableCellRenderer)jTableIssueBook.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableIssueBook.getTableHeader().setBackground(Color.black);
        //jTableMembers.getTableHeader().setForeground(new Color(41,134,204));
        jTableIssueBook.getTableHeader().setFont(new Font("Verdana",Font.BOLD, 12));
        jTableIssueBook.getTableHeader().setOpaque(false);
        jTableIssueBook.setFont(new Font("Verdana",Font.PLAIN, 11));
    }

    void searchIssueID(){
        try {
            db.rs = db.st.executeQuery("Select book_id,mem_id,issue_date,due_date,return_date,fine "
                    + "From tblissuebooks Where issue_id='"+txtIssueID.getText()+"'");
            if(db.rs.next()){
                txtBookID.setText(""+db.rs.getString(1));
                txtMemID.setText(""+db.rs.getString(2));
                jDCIssueDate.setDate(fc.stringToDate(db.rs.getString(3)));
                jDCDueDate.setDate(fc.stringToDate(db.rs.getString(4)));
                if(db.rs.getString(5) != null){
                    jDCReturnDate.setDate(fc.stringToDate(db.rs.getString(5)));
                }
                else jDCReturnDate.setDate(null);
                if(db.rs.getString(6) != null)
                    txtFine.setText(""+db.rs.getString(6));
                else txtFine.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Issue ID is not found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }

    public void inputsChecking(){
        if(txtIssueID.getText().isEmpty() || jDCReturnDate.getDate() == null ||
                jDCIssueDate.getDate() == null || jDCDueDate.getDate() == null ||
                jDCReturnDate.getDate().before(jDCIssueDate.getDate())){
            this.verification = false;
            if(txtIssueID.getText().isEmpty()){
                txtIssueID.setForeground(Color.red);
                txtIssueID.setText("*id required");
            }
        }
        else if(txtIssueID.getForeground().equals(Color.red))
            this.verification = false;
        else this.verification = true;
    }

    void resetFields(){
        this.verification = false;
        this.issueExist = false;
        this.isLost = false;
        this.txtIssueID.setText(null);
        this.txtBookID.setText(null);
        this.txtMemID.setText(null);
        this.jDCIssueDate.setDate(null);
        this.jDCDueDate.setDate(null);
        fc.getDateNow(jDCReturnDate);
        this.txtFine.setText(null);
        this.txtIssueID.setForeground(Color.black);
    }
    
    void checkBookLost(){
        if(jDCReturnDate.getDate() == null && txtFine.getText().isEmpty()){
            this.verification = true;
            this.isLost = true;
        }
        else {
            this.verification = false;
            this.isLost = false;
        }
    }

    public void checkJTextFieldFocusGained(JTextField jtf){
        if(!verification){
            if(jtf.getForeground().equals(Color.red)){
                jtf.setForeground(Color.black);
                jtf.setText("");
            }
        }
    }

    void disableJDCTextField(JDateChooser jdc){
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdc.getDateEditor();
        editor.setEditable(false);
    }

    void calculateFine(){
        if(jDCReturnDate.getDate().after(jDCDueDate.getDate())){
            long overdueDays = ChronoUnit.DAYS.between(jDCDueDate.getDate().toInstant(),
                                                       jDCReturnDate.getDate().toInstant());
            long fine = overdueDays * 1;
            txtFine.setText(""+fine);
        }else txtFine.setText("0");
    }

    public void getDetailOnTableRowClick(){
        //get selected index row
        int index = jTableIssueBook.getSelectedRow();
        //get values
        String id = jTableIssueBook.getValueAt(index, 0).toString();
        String b_id = jTableIssueBook.getValueAt(index, 1).toString();
        String m_id = jTableIssueBook.getValueAt(index, 2).toString();
        String status = jTableIssueBook.getValueAt(index, 3).toString();
        String issue_date = jTableIssueBook.getValueAt(index, 4).toString();
        String due_date = jTableIssueBook.getValueAt(index, 5).toString();
        String return_date = null;
        String fine = null;
        if(jTableIssueBook.getValueAt(index, 6) == null){
            return_date = null;
            fine = null;
        }else{
        return_date = jTableIssueBook.getValueAt(index, 6).toString();
        fine = jTableIssueBook.getValueAt(index, 7).toString();
        }
        //show value in textfield
        this.txtIssueID.setText(id);
        this.txtBookID.setText(b_id);
        this.txtMemID.setText(m_id);
        if(fine != null)
            this.txtFine.setText(fine);
        else this.txtFine.setText(null);
        try {
            this.jDCIssueDate.setDate(fc.stringToDate(issue_date));
            this.jDCDueDate.setDate(fc.stringToDate(due_date));
            if(return_date != null)
                this.jDCReturnDate.setDate(fc.stringToDate(return_date));
            else this.jDCReturnDate.setDate(null);
        } catch (Exception e) {e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(FrmReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLost;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel headerContainer3;
    private javax.swing.JComboBox jCBStatus;
    private com.toedter.calendar.JDateChooser jDCDueDate;
    private com.toedter.calendar.JDateChooser jDCIssueDate;
    private com.toedter.calendar.JDateChooser jDCReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableIssueBook;
    private javax.swing.JPanel parentContainer;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtFine;
    private javax.swing.JTextField txtIssueID;
    private javax.swing.JTextField txtMemID;
    // End of variables declaration//GEN-END:variables
}