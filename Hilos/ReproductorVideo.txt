import javax.swing.*;
import java.awt.*;

public class ReproductorVideo implements Runnable {
    private String videoFilePath;

    public ReproductorVideo(String videoFilePath) {
        this.videoFilePath = videoFilePath;
    }

    @Override
    public void run() {
        try {
            // Crear un JFrame para mostrar el video o gif
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Crear un JLabel para mostrar el video o gif
            ImageIcon icon = new ImageIcon(videoFilePath);
            JLabel label = new JLabel(icon);
            frame.getContentPane().add(label, BorderLayout.CENTER);

            // Mostrar el JFrame
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}