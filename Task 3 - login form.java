import javax.swing.*;

public class LoginForm extends javax.swing.JFrame {

    
    public LoginForm() {
        initComponents();
        setSize(400, 300); // Set window size
        setLocationRelativeTo(null); // Center the window
    }

   
    private void initComponents() {

        JLabel titleLabel = new JLabel("Login Page", SwingConstants.CENTER);
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

    
        usernameField.setToolTipText("Enter your username");
        passwordField.setToolTipText("Enter your password");

      
        titleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(titleLabel)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, 200, 200, 200)
                    .addComponent(passwordField, 200, 200, 200)))
            .addComponent(loginButton)
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(titleLabel)
            .addGap(20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(usernameLabel)
                .addComponent(usernameField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(passwordLabel)
                .addComponent(passwordField))
            .addGap(20)
            .addComponent(loginButton)
        );

        
        loginButton.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(this, "Username: " + user + "\nPassword: " + pass);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true);
    }
}
