package biblioteca;

import java.util.Date;
import java.util.List;

/**
 * Biblioteca va a representar las relaciones que hay dentro para poder clasificar los tipos libros y los socios, y sus correpondientes consecuencias
 * En los ejemplos usaremos
 * @author Manuel Ruz
 */
public class biblioteca{
    class copia {
        private int referencia;
        private EstadoCopia estado;
        private List<Libro> libros;
        private socio socioCopia;

    }
    class socio{
        private int numero;
        private String nombre;
        private String direccion;
        private String telefono;
        private List<copia> copiaSocio;
        private Multa multaSocio;
        
    }
    class Multa{
        private Date inicio;
        private Date fin;
        private socio socioMulta;
    }
    class Libro{
        private String titulo;
        private String editorial;
        private int year;
        private Genero tipo;
        private copia copiaLibro;
        private List<autor> autores;
    }
    class autor{
        private String nombre;
        private String nacionalidad;
        private Date fechaNacimiento;
        private Libro libroautor;
    }
    class Prestamo{
        private Date inicio;
        private Date fin;
        private copia copia;
        private socio socio;
    }
}

