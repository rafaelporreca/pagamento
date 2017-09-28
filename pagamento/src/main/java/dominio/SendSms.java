package dominio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sms")
public class SendSms {
	
	@GET
	@Produces("plan/text")
	public String enviaSms() {
		return "envia sms";
	}

}
