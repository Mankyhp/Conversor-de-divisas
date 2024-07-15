import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("http://vó.exchangerate-api.com/v6/a519b45e33b5a17a8b95bec2/pair/" + monedaBase + "/"+ monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder();
            .uri(direccion)
            .build();

        try {
            HttpResponse<String>response =client
                    .send(request, HttpResponse.BodyHandler.class)
        }
    }

}
