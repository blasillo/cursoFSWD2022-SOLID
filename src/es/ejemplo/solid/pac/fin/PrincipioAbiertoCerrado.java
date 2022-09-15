package es.ejemplo.solid.pac.fin;


public class PrincipioAbiertoCerrado {
    public static void main (String [] args ) {
        System.out.println( "Ejecutando PrincipioAbiertoCerrado");

        Notificacion correoNotificacion = new CorreoNotificacion();
        correoNotificacion.notificar("Solicitud recibida");

        Notificacion smsNotificacion = new SmsNotificacion();
        smsNotificacion.notificar("Solicitud recibida");

        Notificacion whatsappNotificacion = new WhatsAppNotificacion();
        whatsappNotificacion.notificar( "Aceptado en el curso");

    }
}

abstract class Notificacion {
    public abstract void notificar (String mensaje);
}

class CorreoNotificacion extends Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Correo enviado con mensaje: " + mensaje);
    }
}

class SmsNotificacion extends Notificacion {

    @Override
    public void notificar(String mensaje) {
        System.out.println("SMS enviado con mensaje: " + mensaje);
    }
}

class WhatsAppNotificacion extends Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("WhatsApp enviado con mensaje: " + mensaje);
    }
}

