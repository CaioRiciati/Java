import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {

    public static void main(String[] args) {
        // Criar a janela principal (JFrame)
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 170);
        frame.setLocationRelativeTo(null); // Centralizar a janela na tela

        // Criar o painel (JPanel) e configurar o layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Criar os componentes
        JLabel labelUsername = new JLabel("Usuário:");
        JTextField textUsername = new JTextField();
        JLabel labelPassword = new JLabel("Senha:");
        JPasswordField passwordField = new JPasswordField();
        JButton buttonLogin = new JButton("Entrar");
        JButton buttonCadastro = new JButton("Cadastrar");

        // Adicionar os componentes ao painel
        panel.add(labelUsername);
        panel.add(textUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(buttonLogin);
        panel.add(buttonCadastro);

        // Adicionar painel à janela
        frame.add(panel);

        // Ação do botão "Entrar"
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUsername.getText();
                char[] password = passwordField.getPassword();

                // Verificação simples (para fins de exemplo)
                if (username.equals("admin") && String.valueOf(password).equals("senha123")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
