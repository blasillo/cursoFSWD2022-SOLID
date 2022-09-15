package es.ejemplo.solid.pac.inicio;
public class PrincipioAbiertoCerrado {
    public static void main (String [] args ) {
        System.out.println( "Ejecutando PrincipioAbiertoCerrado");

        Notificacion.notificar( Notificacion.TipoNotificacion.CORREO , "Solicitud recibida");

        Notificacion.notificar( Notificacion.TipoNotificacion.SMS , "Solicitud recibida");
    }

}

class Notificacion {
    //static String mensaje;

    static public void notificar(TipoNotificacion tipo, String mensaje) {
        if (tipo.equals(TipoNotificacion.CORREO)) {
            System.out.println("Correo enviado con mensaje: " + mensaje);
        }
        if (tipo.equals(TipoNotificacion.SMS)) {
            System.out.println("SMS enviado con mensaje: " + mensaje);
        }
    }


    enum TipoNotificacion {CORREO, SMS, WHATSAPP}
}
