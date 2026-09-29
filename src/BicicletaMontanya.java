public class BicicletaMontanya extends Bicicleta{
    private int cantidadSuspensiones;

    public BicicletaMontanya() {
    }

    public BicicletaMontanya(String codigo, int anioFabricacion,  double peso, int cantidadSuspensiones) {
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
        return super.toString()+"Tipo : BicicletaMontanya{" +
                "cantidadSuspensores=" + cantidadSuspensiones +
                '}';
    }

    @Override
    public double costoMantencion() {
        int costoBaseM=30000;//3600=34500
        if (cantidadSuspensiones>1){
            return costoBaseM*1.15;
        }
        return 0;
    }

}
