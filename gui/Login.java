package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel {
    private JTextField userField = new JTextField(20);
    private JPasswordField passField = new JPasswordField(20);
    private JButton loginButton = new JButton("LOGIN");
    private JButton signupButton = new JButton("SIGN UP");
    private JLabel messageLabel = new JLabel("");
    private UserManager userManager = new UserManager();

    public Color c5 = new Color(0, 0, 0);
    public Color c6 = new Color(255, 215, 0);

    public Login(JFrame frame) {
        setLayout(new GridBagLayout());
        setBackground(c5);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("AREA CALCULATOR LOGIN");
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 40));
        titleLabel.setForeground(c6);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(titleLabel, gbc);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(c6);
        userLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        add(userLabel, gbc);

        userField.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        gbc.gridx = 1; gbc.gridy = 1;
        add(userField, gbc);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(c6);
        passLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        gbc.gridx = 0; gbc.gridy = 2;
        add(passLabel, gbc);

        passField.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        gbc.gridx = 1; gbc.gridy = 2;
        add(passField, gbc);

        styleButton(loginButton);
        gbc.gridx = 0; gbc.gridy = 3;
        add(loginButton, gbc);

        styleButton(signupButton);
        gbc.gridx = 1; gbc.gridy = 3;
        add(signupButton, gbc);

        messageLabel.setForeground(Color.RED);
        messageLabel.setFont(new Font("Sans-serif", Font.BOLD, 16));
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(messageLabel, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());
                if (userManager.authenticateUser(user, pass)) {
                   
                    frame.getContentPane().removeAll();
                    Start startPanel = new Start(frame, 4, 250);
                    frame.getContentPane().add(startPanel);
                    frame.revalidate();
                    frame.repaint();
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new Signup(frame, userManager));
                frame.revalidate();
                frame.repaint();
            }
        });
    }

    private void styleButton(JButton btn) {
        btn.setFont(new Font("Sans-serif", Font.BOLD, 20));
        btn.setForeground(c5);
        btn.setBackground(c6);
        btn.setFocusPainted(false);
    }
}