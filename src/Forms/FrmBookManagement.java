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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmBookManagement extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    DefaultTableModel tm;
    File selectedFile;
    String imagePath = null;
    boolean verification = false;
    boolean bookExist = false;
    byte[] retrievedImg = null;
    
    private int posX = 0;
    private int posY = 0;
    
    public FrmBookManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(153,103,71)));
        undecoratedMovableForm();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentContainer = new javax.swing.JPanel();
        txtIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtGenreID = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        jLabelBookCover = new javax.swing.JLabel();
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
        jRadioButtonISBN = new javax.swing.JRadioButton();
        jRadioButtonTitle = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        btnSearchTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCBGenre = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        jsQty = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDCDate = new com.toedter.calendar.JDateChooser();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonID = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FrmCustomers");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        parentContainer.setBackground(new java.awt.Color(201, 166, 144));

        txtIsbn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIsbn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIsbn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtIsbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIsbnFocusGained(evt);
            }
        });
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ISBN:");

        txtTitle.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleFocusGained(evt);
            }
        });

        txtAuthor.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtAuthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAuthor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAuthor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAuthorFocusGained(evt);
            }
        });

        txtGenreID.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtGenreID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenreID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtGenreID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenreIDFocusGained(evt);
            }
        });
        txtGenreID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenreIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGenreIDKeyTyped(evt);
            }
        });

        txtPublisher.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPublisher.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPublisher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPublisher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPublisherFocusGained(evt);
            }
        });

        jLabelBookCover.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBookCover.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 103, 71), null));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Book Title:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Author:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Genre:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Publisher:");

        btnSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSearch.setText("<html><center>Search by<br>ID or ISBN</center></html>");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(201, 166, 144));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 103, 71), null), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        jTableMembers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnBrowse.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnBrowse.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_browse_folder_24px_3.png")); // NOI18N
        btnBrowse.setText("Select Cover");
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

        jRadioButtonISBN.setBackground(new java.awt.Color(201, 166, 144));
        jRadioButtonISBN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonISBN.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonISBN.setText("ISBN");
        jRadioButtonISBN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonISBNActionPerformed(evt);
            }
        });

        jRadioButtonTitle.setBackground(new java.awt.Color(201, 166, 144));
        jRadioButtonTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonTitle.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTitle.setText("Title");
        jRadioButtonTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTitleActionPerformed(evt);
            }
        });

        jRadioButtonAll.setBackground(new java.awt.Color(201, 166, 144));
        jRadioButtonAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonAll.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAll.setText("All");
        jRadioButtonAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel3.setBackground(new java.awt.Color(153, 103, 71));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmBook/back_button.png"))); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(153, 103, 71));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_books_emoji_48px.png")); // NOI18N
        jLabel7.setText("Book Management");

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

        jPanel4.setBackground(new java.awt.Color(201, 166, 144));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 103, 71), null));

        btnSave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_add_32px_1.png")); // NOI18N
        btnSave.setText("Add");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_update_32px_2.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_trash_26px_2.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDelete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_reset_32px_1.png")); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        jLabel9.setText("Price:");

        jCBGenre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jCBGenre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCBGenre.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCBGenrePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtPrice.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jsQty.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jsQty.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Quantity:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Recieved Date:");

        jDCDate.setBackground(new java.awt.Color(201, 166, 144));
        jDCDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtID.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ID");

        jRadioButtonID.setBackground(new java.awt.Color(201, 166, 144));
        jRadioButtonID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonID.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonID.setSelected(true);
        jRadioButtonID.setText("ID");
        jRadioButtonID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parentContainerLayout = new javax.swing.GroupLayout(parentContainer);
        parentContainer.setLayout(parentContainerLayout);
        parentContainerLayout.setHorizontalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(parentContainerLayout.createSequentialGroup()
                                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, parentContainerLayout.createSequentialGroup()
                                            .addComponent(txtGenreID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCBGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(parentContainerLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsQty)
                                    .addComponent(txtPrice)
                                    .addComponent(jDCDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addComponent(jRadioButtonID)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonISBN)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAll)
                        .addGap(26, 26, 26)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 543, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        parentContainerLayout.setVerticalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonISBN)
                                .addComponent(jRadioButtonTitle)
                                .addComponent(jRadioButtonAll)
                                .addComponent(jRadioButtonID))
                            .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGap(244, 244, 244)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtGenreID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabelBookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsQty, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jDCDate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parentContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        BrowseImages(jLabelBookCover);
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        bookExist = fc.checkEntryExist("tblbooks",txtID,txtIsbn);
        if(bookExist) JOptionPane.showMessageDialog(rootPane, "Book ID or ISBN already exist!","Duplicate Entry",0);
        else inputsChecking(txtID,txtIsbn,txtTitle,txtAuthor,txtGenreID,txtPublisher,txtPrice,jDCDate);
        if(!bookExist){
            if(verification)
                fc.addRecord("tblbooks", txtID, txtIsbn, txtTitle, txtAuthor, txtGenreID,
                             txtPublisher, txtPrice, jsQty, jDCDate, imagePath);
            else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
        }
        showRecord();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(!txtID.getText().isEmpty() || !txtIsbn.getText().isEmpty())
            searchRecordIDorISBN();
        else JOptionPane.showMessageDialog(rootPane, "ID and ISBN Field are empty!","Error",1);
           
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(this.txtIsbn.getText().isEmpty() && this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter book ID or ISBN!","Empty ID or ISBN Field",0);
        else {
            bookExist = fc.checkEntryExist("tblbooks",txtID,txtIsbn);
            if(!bookExist) JOptionPane.showMessageDialog(rootPane, "Book ID or ISBN does not exist!","No Entry",0);
            else inputsChecking(txtID,txtIsbn,txtTitle,txtAuthor,txtGenreID,txtPublisher,txtPrice,jDCDate);
            if(bookExist){
                if(verification)
                    fc.updateRecord("tblbooks", "isbn", "isbn", "title", "author", "genre_id", "publisher", 
                                    "Price","qty", "recieved_date", "cover", txtIsbn, txtIsbn, txtTitle, txtAuthor, txtGenreID,
                                    txtPublisher, txtPrice, jsQty, jDCDate, imagePath, retrievedImg);
                else JOptionPane.showMessageDialog(rootPane, "Please fill the neccessery fields!","Error Inputs",0);
            }
        }
        showRecord();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(this.txtIsbn.getText().isEmpty() && this.txtID.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please enter book ID or ISBN!","Empty ID or ISBN Field",0);
        else {
            bookExist = fc.checkEntryExist("tblbooks",txtID,txtIsbn);
            if(bookExist){
                fc.deleteRecord("tblbooks", "isbn", txtIsbn);
                resetFields();
            }
            else JOptionPane.showMessageDialog(rootPane, "Book ID or ISBN does not exist!","No Entry",0);
        }
        showRecord();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showRecord();
        radioButtonsGroup(jRadioButtonID, jRadioButtonISBN, jRadioButtonTitle, jRadioButtonAll);
        this.txtID.setText(""+fc.autoId("tblbooks", "id"));
        fc.readFromTableToComboBox("tblgenres","genre", jCBGenre, 2);
        fc.centerjDateChooserText(jDCDate);
        fc.getDateNow(jDCDate);
        ((JLabel)jCBGenre.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)jsQty.getEditor();
        spinnerEditor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        spinnerEditor.setBackground(new Color(201,166,144));
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonISBNActionPerformed
        if(jRadioButtonISBN.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonISBNActionPerformed

    private void jRadioButtonTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTitleActionPerformed
        if(jRadioButtonTitle.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonTitleActionPerformed

    private void btnSearchTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTableActionPerformed
        if(!this.txtSearch.getText().isEmpty()){
            if(jRadioButtonISBN.isSelected()) RefreshDataISBN();
            else if(jRadioButtonTitle.isSelected()) RefreshDataTitle();
            else if(jRadioButtonID.isSelected()) RefreshDataID();
        }        
    }//GEN-LAST:event_btnSearchTableActionPerformed

    private void jRadioButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllActionPerformed
        showRecord();
        txtSearch.setText(null);
        txtSearch.setEditable(false);
    }//GEN-LAST:event_jRadioButtonAllActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmBook/back_button_hover.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrmBook/back_button.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtIsbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIsbnFocusGained
        checkJTextFieldFocusGained(txtIsbn);
    }//GEN-LAST:event_txtIsbnFocusGained

    private void txtTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusGained
        checkJTextFieldFocusGained(txtTitle);
    }//GEN-LAST:event_txtTitleFocusGained

    private void txtAuthorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAuthorFocusGained
        checkJTextFieldFocusGained(txtAuthor);
    }//GEN-LAST:event_txtAuthorFocusGained

    private void txtIsbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnKeyTyped
        if(evt.getKeyChar()==10)
            searchRecordISBN();
    }//GEN-LAST:event_txtIsbnKeyTyped

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(evt.getKeyChar()== 10 && !this.txtSearch.getText().isEmpty()){
            if(jRadioButtonID.isSelected()) RefreshDataID();
            else if(jRadioButtonISBN.isSelected()) RefreshDataISBN();
            else if(jRadioButtonTitle.isSelected()) RefreshDataTitle();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtGenreIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenreIDKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE))
            evt.consume();
    }//GEN-LAST:event_txtGenreIDKeyTyped

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        jTableMembers.isCellEditable(jTableMembers.getSelectedRow(), jTableMembers.getSelectedColumn());
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void txtGenreIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenreIDFocusGained
        checkJTextFieldFocusGained(txtGenreID);
    }//GEN-LAST:event_txtGenreIDFocusGained

    private void txtPublisherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublisherFocusGained
        checkJTextFieldFocusGained(txtPublisher);
    }//GEN-LAST:event_txtPublisherFocusGained

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        checkJTextFieldFocusGained(txtPrice);
    }//GEN-LAST:event_txtPriceFocusGained

    private void jCBGenrePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBGenrePopupMenuWillBecomeInvisible
        fc.selectDataInCombobox("tblgenres", "genre", jCBGenre, txtGenreID, 1);
    }//GEN-LAST:event_jCBGenrePopupMenuWillBecomeInvisible

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        resetFields();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE) && (c != KeyEvent.VK_PERIOD))
            evt.consume();
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtGenreIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenreIDKeyReleased
        try {
                db.rs = db.st.executeQuery("Select genre From tblgenres Where id = '"+txtGenreID.getText().trim()+"'");
                if(db.rs.next()){
                    this.jCBGenre.setSelectedItem(db.rs.getString(1));
                }
            } catch (Exception e) {e.printStackTrace();
            }
    }//GEN-LAST:event_txtGenreIDKeyReleased

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        checkJTextFieldFocusGained(txtID);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) && (c != KeyEvent.VK_BACKSPACE) && (c != KeyEvent.VK_PERIOD))
            evt.consume();
        if(evt.getKeyChar() == 10)
            searchRecordID();
    }//GEN-LAST:event_txtIDKeyTyped

    private void jRadioButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIDActionPerformed
        if(jRadioButtonISBN.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonIDActionPerformed

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
                setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            }
        });
    }
    
    void headerColumn(){
        tm = new DefaultTableModel(0,0){
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;}
        };
        String s[] = new String[]{"ID","ISBN","Title","Author","Genre","Publisher","Price","Qty","Recieved Date"};
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
            db.rs = db.st.executeQuery("Select id,isbn,title,author,genre_id,publisher,price,qty,"
                    + "recieved_date from tblbooks");
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
                v.add(db.rs.getString(9));
                
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
    
    public void inputsChecking(JTextField id,JTextField isbn,JTextField title,JTextField author,
                                JTextField genre,JTextField pub,JTextField price,
                                JDateChooser date){
        if(id.getText().isEmpty() || isbn.getText().isEmpty() || title.getText().isEmpty() || 
                author.getText().isEmpty() || genre.getText().isEmpty() || 
                pub.getText().isEmpty() || price.getText().isEmpty() || 
                date.getDate() == null){            
            this.verification = false;
            if(id.getText().isEmpty()){
                id.setForeground(Color.red);
                id.setText("*id required");
            }
            if(isbn.getText().isEmpty()){
                isbn.setForeground(Color.red);
                isbn.setText("*isbn required");
            }
            if(title.getText().isEmpty()){
                title.setForeground(Color.red);
                title.setText("*title required");                
            }
            if(author.getText().isEmpty()){
                author.setForeground(Color.red);
                author.setText("*author required");                
            }
            if(genre.getText().isEmpty()){
                genre.setForeground(Color.red);
                genre.setText("*id");                
            }
            if(pub.getText().isEmpty()){
                pub.setForeground(Color.red);
                pub.setText("*publisher required");
            }
            if(price.getText().isEmpty()){
                price.setForeground(Color.red);
                price.setText("*price required");
            }
        }
        else if(id.getForeground().equals(Color.red) || isbn.getForeground().equals(Color.red) || 
                title.getForeground().equals(Color.red) || author.getForeground().equals(Color.red) || 
                genre.getForeground().equals(Color.red) || pub.getForeground().equals(Color.red) || 
                price.getForeground().equals(Color.red))
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
        txtID.setText(""+fc.autoId("tblbooks", "id"));
        txtIsbn.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtGenreID.setText("");
        jCBGenre.setSelectedIndex(0);
        txtPublisher.setText("");
        txtPrice.setText("");
        jsQty.setValue(0);
        fc.getDateNow(jDCDate);
        jLabelBookCover.setIcon(null);
        imagePath = null;
        verification = false;
        bookExist = false;
        retrievedImg = null;
        resetForegroundColor();
    }    
    public void BrowseImages(JLabel lbj_image){
        //select picture from computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Book Cover");
        
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
    
    void searchRecordISBN(){
        try {
            db.pst = db.con.prepareStatement("SELECT id,title,author,genre_id,publisher,price,qty,recieved_date,cover"
                    + " FROM tblbooks WHERE isbn = ?");
            db.pst.setString(1, txtIsbn.getText());
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                txtID.setText(db.rs.getString(1));
                txtTitle.setText(db.rs.getString(2));
                txtAuthor.setText(db.rs.getString(3));
                txtGenreID.setText(db.rs.getString(4));
                txtPublisher.setText(db.rs.getString(5));
                txtPrice.setText(db.rs.getString(6));
                jsQty.setValue(Integer.parseInt(db.rs.getString(7)));
                jDCDate.setDate(fc.stringToDate(db.rs.getString(8)));
                if(db.rs.getBytes(9) != null){
                    byte[] img = db.rs.getBytes(9);
                    jLabelBookCover.setIcon(fc.ResizeImage(null, img, jLabelBookCover));
                    retrievedImg = img;
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No book with this ISBN is found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void searchRecordID(){
        try {
            db.pst = db.con.prepareStatement("SELECT isbn,title,author,genre_id,publisher,price,qty,recieved_date,cover"
                    + " FROM tblbooks WHERE id = ?");
            db.pst.setString(1, txtID.getText());
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                txtIsbn.setText(db.rs.getString(1));
                txtTitle.setText(db.rs.getString(2));
                txtAuthor.setText(db.rs.getString(3));
                txtGenreID.setText(db.rs.getString(4));
                txtPublisher.setText(db.rs.getString(5));
                txtPrice.setText(db.rs.getString(6));
                jsQty.setValue(Integer.parseInt(db.rs.getString(7)));
                jDCDate.setDate(fc.stringToDate(db.rs.getString(8)));
                if(db.rs.getBytes(9) != null){
                    byte[] img = db.rs.getBytes(9);
                    jLabelBookCover.setIcon(fc.ResizeImage(null, img, jLabelBookCover));
                    retrievedImg = img;
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No book with this ID is found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
            
        }
    }
    
    void searchRecordIDorISBN(){
        try {
            db.pst = db.con.prepareStatement("SELECT id,isbn,title,author,genre_id,publisher,price,qty,recieved_date,cover"
                    + " FROM tblbooks WHERE id = ? Or isbn = ?");
            db.pst.setString(1, txtID.getText());
            db.pst.setString(2, txtIsbn.getText());
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                txtID.setText(db.rs.getString(1));
                txtIsbn.setText(db.rs.getString(2));
                txtTitle.setText(db.rs.getString(3));
                txtAuthor.setText(db.rs.getString(4));
                txtGenreID.setText(db.rs.getString(5));
                txtPublisher.setText(db.rs.getString(6));
                txtPrice.setText(db.rs.getString(7));
                jsQty.setValue(Integer.parseInt(db.rs.getString(8)));
                jDCDate.setDate(fc.stringToDate(db.rs.getString(9)));
                if(db.rs.getBytes(10) != null){
                    byte[] img = db.rs.getBytes(10);
                    jLabelBookCover.setIcon(fc.ResizeImage(null, img, jLabelBookCover));
                    retrievedImg = img;
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No book with this ID or ISBN is found!", "Search Result",2);
            }
        } catch (Exception e) {e.printStackTrace();
            
        }
    }
    
    void RefreshDataID(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select id,isbn,title,author,genre_id,publisher,price,qty,recieved_date"
                    + "  From tblbooks Where id = '"+txtSearch.getText()+"'");
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
                v.add(db.rs.getString(9));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No book with this ID is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void RefreshDataISBN(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select id,isbn,title,author,genre_id,publisher,price,qty,recieved_date"
                    + "  From tblbooks Where isbn = '"+txtSearch.getText()+"'");
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
                v.add(db.rs.getString(9));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No book with this ISBN is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    void RefreshDataTitle(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select id,isbn,title,author,genre_id,publisher,price,qty,recieved_date"
                    + "  From tblbooks Where title Like '%"+txtSearch.getText()+"%'");
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
                v.add(db.rs.getString(9));
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No book with this title is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }

    public void radioButtonsGroup(JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        buttonGroup.add(rb4);
    }
    
    public void getDetailOnTableRowClick(){
        resetForegroundColor();
        jLabelBookCover.setIcon(null);
        //get selected index row
        int index = jTableMembers.getSelectedRow();
        //get values
        String id = jTableMembers.getValueAt(index, 0).toString();
        String isbn = jTableMembers.getValueAt(index, 1).toString();
        String title = jTableMembers.getValueAt(index, 2).toString();
        String author = jTableMembers.getValueAt(index, 3).toString();
        String genre_id = jTableMembers.getValueAt(index, 4).toString();
        String publisher = jTableMembers.getValueAt(index, 5).toString();
        String price = jTableMembers.getValueAt(index, 6).toString();
        String qty = jTableMembers.getValueAt(index, 7).toString();
        String date = jTableMembers.getValueAt(index, 8).toString();
        //show value in textfield
        this.txtID.setText(id);
        this.txtIsbn.setText(isbn);
        this.txtTitle.setText(title);
        this.txtAuthor.setText(author);
        this.txtGenreID.setText(genre_id);
        this.txtPublisher.setText(publisher);
        this.txtPrice.setText(price);
        this.jsQty.setValue(Float.parseFloat(qty));
        try {  
        this.jDCDate.setDate(fc.stringToDate(date));
            db.rs = db.st.executeQuery("Select genre_id,cover From tblbooks Where isbn='"+isbn+"'");
            while(db.rs.next()){
                if(db.rs.getString(1) != null){
                    String genre = db.rs.getString(1);
                    this.jCBGenre.setSelectedItem(genre);
                }
                if(db.rs.getBytes(2) != null){
                    byte[] imgRead = db.rs.getBytes(2);
                    jLabelBookCover.setIcon(fc.ResizeImage(null, imgRead, jLabelBookCover));
                    retrievedImg = imgRead;
                }
                else retrievedImg = null;
            } 
        } catch (Exception e) {
        }
    }
    
    private void resetForegroundColor(){
        this.txtID.setForeground(Color.black);
        this.txtIsbn.setForeground(Color.black);
        this.txtTitle.setForeground(Color.black);
        this.txtAuthor.setForeground(Color.black);
        this.txtGenreID.setForeground(Color.black);
        this.txtPrice.setForeground(Color.black);
        this.txtPublisher.setForeground(Color.black);
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
            java.util.logging.Logger.getLogger(FrmBookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBookManagement().setVisible(true);
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
    private javax.swing.JComboBox jCBGenre;
    private com.toedter.calendar.JDateChooser jDCDate;
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
    private javax.swing.JLabel jLabelBookCover;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JRadioButton jRadioButtonISBN;
    private javax.swing.JRadioButton jRadioButtonTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JSpinner jsQty;
    private javax.swing.JPanel parentContainer;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtGenreID;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
