package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmAccountManagement extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    DefaultTableModel tm;
    boolean verification = false;
    boolean userExist = false;
    
    int posX = 0;
    int posY = 0;
    
    public FrmAccountManagement() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(13,23,26)));
        this.setLocationRelativeTo(this);
        undecoratedMovableForm();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBShowPass = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSearchTable = new javax.swing.JButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        jRadioButtonName = new javax.swing.JRadioButton();
        jRadioButtonID = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        txtPass = new javax.swing.JPasswordField();
        txtConPass = new javax.swing.JPasswordField();
        jCBAdministrator = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(13, 23, 26));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmAccount/back_button.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_NFT_User_64px.png")); // NOI18N
        jLabel7.setText("Account Management");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name:");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFNameFocusGained(evt);
            }
        });

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLNameFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Confirm Password:");

        jCBShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jCBShowPass.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jCBShowPass.setText("Show Password");
        jCBShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBShowPassActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_add_32px.png")); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_update_32px.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_trash_26px.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_refresh_24px_7.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_24px_8.png")); // NOI18N
        btnSearchTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTableActionPerformed(evt);
            }
        });

        jRadioButtonAll.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonAll.setText("All");
        jRadioButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllActionPerformed(evt);
            }
        });

        jRadioButtonName.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonName.setText("Name");
        jRadioButtonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNameActionPerformed(evt);
            }
        });

        jRadioButtonID.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonID.setSelected(true);
        jRadioButtonID.setText("ID");
        jRadioButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIDActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(13, 23, 26), null), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Username", "Password", "User Type"
            }
        ));
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtConPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConPassFocusGained(evt);
            }
        });

        jCBAdministrator.setBackground(new java.awt.Color(255, 255, 255));
        jCBAdministrator.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jCBAdministrator.setText("Administrator Privilege");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBShowPass, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonID)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonName)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAll)
                        .addGap(26, 26, 26)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(381, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonID)
                            .addComponent(jRadioButtonName)
                            .addComponent(jRadioButtonAll))
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jCBShowPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAdministrator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmAccount/back_button_hover.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmAccount/back_button.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        userExist = fc.checkEntryExist("tblaccounts","u_id", txtID);
        if(userExist) JOptionPane.showMessageDialog(rootPane, "User ID already exist!","Duplicate Entry",0);
        else inputsChecking(txtID,txtFName,txtLName,txtUsername,txtPass,txtConPass,jCBShowPass);
        if(!userExist){
            if(verification){
                fc.addRecord("tblaccounts",txtID,txtFName,txtLName,txtUsername,txtPass, jCBAdministrator);
                resetFields();
            }
            else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
        }
        showRecord();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter User ID!","Empty ID Field",0);
        else {
            userExist = fc.checkEntryExist("tblaccounts","u_id", txtID);
            if(!userExist) JOptionPane.showMessageDialog(rootPane, "User with this ID does not exist!","No Entry",0);
            else inputsChecking(txtID,txtFName,txtLName,txtUsername,txtPass,txtConPass,jCBShowPass);
            if(userExist){
                if(verification){
                    fc.updateRecord("tblaccounts","u_id",txtID,"u_id","f_name","l_name","username",
                            "password","account_type",txtID,txtFName,txtLName,txtUsername,txtPass,jCBAdministrator);
                    resetFields();
                }
                else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
            }
        }
        showRecord();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter user ID!","Empty ID Field",0);
        else {
            userExist = fc.checkEntryExist("tblaccounts","u_id", txtID);
            if(userExist){
                fc.deleteRecord("tblaccounts", "u_id", txtID);
                resetFields();
            }
            else JOptionPane.showMessageDialog(rootPane, "User with this ID does not exist!","No Entry",0);
        }
        showRecord();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTableActionPerformed
        if(!this.txtSearch.getText().isEmpty()){
            if(jRadioButtonID.isSelected() == true) RefreshDataID();
            else if(jRadioButtonName.isSelected() == true) RefreshDataName();
        }
    }//GEN-LAST:event_btnSearchTableActionPerformed

    private void jRadioButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllActionPerformed
        showRecord();
        txtSearch.setText(null);
        txtSearch.setEditable(false);
    }//GEN-LAST:event_jRadioButtonAllActionPerformed

    private void jRadioButtonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNameActionPerformed
        if(jRadioButtonName.isSelected() == true)
        txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonNameActionPerformed

    private void jRadioButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIDActionPerformed
        if(jRadioButtonID.isSelected() == true)
        txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonIDActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(evt.getKeyChar()==10 && !this.txtSearch.getText().isEmpty()){
            if(jRadioButtonID.isSelected() == true) RefreshDataID();
            else if(jRadioButtonName.isSelected() == true) RefreshDataName();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fc.radioButtonsGroup(jRadioButtonID, jRadioButtonName, jRadioButtonAll);
        this.txtID.setText(""+fc.autoId("tblaccounts", "u_id"));
        showRecord();
    }//GEN-LAST:event_formWindowOpened

    private void jCBShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBShowPassActionPerformed
        fc.showCheckPassword(jCBShowPass, txtPass);
        fc.showCheckPassword(jCBShowPass, txtConPass);
    }//GEN-LAST:event_jCBShowPassActionPerformed

    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseClicked
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableUsersMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if(evt.getKeyChar()==10)
            searchRecord();
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        checkJTextFieldFocusGained(txtID);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtFNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameFocusGained
        checkJTextFieldFocusGained(txtFName);
    }//GEN-LAST:event_txtFNameFocusGained

    private void txtLNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameFocusGained
        checkJTextFieldFocusGained(txtLName);
    }//GEN-LAST:event_txtLNameFocusGained

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        checkJTextFieldFocusGained(txtUsername);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtConPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConPassFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConPassFocusGained

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
    
    void headerColumn(){
        tm = new DefaultTableModel(0,0);
        String s[] = new String[]{"ID","First Name","Last Name","Username","Password","Accouont Type"};
        tm.setColumnIdentifiers(s);
        jTableUsers.setModel(tm);
        jTableUsers.setAutoCreateRowSorter(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < s.length; i++)
            jTableUsers.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    
    void showRecord(){
        try {
            headerColumn();
            customizeJtable();
            db.rs = db.st.executeQuery("Select * from tblaccounts");
            while(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3));
                v.add(db.rs.getString(4));
                v.add(db.rs.getString(5));
                v.add(db.rs.getString(6));
                tm.addRow(v);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    public void customizeJtable(){
        //customize jtable
        jTableUsers.setSelectionBackground(new Color(110,174,222));
        jTableUsers.setSelectionForeground(Color.white);
        jTableUsers.setRowHeight(30);
        jTableUsers.setShowGrid(false);
        jTableUsers.setBackground(new Color(255,255,255));
        //customize jtable header row
        ((DefaultTableCellRenderer)jTableUsers.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableUsers.getTableHeader().setBackground(Color.black);
        //jTableUsers.getTableHeader().setForeground(Color.white);
        jTableUsers.getTableHeader().setFont(new Font("Verdana",Font.BOLD, 12));
        jTableUsers.getTableHeader().setOpaque(false);
        jTableUsers.setFont(new Font("Verdana",Font.PLAIN, 11));
    }
    
    public void inputsChecking(JTextField id,JTextField fname,JTextField lname,JTextField user,
                               JPasswordField pass,JPasswordField conPass,JCheckBox admin){
        if(id.getText().isEmpty() || fname.getText().isEmpty() || fname.getText().isEmpty() ||
                user.getText().isEmpty() || pass.getPassword().length == 0 ||
                conPass.getPassword().length == 0 || !Arrays.equals(conPass.getPassword(), pass.getPassword())){            
            this.verification = false;
            if(id.getText().isEmpty()){
                id.setForeground(Color.red);
                id.setText("*id required");                
            }
            if(fname.getText().isEmpty()){
                fname.setForeground(Color.red);
                fname.setText("*first name required");                
            }
            if(lname.getText().isEmpty()){
                lname.setForeground(Color.red);
                lname.setText("*last name required");                
            }
            if(user.getText().isEmpty()){
                user.setForeground(Color.red);
                user.setText("*username required");                
            }
            if(pass.getPassword().length == 0){
                JOptionPane.showMessageDialog(rootPane, "Please enter password!","Empty Password Field!",0);
            }
            if((pass.getPassword().length > 0) && (conPass.getPassword().length == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter Confirm password!","Empty Confirm Password Field!",0);
            }
            if((pass.getPassword().length > 0) && (conPass.getPassword().length > 0)){
                if(!Arrays.equals(conPass.getPassword(), pass.getPassword()))
                    JOptionPane.showMessageDialog(rootPane, "Confirm password doesn't match!","Retype Confirm Password",0);
            }
        }
        else if(fname.getForeground().equals(Color.red) || lname.getForeground().equals(Color.red) ||
                user.getForeground().equals(Color.red))
            this.verification = false;
        else this.verification = true;
    }
    
    void checkJTextFieldFocusGained(JTextField jtf){
        if(!verification){
            if(jtf.getForeground().equals(Color.red)){
                jtf.setForeground(Color.black);
                jtf.setText("");
            }
        }
    }
    
    void searchRecord(){
        try {
            db.pst = db.con.prepareStatement("SELECT * FROM tblaccounts WHERE u_id = ?");
            db.pst.setString(1, txtID.getText());
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                txtFName.setText(db.rs.getString(2));
                txtLName.setText(db.rs.getString(3));
                txtUsername.setText(db.rs.getString(4));
                txtPass.setText(db.rs.getString(5));
                if(db.rs.getString(6).equals("admin"))
                    jCBAdministrator.setSelected(true);
                else jCBAdministrator.setSelected(false);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No user with this id is found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
            
        }
    }

    void RefreshDataID(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select * From tblaccounts Where u_id = '"+txtSearch.getText()+"'");
            if(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3));
                v.add(db.rs.getString(4));
                v.add(db.rs.getString(5));
                v.add(db.rs.getString(6));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No user with this id is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    void RefreshDataName(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select * From tblaccounts Where "
                    + "f_name Like '%"+txtSearch.getText()+"%' Or l_name Like '%"+txtSearch.getText()+"%' "
                    + "Or Concat(f_name,l_name) Like '%"+txtSearch.getText()+"%' "
                    + "Or Concat(f_name,' ',l_name) Like '%"+txtSearch.getText()+"%'");
            if(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3));
                v.add(db.rs.getString(4));
                v.add(db.rs.getString(5));
                v.add(db.rs.getString(6));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No user with this name is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    public void getDetailOnTableRowClick(){
        //get selected index row
        int index = jTableUsers.getSelectedRow();
        //get values
        String id = jTableUsers.getValueAt(index, 0).toString();
        String fname = jTableUsers.getValueAt(index, 1).toString();
        String lname = jTableUsers.getValueAt(index, 2).toString();
        String user = jTableUsers.getValueAt(index, 3).toString();
        String pass = jTableUsers.getValueAt(index, 4).toString();
        String type = jTableUsers.getValueAt(index, 5).toString();
        //show value in textfield
        this.txtID.setText(id);
        this.txtFName.setText(fname);
        this.txtLName.setText(lname);
        this.txtUsername.setText(user);
        this.txtPass.setText(pass);
        if(type.equals("admin"))
            this.jCBAdministrator.setSelected(true);
        else this.jCBAdministrator.setSelected(false);
    }
    
    void resetFields(){
        this.verification = false;
        this.userExist = false;
        this.txtID.setText(""+fc.autoId("tblaccounts", "u_id"));
        this.txtFName.setText(null);
        this.txtLName.setText(null);
        this.txtUsername.setText(null);
        this.txtPass.setText(null);
        this.txtConPass.setText(null);
        this.jCBShowPass.setSelected(false);
        this.jCBAdministrator.setSelected(false);
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
            java.util.logging.Logger.getLogger(FrmAccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAccountManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearchTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox jCBAdministrator;
    private javax.swing.JCheckBox jCBShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JRadioButton jRadioButtonName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
