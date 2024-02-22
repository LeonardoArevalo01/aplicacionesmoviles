import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class ReproductorAudio implements Runnable {
    private String audioFilePath;

    public ReproductorAudio(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    @Override
    public void run() {
        try {
            // Obtener el archivo de audio y crear un Clip
            File audioFile = new File(audioFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Reproducir el audio
            clip.start();

            // Esperar hasta que termine de reproducirse el audio
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Cerrar el clip
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}