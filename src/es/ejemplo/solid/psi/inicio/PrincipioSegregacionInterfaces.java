package es.ejemplo.solid.psi.inicio;

public class PrincipioSegregacionInterfaces {
    public static void main (String [] args ) {
        System.out.println("Ejecutando PrincipioSegregacionInterfaces");

        new MaquinaCafeImpl().prepararCafe();
        new MaquinaTeImpl().prepararTe();
    }

}
interface MaquinaBebidas {
    void prepararCafe();
    void prepararTe();
}

class MaquinaCafeImpl implements MaquinaBebidas {

    @Override
    public void prepararCafe() {
        System.out.println("Preparando café");
    }

    @Override
    public void prepararTe() {
        // Método no implementado
    }
}

class MaquinaTeImpl implements MaquinaBebidas {
    @Override
    public void prepararCafe() {
        // Método no implementado
    }

    @Override
    public void prepararTe() {
        System.out.println("Preparando té");
    }
}