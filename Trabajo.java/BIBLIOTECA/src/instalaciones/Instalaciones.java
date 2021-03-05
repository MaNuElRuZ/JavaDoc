package instalaciones;

import java.util.Date;
import java.util.List;

/**
 * En este veremos las diferentes reservas que se pueden hacer dependiendo del deporte en el que se quiera jugar y sus complementos para ejercerlo
 * @author Manuel Ruz Castro
 *
 */
public class Instalaciones {

    class Socio{
        private String nombre;
        private String direccion;
        private String ciudad;
        private String provincia;
        private String telefono;
        private Float cuota;
        private List<Reserva> reservas;
    }
    class Reserva{
        private int id;
        private Date fecha;
        private Date horaInicio;
        private Date horaFin;
        private Socio socioReserva;

        public Reserva(int id, Date fecha, Date horaInicio, Date horaFin) {
            this.id = id;
            this.fecha = fecha;
            this.horaInicio = horaInicio;
            this.horaFin = horaFin;
        }
    }
    class ReservaArticulo extends Reserva{
        private int cantidad;
        private Artículo artículoReservaArticulo;
        public ReservaArticulo(int id, Date fecha, Date horaInicio, Date horaFin){
            super(id, fecha, horaInicio, horaFin);
            this.cantidad = cantidad;
        }
    }
    class Artículo{
        private int codigo;
        private String descripcion;
        private TipoArticulo tipo;
        private List<ReservaArticulo> reservaArticulos;
    }
    class instalacion{
        private String nombre;
        private TipoInstalacion tipo;
        private List<ReservaInstalacion> reservaInstalacioness;
    }
    class ReservaInstalacion extends Reserva{
        private instalacion instalacionReservaInstalacion;
        public ReservaInstalacion(int id, Date fecha, Date horaInicio, Date horaFin){
            super(id, fecha, horaInicio, horaFin);
        }
    }
}
