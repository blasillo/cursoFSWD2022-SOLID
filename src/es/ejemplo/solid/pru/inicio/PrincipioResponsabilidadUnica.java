package es.ejemplo.solid.pru.inicio;

public class PrincipioResponsabilidadUnica {

    public static void main (String [] args ) {
        System.out.println( "Ejecutando PrincipioResponsabilidadUnica");

        IMensajeServicio servicio = new MensajeServicioImpl();
        servicio.escribirMensaje("Hola, que tal!");
        servicio.imprimirMensaje();
        servicio.reemplazarContenidoMensaje("Hola","Buenas");
        servicio.imprimirMensaje();
        servicio.enviarMensaje();
    }
}

interface IMensajeServicio {
    void escribirMensaje (String mensaje);
    void imprimirMensaje ();
    void enviarMensaje();
    void reemplazarContenidoMensaje (String origen, String destino);
}

class MensajeServicioImpl implements IMensajeServicio {

    private String contenido;
    @Override
    public void escribirMensaje(String mensaje) {
        contenido = mensaje;
    }

    @Override
    public void imprimirMensaje() {
        System.out.println("Mensaje : " + contenido);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje enviado con contenido : " + contenido);
    }

    @Override
    public void reemplazarContenidoMensaje(String origen, String destino) {
        contenido = contenido.replace(origen,destino);
    }
}


