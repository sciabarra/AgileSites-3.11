package starter;

import wcs.api.*;
public class Router extends wcs.java.Router {

	@Override
	public Call route(Env env, URL url) {
		return defaultRoute("Starter", env, url);
	}

	@Override
	public String link(Env e, Id id, Arg... args) {
		return defaultLink(e, id, args);
	}
}

        