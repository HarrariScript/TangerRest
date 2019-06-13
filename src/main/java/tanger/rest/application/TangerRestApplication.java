package tanger.rest.application;

import java.util.HashSet;
import java.util.Set;


import javax.ws.rs.core.Application;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import tanger.rest.rest.api.DemoRestApi;

/**
 * @author oharrari
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest",
		"liferay.auth.verifier=false", 
		"liferay.oauth2=false",
		"auth.verifier.guest.allowed=true",
		"auth.verifier.auth.verifier.OAuth2RestAuthVerifier.urls.includes=*",
		"auth.verifier.auth.verifier.PortalSessionAuthVerifier.urls.includes=*",
		"oauth2.scopechecker.type=annotations"
	},
	service = Application.class
)
public class TangerRestApplication extends Application {

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JacksonJsonProvider());

		singletons.add(demoRestApi);

		return singletons;
	}

	@Reference
	DemoRestApi demoRestApi;

}