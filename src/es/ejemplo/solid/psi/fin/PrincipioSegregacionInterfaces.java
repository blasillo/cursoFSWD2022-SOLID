package es.ejemplo.solid.psi.fin;




public class PrincipioSegregacionInterfaces {
    public static void main (String [] args ) {
        System.out.println("Ejecutando PrincipioSegregacionInterfaces");

        new MaquinaCafeImpl().prepararCafe();
        new MaquinaTeImpl().prepararTe();

        new MaquinaTeCafeImpl().prepararTe();

    }
}

interface IMaquinaCafe {
    void prepararCafe();
}

interface IMaquinaTe {
    void prepararTe();
}

class MaquinaCafeImpl implements IMaquinaCafe {

    @Override
    public void prepararCafe() {
        System.out.println("Preparando café");
    }
}

class MaquinaTeImpl implements IMaquinaTe {

    @Override
    public void prepararTe() {
        System.out.println("Preparando té");
    }
}

class MaquinaTeCafeImpl implements IMaquinaTe, IMaquinaCafe {
    @Override
    public void prepararCafe() {
        System.out.println("Preparando café");
    }

    @Override
    public void prepararTe() {
        System.out.println("Preparando té");
    }
}