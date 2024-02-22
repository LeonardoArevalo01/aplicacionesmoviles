public class Main {

    public static void main(String[] args) {
        
        Perro perro1 = new Perro();
        Gato gato1 = new Gato("americano", "naranja", "6 kg", "purina", 4 , "domestico");
        
        perro1.comer();
        
        perro1.hacerSonido("labrador","negro");
        
        gato1.comer(gato1.getTipo_alimentacion());
        
    }
}