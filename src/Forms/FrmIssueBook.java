package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FrmIssueBook extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    int posX = 0;
    int posY = 0;
    
    boolean book_exist = false;
    boolean member_exist = false;
    boolean verification = false;
    
    public FrmIssueBook() {
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
        txtBookID = new javax.swing.JTextField();
        txtMemberID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSearchBook = new javax.swing.JButton();
        btnSearchMember = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBBorrowDuration = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDCIssueDate = new com.toedter.calendar.JDateChooser();
        lblBookAvailability = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblBookTitle = new javax.swing.JLabel();
        lblMemberName = new javax.swing.JLabel();
        jDCReturnDate = new com.toedter.calendar.JDateChooser();
        btnIssue = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        parentContainer.setBackground(new java.awt.Color(249, 248, 248));

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
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_knowledge_sharing_60px.png")); // NOI18N
        jLabel4.setText("Issue Book");
        jLabel4.setIconTextGap(10);

        javax.swing.GroupLayout headerContainer3Layout = new javax.swing.GroupLayout(headerContainer3);
        headerContainer3.setLayout(headerContainer3Layout);
        headerContainer3Layout.setHorizontalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );
        headerContainer3Layout.setVerticalGroup(
            headerContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerContainer3Layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtBookID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBookID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBookIDFocusGained(evt);
            }
        });
        txtBookID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBookIDKeyTyped(evt);
            }
        });

        txtMemberID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMemberID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMemberIDFocusGained(evt);
            }
        });
        txtMemberID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMemberIDKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Enter Book ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Member ID:");

        btnSearchBook.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSearchBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_more_24px_1.png")); // NOI18N
        btnSearchBook.setText("Search Book");
        btnSearchBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });

        btnSearchMember.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSearchMember.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_more_24px_2.png")); // NOI18N
        btnSearchMember.setText("Search Member");
        btnSearchMember.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMemberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Book Availability:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Borrow Duration:");

        jCBBorrowDuration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        jCBBorrowDuration.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCBBorrowDurationPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Week(s)");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Issue Date:");

        jDCIssueDate.setBackground(new java.awt.Color(249, 248, 248));
        jDCIssueDate.setDateFormatString("yyyy-MM-dd");
        jDCIssueDate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblBookAvailability.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblBookAvailability.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBookAvailability.setText("Yes | No");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Return Date:");

        jPanel2.setBackground(new java.awt.Color(249, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Book: ");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel11.setText("Member:");

        lblBookTitle.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblBookTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBookTitle.setText("Title");
        lblBookTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblBookTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBookTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookTitleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBookTitleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBookTitleMouseExited(evt);
            }
        });

        lblMemberName.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblMemberName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMemberName.setText("Name");
        lblMemberName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMemberName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMemberName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMemberNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMemberNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMemberNameMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMemberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblBookTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblMemberName))
                .addGap(45, 45, 45))
        );

        jDCReturnDate.setBackground(new java.awt.Color(249, 248, 248));
        jDCReturnDate.setDateFormatString("yyyy-MM-dd");
        jDCReturnDate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        btnIssue.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnIssue.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_book_and_pencil_32px_1.png")); // NOI18N
        btnIssue.setText("Issue");
        btnIssue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_reset_32px_3.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_cancel_35px.png")); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ID:");

        javax.swing.GroupLayout parentContainerLayout = new javax.swing.GroupLayout(parentContainer);
        parentContainer.setLayout(parentContainerLayout);
        parentContainerLayout.setHorizontalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addComponent(lblBookAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(parentContainerLayout.createSequentialGroup()
                                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(parentContainerLayout.createSequentialGroup()
                                            .addComponent(jCBBorrowDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jDCIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(parentContainerLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDCReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        parentContainerLayout.setVerticalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addComponent(headerContainer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)))
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblBookAvailability))
                                .addGap(35, 35, 35)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jDCIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jCBBorrowDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel6)))
                        .addGap(29, 29, 29)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9))))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIssue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmIssueBook/back_button_hover.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseEntered

    private void btnBackbtnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackbtnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmIssueBook/back_button.png")));
    }//GEN-LAST:event_btnBackbtnBackMouseExited

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed
        searchBookID();
    }//GEN-LAST:event_btnSearchBookActionPerformed

    private void btnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMemberActionPerformed
        searchMemberID();
    }//GEN-LAST:event_btnSearchMemberActionPerformed

    private void txtBookIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookIDKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE))
            evt.consume();
        if(evt.getKeyChar() == 10)
            searchBookID();
    }//GEN-LAST:event_txtBookIDKeyTyped

    private void txtMemberIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIDKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE))
            evt.consume();
        if(evt.getKeyChar() == 10)
            searchMemberID();
    }//GEN-LAST:event_txtMemberIDKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtID.setText(""+fc.autoId("tblissuebooks", "issue_id"));
        fc.getDateNow(jDCIssueDate);
        fc.centerjDateChooserText(jDCIssueDate);
        fc.centerjDateChooserText(jDCReturnDate);
    }//GEN-LAST:event_formWindowOpened

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        inputsChecking();
        if(verification && book_exist && member_exist){
            fc.addRecord("tblissuebooks", txtID, txtBookID, txtMemberID, "Issued", jDCIssueDate, jDCReturnDate);
            book_exist = false;
            member_exist = false;
        }
        else if(!book_exist || !member_exist)
            JOptionPane.showMessageDialog(rootPane, "Search Book ID or Member ID first!","Search",0);
        else if(lblBookAvailability.getText().equals("No"))
            JOptionPane.showMessageDialog(rootPane, "Book is not available!","Book Availability",0);
        else if(jDCReturnDate.getDate().before(jDCIssueDate.getDate())){
            JOptionPane.showMessageDialog(rootPane, "Return Date must be days later than Issue Date!","Date Eror",0);
        }
        else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.txtID.setText(""+fc.autoId("tblissuebooks", "issue_id"));
        this.verification = false;
        this.book_exist = false;
        this.member_exist = false;
        this.lblBookAvailability.setForeground(Color.black);
        this.lblBookAvailability.setText("Yes | No");
        this.lblBookTitle.setText("Title");
        this.lblMemberName.setText("Name");
        this.txtBookID.setText(null);
        this.txtMemberID.setText(null);
        fc.getDateNow(jDCIssueDate);
        this.jDCReturnDate.setDate(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jCBBorrowDurationPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBBorrowDurationPopupMenuWillBecomeInvisible
        comboBoxSelectedIndex();
    }//GEN-LAST:event_jCBBorrowDurationPopupMenuWillBecomeInvisible

    private void txtBookIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBookIDFocusGained
        checkJTextFieldFocusGained(txtBookID);
    }//GEN-LAST:event_txtBookIDFocusGained

    private void txtMemberIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMemberIDFocusGained
        checkJTextFieldFocusGained(txtMemberID);
    }//GEN-LAST:event_txtMemberIDFocusGained

    private void lblBookTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookTitleMouseClicked
        if(!txtBookID.getText().isEmpty()){
            FrmDialogBookInfo bookInfo = new FrmDialogBookInfo(this,true,txtBookID.getText().trim());
            bookInfo.setVisible(true);
        }
    }//GEN-LAST:event_lblBookTitleMouseClicked

    private void lblBookTitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookTitleMouseEntered
        setBorderToJLabel(lblBookTitle, Color.black);
    }//GEN-LAST:event_lblBookTitleMouseEntered

    private void lblBookTitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookTitleMouseExited
        setBorderToJLabel(lblBookTitle, new Color(249,248,248));
    }//GEN-LAST:event_lblBookTitleMouseExited

    private void lblMemberNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMemberNameMouseClicked
        if(!txtMemberID.getText().isEmpty()){
            FrmDialogMemberInfo memInfo = new FrmDialogMemberInfo(this, true, txtMemberID.getText().trim());
            memInfo.setVisible(true);
        }
    }//GEN-LAST:event_lblMemberNameMouseClicked

    private void lblMemberNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMemberNameMouseEntered
        setBorderToJLabel(lblMemberName, Color.black);
    }//GEN-LAST:event_lblMemberNameMouseEntered

    private void lblMemberNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMemberNameMouseExited
        setBorderToJLabel(lblMemberName, new Color(249,248,248));
    }//GEN-LAST:event_lblMemberNameMouseExited

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
    
    void setBorderToJLabel(JLabel lbl, Color color){
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        lbl.setBorder(border);
    }
    
    void comboBoxSelectedIndex(){
        Calendar calendar = Calendar.getInstance();
        if(jCBBorrowDuration.getSelectedIndex() == 0){
            int noOfDays = 7; //1 week
            calendar.setTime(jDCIssueDate.getDate());            
            calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
            Date date = calendar.getTime();
            jDCReturnDate.setDate(date);
        }else if (jCBBorrowDuration.getSelectedIndex() == 1){
            int noOfDays = 14; //2 week
            calendar.setTime(jDCIssueDate.getDate());            
            calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
            Date date = calendar.getTime();
            jDCReturnDate.setDate(date);
        }else {
            int noOfDays = 21; //3 week
            calendar.setTime(jDCIssueDate.getDate());            
            calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
            Date date = calendar.getTime();
            jDCReturnDate.setDate(date);
        }
    }
    
    public void inputsChecking(){
        if(txtBookID.getText().isEmpty() || txtMemberID.getText().isEmpty() || 
                jDCIssueDate.getDate() == null || jDCReturnDate.getDate() == null ||
                !lblBookAvailability.getText().equals("Yes") ||
                jDCReturnDate.getDate().before(jDCIssueDate.getDate())){            
            this.verification = false;
            if(txtBookID.getText().isEmpty()){
                txtBookID.setForeground(Color.red);
                txtBookID.setText("*id required");                
            }
            if(txtMemberID.getText().isEmpty()){
                txtMemberID.setForeground(Color.red);
                txtMemberID.setText("*id required");                
            }
        }
        else if(txtBookID.getForeground().equals(Color.red) || txtMemberID.getForeground().equals(Color.red) 
                || jDCIssueDate.getForeground().equals(Color.red) || jDCReturnDate.getForeground().equals(Color.red))
            this.verification = false;
        else this.verification = true;
    }
    
    public void checkJTextFieldFocusGained(JTextField jtf){
        if(!verification){
            if(jtf.getForeground().equals(Color.red)){
                jtf.setForeground(Color.black);
                jtf.setText("");
            }
        }
    }
    
    void searchBookID(){
        try {
            db.rs = db.st.executeQuery("Select title,qty From tblbooks Where id='"+txtBookID.getText()+"'");
            if(db.rs.next()){
                book_exist = true;
                this.lblBookTitle.setText(fc.stringToHTML(db.rs.getString(1)));
                int qty = Integer.parseInt(db.rs.getString(2));
                if(qty != 0) {
                    this.lblBookAvailability.setForeground(new Color(8,164,167));
                    this.lblBookAvailability.setText("Yes");
                }
                else{
                    this.lblBookAvailability.setForeground(new Color(190,0,0));
                    this.lblBookAvailability.setText("No");
                }
            }
            else {
                book_exist = false;
                JOptionPane.showMessageDialog(rootPane, "No book with this ID is found!", "Search Result",2);
                this.lblBookAvailability.setForeground(new Color(190,0,0));
                this.lblBookAvailability.setText("No");
                this.lblBookTitle.setText("");
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void searchMemberID(){
        try {
            db.rs = db.st.executeQuery("Select f_name,l_name From tblmembers Where mem_id='"+txtMemberID.getText()+"'");
            if(db.rs.next()){
                member_exist = true;
                this.lblMemberName.setText(fc.stringToHTML(""+db.rs.getString(1)+" "+db.rs.getString(2)));
            }
            else {
                member_exist = true;
                JOptionPane.showMessageDialog(rootPane, "No member with this ID is found!", "Search Result",2);
                this.lblMemberName.setText("");
            }
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
            java.util.logging.Logger.getLogger(FrmIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnSearchMember;
    private javax.swing.JPanel headerContainer3;
    private javax.swing.JComboBox jCBBorrowDuration;
    private com.toedter.calendar.JDateChooser jDCIssueDate;
    private com.toedter.calendar.JDateChooser jDCReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBookAvailability;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblMemberName;
    private javax.swing.JPanel parentContainer;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMemberID;
    // End of variables declaration//GEN-END:variables
}
