/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author noqok
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
public class LoginView extends JFrame {


    private JLabel lblUsername;
    private JLabel lblPassword;

    private JTextField txtUsername;
    private JPasswordField txtPassword;

    private JButton btnLogin;
    private JLabel btnShow;
    private JLabel btnClose;

    public LoginView() {
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 175);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");

        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(18);

        btnLogin = new JButton("Đăng nhập");
        btnShow = new JLabel("🙈");
        btnShow.setFont(new Font("Segoe UI Emoji", Font.PLAIN,18));

        btnClose = new JLabel("🙉");
        btnClose.setFont(new Font("Segoe UI Emoji", Font.PLAIN,18));

        JPanel userpanel = new JPanel(new FlowLayout());
        userpanel.add(lblUsername);
        userpanel.add(txtUsername);

        JPanel passpanel = new JPanel(new FlowLayout());
        passpanel.add(lblPassword);
        passpanel.add(txtPassword);
        passpanel.add(btnShow);
        passpanel.add(btnClose);

        JPanel buttonpanel = new JPanel(new FlowLayout());
        buttonpanel.add(btnLogin);

        this.setLayout(new GridLayout(3, 1));
        this.add(userpanel);
        this.add(passpanel);
        this.add(buttonpanel);

        showPassword(true, false);



    }

    public void addActionListener(ActionListener listener){
        btnLogin.addActionListener(listener);
    }
    public void addMouseListenerForShowClose(MouseListener listener) {
        btnShow.addMouseListener(listener);
        btnClose.addMouseListener(listener);
    }




    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }


    public JLabel getBtnShow() {
        return btnShow;
    }

    public JLabel getBtnClose() {
        return btnClose;
    }


    public void showPassword(boolean a, boolean b){

        btnShow.setVisible(a);
        btnClose.setVisible(b);


    }
}