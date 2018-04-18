package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Service implements API {

    public Service() {}

    @Override
    @POST
    @Path("/f1")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Data f1(Data d) {
        System.out.println("CALL F1");
        d.setA(d.getA()+" X");
        d.setB(d.getB()+1);
        return d;
    }
}
