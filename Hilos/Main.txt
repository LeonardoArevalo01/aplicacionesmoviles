public class Main {
    public static void main(String[] args) {

	// Ruta del archivo de audio
	String audioFilePath = "C:\\Users\\leona\\Desktop\\4to semestre\\Desarrollo de aplicaciones\\Hilos\\Hijo-de-la-luna.wav";

	// Ruta del archivo de video o gif
	String videoFilePath = "C:\\Users\\leona\\Desktop\\4to semestre\\Desarrollo de aplicaciones\\Hilos\\Luna.gif";


        // Crear instancias de los objetos Runnable para cada tarea
        ReproductorAudio reproductorAudio = new ReproductorAudio(audioFilePath);
        ReproductorVideo reproductorVideo = new ReproductorVideo(videoFilePath);

        // Crear hilos para cada tarea y ejecutarlos
        Thread audioThread = new Thread(reproductorAudio);
        Thread videoThread = new Thread(reproductorVideo);

        audioThread.start();
        videoThread.start();
    }
}
