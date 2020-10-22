package com.javax4u.camel;

import org.apache.camel.builder.RouteBuilder;

public class SocketRoute extends RouteBuilder {

    @Override
    public void configure() {

        from("netty:tcp://localhost:4209?allowDefaultCodec=false&sync=false")
                .to("log:?level=DEBUG&showBody=true");

    }
}
