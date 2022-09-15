package es.ejemplo.solid.psl.inicio;


public class PrincipioSustiticionLiskov {
    public static void main (String [] args ) {
        System.out.println("Ejecutando PrincipioSustiticionLiskov");

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.agregarLeche();
        maquinaCafe.prepararBebida();


        MaquinaTe maquinaTe = new MaquinaTe();
        maquinaTe.agregarLeche();
        maquinaTe.prepararBebida();
    }
}


abstract class Maquina {
    public void prepararBebida (){
        System.out.println("Bebida preparada");
    }

    public abstract void agregarLeche ();
}

class MaquinaCafe extends Maquina {

    @Override
    public void agregarLeche() {
        System.out.println("Leche añadida");
    }
    @Override
    public void prepararBebida() {
        System.out.println("Café preparado");
    }
}

class MaquinaTe extends Maquina {

    @Override
    public void agregarLeche() {
        try { throw new Exception("Operación no soportada"); }
        catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public void prepararBebida() {
        System.out.println("Té preparado");
    }
}