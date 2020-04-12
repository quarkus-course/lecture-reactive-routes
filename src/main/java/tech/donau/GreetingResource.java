package tech.donau;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.quarkus.vertx.web.RouteFilter;
import io.quarkus.vertx.web.RoutingExchange;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@RouteBase(path = "/test",produces = "text/html")
public class GreetingResource {

    @Route(methods = HttpMethod.GET)
    @Route(path = "/greeting", methods = HttpMethod.GET)
    public void hello(RoutingExchange re) {
        throw new RuntimeException();
//        re.ok("hello");
    }

    public void init(@Observes Router router) {
        router.get("/book").handler( rc -> rc.response().end("Book1"));
    }


//    @RouteFilter(999999)
//    public void myFilter(RoutingContext rc) {
//        rc.response().putHeader("test","test");
//        try {
//            rc.next();
//        }catch (Exception e) {
//            System.out.println("TEST");
//        }
//    }
}