public class Perro extends Animal{
    
    private String raza;
    private String color_pelo;
    private String tamano;

    public Perro() {
        
    }

    
    //Metodo Constructor con herencia
    public Perro(String raza, String color_pelo, String tamano, String tipo_alimentacion, int num_patas, String habitat) {
        super(tipo_alimentacion, num_patas, habitat);
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.tamano = tamano;
    }

        
    @Override
    public void hacerSonido() {
        System.out.println("El perro esta ladrando");
    }
    
    public void hacerSonido(String raza) {
        System.out.println("El perro de raza "+ raza +" esta ladrando");
    }
    
    public void hacerSonido(String raza,String color_pelo) {
        System.out.println("El perro de raza "+ raza +" de color "+color_pelo+" esta ladrando");
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro esta durmiendo");
    }
    
}