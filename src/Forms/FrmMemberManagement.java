package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmMemberManagement extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    DefaultTableModel tm;
    File selectedFile;
    String imagePath = null;
    boolean verification = false;
    boolean memberExist = false;
    byte[] retrievedImg = null;
    
    int posX = 0;
    int posY = 0;
    
    public FrmMemberManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(41,134,204)));
        undecoratedMovableForm();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentContainer = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabelImageRead = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        btnBrowse = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jRadioButtonID = new javax.swing.JRadioButton();
        jRadioButtonName = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        btnSearchTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDCRegisterDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCBGender = new javax.swing.JComboBox();
        txtLName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FrmCustomers");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        parentContainer.setBackground(new java.awt.Color(111, 175, 223));

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Member ID:");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtFName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFNameFocusGained(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        jLabelImageRead.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImageRead.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(111, 175, 223), null));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email:");

        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_26px_1.png")); // NOI18N
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(111, 175, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(111, 175, 223), null), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        jTableMembers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTableMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMembers);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBrowse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBrowse.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_Browse_Folder_24px_4.png")); // NOI18N
        btnBrowse.setText("Select Photo");
        btnBrowse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jRadioButtonID.setBackground(new java.awt.Color(111, 175, 223));
        jRadioButtonID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonID.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonID.setSelected(true);
        jRadioButtonID.setText("ID");
        jRadioButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIDActionPerformed(evt);
            }
        });

        jRadioButtonName.setBackground(new java.awt.Color(111, 175, 223));
        jRadioButtonName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonName.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonName.setText("Name");
        jRadioButtonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNameActionPerformed(evt);
            }
        });

        jRadioButtonAll.setBackground(new java.awt.Color(111, 175, 223));
        jRadioButtonAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonAll.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAll.setText("All");
        jRadioButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllActionPerformed(evt);
            }
        });

        btnSearchTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_24px_9.png")); // NOI18N
        btnSearchTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTableActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(41, 134, 204));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmMembers/back_button.png"))); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(41, 134, 204));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_people_50px_3.png")); // NOI18N
        jLabel7.setText("Member Management");

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

        jDCRegisterDate.setBackground(new java.awt.Color(111, 175, 223));
        jDCRegisterDate.setDateFormatString("yyyy-MM-dd");
        jDCRegisterDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Register Date:");

        jPanel4.setBackground(new java.awt.Color(111, 175, 223));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(111, 175, 223), null));

        btnSave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_save_30px_1.png")); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_update_32px_4.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_trash_26px_5.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDelete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_reset_32px_4.png")); // NOI18N
        btnDelete1.setText("Reset");
        btnDelete1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");

        jCBGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtLName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLNameFocusGained(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Last Name:");

        javax.swing.GroupLayout parentContainerLayout = new javax.swing.GroupLayout(parentContainer);
        parentContainer.setLayout(parentContainerLayout);
        parentContainerLayout.setHorizontalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtPhone)
                            .addComponent(txtAddress)
                            .addComponent(txtFName)
                            .addComponent(txtID)
                            .addComponent(jCBGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLName)
                            .addComponent(jDCRegisterDate, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButtonID)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonName)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAll)
                        .addGap(26, 26, 26)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parentContainerLayout.setVerticalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jCBGender, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGap(248, 248, 248)
                                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jDCRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonID)
                                .addComponent(jRadioButtonName)
                                .addComponent(jRadioButtonAll))
                            .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parentContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        BrowseImages(jLabelImageRead);
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        memberExist = fc.checkEntryExist("tblmembers","mem_id", txtID);
        if(memberExist) JOptionPane.showMessageDialog(rootPane, "Member ID already exist!","Duplicate Entry",0);
        else inputsChecking(txtID,txtFName,txtLName,txtAddress,txtPhone,txtEmail,jDCRegisterDate);
        if(!memberExist){
            if(verification)
                fc.addRecord("tblmembers",txtID,txtFName,txtLName,txtAddress,txtPhone,txtEmail,
                        jCBGender,jDCRegisterDate,imagePath);
            else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
        }
        showRecord();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchRecord();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter member ID!","Empty ID Field",0);
        else {
            memberExist = fc.checkEntryExist("tblmembers","mem_id", txtID);
            if(!memberExist) JOptionPane.showMessageDialog(rootPane, "Member with this ID does not exist!","No Entry",0);
            else inputsChecking(txtID,txtFName,txtLName,txtAddress,txtPhone,txtEmail,jDCRegisterDate);
            if(memberExist){
                if(verification)
                    fc.updateRecord("tblmembers","mem_id",txtID,"mem_id","f_name","l_name","address","phone","email",
                            "gender","register_date","photo",txtID,txtFName,txtLName,txtAddress,txtPhone,
                            txtEmail,jCBGender,jDCRegisterDate,imagePath,retrievedImg);
                else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
            }
        }
        showRecord();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter member ID!","Empty ID Field",0);
        else {
            memberExist = fc.checkEntryExist("tblmembers","mem_id", txtID);
            if(memberExist){
                fc.deleteRecord("tblmembers", "mem_id", txtID);
                resetFields();
            }
            else JOptionPane.showMessageDialog(rootPane, "Member with this ID does not exist!","No Entry",0);
        }
        showRecord();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showRecord();
        radioButtonsGroup(jRadioButtonID, jRadioButtonName, jRadioButtonAll);
        this.txtID.setText(""+fc.autoId("tblmembers", "mem_id"));
        fc.getDateNow(jDCRegisterDate);
        fc.centerjDateChooserText(jDCRegisterDate);
        ((JLabel)jCBGender.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIDActionPerformed
        if(jRadioButtonID.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonIDActionPerformed

    private void jRadioButtonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNameActionPerformed
        if(jRadioButtonName.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonNameActionPerformed

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

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmMembers/back_button_hover.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmMembers/back_button.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        checkJTextFieldFocusGained(txtID);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtFNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameFocusGained
        checkJTextFieldFocusGained(txtFName);
    }//GEN-LAST:event_txtFNameFocusGained

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        checkJTextFieldFocusGained(txtAddress);
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        checkJTextFieldFocusGained(txtPhone);
    }//GEN-LAST:event_txtPhoneFocusGained

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if(evt.getKeyChar()==10)
            searchRecord();
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(evt.getKeyChar()==10 && !this.txtSearch.getText().isEmpty()){
            if(jRadioButtonID.isSelected() == true) RefreshDataID();
            else if(jRadioButtonName.isSelected() == true) RefreshDataName();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE))
            evt.consume();
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void txtLNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameFocusGained
        checkJTextFieldFocusGained(txtLName);
    }//GEN-LAST:event_txtLNameFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        checkJTextFieldFocusGained(txtEmail);
    }//GEN-LAST:event_txtEmailFocusGained

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        resetFields();
    }//GEN-LAST:event_btnDelete1ActionPerformed

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
        tm = new DefaultTableModel(0,0){
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;}
        };
        String s[] = new String[]{"ID","First Name","Last Name","Address","Phone","Email","Gender","Register Date"};
        tm.setColumnIdentifiers(s);
        jTableMembers.setModel(tm);
        jTableMembers.setAutoCreateRowSorter(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < s.length; i++)
            jTableMembers.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    void showRecord(){
        try {
            headerColumn();
            customizeJtable();
            db.rs = db.st.executeQuery("Select mem_id,f_name,l_name,address,phone,email,gender,"
                                      + "register_date from tblmembers");
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
        jTableMembers.setSelectionBackground(new Color(110,174,222));
        jTableMembers.setSelectionForeground(Color.white);
        jTableMembers.setRowHeight(30);
        jTableMembers.setShowGrid(false);
        jTableMembers.setBackground(new Color(193,221,242));
        //customize jtable header row
        ((DefaultTableCellRenderer)jTableMembers.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableMembers.getTableHeader().setBackground(Color.red);
        //jTable_Genre.getTableHeader().setForeground(Color.white);
        jTableMembers.getTableHeader().setFont(new Font("Verdana",Font.BOLD, 12));
        jTableMembers.getTableHeader().setOpaque(false);
        jTableMembers.setFont(new Font("Verdana",Font.PLAIN, 11));
    }
    
    public void inputsChecking(JTextField id,JTextField fname,JTextField lname,JTextField address,
                               JTextField phone,JTextField email,JDateChooser date){
        if(id.getText().isEmpty() || fname.getText().isEmpty() || fname.getText().isEmpty() ||
                address.getText().isEmpty() || phone.getText().isEmpty() ||
                email.getText().isEmpty() || date.getDate() == null){            
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
            if(address.getText().isEmpty()){
                address.setForeground(Color.red);
                address.setText("*address required");                
            }
            if(phone.getText().isEmpty()){
                phone.setForeground(Color.red);
                phone.setText("*phone required");                
            }
            if(email.getText().isEmpty()){
                email.setForeground(Color.red);
                email.setText("*email required");                
            }
        }
        else if(fname.getForeground().equals(Color.red) || lname.getForeground().equals(Color.red) ||
                address.getForeground().equals(Color.red) || phone.getForeground().equals(Color.red) ||
                email.getForeground().equals(Color.red) || date.getForeground().equals(Color.red))
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
    
    public void resetFields(){
        txtID.setText(""+fc.autoId("tblmembers", "mem_id"));
        txtFName.setText("");
        txtLName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        jCBGender.setSelectedIndex(0);
        fc.getDateNow(jDCRegisterDate);
        jLabelImageRead.setIcon(null);
        imagePath = null;
        verification = false;
        memberExist = false;
        retrievedImg = null;
        resetForegroundColor();
    }
    
    private void resetForegroundColor(){
        this.txtID.setForeground(Color.black);
        this.txtFName.setForeground(Color.black);
        this.txtLName.setForeground(Color.black);
        this.txtAddress.setForeground(Color.black);
        this.txtPhone.setForeground(Color.black);
        this.txtEmail.setForeground(Color.black);
    }
    
    public void BrowseImages(JLabel lbj_image){
        //select picture from computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","png");
        fileChooser.addChoosableFileFilter(filter);
        
        int fileState = fileChooser.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION){
            String path =fileChooser.getSelectedFile().getAbsolutePath();
            imagePath = path;
            lbj_image.setIcon(fc.ResizeImage(path, null, lbj_image));
        }
    }//BrosweImage
    
    void searchRecord(){
        jLabelImageRead.setIcon(null);
        try {
            db.pst = db.con.prepareStatement("SELECT * FROM tblmembers WHERE mem_id = ?");
            db.pst.setString(1, txtID.getText());
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                txtFName.setText(db.rs.getString(2));
                txtLName.setText(db.rs.getString(3));
                txtAddress.setText(db.rs.getString(4));
                txtPhone.setText(db.rs.getString(5));
                txtEmail.setText(db.rs.getString(6));
                jCBGender.setSelectedItem(db.rs.getString(7));
                jDCRegisterDate.setDate(fc.stringToDate(db.rs.getString(8)));
                if(db.rs.getBytes(9) != null){
                    retrievedImg = db.rs.getBytes(9);
                    jLabelImageRead.setIcon(fc.ResizeImage(null, retrievedImg, jLabelImageRead));
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No member with this id is found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
            
        }
    }

    void RefreshDataID(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select mem_id,f_name,l_name,address,phone,email,gender,register_date"
                    + "  From tblmembers Where mem_id = '"+txtSearch.getText()+"'");
            if(db.rs.next()){
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
            else JOptionPane.showMessageDialog(rootPane, "No member with this id is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    void RefreshDataName(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select mem_id,f_name,l_name,address,phone,email,gender,register_date"
                    + "  From tblmembers Where f_name Like '%"+txtSearch.getText()+"%' Or l_name Like '%"+txtSearch.getText()+"%' "
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
                v.add(db.rs.getString(7));
                v.add(db.rs.getString(8));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No member with this name is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }

    public void radioButtonsGroup(JRadioButton rb1, JRadioButton rb2, JRadioButton rb3){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
    }
    
    public void getDetailOnTableRowClick(){
        jLabelImageRead.setIcon(null);
        //get selected index row
        int index = jTableMembers.getSelectedRow();
        //get values
        String id = jTableMembers.getValueAt(index, 0).toString();
        String fname = jTableMembers.getValueAt(index, 1).toString();
        String lname = jTableMembers.getValueAt(index, 2).toString();
        String address = jTableMembers.getValueAt(index, 3).toString();
        String phone = jTableMembers.getValueAt(index, 4).toString();
        String email = jTableMembers.getValueAt(index, 5).toString();
        String gender = jTableMembers.getValueAt(index, 6).toString();
        String date = jTableMembers.getValueAt(index, 7).toString();        
        //show value in textfield
        this.txtID.setText(id);
        this.txtFName.setText(fname);
        this.txtLName.setText(lname);
        this.txtAddress.setText(address);
        this.txtPhone.setText(phone);
        if(email != "")
            this.txtEmail.setText(email);
        this.jCBGender.setSelectedItem(gender);
        try {
            this.jDCRegisterDate.setDate(fc.stringToDate(date));
            db.rs = db.st.executeQuery("Select photo From tblmembers Where mem_id = '"+id+"'");
            while(db.rs.next()){
                if(db.rs.getBytes(1) != null){
                    byte[] imgRead = db.rs.getBytes(1);
                    jLabelImageRead.setIcon(fc.ResizeImage(null, imgRead, jLabelImageRead));
                    retrievedImg = imgRead;
                }
                else retrievedImg = null;
            } 
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(FrmMemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemberManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox jCBGender;
    private com.toedter.calendar.JDateChooser jDCRegisterDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImageRead;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JRadioButton jRadioButtonName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JPanel parentContainer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
