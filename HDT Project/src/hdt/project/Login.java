package hdt.project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Forgot_Pass = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("HỆ THỐNG QUẢN LÍ SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Password:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Login_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(0, 0, 255));
        Login_Button.setText("Login");
        Login_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0), new java.awt.Color(255, 153, 153), new java.awt.Color(204, 51, 0)));
        Login_Button.setDoubleBuffered(true);
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Forgot_Pass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Forgot_Pass.setText("Forgot password?");
        Forgot_Pass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Login Page");

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(User))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Forgot_Pass)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Pass)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Forgot_Pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Login_Button)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        String user=User.getText();
        String pass=Pass.getText();
        if (user.equals("admin") && pass.equals("admin"))
        {
            Admin obj= new Admin();
            obj.setVisible(true);
            dispose();
        }
        else
        {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            Statement st=(Statement) conn.createStatement();
            String sql=" Select * from student_login";
            String s="Select * from student_login \n"+
                        "Where username = '"+user +"' and password = '"+pass+"';";
            String s1="Select * from teacher_login \n"+
                        "Where username = '"+user +"' and password = '"+pass+"';";
            //JOptionPane.showMessageDialog(this,s);
            //JOptionPane.showMessageDialog(this,s1);
            String a="";
            String b="";
            
            //PreparedStatement 
            ResultSet res=st.executeQuery(s);
            while(res.next())
            {
                a=res.getString("id");
            }
            
            ResultSet res1=st.executeQuery(s1);
            while(res1.next())
            {
                b=res1.getString("id");
            }
            
            /*ResultSet res=st.executeQuery(s);
            res.next();
            a=res.getString("id");
            JOptionPane.showMessageDialog(this,s);
            
            ResultSet res1=st.executeQuery(s1);
            res1.next();
            b=res1.getString("id");
            JOptionPane.showMessageDialog(this,s1);*/
           
            ResultSet rs_student=st.executeQuery(sql);
            boolean check=true;
            while(rs_student.next())
            {
                String username=rs_student.getString("username");
                String password=rs_student.getString("password");
                //JOptionPane.showMessageDialog(this,username+" "+password+" "+user+" "+pass);
                if(user.equals(username)&& pass.equals(password))
                {
                    //new welcome().setVisible(true);
                    check=true;
                    StudentPage obj= new StudentPage(a);
                    obj.setVisible(true);
                    dispose();
                    break;
                    //JOptionPane.showMessageDialog(this,"You re student.");
                }
                else
                    check=false;
            }
            String sql1="Select * from teacher_login";
            ResultSet rs_teacher=st.executeQuery(sql1);
            if(!check)
                while(rs_teacher.next())
                {
                    String username=rs_teacher.getString("username");
                    String password=rs_teacher.getString("password");
                    if(user.equals(username)&& pass.equals(password))
                    {
                        //new welcome().setVisible(true);
                        check=true;
                        TeacherPage obj= new TeacherPage(b);
                        obj.setVisible(true);
                        dispose();
                        break;
                        //JOptionPane.showMessageDialog(this,"You re teacher.");
                    }
                    else
                        check=false;
                }
            if(!check)
                JOptionPane.showMessageDialog(this,"Username or Password is incorrect!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while establishing connection!");
        }
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Forgot_Pass;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
