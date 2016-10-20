package se.ivankrizsan.restexample.restadapter;

import org.springframework.stereotype.Component;
import se.ivankrizsan.restexample.domain.Drawing;
import se.ivankrizsan.restexample.services.DrawingService;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST resource exposing operations on drawings.
 *
 * @author Ivan Krizsan
 */
@Component
@Path(DrawingResource.PATH)
@Produces({MediaType.APPLICATION_JSON})
public class DrawingResource extends RestResourceBase<Drawing> {
    /* Constant(s): */
    public final static String PATH = "/drawing";

    /**
     * Creates a REST resource using the supplied service to manipulate entities.
     *
     * @param inService Service used to manipulate entities.
     */
    public DrawingResource(final DrawingService inService) {
        setService(inService);
    }
}
