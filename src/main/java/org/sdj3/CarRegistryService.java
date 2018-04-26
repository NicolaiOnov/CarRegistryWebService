package org.sdj3;

import org.sdj3.model.Car;
import org.sdj3.model.Point;
import org.sdj3.remote.ServerCommunication;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by marom on 27/09/16.
 */
@Path("car")
public class CarRegistryService {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */


    @POST
    @Consumes("application/json")
    @Produces(MediaType.TEXT_PLAIN)
    public String registerCar(Car car) throws IOException {
        ServerCommunication.saveCarToDummyDB(car);
        return "Car saved";
    }


//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }

//    @GET
//    @Path("/point")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getPoint() throws IOException {
//        try {
//            Point point = new Point();
//            point.setX(1);
//            point.setY(2);
//            return Response.status(200).entity(point).build();
//        } catch (NumberFormatException e) {
//            return Response.status(400).build();
//        } catch (IndexOutOfBoundsException e) {
//            return Response.status(404).build();
//        }
//    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String registerCar(@QueryParam("chassis") int chassis,
//                                @QueryParam("model") String model,
//                                @QueryParam("weight") double weight) throws IOException {
//        ServerCommunication.saveCarToDummyDB(new Car(chassis, model, weight));
//        return "Car saved";
//    }

}
