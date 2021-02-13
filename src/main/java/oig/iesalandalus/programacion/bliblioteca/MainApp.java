package oig.iesalandalus.programacion.bliblioteca;
import org.iesalandalus.programacion.biblioteca.mvc.controlador.Controlador;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.Modelo;
import org.iesalandalus.programacion.biblioteca.mvc.vista.Vista;

public class MainApp {

	public static void main(String[] args) {

		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();

	}

}

/*
Tarea: Biblioteca IES Al-Ándalus
Profesor: José Ramón Jiménez Reyes
Alumno: José Antonio Del Rey Martínez
Curso: Programación, DAM IES ÁL-ANDALUS
*/