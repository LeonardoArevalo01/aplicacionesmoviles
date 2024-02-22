abstract class Animal implements SerVivo{
    
    protected String tipo_alimentacion;
    protected int num_extremidades;
    protected String habitat;

    public Animal() {
        
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getNum_extremidades() {
        return num_extremidades;
    }

    public void setNum_patas(int num_extremidades) {
        this.num_extremidades = num_extremidades;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    
    //Metodo Constructor padre
    public Animal(String tipo_alimentacion, int num_patas, String habitat) {
        this.tipo_alimentacion = tipo_alimentacion;
        this.num_patas = num_patas;
        this.habitat = habitat;
    }

    
    //metodo abstracto
    public abstract void hacerSonido();
}