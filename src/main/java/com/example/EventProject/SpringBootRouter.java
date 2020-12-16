package com.example.EventProject;

import com.example.EventProject.Service.EventService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class SpringBootRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        restConfiguration()
//                .component("servlet")
//                .bindingMode(RestBindingMode.auto);
//

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json);

        rest("/events")
                .get("/")
                .route().routeId("events-api")
                .bean(EventService.class, "getAllEvents");

    }
}
