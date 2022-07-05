/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoicing_GetData;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author joses
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {    
//    "products",
//})

@XmlRootElement(name = "products_GetDataXML")
public class products_GetDataXML {
    @XmlElementWrapper(name = "products")
    @XmlElement(name = "product")
    private ArrayList<products_GetDataXML> products;
    
    public products_GetDataXML (){}
    
    public products_GetDataXML(ArrayList<products_GetDataXML> products){
        this.products = products;
    }
    
    public ArrayList<products_GetDataXML> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<products_GetDataXML> products) {
        this.products = products;
    }
}
