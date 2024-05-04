import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Busqueda buscaPelicula = new Busqueda();

        System.out.print("Pelicula para consultar: ");

        try {
            var numeroPelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = buscaPelicula.buscar(numeroPelicula);
            System.out.println(pelicula.toString());
            Archivo crearArchivo = new Archivo();
            crearArchivo.crearJson(pelicula);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("PRUEBA FINALIZADA");
        } catch (IOException e) {
            System.out.println("PRUEBA FINALIZADA");
            throw new RuntimeException(e);
        }

    }
}
