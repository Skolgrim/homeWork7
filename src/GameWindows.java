import javax.swing.*;
import java.awt.*;

public class GameWindows extends JFrame {
    public GameWindows () {
        setTitle("Крестики-нолики");
        setDefaultCloseOperation(3);
        setBounds(600,300,700,500);
        setVisible(true);

        JButton buttonStart = new JButton("Начало игры");
        JButton buttonEnd = new JButton("Конец игры");
        add(buttonStart);
        add(buttonEnd);

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(6,1));
        panelButton.add(buttonStart);
        panelButton.add(buttonEnd);
        buttonStart.setBackground(new Color(0x6969FF));
        buttonStart.setFont(new Font("Arial", Font.ITALIC, 32 ));
        buttonEnd.setBackground(new Color(0xFF6C6C));
        buttonEnd.setFont(new Font("Arial", Font.ITALIC, 32 ));


        GameField gameField = new GameField();
        add(gameField);

        add(panelButton, BorderLayout.EAST);
    }
}
