import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaComDuasTelas {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.criarEExibirTela();
        });
    }
}

class TelaPrincipal {
    private JFrame frame;

    public void criarEExibirTela() {
        frame = new JFrame("Tela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton btnAbrirTela2 = new JButton("Abrir Tela 2");
        btnAbrirTela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaSecundaria telaSecundaria = new TelaSecundaria();
                telaSecundaria.criarEExibirTela();
            }
        });

        frame.add(btnAbrirTela2);

        frame.setVisible(true);
    }
}

class TelaSecundaria {
    private JFrame frame;

    public void criarEExibirTela() {
        frame = new JFrame("Tela Secundária");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Esta é a Tela Secundária.");

        frame.add(label);

        frame.setVisible(true);
    }
}
