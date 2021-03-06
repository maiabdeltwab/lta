
package com.fym.lta.UI;

import com.fym.lta.BAO.BaoFactory;
import com.fym.lta.BAO.UserBao;
import com.fym.lta.DTO.UserDto;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Mai-AbdEltwab
 */
public class AccountPanel extends javax.swing.JPanel
{
  @SuppressWarnings("compatibility:-1918251213178067972")
  private static final long serialVersionUID = 1L;

  //create user dto
  private static UserDto user_account;
  //create user bao
  private static UserBao user_bao =
    new BaoFactory().createUserBao(user_account);

  /** Creates new form AccountPanel */
  public AccountPanel(UserDto user)
  {
    //assign logged in user to user_account object
    user_account = user;

    //set panel components
    initComponents();

    //set welcome text to username
    usernameLabel.setText("Welcome, "+user.getUsername()+"!");

    //set username to username text
    UsernameText.setText(user.getUsername());

    //set user email to email text box
    EmailText.setText(user.getEmail());

    //set user password to user password text box
    PasswordText.setText(user.getPassword());


  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  private void initComponents()//GEN-BEGIN:initComponents
  {

    acoountIcon = new javax.swing.JLabel();
    editPanel = new javax.swing.JPanel();
    UserNameLabel = new javax.swing.JLabel();
    UsernameText = new javax.swing.JTextField();
    emailLabel = new javax.swing.JLabel();
    EmailText = new javax.swing.JTextField();
    passLabel = new javax.swing.JLabel();
    PasswordText = new javax.swing.JPasswordField();
    savePanel = new javax.swing.JPanel();
    Save = new javax.swing.JButton();
    ShowPassword = new javax.swing.JLabel();
    usernameLabel = new javax.swing.JLabel();

    setBackground(new java.awt.Color(245, 245, 245));
    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    acoountIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fym/lta/Images/icons8_user_group_man_woman_128px.png"))); // NOI18N
    add(acoountIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

    editPanel.setBackground(new java.awt.Color(245, 245, 245));
    editPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Account setting ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("VIP Rawy Regular", 0, 24), new java.awt.Color(231, 78, 123))); // NOI18N
    editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    UserNameLabel.setFont(new java.awt.Font("VIP Rawy Regular", 0, 18)); // NOI18N
    UserNameLabel.setForeground(new java.awt.Color(0, 51, 204));
    UserNameLabel.setText("User Name");
    editPanel.add(UserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 40));

    UsernameText.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
    UsernameText.setText("Username");
    UsernameText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
    UsernameText.addFocusListener(new java.awt.event.FocusAdapter()
    {
      public void focusGained(java.awt.event.FocusEvent evt)
      {
        UsernameTextFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt)
      {
        UsernameTextFocusLost(evt);
      }
    });
    UsernameText.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        UsernameTextActionPerformed(evt);
      }
    });
    editPanel.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 550, 50));

    emailLabel.setFont(new java.awt.Font("VIP Rawy Regular", 0, 18)); // NOI18N
    emailLabel.setForeground(new java.awt.Color(0, 51, 204));
    emailLabel.setText("Email");
    editPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 52, 23));

    EmailText.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
    EmailText.setText("User Email");
    EmailText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
    EmailText.addFocusListener(new java.awt.event.FocusAdapter()
    {
      public void focusGained(java.awt.event.FocusEvent evt)
      {
        EmailTextFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt)
      {
        EmailTextFocusLost(evt);
      }
    });
    editPanel.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 550, 50));

    passLabel.setFont(new java.awt.Font("VIP Rawy Regular", 0, 18)); // NOI18N
    passLabel.setForeground(new java.awt.Color(0, 51, 204));
    passLabel.setText("Password");
    editPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 30));

    PasswordText.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
    PasswordText.setText("Enter user password");
    PasswordText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
    PasswordText.addFocusListener(new java.awt.event.FocusAdapter()
    {
      public void focusGained(java.awt.event.FocusEvent evt)
      {
        PasswordTextFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt)
      {
        PasswordTextFocusLost(evt);
      }
    });
    PasswordText.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        PasswordTextActionPerformed(evt);
      }
    });
    editPanel.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 520, 50));

    savePanel.setBackground(new java.awt.Color(0, 129, 211));

    Save.setFont(new java.awt.Font("VIP Rawy Regular", 0, 20)); // NOI18N
    Save.setForeground(new java.awt.Color(255, 255, 255));
    Save.setText("Save Changes");
    Save.setBorderPainted(false);
    Save.setContentAreaFilled(false);
    Save.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
    {
      public void mouseMoved(java.awt.event.MouseEvent evt)
      {
        SaveMouseMoved(evt);
      }
    });
    Save.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseExited(java.awt.event.MouseEvent evt)
      {
        SaveMouseExited(evt);
      }
    });
    Save.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        SaveActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
    savePanel.setLayout(savePanelLayout);
    savePanelLayout.setHorizontalGroup(
      savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
    );
    savePanelLayout.setVerticalGroup(
      savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savePanelLayout.createSequentialGroup()
        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    editPanel.add(savePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 160, 50));

    ShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fym/lta/Images/icons8_visible_24px.png"))); // NOI18N
    ShowPassword.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseClicked(java.awt.event.MouseEvent evt)
      {
        ShowPasswordMouseClicked(evt);
      }
    });
    editPanel.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, 30));

    add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 660, 510));

    usernameLabel.setFont(new java.awt.Font("VIP Rawy Regular", 0, 30)); // NOI18N
    usernameLabel.setForeground(new java.awt.Color(231, 78, 123));
    usernameLabel.setText("Welocme, Mai!");
    add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 290, 70));
  }//GEN-END:initComponents

  private void UsernameTextFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_UsernameTextFocusGained
  {//GEN-HEADEREND:event_UsernameTextFocusGained

    //change border color when user focus on this text field
    UsernameText.setBorder(new LineBorder(Color.decode("#0081D3"), 2));
  }//GEN-LAST:event_UsernameTextFocusGained

  private void UsernameTextFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_UsernameTextFocusLost
  {//GEN-HEADEREND:event_UsernameTextFocusLost
  
    //reset border color when user focus out this text field
    UsernameText.setBorder(new LineBorder(Color.decode("#CCCCCC"), 2));
  }//GEN-LAST:event_UsernameTextFocusLost

  private void EmailTextFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_EmailTextFocusGained
  {//GEN-HEADEREND:event_EmailTextFocusGained
  
    //change border color when user focus on this text field
    EmailText.setBorder(new LineBorder(Color.decode("#0081D3"), 2));
  }//GEN-LAST:event_EmailTextFocusGained

  private void EmailTextFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_EmailTextFocusLost
  {//GEN-HEADEREND:event_EmailTextFocusLost
   
    //reset border color when user focus out this text field
    EmailText.setBorder(new LineBorder(Color.decode("#CCCCCC"), 2));
  }//GEN-LAST:event_EmailTextFocusLost

  private void PasswordTextFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_PasswordTextFocusGained
  {//GEN-HEADEREND:event_PasswordTextFocusGained
    
    //change border color when user focus on this text field
    PasswordText.setBorder(new LineBorder(Color.decode("#0081D3"), 2));
  }//GEN-LAST:event_PasswordTextFocusGained

  private void PasswordTextFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_PasswordTextFocusLost
  {//GEN-HEADEREND:event_PasswordTextFocusLost

    //reset border color when user focus out this text field
    PasswordText.setBorder(new LineBorder(Color.decode("#CCCCCC"), 2));
    
  }//GEN-LAST:event_PasswordTextFocusLost

  private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PasswordTextActionPerformed
  {//GEN-HEADEREND:event_PasswordTextActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_PasswordTextActionPerformed

  private void SaveMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SaveMouseMoved
  {//GEN-HEADEREND:event_SaveMouseMoved
    // change save panel's background color when user move mouse to save button
    savePanel.setBackground(Color.decode("#0051D2"));
  }//GEN-LAST:event_SaveMouseMoved

  private void SaveMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SaveMouseExited
  {//GEN-HEADEREND:event_SaveMouseExited
    // reset save panel color
    savePanel.setBackground(Color.decode("#0081D3"));
  }//GEN-LAST:event_SaveMouseExited

  private void SaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveActionPerformed
  {//GEN-HEADEREND:event_SaveActionPerformed
    // TODO add your handling code here:

   /** Save account setting changes **/

    try
      {
        if(checkValidity())
          { //if data is valid

            user_account.setUsername(UsernameText.getText()); //get entered username
            user_account.setEmail(EmailText.getText()); //get entered email
            user_account.setPassword(PasswordText.getText()); //get entered password

            //update user account
            user_account = user_bao.userSetting(user_account);

            //check if it success
            if(user_account.getUsername().equalsIgnoreCase(UsernameText.getText())&&
              user_account.getEmail().equalsIgnoreCase(EmailText.getText())&&
              user_account.getPassword().equalsIgnoreCase(PasswordText.getText()))
              {
                JOptionPane.showMessageDialog(null,
                  "Your account information updated successfully!", "Done",
                  1);
                
                //update welcome text 
                usernameLabel.setText("Welcome, "+
                  user_account.getUsername()+"!");

              }
            else //if update failed 
              JOptionPane.showMessageDialog(null, "Something went wrong!",
                "Error", JOptionPane.ERROR_MESSAGE);
          }
      }
    catch(Exception e)
      {
        e.printStackTrace();
      }
    

  }//GEN-LAST:event_SaveActionPerformed

  private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UsernameTextActionPerformed
  {//GEN-HEADEREND:event_UsernameTextActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_UsernameTextActionPerformed

  private void ShowPasswordMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ShowPasswordMouseClicked
  {//GEN-HEADEREND:event_ShowPasswordMouseClicked
    //show password if it hidden 
    if(PasswordText.echoCharIsSet())
      {
        PasswordText.setEchoChar((char) 0);
      }
    //hide password, if it not hidden 
    else
      PasswordText.setEchoChar('*');
    
  }//GEN-LAST:event_ShowPasswordMouseClicked


/**This method to check validity of user entered data
 * @return true if all data entered as expected, false if not  */
  private boolean checkValidity()
  {

    try
      {

        /**check validity of username*/

        //Username can't start with number or symbol
        if(!Character.isAlphabetic(UsernameText.getText().charAt(0)))
          {
            //So if the first char isn't alphabetic 
           
            //show message to inform user this
            JOptionPane.showMessageDialog(null,
              "Invalid Username format\n(Username can't start with number or symbol)",
              "Invalid Input", JOptionPane.ERROR_MESSAGE);
            
            //throw a new exception to catch this error 
            throw new IllegalArgumentException("Username can't start with number or symbol");
          
          }
      
      
        //check for all username chars
        for(int i = 1; i<UsernameText.getText().length(); i++)
          {

            //username can contain only letters,numbers,'-','.' and '_'
            if(!Character.isLetterOrDigit(UsernameText.getText().charAt(i))&&
              UsernameText.getText().charAt(i)!='_'
              && UsernameText.getText().charAt(i)!='-'
              && UsernameText.getText().charAt(i)!='.')
              {
                //if it not show message to tell user that 
                JOptionPane.showMessageDialog(null,
                  "Invalid Username format\n\n(Username can only be a sequence of Unicode letters and digits separated by \"_\",\".\" or \"-\")",
                  "Invalid Input", JOptionPane.ERROR_MESSAGE);
                
                //throw this exception
                throw new IllegalArgumentException("Username can't contain stranger symbols");

              }
          }


        /**check validity of email*/

        //Email can't start with number or symbol
        if(!Character.isAlphabetic(EmailText.getText().charAt(0)))
          {
          
            //if it not show message to tell user that
            JOptionPane.showMessageDialog(null,
              "Invalid Email format\n\n(Email can't start with number or symbol)",
              "Invalid Input", JOptionPane.ERROR_MESSAGE);
            
            //throw this exception 
            throw new IllegalArgumentException("Email can't start with number or symbol");

          }

        //separate entred email by "@"
        String[] email = EmailText.getText().split("@");

        /*check if the entred email doesn't contain "@"
         * or contains more than one "@" */
        if(!(EmailText.getText().contains("@")) || email.length!=2)
          {
            //show this message to user
            JOptionPane.showMessageDialog(null,
              "invalid Email format\n\n" +
               "It should be in form of\n" +
                "(example@domain.com)",
              "Invalid Input", JOptionPane.ERROR_MESSAGE);

            //throw this exception
            throw new IllegalArgumentException("Email should in this format (example@domain.com) ");

          }


        //check for email two sides
        for(int i = 1; i<email[0].length(); i++) //for side one(email body)
          {
            //chars in the first side must be letter or digit
            //and they can be "_","." if it not the last char 
            if(!Character.isLetterOrDigit(email[0].charAt(i))&&
              ((email[0].charAt(i)!='_'||i==email[0].length()-1)&&
              (email[0].charAt(i)!='.'||i==email[0].length()-1)))
              {
                
                //if any char has differet format show this message to user
                JOptionPane.showMessageDialog(null,
                  "Invalid Email format\n" +
                  "Email can contain only letters (a-z) or digits (0-9)" +
                  "\nAnd (.) or (_) except the last one ", "Invalid Email Format",
                  JOptionPane.ERROR_MESSAGE);
                
                //thow this exception 
                throw new IllegalArgumentException("Invalid Email format");

              }
          }

        
        for(int i = 0; i<email[1].length(); i++) //side two (email domain)
          {
          
            //domain can contain letters and dots if it isn't the last char
            if(!Character.isLetter(email[1].charAt(i))&&
              (email[1].charAt(i)!='.'||(i==email[1].length()-1||i==0)))
              {
               
                //show this message to user if domain is invalid
                JOptionPane.showMessageDialog(null,
                  "Invalid Email domain\n\n ", "Invalid email format",
                  JOptionPane.ERROR_MESSAGE);
                
                //throw this exception
                throw new IllegalArgumentException("Invalid Email domain");
              }
          }

     
        /**check validity of password*/
        //if password length less than 4 char 
        if(PasswordText.getText().length()<4)
          {
            //show message to ask user enter at least 4 char
            JOptionPane.showMessageDialog(null,
              "Invalid Password\n\n(Password length must at least 4 character)",
              "Invalid Input", JOptionPane.ERROR_MESSAGE);
            
            //throw this exception 
            throw new IllegalArgumentException("Password length must at least 4 character");

          }

        //if there is no exception return true "data is valid"
        return true; 

      }
    
    // catch the illagal thrown exceptions 
    catch(IllegalArgumentException e)
      {
        //print this exception 
        e.printStackTrace();
        
        return false; // data is invalid
      }

    //if there is any other non expecting error
    catch(Exception e)
      {
        //print this exception
        e.printStackTrace();
        //ask user to check data
        JOptionPane.showMessageDialog(null,
          "Some Thing went wrong!\n\nPlease check your entered data. ",
          "Invalid Input", JOptionPane.ERROR_MESSAGE);
        
        return false;
        
      }

  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField EmailText;
  private javax.swing.JPasswordField PasswordText;
  private javax.swing.JButton Save;
  private javax.swing.JLabel ShowPassword;
  private javax.swing.JLabel UserNameLabel;
  private javax.swing.JTextField UsernameText;
  private javax.swing.JLabel acoountIcon;
  private javax.swing.JPanel editPanel;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JLabel passLabel;
  private javax.swing.JPanel savePanel;
  private javax.swing.JLabel usernameLabel;
  // End of variables declaration//GEN-END:variables

}
