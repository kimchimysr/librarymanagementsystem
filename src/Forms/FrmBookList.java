package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmBookList extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    DefaultTableModel tm;
    
    private int posX = 0;
    private int posY = 0;
    
    public FrmBookList() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(153,103,71)));
        this.setLocationRelativeTo(null);
        undecoratedMovableForm();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jRadioButtonISBN = new javax.swing.JRadioButton();
        jRadioButtonTitle = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        btnSearchTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelImageRead = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtQty = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnSearchBetweenDates = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtISBN1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FrmCustomers");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(201, 166, 144));

        jPanel2.setBackground(new java.awt.Color(201, 166, 144));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 103, 71), null), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        jTableMembers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        jRadioButtonISBN.setSelected(true);
        jRadioButtonISBN.setText("ISBN");
        jRadioButtonISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonISBNActionPerformed(evt);
            }
        });

        jRadioButtonTitle.setBackground(new java.awt.Color(201, 166, 144));
        jRadioButtonTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonTitle.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTitle.setText("Title");
        jRadioButtonTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTitleActionPerformed(evt);
            }
        });

        jRadioButtonAll.setBackground(new java.awt.Color(201, 166, 144));
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
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\Downloads\\icons8-books-49.png")); // NOI18N
        jLabel7.setText("Book List");

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

        jLabelImageRead.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImageRead.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 103, 71), null));

        txtTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitle.setText("Title");
        txtTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Title:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtAuthor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAuthor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAuthor.setText("Author");
        txtAuthor.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Author:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtGenre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtGenre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtGenre.setText("Genre");
        txtGenre.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Genre:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Publisher:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtPublisher.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPublisher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPublisher.setText("Publisher");
        txtPublisher.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("ISBN:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtISBN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtISBN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtISBN.setText("ISBN");
        txtISBN.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Price:");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPrice.setText("Price");
        txtPrice.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Qty:");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQty.setText("Qty");
        txtQty.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Recieved Date:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDate.setText("Date");
        txtDate.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Date Recieved between:");

        jDateChooser1.setBackground(new java.awt.Color(201, 166, 144));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setIcon(null);

        jDateChooser2.setBackground(new java.awt.Color(201, 166, 144));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setText("-");

        btnSearchBetweenDates.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_filter_16px.png")); // NOI18N
        btnSearchBetweenDates.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchBetweenDates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchBetweenDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBetweenDatesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("ID:");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtISBN1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtISBN1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtISBN1.setText("ID");
        txtISBN1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonISBN)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBetweenDates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(btnSearchBetweenDates, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtISBN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(txtAuthor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addComponent(txtGenre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(txtPublisher))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(txtPrice))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9)
                                            .addComponent(txtQty))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10)
                                            .addComponent(txtDate)))
                                    .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtISBN1))
                                .addGap(0, 74, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonISBN)
                            .addComponent(jRadioButtonTitle)
                            .addComponent(jRadioButtonAll))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showRecord();
        radioButtonsGroup(jRadioButtonISBN, jRadioButtonTitle, jRadioButtonAll);
        jDateChooser2.setIcon(new ImageIcon(getClass().getResource("/Images/Icons/calendar.png")));
        jDateChooser1.setIcon(new ImageIcon(getClass().getResource("/Images/Icons/calendar.png")));
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonISBNActionPerformed
        if(jRadioButtonISBN.isSelected() == true)
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonISBNActionPerformed

    private void jRadioButtonTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTitleActionPerformed
        if(jRadioButtonTitle.isSelected())
            txtSearch.setEditable(true);
    }//GEN-LAST:event_jRadioButtonTitleActionPerformed

    private void btnSearchTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTableActionPerformed
        if(!this.txtSearch.getText().isEmpty()){
            if(jRadioButtonISBN.isSelected()) RefreshDataISBN();
            else if(jRadioButtonTitle.isSelected()) RefreshDataTitle();
        }        
    }//GEN-LAST:event_btnSearchTableActionPerformed

    private void jRadioButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllActionPerformed
        showRecord();
        txtSearch.setText(null);
        txtSearch.setEditable(false);
    }//GEN-LAST:event_jRadioButtonAllActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmBook/back_button_hover.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new ImageIcon(getClass().getResource("/Images/FrmBook/back_button.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(evt.getKeyChar()==10 && !this.txtSearch.getText().isEmpty()){
            if(jRadioButtonISBN.isSelected()) RefreshDataISBN();
            else if(jRadioButtonTitle.isSelected()) RefreshDataTitle();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void btnSearchBetweenDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBetweenDatesActionPerformed
        if(jDateChooser1.getDate() != null && jDateChooser2.getDate() != null)
            refreshBetweenDates();
    }//GEN-LAST:event_btnSearchBetweenDatesActionPerformed

    void undecoratedMovableForm(){
        this.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                posX=e.getX();
                posY=e.getY();
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
        String s[] = new String[]{"ISBN","Title","Author","Genre","Publisher","Price","Qty","Recieved Date"};
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
            db.rs = db.st.executeQuery("Select b.isbn,b.title,b.author,g.genre,b.publisher,b.price,"
                    + "b.qty,b.recieved_date from tblbooks b,tblgenres g Where g.id=b.genre_id");
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
        jTableMembers.getTableHeader().setBackground(Color.black);
        //jTableMembers.getTableHeader().setForeground(new Color(41,134,204));
        jTableMembers.getTableHeader().setFont(new Font("Verdana",Font.BOLD, 12));
        jTableMembers.getTableHeader().setOpaque(false);
        jTableMembers.setFont(new Font("Verdana",Font.PLAIN, 11));
    }
    
    void RefreshDataISBN(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select isbn,title,author,genre_id,publisher,price,qty,recieved_date"
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
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No book with this ISBN is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }
    void RefreshDataTitle(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select isbn,title,author,genre_id,publisher,price,qty,recieved_date"
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
                tm.addRow(v);
            }
            else JOptionPane.showMessageDialog(rootPane, "No book with this title is found!", "Search Result",2);
        } catch (Exception e) {e.printStackTrace();
        }
    }

    void refreshBetweenDates(){
        try {
            tm.setRowCount(0);
            db.rs = db.st.executeQuery("Select isbn,title,author,genre_id,publisher,price,qty,recieved_date"
                    + "  From tblbooks Where recieved_date Between '"+fc.getDate(jDateChooser1)+"' "
                    + "And '"+fc.getDate(jDateChooser2)+"'");
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
        String isbn = jTableMembers.getValueAt(index, 0).toString();
        String title = jTableMembers.getValueAt(index, 1).toString();
        String author = jTableMembers.getValueAt(index, 2).toString();
        String genre = jTableMembers.getValueAt(index, 3).toString();
        String pub = jTableMembers.getValueAt(index, 4).toString();
        String price = jTableMembers.getValueAt(index, 5).toString();
        String qty = jTableMembers.getValueAt(index, 6).toString();
        String date = jTableMembers.getValueAt(index, 7).toString();
        //show value in textfield
        this.txtISBN.setText(isbn);
        this.txtTitle.setText(fc.stringToHTML(title));
        this.txtAuthor.setText(author);
        this.txtGenre.setText(genre);
        this.txtPublisher.setText(pub);
        this.txtPrice.setText(price);
        this.txtQty.setText(qty);
        this.txtDate.setText(date);
        try {
            db.rs = db.st.executeQuery("Select cover From tblbooks Where isbn = '"+isbn+"'");
            while(db.rs.next()){
                if(db.rs.getBytes(1) != null){
                    byte[] imgRead = db.rs.getBytes(1);
                    jLabelImageRead.setIcon(fc.ResizeImage(null, imgRead, jLabelImageRead));
                }
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
            java.util.logging.Logger.getLogger(FrmBookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmBookList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnSearchBetweenDates;
    private javax.swing.JButton btnSearchTable;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImageRead;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonISBN;
    private javax.swing.JRadioButton jRadioButtonTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtGenre;
    private javax.swing.JLabel txtISBN;
    private javax.swing.JLabel txtISBN1;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtPublisher;
    private javax.swing.JLabel txtQty;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
