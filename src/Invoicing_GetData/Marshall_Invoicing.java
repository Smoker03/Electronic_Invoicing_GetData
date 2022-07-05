/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoicing_GetData;

import java.util.ArrayList;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 *
 * @author joses
 */
public class Marshall_Invoicing {
    public static void main(String[] args) {
        try{
            /**
             * La clase JAXBContext proporciona el punto de entrada del cliente a la API de JAXB
             */
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);            
            /**
             * La clase Marshaller proporciona a la aplicación cliente la capacidad 
             * de convertir un árbol de contenido Java en datos XML. 
             */
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            /**
             * Creamos una objeto cliente y agregamos algunos datos
             */                         
                    
//            ArrayList<products_GetDataXML> products = new ArrayList<>();
//            products.add(new products_GetDataXML("P123","Televisor",110.50));
//            products.add(new products_GetDataXML("0504427758","Silla", 0.12));
//            products.add(new products_GetDataXML("0504427758","refrigeradora", 0.12));
            Customer customer = new Customer("0504427758");
            /**
             * Se definen algunas propiedades standar
             */            
            //Datos formateados con salto de linea y sangria
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Especifica el valor del atributo xsi: schemaLocation para colocar en la salida XML 
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
            //Codificacion de salida
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");            
            //El nombre del esquemaXSD para el atributo xsi: noNamespaceSchemaLocation
            jaxbMarshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "miesquema.xsd");
            
            /**
             * Se genera el XML y se muestra en consola
             */
            jaxbMarshaller.marshal(customer, System.out);                                   
            
        } catch (JAXBException ex) {
            System.err.println(ex.getMessage());                        
        }        
    }
}
    

