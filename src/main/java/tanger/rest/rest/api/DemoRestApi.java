package tanger.rest.rest.api;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/")
public interface DemoRestApi {
	
	@GET
	@Path("/working")
	@Produces({"application/json"})
	public String working() ;
	
}
