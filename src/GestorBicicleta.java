import java.util.ArrayList;

public class GestorBicicleta {
    private ArrayList<Bicicleta>bicicletas;

    public GestorBicicleta(){
        this.bicicletas =new ArrayList<>();
    }

    //registrar o sea add
    public void registrar(Bicicleta bici){
        for (Bicicleta b: bicicletas){
            System.out.println("1");
            bicicletas.add(b);

        }
        System.out.println("Bicicleta registrada correctamente");

    }
    public ArrayList<Bicicleta>buscarCodigo(String codigo){
        ArrayList<Bicicleta>bicikodigo=new ArrayList<>();
        for (Bicicleta b : bicicletas){
            if(codigo.equals(b.getCodigo())){
                bicikodigo.add(b);
            }
        }
        return bicikodigo;
    }

    public void listar(){
        System.out.println("LISTADO DE BICICLETAS");
        for(Bicicleta b: bicicletas){
            System.out.println(b);
        }
    }
}
