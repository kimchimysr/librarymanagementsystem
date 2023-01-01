package Forms;

import Classes.ConnectionMySQL;
import Classes.FunctionCode;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class FrmDashboard extends javax.swing.JFrame {

    ConnectionMySQL db = new ConnectionMySQL();
    FunctionCode fc = new FunctionCode();
    
    public static final String DATE_FORMAT_NOW = "EEEE | dd/MMM/yyyy | hh:mm:ss a";
    Timer t,tl;
    Timer timer;
    
    private JLabel[] lbl_Covers = new JLabel[4];
    
    public FrmDashboard() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Main = new javax.swing.JPanel();
        jPanel_Nav = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddMember = new javax.swing.JLabel();
        btnManageMember = new javax.swing.JLabel();
        btnDeleteMember = new javax.swing.JLabel();
        btnMemberList = new javax.swing.JLabel();
        btnBookList = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JLabel();
        btnManageBook = new javax.swing.JLabel();
        btnDeleteBook = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnManageGenre = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnIssueBook = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnReturnBook = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnPrintReport = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnAccountManagement1 = new javax.swing.JLabel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JLabel();
        jPanel_Books = new javax.swing.JPanel();
        jPanel_BookHeader = new javax.swing.JPanel();
        lblBook = new javax.swing.JLabel();
        lblBookAmount = new javax.swing.JLabel();
        jPanel_Member = new javax.swing.JPanel();
        jPanel_MemberHeader = new javax.swing.JPanel();
        lblMembers = new javax.swing.JLabel();
        lblMemberAmount = new javax.swing.JLabel();
        jPanel_IssueBook = new javax.swing.JPanel();
        jPanel_IssueBookHeader = new javax.swing.JPanel();
        lblIssueBooks = new javax.swing.JLabel();
        lblIssueBookAmount = new javax.swing.JLabel();
        jPanel_NotReturn = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNotReturn = new javax.swing.JLabel();
        lblNotReturnAmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblImage1 = new javax.swing.JLabel();
        lblImage2 = new javax.swing.JLabel();
        lblImage3 = new javax.swing.JLabel();
        lblImage4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Main.setBackground(new java.awt.Color(238, 238, 238));

        jPanel_Nav.setBackground(new java.awt.Color(81, 88, 96));

        jLabel_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 210, 211));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_navigation_16px.png")); // NOI18N
        jLabel2.setText("NAVIGATION");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_member_24px.png")); // NOI18N
        jLabel1.setText("Members");

        btnAddMember.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAddMember.setForeground(new java.awt.Color(208, 210, 211));
        btnAddMember.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_add_user_group_man_man_24px.png")); // NOI18N
        btnAddMember.setText("Add New Member");
        btnAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnManageMember.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnManageMember.setForeground(new java.awt.Color(208, 210, 211));
        btnManageMember.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_edit_profile_24px.png")); // NOI18N
        btnManageMember.setText("Manage Member");

        btnDeleteMember.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnDeleteMember.setForeground(new java.awt.Color(208, 210, 211));
        btnDeleteMember.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_delete_user_male_24px.png")); // NOI18N
        btnDeleteMember.setText("Delete Member");

        btnMemberList.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnMemberList.setForeground(new java.awt.Color(208, 210, 211));
        btnMemberList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_people_24px_2.png")); // NOI18N
        btnMemberList.setText("Members List");

        btnBookList.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBookList.setForeground(new java.awt.Color(208, 210, 211));
        btnBookList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_books_26px.png")); // NOI18N
        btnBookList.setText("Books List");
        btnBookList.setIconTextGap(2);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_books_24px_2.png")); // NOI18N
        jLabel8.setText("Books");

        btnAddBook.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(208, 210, 211));
        btnAddBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_book_and_pencil_24px_3.png")); // NOI18N
        btnAddBook.setText("Add New Book");

        btnManageBook.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnManageBook.setForeground(new java.awt.Color(208, 210, 211));
        btnManageBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_book_reading_24px.png")); // NOI18N
        btnManageBook.setText("Manage Book");

        btnDeleteBook.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnDeleteBook.setForeground(new java.awt.Color(208, 210, 211));
        btnDeleteBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_remove_book_24px_3.png")); // NOI18N
        btnDeleteBook.setText("Delete Book");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_sorting_24px.png")); // NOI18N
        jLabel13.setText("Genres");

        btnManageGenre.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnManageGenre.setForeground(new java.awt.Color(208, 210, 211));
        btnManageGenre.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_elective_24px.png")); // NOI18N
        btnManageGenre.setText("Manage Genre");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_book_24px_1.png")); // NOI18N
        jLabel15.setText("Issues");

        btnIssueBook.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnIssueBook.setForeground(new java.awt.Color(208, 210, 211));
        btnIssueBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_knowledge_sharing_24px.png")); // NOI18N
        btnIssueBook.setText("Issue Book");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_return_24px.png")); // NOI18N
        jLabel17.setText("Return");

        btnReturnBook.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnReturnBook.setForeground(new java.awt.Color(208, 210, 211));
        btnReturnBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_borrow_book_24px_1.png")); // NOI18N
        btnReturnBook.setText("Return Book");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_administrative_tools_24px.png")); // NOI18N
        jLabel19.setText("Tool");

        btnPrintReport.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnPrintReport.setForeground(new java.awt.Color(208, 210, 211));
        btnPrintReport.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_print_24px.png")); // NOI18N
        btnPrintReport.setText("Print Reports");

        lblTime.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Time:");
        lblTime.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnAccountManagement1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAccountManagement1.setForeground(new java.awt.Color(208, 210, 211));
        btnAccountManagement1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_user_secured_24px.png")); // NOI18N
        btnAccountManagement1.setText("User Management");

        javax.swing.GroupLayout jPanel_NavLayout = new javax.swing.GroupLayout(jPanel_Nav);
        jPanel_Nav.setLayout(jPanel_NavLayout);
        jPanel_NavLayout.setHorizontalGroup(
            jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnAccountManagement1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavLayout.createSequentialGroup()
                                .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                                        .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addComponent(btnManageBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                                        .addComponent(btnDeleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addComponent(btnManageGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavLayout.createSequentialGroup()
                                .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel_NavLayout.createSequentialGroup()
                                .addComponent(btnBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel_NavLayout.createSequentialGroup()
                .addComponent(jLabel_Logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_NavLayout.createSequentialGroup()
                .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_NavLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_NavLayout.setVerticalGroup(
            jPanel_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NavLayout.createSequentialGroup()
                .addComponent(jLabel_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMemberList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBookList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIssueBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturnBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAccountManagement1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Header.setBackground(new java.awt.Color(81, 88, 96));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dashboard");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome Back, ");

        lblUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("User");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/refresh.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_Books.setBackground(new java.awt.Color(114, 158, 209));

        jPanel_BookHeader.setBackground(new java.awt.Color(80, 134, 198));

        lblBook.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setText("Books");

        javax.swing.GroupLayout jPanel_BookHeaderLayout = new javax.swing.GroupLayout(jPanel_BookHeader);
        jPanel_BookHeader.setLayout(jPanel_BookHeaderLayout);
        jPanel_BookHeaderLayout.setHorizontalGroup(
            jPanel_BookHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BookHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_BookHeaderLayout.setVerticalGroup(
            jPanel_BookHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBook, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblBookAmount.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblBookAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblBookAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookAmount.setText("00");

        javax.swing.GroupLayout jPanel_BooksLayout = new javax.swing.GroupLayout(jPanel_Books);
        jPanel_Books.setLayout(jPanel_BooksLayout);
        jPanel_BooksLayout.setHorizontalGroup(
            jPanel_BooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BookHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_BooksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBookAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_BooksLayout.setVerticalGroup(
            jPanel_BooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BooksLayout.createSequentialGroup()
                .addComponent(jPanel_BookHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBookAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Member.setBackground(new java.awt.Color(108, 203, 189));

        jPanel_MemberHeader.setBackground(new java.awt.Color(72, 191, 173));

        lblMembers.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMembers.setForeground(new java.awt.Color(255, 255, 255));
        lblMembers.setText("Members");

        javax.swing.GroupLayout jPanel_MemberHeaderLayout = new javax.swing.GroupLayout(jPanel_MemberHeader);
        jPanel_MemberHeader.setLayout(jPanel_MemberHeaderLayout);
        jPanel_MemberHeaderLayout.setHorizontalGroup(
            jPanel_MemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMembers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_MemberHeaderLayout.setVerticalGroup(
            jPanel_MemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMembers, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblMemberAmount.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblMemberAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberAmount.setText("00");

        javax.swing.GroupLayout jPanel_MemberLayout = new javax.swing.GroupLayout(jPanel_Member);
        jPanel_Member.setLayout(jPanel_MemberLayout);
        jPanel_MemberLayout.setHorizontalGroup(
            jPanel_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MemberHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_MemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMemberAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_MemberLayout.setVerticalGroup(
            jPanel_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MemberLayout.createSequentialGroup()
                .addComponent(jPanel_MemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMemberAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_IssueBook.setBackground(new java.awt.Color(255, 223, 50));

        jPanel_IssueBookHeader.setBackground(new java.awt.Color(229, 193, 0));

        lblIssueBooks.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblIssueBooks.setForeground(new java.awt.Color(255, 255, 255));
        lblIssueBooks.setText("Issued Books");

        javax.swing.GroupLayout jPanel_IssueBookHeaderLayout = new javax.swing.GroupLayout(jPanel_IssueBookHeader);
        jPanel_IssueBookHeader.setLayout(jPanel_IssueBookHeaderLayout);
        jPanel_IssueBookHeaderLayout.setHorizontalGroup(
            jPanel_IssueBookHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_IssueBookHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIssueBooks)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel_IssueBookHeaderLayout.setVerticalGroup(
            jPanel_IssueBookHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIssueBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblIssueBookAmount.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblIssueBookAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblIssueBookAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIssueBookAmount.setText("00");

        javax.swing.GroupLayout jPanel_IssueBookLayout = new javax.swing.GroupLayout(jPanel_IssueBook);
        jPanel_IssueBook.setLayout(jPanel_IssueBookLayout);
        jPanel_IssueBookLayout.setHorizontalGroup(
            jPanel_IssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_IssueBookHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_IssueBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIssueBookAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_IssueBookLayout.setVerticalGroup(
            jPanel_IssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_IssueBookLayout.createSequentialGroup()
                .addComponent(jPanel_IssueBookHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIssueBookAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_NotReturn.setBackground(new java.awt.Color(218, 99, 99));

        jPanel4.setBackground(new java.awt.Color(209, 61, 61));

        lblNotReturn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNotReturn.setForeground(new java.awt.Color(255, 255, 255));
        lblNotReturn.setText("Not Returned");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNotReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNotReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblNotReturnAmount.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblNotReturnAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblNotReturnAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotReturnAmount.setText("00");

        javax.swing.GroupLayout jPanel_NotReturnLayout = new javax.swing.GroupLayout(jPanel_NotReturn);
        jPanel_NotReturn.setLayout(jPanel_NotReturnLayout);
        jPanel_NotReturnLayout.setHorizontalGroup(
            jPanel_NotReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_NotReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNotReturnAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_NotReturnLayout.setVerticalGroup(
            jPanel_NotReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NotReturnLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNotReturnAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Synir\\AppData\\Local\\Temp\\icons8_library_24px_1.png")); // NOI18N
        jLabel5.setText("Library Management System,");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Developed By Kim Chimy");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Version 1.0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(57, 163, 183));

        jPanel3.setBackground(new java.awt.Color(8, 141, 165));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Latest Book Added");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
        jPanel_Main.setLayout(jPanel_MainLayout);
        jPanel_MainLayout.setHorizontalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addComponent(jPanel_Nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addComponent(jPanel_Books, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_IssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_NotReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_MainLayout.setVerticalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Books, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_NotReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_IssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showTime();
        hoverEffect();
        displayInfo();
        this.lblUser.setText(FrmLogin.username);
        if(FrmLogin.userType.equals("admin"))
            this.btnAccountManagement1.setEnabled(true);
        else this.btnAccountManagement1.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    void displayInfo(){
        showCount("tblbooks",lblBookAmount);
        showCount("tblmembers", lblMemberAmount);
        showCount("tblissuebooks", lblIssueBookAmount);
        showCount("tblissuebooks","Issued", lblNotReturnAmount);
        displayBookCover();
    }
    
    void showCount(String tbl, JLabel jlb){
        try {
            db.rs = db.st.executeQuery("Select Count(*) From "+tbl+"");
            while(db.rs.next())
            jlb.setText(db.rs.getString(1));
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void showCount(String tbl, String status, JLabel jlb){
        try {
            db.rs = db.st.executeQuery("Select Count(*) From "+tbl+" Where status='"+status+"'");
            while(db.rs.next())
            jlb.setText(db.rs.getString(1));
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void displayBookCover(){
        lbl_Covers[0] = lblImage1;
        lbl_Covers[1] = lblImage2;
        lbl_Covers[2] = lblImage3;
        lbl_Covers[3] = lblImage4;
        try {
            String title;
            byte[] image;
            int i = 0;
            db.rs = db.st.executeQuery("Select title,cover From tblbooks Order By id DESC Limit 4 ");
            while(db.rs.next()){
                title = db.rs.getString("title");
                image = db.rs.getBytes("cover");
                if(image != null)
                    lbl_Covers[i].setIcon(fc.ResizeImage(null, image, lbl_Covers[i]));
                else lbl_Covers[i].setText(title);
                i++;
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
    
    void hoverEffect(){
        hoverEffectOnMenu(btnAddMember, new FrmMemberRegistration());
        hoverEffectOnMenu(btnManageMember, new FrmMemberManagement());
        hoverEffectOnMenu(btnDeleteMember, new FrmMemberDeletion());
        hoverEffectOnMenu(btnMemberList, new FrmMemberList());
        hoverEffectOnMenu(btnAddBook, new FrmBookRegisteration());
        hoverEffectOnMenu(btnManageBook, new FrmBookManagement());
        hoverEffectOnMenu(btnDeleteBook, new FrmBookDeletion());
        hoverEffectOnMenu(btnBookList, new FrmBookList());
        hoverEffectOnMenu(btnManageGenre, new FrmGenre());
        hoverEffectOnMenu(btnIssueBook, new FrmIssueBook());
        hoverEffectOnMenu(btnReturnBook, new FrmReturnBook());
        hoverEffectOnMenu(btnPrintReport, new FrmPrintPreview());
        if(FrmLogin.userType.equals("admin"))
            hoverEffectOnMenu(btnAccountManagement1, new FrmAccountManagement());
        hoverEffectOnBtn(btnRefresh);
    }
    void hoverEffectOnBtn(JLabel jlb){
        jlb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jlb.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            jlb.setIcon(new ImageIcon(getClass().getResource("/Images/Icons/refresh_hover.png")));
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            displayInfo();
        }
        @Override
        public void mouseExited(MouseEvent e) {
            jlb.setIcon(new ImageIcon(getClass().getResource("/Images/Icons/refresh.png")));
        }
    });
    }
    void hoverEffectOnMenu(JLabel jlb, JFrame jf){
        jlb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jlb.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            jlb.setForeground(new Color(255,255,255));
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            jf.setVisible(true);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            //jlb.setFont(new Font("SansSerif", Font.BOLD, 13));
            jlb.setForeground(new Color(208,210,211));
        }
    });
    }
    
    void showTime(){
        tl = new Timer(1000, new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            lblTime.setText(timeNow());
                        }
        });
        tl.start();
    }
    
    public static String timeNow(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTimeInMillis());
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
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAccountManagement1;
    private javax.swing.JLabel btnAddBook;
    private javax.swing.JLabel btnAddMember;
    private javax.swing.JLabel btnBookList;
    private javax.swing.JLabel btnDeleteBook;
    private javax.swing.JLabel btnDeleteMember;
    private javax.swing.JLabel btnIssueBook;
    private javax.swing.JLabel btnManageBook;
    private javax.swing.JLabel btnManageGenre;
    private javax.swing.JLabel btnManageMember;
    private javax.swing.JLabel btnMemberList;
    private javax.swing.JLabel btnPrintReport;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JLabel btnReturnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_BookHeader;
    private javax.swing.JPanel jPanel_Books;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_IssueBook;
    private javax.swing.JPanel jPanel_IssueBookHeader;
    private javax.swing.JPanel jPanel_Main;
    private javax.swing.JPanel jPanel_Member;
    private javax.swing.JPanel jPanel_MemberHeader;
    private javax.swing.JPanel jPanel_Nav;
    private javax.swing.JPanel jPanel_NotReturn;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBookAmount;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblImage3;
    private javax.swing.JLabel lblImage4;
    private javax.swing.JLabel lblIssueBookAmount;
    private javax.swing.JLabel lblIssueBooks;
    private javax.swing.JLabel lblMemberAmount;
    private javax.swing.JLabel lblMembers;
    private javax.swing.JLabel lblNotReturn;
    private javax.swing.JLabel lblNotReturnAmount;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
