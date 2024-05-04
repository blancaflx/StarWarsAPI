import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public Pelicula buscar(int numeroPelicula){

        URI direccion= URI.create("https://swapi.py4e.com/api/films/"+numeroPelicula+"/");
        HttpClient client = HttpClient.newHttpClient(); //somos el cliente
        HttpRequest request = HttpRequest.newBuilder() //que es lo que pedimos al servidor
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pelicula.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
