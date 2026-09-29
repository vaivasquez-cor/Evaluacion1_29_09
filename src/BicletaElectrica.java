public class BicletaElectrica extends Bicicleta implements ConGarantiaExtendida{
    private int kilometros;
    private boolean bateriaCertificada;
    private boolean garantiaEx;


    public BicletaElectrica() {
    }

    public BicletaElectrica(String codigo, int anioFabricacion, double peso, int kilometros, boolean bateriaCertificada) {
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

    public boolean isGarantiaEx() {
        return garantiaEx;
    }

    public void setGarantiaEx(boolean garantiaEx) {
        this.garantiaEx = garantiaEx;
    }

    @Override
    public String toString() {
        return super.toString()+"Tipo: BicletaElectrica{" +
                "Autonomia=" + kilometros +
                ", bateriaCertificada=" + (bateriaCertificada?"Si":"No")+
                ", garantiaEx=" + (garantiaEx?"Si":"No") +
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

    @Override
    public boolean consultarGarantiaExtendida() {
        return garantiaEx;
    }

    @Override
    public void activarGarantia() {
        if(!consultarGarantiaExtendida()){//osea que es falsa
            garantiaEx=true;
        }
    }
}
