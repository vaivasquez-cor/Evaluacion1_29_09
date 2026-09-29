public abstract class Bicicleta {
    protected String codigo;
    protected int anioFabricacion;
    protected double peso;

    public Bicicleta() {
    }

    public Bicicleta(String codigo, int anioFabricacion, double peso) {
        setCodigo(codigo);
        setAnioFabricacion(anioFabricacion);
        setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.isBlank() || codigo.isEmpty()){
            throw new IllegalArgumentException("Código no puede ser nulo o vacio");
        }
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if(anioFabricacion<2000 || anioFabricacion>2026){
            throw new IllegalArgumentException("El año de fabricación debe encontrarse entre 2000 y 2026");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso<=0){
            throw new IllegalArgumentException("Peso debe ser mayor a 0");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigo='" + codigo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", peso=" + peso +
                '}';
    }
    public abstract double costoMantencion();//devuelve en pesos el valor de mantencion


}
