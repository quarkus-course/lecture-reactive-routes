package tech.donau;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import java.io.IOException;

@Provider
public class SecurityInterceptor implements ContainerResponseFilter {

//    @Override
//    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
//        try {
//            return context.proceed();
//        } catch (Exception e) {
//            return Response.ok("nothing happened");
//        }
//    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        final String s = requestContext.toString();
        System.out.println(s);
    }
}
