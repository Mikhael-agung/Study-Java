import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        frame.add(userLabel);

        JTextField userTextField = new JTextField();
        userTextField.setBounds(150, 50, 150, 30);
        frame.add(userTextField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        frame.add(passLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        frame.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        frame.add(loginButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 200, 300, 30);
        messageLabel.setForeground(Color.RED);
        frame.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());

                if (isValidPassword(password)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Berhasil");
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Password tidak valid");
                }
            }

            private boolean isValidPassword(String password) {
                if (password.length() < 8) {
                    return false;
                }
                boolean hasUpperCase = false;
                boolean hasLowerCase = false;
                boolean hasDigit = false;

                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(c)) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(c)) {
                        hasDigit = true;
                    }

                    if (hasUpperCase && hasLowerCase && hasDigit) {
                        return true;
                    }
                }

                return false;
            }
        });

        // Menampilkan JFrame
        frame.setVisible(true);
    }
}
