
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://UDDI/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://UDDI/", "hello");
    private final static QName _Operacion_QNAME = new QName("http://UDDI/", "operacion");
    private final static QName _OperacionResponse_QNAME = new QName("http://UDDI/", "operacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link OperacionResponse }
     * 
     */
    public OperacionResponse createOperacionResponse() {
        return new OperacionResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Operacion }
     * 
     */
    public Operacion createOperacion() {
        return new Operacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "operacion")
    public JAXBElement<Operacion> createOperacion(Operacion value) {
        return new JAXBElement<Operacion>(_Operacion_QNAME, Operacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "operacionResponse")
    public JAXBElement<OperacionResponse> createOperacionResponse(OperacionResponse value) {
        return new JAXBElement<OperacionResponse>(_OperacionResponse_QNAME, OperacionResponse.class, null, value);
    }

}
