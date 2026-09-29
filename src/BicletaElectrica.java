public class BicletaElectrica extends Bicleta{
    private int kilometros;
    private boolean bateriaCertificada;

    public BicletaElectrica() {
    }

    public BicletaElectrica(String codigo, int anioFabricacion, float peso, int kilometros, boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        this.kilometros = kilometros;
        this.bateriaCertificada = bateriaCertificada;

    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public String toString() {
        return super.toString()+"BicletaElectrica{" +
                "kilometros=" + kilometros +
                ", bateriaCertificada=" + bateriaCertificada +
                '}';
    }

    @Override
    public double costoMantencion() {
        int costoBaseM=45000;
        if (!bateriaCertificada){//+11250=56250
            return costoBaseM*1.25;
        }
        return costoBaseM;
    }

}
