
package uddi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "numero", targetNamespace = "http://UDDI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Numero {


    /**
     * 
     * @param num
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "primo", targetNamespace = "http://UDDI/", className = "uddi.Primo")
    @ResponseWrapper(localName = "primoResponse", targetNamespace = "http://UDDI/", className = "uddi.PrimoResponse")
    @Action(input = "http://UDDI/numero/primoRequest", output = "http://UDDI/numero/primoResponse")
    public String primo(
        @WebParam(name = "num", targetNamespace = "")
        int num);

}
