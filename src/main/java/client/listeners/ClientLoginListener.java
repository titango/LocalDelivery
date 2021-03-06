package main.java.client.listeners;

import main.java.client.ClientFrameMain;
import main.java.model.User;
import main.java.service.ClientConnectService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;

public class ClientLoginListener implements ActionListener {

    private JFrame jf;
    public ClientLoginListener(JFrame jf)
    {
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() instanceof JButton)
        {
            JButton clickedBtn = (JButton)e.getSource();

            if(clickedBtn.getText().equals("Login"))
            {
                checkUser();
            }
        }else if(e.getSource() instanceof JTextField)
        {
            checkUser();
        }else if(e.getSource() instanceof JPasswordField)
        {
            checkUser();
        }

    }

    private void checkUser()
    {
        // Check username password
        try {

            //Get username and password
            ClientFrameMain cfm = (ClientFrameMain)jf;
            String username = cfm.getClientFrameLogin().getUsernameValue();
            String pass = String.valueOf(cfm.getClientFrameLogin().getPasswordValue());
            System.out.println(username + " 0-0 " + pass);
            ClientConnectService clientConnectSv = new ClientConnectService();
            User newUser = clientConnectSv.connectServer(username.trim(), pass.trim());

            if(newUser != null) // Existed
            {
                System.out.println("new user????");
                System.out.println(newUser.toString());

                //Set user
                cfm.getModel().setLoginUser(newUser);

                // Is it user? -> menu
                cfm.setScene(ClientFrameMain.MENU_SCENE); // Change to Menu
            }else
            {
                JOptionPane.showMessageDialog(null,"Cannot connect to server. Please try again later.");
            }

        }catch(IOException ioe)
        {
            System.out.println("IOE exception");
            System.out.println(ioe.getMessage());
        }
    }

}
