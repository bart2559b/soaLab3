package th.ac.ku.kps.eng.cpe.soa.service;


import jakarta.xml.ws.Endpoint;
import th.ac.ku.kps.eng.cpe.soa.service.impl.UnitConversionImpl;

public class UCPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/UC",new UnitConversionImpl());
	}
}
