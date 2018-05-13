package org.sdj3;

import org.sdj3.model.CarPart;
import org.sdj3.remote.ServerCommunication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Collection;


@Path("/")
public class CarRegistryService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response trackCarParts(@PathParam("id") int chassisNo) throws IOException{
        Collection<CarPart> partsList = org.sdj3.util.ModelConverter.convert(
                ServerCommunication.getCarParts(chassisNo)
        );
        return Response.status(200).entity(partsList).build();
    }


}
