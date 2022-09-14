package es.ejemplo.solid.pid.fin;



public class PrincipioInversionDependencia {

    public static void main (String [] args ) {
        System.out.println( "Ejecutando PrincipioInversionDependencia");

        Notificacion notificacion = new Notificacion( new CorreoServicio());
        notificacion.generarNotificacion();

        notificacion = new Notificacion( new SmsServicio());
        notificacion.generarNotificacion();
    }
}

interface INotificacion {
    void notificar ();
}

class CorreoServicio implements  INotificacion {
    @Override
    public void notificar() {
        System.out.println("Correo enviado.");
    }
}

class SmsServicio implements INotificacion {
    @Override
    public void notificar() {
        System.out.println("SMS enviado.");
    }
}

// class WhatsAppServicio implemens INotification { }

class Notificacion {
    private INotificacion servicio;

    public Notificacion(INotificacion servicio) {
        this.servicio = servicio;
    }

    public void generarNotificacion() {
        this.servicio.notificar();
    }
}

