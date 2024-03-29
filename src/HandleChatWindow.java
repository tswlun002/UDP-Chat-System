/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class HandleChatWindow extends javax.swing.JFrame {
    int port_number=0;
    int recipient=0;
    DatagramSocket datagramSocket;
    boolean click = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin,btnSend,jButton1,jButton2;
    private javax.swing.JLabel jLabel1,jLabel2,jLabel3;
    private javax.swing.JPanel jPanel1,jPanel2,jPanel3,pnlStatus,pnlTexts;
    private javax.swing.JScrollBar jScrollBar1,jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1,jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2,jTabbedPane3;
    private javax.swing.JLabel lblClientPort,lblIncorrect;
    private javax.swing.JTabbedPane tabMenu;
    private javax.swing.JTextArea txaChat;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    /***
     * Create new chat for user using a local host and allow user to enter their identical port number
     * @throws SocketException error thrown if socket fail to connect
     * @throws UnknownHostException when can't connect or find host name
     */
    public HandleChatWindow() throws SocketException, UnknownHostException {
        initComponents();

        tabMenu.setEnabled(false);
        port_number =  Integer.parseInt(JOptionPane.showInputDialog(pnlTexts,"Enter your number").trim());
        System.out.println(" Port Number chat "+port_number);
        //InetAddress inet = InetAddress.getByName("localhost");
        datagramSocket = new DatagramSocket(port_number, SeverDetails.getInet());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        tabMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblIncorrect = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        lblClientPort = new javax.swing.JLabel();
        pnlTexts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaChat = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton("Log Out");


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab1", jPanel2);

        jScrollPane1.setViewportView(jLabel3);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabMenu.setForeground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel1.setText("Usename:");

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel2.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblIncorrect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIncorrect.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUserName)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                    .addComponent(lblIncorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(lblIncorrect, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabMenu.addTab("Login", jPanel1);

        txtMessage.setForeground(new java.awt.Color(204, 204, 204));
        txtMessage.setText("type message...");
        txtMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMessageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMessageMouseEntered(evt);
            }
        });
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(153, 255, 153));
        btnSend.setForeground(new java.awt.Color(51, 204, 0));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        pnlStatus.setBackground(new java.awt.Color(204, 255, 0));
        pnlStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlStatus.setForeground(new java.awt.Color(0, 102, 153));
        pnlStatus.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N

        lblClientPort.setBackground(new java.awt.Color(255, 255, 102));
        lblClientPort.setFont(new java.awt.Font("Tw Cen MT Condensed", Font.PLAIN, 24)); // NOI18N
        lblClientPort.setForeground(new java.awt.Color(102, 0, 255));

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClientPort, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClientPort, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        pnlTexts.setBorder(new javax.swing.border.MatteBorder(null));

        txaChat.setEditable(false);
        txaChat.setBackground(new java.awt.Color(0, 102, 153));
        txaChat.setColumns(20);
        txaChat.setFont(new java.awt.Font("Verdana", Font.PLAIN, 18)); // NOI18N
        txaChat.setRows(5);
        jScrollPane2.setViewportView(txaChat);

        javax.swing.GroupLayout pnlTextsLayout = new javax.swing.GroupLayout(pnlTexts);
        pnlTexts.setLayout(pnlTextsLayout);
        pnlTextsLayout.setHorizontalGroup(
            pnlTextsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pnlTextsLayout.setVerticalGroup(
            pnlTextsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jButton2.setBackground(Color.RED);
        jButton2.setToolTipText("LOGOUT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTexts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTexts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tabMenu.addTab("Chats", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Thread() {
            @Override
            public void run() {
                try {

                    if(datagramSocket.isClosed()){
                        datagramSocket = new DatagramSocket(port_number);
                    }

                    // send message from  text box
                    String single = txtUserName.getText() + "#" +  new String(txtPass.getPassword());
                    byte[] buffer = single.getBytes(StandardCharsets.UTF_8);
                    DatagramPacket dgp = new DatagramPacket(buffer, buffer.length, SeverDetails.getInet(), (int) SeverDetails.getSever_port());
                    datagramSocket.send(dgp);
                    System.out.println("User name & password"+  new String(dgp.getData()));
                    dgp = new DatagramPacket(SeverDetails.getBuffer(), buffer.length, SeverDetails.getInet(), (int) SeverDetails.getSever_port());

                    // Receive a datagram packet over the socket.
                    if(!datagramSocket.isConnected()){
                        lblIncorrect.setText("You are not connected to the server");
                    }
                    else{
                        datagramSocket.receive(dgp);
                    }

                     // Print the data returned from the server program and stored
                    // in the datagram packet.
                    String rec = new String(dgp.getData(), 0, dgp.getLength());
                    System.out.println(" Rec at HandleChatWindow : "+rec);
                    // Check password is wrong message shown to chat window
                    if(rec.equalsIgnoreCase("false")){
                        txtUserName.setText("");
                        txtPass.setText("");
                        lblIncorrect.setText("Incorrect username or password");

                    }else{
                        tabMenu.setSelectedIndex(1);
                        //get destination port number
                        recipient  =  Integer.parseInt(JOptionPane.showInputDialog(pnlTexts,"Enter recipient number"));
                        lblClientPort.setText("Chat with: "+recipient);
                        //bind the sender port number
                        //make receive object and start its thread
                        Client client = new Client(datagramSocket, txaChat,recipient);
                        Thread receiveThread = new Thread(client);
                        receiveThread.start();

                    }
                }catch(Exception e){
                    e.printStackTrace();
                }

            }

        }.start();
    }

    /**
     * Handle send Button
     * Get text from text box and send to other user
     * @param evt event of button send
     */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
            new Thread() {
            @Override
            public void run() {
                try {
                     String buf = recipient + " : " + txtMessage.getText();
                     byte[] buffer = buf.getBytes(StandardCharsets.UTF_8);
                     txaChat.setForeground(Color.WHITE);
                     txaChat.append("\n"+port_number+":"+txtMessage.getText());
                     DatagramPacket req = new DatagramPacket(buffer, buffer.length, SeverDetails.getInet(), (int) SeverDetails.getSever_port());
                     datagramSocket.send(req);
                     txtMessage.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }.start();    
    }
    private void txtMessageMouseEntered(java.awt.event.MouseEvent evt) {}
    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {}

    public   void windowClosing (WindowListener[] frameEvent){
    }

    /***
     * Handle text box messages. clear after message is sent
     * @param evt - event of text box
     */
    private void txtMessageMouseClicked(java.awt.event.MouseEvent evt) {
        if(!click) {
            click = true;
            txtMessage.setText("");
            txtMessage.setForeground(Color.black);
        }
    }

    /**
     * Handle the logout button
     * @param evt - event of logout button
     */
    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int res = JOptionPane.showConfirmDialog(tabMenu, "Are you sure you want to logout?");
        if(res==0){
            try {
                String message = "quit";
                byte[] buffer = message.getBytes(StandardCharsets.UTF_8);
                DatagramPacket req = new DatagramPacket(buffer, buffer.length, SeverDetails.getInet(), (int) SeverDetails.getSever_port());
                datagramSocket.send(req);

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                datagramSocket.close();
                tabMenu.setSelectedIndex(0);
            }

        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HandleChatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                 HandleChatWindow handleChatWindow =   new HandleChatWindow();
                 handleChatWindow.setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(HandleChatWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }



}
