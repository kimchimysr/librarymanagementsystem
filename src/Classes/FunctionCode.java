package Classes;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;

public class FunctionCode {
    ConnectionMySQL db = new ConnectionMySQL();
    
    //function to display image in jlabel
    public void displayImage(String imgPath, JLabel label){
        //get image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imgPath));
        //make image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        //set image to jlabel
        label.setIcon(new ImageIcon(image));
    }
    
    public int autoId(String tb, String col){
        int id = 0;
        try {
            db.pst = db.con.prepareStatement("Select Max("+col+") From "+tb+"");
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                id = db.rs.getInt(1);
                if(id >= 0)
                    id += 1;
            }
        } catch (Exception e) {e.printStackTrace();
        }
        return id;
    }//autoId
    
    public void showCheckPassword(JCheckBox jcb, JPasswordField jpf){
        if(jcb.isSelected())
            jpf.setEchoChar((char)0);
        else
            jpf.setEchoChar('*');
    }
    
    //add genre
    public void addRecord(String tb, JTextField tf1, JTextField tf2){
        try {
            db.pst = db.con.prepareStatement("Insert Ignore into "+tb+" Values(?,?)");
            db.pst.setString(1, tf1.getText().trim());
            db.pst.setString(2, tf2.getText().trim());
            
            db.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Added!");            
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Add Record!");
        }
    }//add
    
    //add new member
    public void addRecord(String tb, JTextField tf1, JTextField tf2, JTextField tf3, JTextField tf4,
                          JTextField tf5,  JTextField tf6, JComboBox jcb7, JDateChooser jdc8, String imgPath){
        byte[] img = null;
        try {
            if(imgPath != null){
                Path path = Paths.get(imgPath);
                img = Files.readAllBytes(path);
            }            
            db.pst = db.con.prepareStatement("Insert Ignore into "+tb+" Values(?,?,?,?,?,?,?,?,?)");
            db.pst.setString(1, tf1.getText().trim());
            db.pst.setString(2, tf2.getText().trim());
            db.pst.setString(3, tf3.getText().trim());
            db.pst.setString(4, tf4.getText().trim());
            db.pst.setString(5, tf5.getText().trim());
            db.pst.setString(6, tf6.getText().trim());
            db.pst.setString(7, jcb7.getSelectedItem().toString().trim());
            db.pst.setString(8, getDate(jdc8).trim());
            db.pst.setBytes(9, img);
            
            db.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Added!");            
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Add Record!");
        }
    }
    
    //add book
    public void addRecord(String tb1, JTextField tf1, JTextField tf2, JTextField tf3, JTextField tf4,
                          JTextField tf5, JTextField tf6, JTextField tf7, JSpinner js8, JDateChooser jdc9,
                          String imgPath){
        byte[] img = null;
        try {
            db.rs = db.st.executeQuery("Select * From tblbooks Where isbn = '"+tf1.getText()+"'");
            if(db.rs.next()){
                JOptionPane.showMessageDialog(null, "This ISBN already exists!");
            }
            else {
                if(imgPath != null){
                    Path path = Paths.get(imgPath);
                    img = Files.readAllBytes(path);
                }
                db.pst = db.con.prepareStatement("Insert into "+tb1+" Values(?,?,?,?,?,?,?,?,?,?)");
                db.pst.setString(1, tf1.getText().trim());
                db.pst.setString(2, tf2.getText().trim());
                db.pst.setString(3, tf3.getText().trim());
                db.pst.setString(4, tf4.getText().trim());
                db.pst.setString(5, tf5.getText().trim());            
                db.pst.setString(6, tf6.getText().trim());
                db.pst.setString(8, tf7.getText().trim());
                db.pst.setString(7, js8.getValue().toString());
                db.pst.setString(9, getDate(jdc9).trim());
                db.pst.setBytes(10, img);

                db.pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Book Added!");
            }
                        
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Add Book!");
        }
    }
    
    //add issue book
    public void addRecord(String tb, JTextField tf1, JTextField tf2, JTextField tf3, String tf4,
                          JDateChooser jdc5, JDateChooser jdc6){
        try {
            db.pst = db.con.prepareStatement("Insert into "+tb+" (issue_id,book_id,mem_id,status,"
                    + "issue_date,due_date,return_date,fine) Values(?,?,?,?,?,?,?,?)");
            db.pst.setString(1, tf1.getText().trim());
            db.pst.setString(2, tf2.getText().trim());
            db.pst.setString(3, tf3.getText().trim());
            db.pst.setString(4, tf4.trim());
            db.pst.setString(5, getDate(jdc5).trim());
            db.pst.setString(6, getDate(jdc6).trim());
            db.pst.setString(7, null);
            db.pst.setString(8, null);
            
            db.pst.executeUpdate();
            db.st.execute("Update tblbooks Set qty = GREATEST(0,qty-1) Where id='"+tf2.getText().trim()+"'");
            JOptionPane.showMessageDialog(null, "Issue Book Succesfully!");            
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Issue Book!");
        }
    }//add
    
    //add user
    public void addRecord(String tb, JTextField id, JTextField fn, JTextField ln, JTextField user,
                          JPasswordField pass, JCheckBox admin){
        String password = new String(pass.getPassword());
        try {
            db.pst = db.con.prepareStatement("Insert into "+tb+" (u_id,f_name,l_name,username,"
                    + "password,account_type) Values(?,?,?,?,?,?)");
            db.pst.setString(1, id.getText().trim());
            db.pst.setString(2, fn.getText().trim());
            db.pst.setString(3, ln.getText().trim());
            db.pst.setString(4, user.getText().trim());
            db.pst.setString(5, password.trim());
            if(admin.isSelected())
                db.pst.setString(6, "admin");
            else db.pst.setString(6, "user");
            
            db.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add User Succesfully!");            
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Add User!");
        }
    }//add
    
    //update genre
    public void updateRecord(String tb, String cs,
                             String col1, String col2,
                             JTextField ts,
                             JTextField tf1, JTextField tf2){
        int option;
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                db.pst = db.con.prepareStatement
                ("Update "+tb+" Set "+col1+"=?,"+col2+"=? Where "+cs+"='"+ts.getText()+"'");
                db.pst.setString(1, tf1.getText());
                db.pst.setString(2, tf2.getText());
                
                db.pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated!");                
            }
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Update Record!");
        }
    }//update
    
    //update member
    public void updateRecord(String tb, String cs,JTextField ts,
                             String col1,String col2,String col3,String col4,
                             String col5,String col6,String col7,String col8,String col9,
                             JTextField tf1,JTextField tf2,JTextField tf3,JTextField tf4,
                             JTextField tf5,JTextField tf6,JComboBox jcb7,JDateChooser jdc8,
                             String imgPath,byte[] pic){
        byte[] img = null;
        int option; 
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                if(imgPath != null){
                    Path path = Paths.get(imgPath);
                    img = Files.readAllBytes(path);
                }else img = pic;
                db.pst = db.con.prepareStatement
                ("Update "+tb+" Set "+col1+"=?,"+col2+"=?,"+col3+"=?,"+col4+"=?,"+col5+"=?,"
                    + ""+col6+"=?,"+col7+"=?,"+col8+"=?,"+col9+"=? Where "+cs+"='"+ts.getText()+"'");
                db.pst.setString(1, tf1.getText().trim());
                db.pst.setString(2, tf2.getText().trim());
                db.pst.setString(3, tf3.getText().trim());
                db.pst.setString(4, tf4.getText().trim());
                db.pst.setString(5, tf5.getText().trim());
                db.pst.setString(6, tf6.getText().trim());
                db.pst.setString(7, jcb7.getSelectedItem().toString());
                db.pst.setString(8, getDate(jdc8).trim());
                db.pst.setBytes(9, img);
                
                if(db.pst.executeUpdate() == 1)
                    JOptionPane.showMessageDialog(null, "Record Updated!");
                else JOptionPane.showMessageDialog(null, "Cannot Update Record!");
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }//update
    
    //update book
    public void updateRecord(String tb, String cs,
                             String col1,String col2,String col3,String col4,String col5,
                             String col6,String col7,String col8,String col9,
                             JTextField ts,
                             JTextField tf1,JTextField tf2,JTextField tf3,JTextField tf4,
                             JTextField tf5,JTextField tf6,JSpinner js7,JDateChooser jdc8,String imgPath,byte[] pic){
        byte[] img = null;
        int option;
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                if(imgPath != null){
                    Path path = Paths.get(imgPath);
                    img = Files.readAllBytes(path);
                }else img = pic;
                db.pst = db.con.prepareStatement
                ("Update "+tb+" Set "+col1+"=?,"+col2+"=?,"+col3+"=?,"+col4+"=?,"+col5+"=?,"
                    + ""+col6+"=?,"+col7+"=?,"+col8+"=?,"+col9+"=? Where "+cs+"='"+ts.getText()+"'");
                db.pst.setString(1, tf1.getText().trim());
                db.pst.setString(2, tf2.getText().trim());
                db.pst.setString(3, tf3.getText().trim());
                db.pst.setString(4, tf4.getText().trim());
                db.pst.setString(5, tf5.getText().trim());
                db.pst.setString(6, tf6.getText().trim());
                db.pst.setString(7, js7.getValue().toString());
                db.pst.setString(8, getDate(jdc8).trim());
                db.pst.setBytes(9, img);
                
                if(db.pst.executeUpdate() == 1)
                    JOptionPane.showMessageDialog(null, "Book Updated!");
                else JOptionPane.showMessageDialog(null, "Cannot Update Book!");
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }//update
    
    //update issue book
    public void updateRecord(String tb, String cs, JTextField ts,
                             String col1, String col2, String col3,
                             String str, JDateChooser jdc, JTextField tf, JTextField tf2, String status){
        int option;
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                if(jdc.getDate() != null){
                    db.pst = db.con.prepareStatement
                    ("Update "+tb+" Set "+col1+"=?,"+col2+"=?,"+col3+"=? Where "+cs+"='"+ts.getText()+"'");
                    db.pst.setString(1, str.trim());
                    db.pst.setString(2, getDate(jdc).trim());
                    db.pst.setString(3, tf.getText().trim());
                }else{
                    db.pst = db.con.prepareStatement
                    ("Update "+tb+" Set "+col1+"=? Where "+cs+"='"+ts.getText()+"'");
                    db.pst.setString(1, str.trim());
                }
                
                db.pst.executeUpdate();
                if(status == "Returned")
                    db.st.execute("Update tblbooks Set qty = qty+1 Where id='"+tf2.getText().trim()+"'");
                JOptionPane.showMessageDialog(null, "Record Updated!");                
            }
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Update Record!");
        }
    }//update
    
    //update user account
    public void updateRecord(String tb, String cs, JTextField ts,
                             String col1, String col2, String col3, String col4, String col5, String col6,
                             JTextField id, JTextField fn, JTextField ln, JTextField user,
                             JPasswordField pass, JCheckBox admin){
        int option;
        String password = new String(pass.getPassword());
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                db.pst = db.con.prepareStatement
                ("Update "+tb+" Set "+col1+"=?,"+col2+"=?,"+col3+"=?,"+col4+"=?,"+col5+"=?,"
                    + ""+col6+"=? Where "+cs+"='"+ts.getText()+"'");
                db.pst.setString(1, id.getText().trim());
                db.pst.setString(2, fn.getText().trim());
                db.pst.setString(3, ln.getText().trim());
                db.pst.setString(4, user.getText().trim());
                db.pst.setString(5, password.trim());
                if(admin.isSelected())
                    db.pst.setString(6, "admin");
                else db.pst.setString(6, "user");
                db.pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Record Updated!");                
            }
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Update Record!");
        }
    }//update
    
    public void deleteRecord(String tb, String col, JTextField ts){
        int option;
        try {
            option=JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Delete",
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.WARNING_MESSAGE);
            if(option==JOptionPane.YES_OPTION){
                db.pst = db.con.prepareStatement("Delete From "+tb+" Where "+col+"=?");
                db.pst.setString(1, ts.getText());
                if(db.pst.executeUpdate() == 1)
                    JOptionPane.showMessageDialog(null, "Record Deleted!","Result",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Cannot Delete Record! Record does not exist...","Result",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {e.printStackTrace();            
        }
    }//delete
    
    //base showRecord
    public void readAllRecordToJTable(String tb, JTable jt){
        try {
            db.pst = db.con.prepareStatement("Select * From "+tb+"");
            db.rs = db.pst.executeQuery();
            //if(db.rs.next()){
                jt.setModel(DbUtils.resultSetToTableModel(db.rs));
            //}
        } catch (Exception e) {e.printStackTrace();
        }
    }//readAllRecord
    
    //search genre
    public void searchRecord(String tb, String col, JTextField ts,
                             JTextField tf1, JTextField tf2){
        try {
            db.pst = db.con.prepareStatement("Select * From "+tb+" Where "+col+"='"+ts.getText()+"'");
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                tf1.setText(db.rs.getString(1));
                tf2.setText(db.rs.getString(2));
            }
            else JOptionPane.showMessageDialog(null, "Genre id not found!","Search Result",1);
        } catch (Exception e) {e.printStackTrace();
        }
    }//search
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic,JLabel jbl){
    ImageIcon MyImage = null;
        if(ImagePath != null){
           MyImage = new ImageIcon(ImagePath);
           }
        else{  
            MyImage = new ImageIcon(pic);
            }
            Image img = MyImage.getImage();
            Image newImg = img.getScaledInstance(jbl.getWidth(),
                           jbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public void getYearMonthDay(JDateChooser jDateCh, JTextField tf){
        jDateCh.setDateFormatString("yyyy-MM-dd");
        if(jDateCh.getDate() != null){
            SimpleDateFormat f=new SimpleDateFormat(jDateCh.getDateFormatString());
            tf.setText(f.format(jDateCh.getDate()));
        }
    }//getDate
    
    public String getDate(JDateChooser jdc){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(jdc.getDate());
        return date;
    }
    
    public void getDateNow(JTextField jtf){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        jtf.setText(dateFormat.format(date));
    }
    
    public void getDateNow(JDateChooser jdc){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        jdc.setDate(date);
    }
    
    public void readFromTableToComboBox(String tb, String col, JComboBox jc, int index){
        try {
            db.pst = db.con.prepareStatement("Select * From "+tb+" Order By "+col+" ASC");
            db.rs = db.pst.executeQuery();
            while(db.rs.next()){
                jc.addItem(db.rs.getString(index));
            }//while
        } catch (Exception e) {e.printStackTrace();
        }
    }//readData
    
    public void selectDataInCombobox(String tb, String col, JComboBox jc, JTextField tf, int index){
        try {
            db.pst = db.con.prepareStatement("Select * From "+tb+" Where "+col+"='"+
                     jc.getSelectedItem().toString()+"'");
            db.rs = db.pst.executeQuery();
            if(db.rs.next()){
                tf.setText(db.rs.getString(index));
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }//select
    
    public String stringToHTML(String str){
        String html = "<html>"+str+"</html>";
        return html;
    }
    
    public Date stringToDate(String str) throws ParseException{
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        return date;
    }
    
    public void centerjDateChooserText(JDateChooser jdc){
        JTextFieldDateEditor dateEditor = (JTextFieldDateEditor)jdc.getDateEditor();
        dateEditor.setHorizontalAlignment(JTextField.CENTER);
    }
    
    public void setBorderToJPanel(JPanel lbl, Color color){
        Border border = BorderFactory.createMatteBorder(3, 3, 3, 3, color);
        lbl.setBorder(border);
    }
    
    public boolean checkEntryExist(String tbl,JTextField id,JTextField isbn){
        boolean entryExist = false;
        try {
            db.rs = db.st.executeQuery("Select * from "+tbl+" Where id='"+id.getText().trim()+"'"
                                     + " Or isbn='"+isbn.getText().trim()+"'");
            if(db.rs.next())
                entryExist = true;
            else entryExist = false;
        } catch (Exception e) {e.printStackTrace();
        }
        return entryExist;
    }
    
    public boolean checkEntryExist(String tbl,String fn,JTextField id){
        boolean entryExist = false;
        try {
            db.rs = db.st.executeQuery("Select * from "+tbl+" Where "+fn+"='"+id.getText().trim()+"'");
            if(db.rs.next())
                entryExist = true;
            else entryExist = false;
        } catch (Exception e) {e.printStackTrace();
        }
        return entryExist;
    }
    
    public void radioButtonsGroup(JRadioButton rb1, JRadioButton rb2, JRadioButton rb3){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
    }
    
}
