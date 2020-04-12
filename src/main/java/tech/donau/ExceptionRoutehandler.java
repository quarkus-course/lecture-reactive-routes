package tech.donau;


import io.quarkus.vertx.web.RouteFilter;
import io.quarkus.vertx.web.runtime.RouteHandler;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ext.Provider;

@Provider
@ApplicationScoped
public class ExceptionRoutehandler implements RouteHandler {
    @Override
    public void invokeBean(RoutingContext routingContext) {
        try {
            this.invoke(routingContext);
        }catch (Exception e) {
            routingContext.fail(200);
        }
    }
}
