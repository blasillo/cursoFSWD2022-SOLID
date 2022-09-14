package es.ejemplo.solid.pid.inicio;

public class PrincipioInversionDependencia {

    public static void main (String [] args ) {

        System.out.println( "Ejecutando PrincipioInversionDependencia");

        Notificacion notificacion = new Notificacion( new CorreoServicio());
        notificacion.notificarPorCorreo();

        notificacion = new Notificacion( new SmsServicio());
        notificacion.notificarPorSms();

    }
}


class CorreoServicio {
    public void enviarCorreo() {
        System.out.println("Correo enviado.");
    }
}

class SmsServicio {
    public void enviarSms() {
        System.out.println("SMS enviado.");
    }
}

class WhatsAppServicio { }

class Notificacion {
    private CorreoServicio correoServicio;
    private SmsServicio smsServicio;

    public Notificacion(CorreoServicio correoServicio) {
        this.correoServicio = correoServicio;
    }

    public Notificacion(SmsServicio smsServicio) {
        this.smsServicio = smsServicio;
    }

    public void notificarPorCorreo () {
        this.correoServicio.enviarCorreo();
    }

    public void notificarPorSms () {
        this.smsServicio.enviarSms();
    }
}

