public class BicicletaMontanya extends Bicleta{
    private int cantidadSuspensiones;

    public BicicletaMontanya() {
    }

    public BicicletaMontanya(String codigo, int anioFabricacion, float peso, int cantidadSuspensiones) {
        super(codigo, anioFabricacion, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensores() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensores(int cantidadSuspensores) {
        this.cantidadSuspensiones = cantidadSuspensores;
    }

    @Override
    public String toString() {
        return super.toString()+"BicicletaMontanya{" +
                "cantidadSuspensores=" + cantidadSuspensiones +
                '}';
    }

    @Override
    public int costoMantencion() {
        return 0;
    }

}
