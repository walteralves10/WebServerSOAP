package CONTROLER;

import javax.xml.ws.Endpoint;

public class ProdutosServerPublisher {
    
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9876/CONTROLER",
                new ProdutosServerImpl());
    }
}
