import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroGUI {

    public static void main(String[] args) {
        // Criar a janela principal (JFrame)
        JFrame frame = new JFrame("Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 170);
        frame.setLocationRelativeTo(null); // Centralizar a janela na tela

        // Criar o painel (JPanel) e configurar o layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Criar os componentes
        JLabel labelName = new JLabel("Nome:");
        JTextField textName = new JTextField();
        JLabel labelEmail = new JLabel("E-mail:");
        JTextField textEmail = new JTextField();
        JLabel labelUsername = new JLabel("Usuário:");
        JTextField textUsername = new JTextField();
        JLabel labelPassword = new JLabel("Senha:");
        JPasswordField passwordField = new JPasswordField();
        JButton buttonRegister = new JButton("Cadastrar");

        // Adicionar os componentes ao painel
        panel.add(labelName);
        panel.add(textName);
        panel.add(labelEmail);
        panel.add(textEmail);
        panel.add(labelUsername);
        panel.add(textUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(buttonRegister);

        // Adicionar painel à janela
        frame.add(panel);

        // Ação do botão "Cadastrar"
        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String email = textEmail.getText();
                String username = textUsername.getText();
                char[] password = passwordField.getPassword();

                // Verificação simples (pode ser melhorado com validações reais)
                if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.length == 0) {
                    JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Aqui você pode adicionar a lógica para salvar os dados em um banco de dados ou arquivo
                    JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso!");
                }
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
