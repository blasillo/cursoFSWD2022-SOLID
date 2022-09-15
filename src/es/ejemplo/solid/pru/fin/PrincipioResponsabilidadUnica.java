package es.ejemplo.solid.pru.fin;

public class PrincipioResponsabilidadUnica {

    public static void main (String [] args ) {

        System.out.println( "Ejecutando PrincipioResponsabilidadUnica");
        IContenidoServicio servicio = new ContenidoServicioImpl();
        servicio.escribirMensaje("Hola, qué tal!");

        servicio.reemplazarContenidoMensaje("Hola", "Buenas");

    }
}

interface IContenidoServicio {
    void escribirMensaje (String mensaje);
    void reemplazarContenidoMensaje (String origen, String destino);
}

interface IMensajeServicio {
    void imprimirMensaje (String contenido);
    void enviarMensaje(String contenido);
}

class ContenidoServicioImpl implements IContenidoServicio {
    private String contenido;

    IMensajeServicio mensajeServicio = new MensajeServicioImpl();

    @Override
    public void escribirMensaje(String mensaje) {
        contenido = mensaje;
        mensajeServicio.imprimirMensaje(contenido);
    }

    @Override
    public void reemplazarContenidoMensaje(String origen, String destino) {
        contenido = contenido.replace(origen,destino);
        mensajeServicio.enviarMensaje(contenido);
    }
}

class MensajeServicioImpl implements IMensajeServicio {

    @Override
    public void imprimirMensaje(String contenido) {
        System.out.println("Mensaje : " + contenido);
    }

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Mensaje enviado con contenido : " + contenido);
    }
}