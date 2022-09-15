package es.ejemplo.solid.psl.fin;

public class PrincipioSustiticionLiskov {
    public static void main (String [] args ) {
        System.out.println("Ejecutando PrincipioSustiticionLiskov");

        Maquina maquinaCafe = new MaquinaCafe();
        maquinaCafe.agregarLeche();
        maquinaCafe.prepararBebida();


        Maquina maquinaTe = new MaquinaTe();
        maquinaTe.prepararBebida();
    }
}

abstract class Maquina {
    public abstract  void prepararBebida ();


    public void agregarLeche () {
        System.out.println("Leche añadida");
    }
}

class MaquinaCafe extends Maquina {

    @Override
    public void prepararBebida() {
        System.out.println("Café preparado");
    }

    @Override
    public void agregarLeche () {
        System.out.println("Leche añadida a café");
    }
}

class MaquinaTe extends Maquina {
    @Override
    public void prepararBebida() {
        System.out.println("Té preparado");
    }
}

