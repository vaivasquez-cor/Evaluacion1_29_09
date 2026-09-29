public abstract class Bicleta {
    protected String codigo;
    protected int anioFabricacion;
    protected float peso;

    public Bicleta() {
    }

    public Bicleta(String codigo, int anioFabricacion, float peso) {
        this.codigo = codigo;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicleta{" +
                "codigo='" + codigo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", peso=" + peso +
                '}';
    }
    public abstract int costoMantencion();//devuelve en pesos el valor de mantencion
}
