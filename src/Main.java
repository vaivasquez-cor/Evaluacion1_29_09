void main() {
    GestorBicicleta gb =new GestorBicicleta();

    BicletaElectrica e1= new BicletaElectrica("BIC-E01", 2023, 22.5, 60,false);
    BicletaElectrica e2=new BicletaElectrica("BIC-E02", 2022,24.0, 45, true);

    BicicletaMontanya m1=new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
    BicicletaMontanya m2=new BicicletaMontanya("BIC-M02", 2020, 12.0,1);


    e1.activarGarantia();

    gb.registrar(e1);
    gb.registrar(e2);
    gb.registrar(m1);
    gb.registrar(m2);


    gb.listar();

    gb.buscarCodigo("BIC-01");

}