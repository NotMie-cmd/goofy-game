
// wont be showin the code ( or you can just scroll if you want to modify it )












































































































































































import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    private JButton button;
    private JLabel countLabel;
    private Timer timer;
    private int x, y, dx, dy;
    private int clickCount;

    public App() {
        setTitle("gay");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        button = new JButton("gaye");
        button.setBounds(0, 0, 100, 50);
        button.addActionListener(this);
        add(button);

        countLabel = new JLabel("your a gay 0 out of infinity");
        countLabel.setBounds(20, 70, 150, 20);
        add(countLabel);

        setVisible(true);

        x = button.getX();
        y = button.getY();
        dx = 1;
        dy = 1;
        clickCount = 0;

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveButton();
            }
        });
        timer.start();
    }

    private void moveButton() {
        x += dx;
        y += dy;

        if (x <= 0 || x >= getWidth() - button.getWidth()) {
            dx *= -1;
        }
        if (y <= 0 || y >= getHeight() - button.getHeight()) {
            dy *= -1;
        }

        button.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        countLabel.setText("your a gay " + clickCount + " out of infinity");

        dx += 1; // Increase the speed of the button by 1
        dy += 1; // Increase the speed of the button by 1
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}