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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmMemberList extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    DefaultTableModel tm;
    
    int posX = 0;
    int posY = 0;
    
    public FrmMemberList() {
        initComponents();
        setLocationRelativeTo(null);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(41,134,204)));
        undecoratedMovableForm();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jRadioButtonID = new javax.swing.JRadioButton();
        jRadioButtonName = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        btnSearchTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelImageRead = new javax.swing.JLabel();
        txtFName = new javax.swing.JLabel();
        txtGender = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtGender1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtLName = new javax.swing.JLabel();
        txtTel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(111, 175, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(111, 175, 223), null), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 12))); // NOI18N

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnSearchTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_26px.png")); // NOI18N
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
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_search_client_60px_1.png")); // NOI18N
        jLabel7.setText("Member List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelImageRead.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImageRead.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(111, 175, 223), null));

        txtFName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtFName.setText("FName");

        txtGender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtGender.setText("Gender");

        lblTel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblTel.setText("Tel:");

        lblEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblEmail.setText("Email:");

        lblAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblAdd.setText("Address:");

        lblDate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblDate.setText("Register Date:");

        lblName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblName.setText("First Name:");

        txtGender1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtGender1.setText("Gender:");

        lblName1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblName1.setText("Last Name:");

        txtLName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtLName.setText("LName");

        txtTel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtTel.setText("Tel");

        txtEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtEmail.setText("Email");

        txtAddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtAddress.setText("Address");

        txtDate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtDate.setText("Register Date");

        javax.swing.GroupLayout parentContainerLayout = new javax.swing.GroupLayout(parentContainer);
        parentContainer.setLayout(parentContainerLayout);
        parentContainerLayout.setHorizontalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addComponent(lblAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAddress))
                                    .addGroup(parentContainerLayout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail)))
                                .addGap(78, 78, 78))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addComponent(txtGender1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGender))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addComponent(lblTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel))
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLName)
                                    .addComponent(txtFName)))
                            .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(parentContainerLayout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate))))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addComponent(jRadioButtonID)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonName)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAll)
                        .addGap(26, 26, 26)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parentContainerLayout.setVerticalGroup(
            parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentContainerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButtonID)
                        .addComponent(jRadioButtonName)
                        .addComponent(jRadioButtonAll))
                    .addComponent(btnSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parentContainerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelImageRead, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFName)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(txtLName))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender1)
                            .addComponent(txtGender))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(txtTel))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdd)
                            .addComponent(txtAddress))
                        .addGap(18, 18, 18)
                        .addGroup(parentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parentContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showRecord();
        radioButtonsGroup(jRadioButtonID, jRadioButtonName, jRadioButtonAll);
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

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(evt.getKeyChar()==10 && !this.txtSearch.getText().isEmpty()){
            if(jRadioButtonID.isSelected() == true) RefreshDataID();
            else if(jRadioButtonName.isSelected() == true) RefreshDataName();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        getDetailOnTableRowClick();
    }//GEN-LAST:event_jTableMembersMouseClicked

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
        jTableMembers.getTableHeader().setBackground(Color.black);
        //jTableMembers.getTableHeader().setForeground(new Color(41,134,204));
        jTableMembers.getTableHeader().setFont(new Font("Verdana",Font.BOLD, 12));
        jTableMembers.getTableHeader().setOpaque(false);
        jTableMembers.setFont(new Font("Verdana",Font.PLAIN, 11));
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
                    + "  From tblmembers Where f_name Like '%"+txtSearch.getText()+"%' Or l_name Like '%"+txtSearch.getText()+"%'");
            if(db.rs.next()){
                Vector<String> v = new Vector<String>();
                v.add(db.rs.getString(1)); //id
                v.add(db.rs.getString(2)); //name
                v.add(db.rs.getString(3)); //name
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
        this.txtFName.setText(fname);
        this.txtLName.setText(lname);
        this.txtAddress.setText(fc.stringToHTML(address));
        this.txtTel.setText(phone);
        if(email != null)
            this.txtEmail.setText(fc.stringToHTML(email));
        this.txtGender.setText(gender);
        this.txtDate.setText(date);
        try {
            db.rs = db.st.executeQuery("Select photo From tblmembers Where mem_id = '"+id+"'");
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
            java.util.logging.Logger.getLogger(FrmMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmMemberList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnSearchTable;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImageRead;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JRadioButton jRadioButtonName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel parentContainer;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtFName;
    private javax.swing.JLabel txtGender;
    private javax.swing.JLabel txtGender1;
    private javax.swing.JLabel txtLName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTel;
    // End of variables declaration//GEN-END:variables
}
