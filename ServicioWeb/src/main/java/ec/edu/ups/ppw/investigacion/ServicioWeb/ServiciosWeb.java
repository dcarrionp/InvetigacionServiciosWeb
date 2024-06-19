package ec.edu.ups.ppw.investigacion.ServicioWeb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class ServiciosWeb {
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, World!";
    }

}
