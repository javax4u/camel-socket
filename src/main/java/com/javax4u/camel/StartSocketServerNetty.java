package com.javax4u.camel;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.jndi.JndiContext;

public class StartSocketServerNetty {

    public static void main(String... args) {

        try {
            JndiContext jndiRegistry = new JndiContext();
            CamelContext camelContext = new DefaultCamelContext(jndiRegistry);
            camelContext.addRoutes(new SocketRoute());
            camelContext.start();
        } catch (Exception ex) {
            Logger.getLogger(StartSocketServerNetty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
