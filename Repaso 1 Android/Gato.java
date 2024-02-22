public class Gato extends Animal{

    private String raza;
    private String color_pelo;
    private String peso;

    public Gato() {
        
        
    }
        
    //Metodo Constructor con herencia
    public Gato(String raza, String color_pelo, String peso, String tipo_alimentacion, int num_patas, String habitat) {
        super(tipo_alimentacion, num_patas, habitat);
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
    @Override
    public void hacerSonido() {
        System.out.println("El gato esta maullando");
    }

    @Override
    public void comer() {
       System.out.println("El gato esta comiendo");
    }
    
    public void comer(String tipo_alimentacion) {
       System.out.println("El gato esta comiendo "+tipo_alimentacion);
    }

    @Override
    public void dormir() {
        System.out.println("El gato esta durmiendo");
    }
    
}