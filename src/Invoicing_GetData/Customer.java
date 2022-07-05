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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author joses
 */

    //@XmlAccessorType(XmlAccessType.FIELD)
    //@XmlType(propOrder = {    
    //"id",
    //"firstName",
    //"lastName"
//})
@XmlRootElement(name = "Customer ")
public class Customer {
    @XmlElement(name = "id", required = true)
    private String id;
    //@XmlElement(name = "firstName", required = true)
    //private String firstName;
    //@XmlElement(name = "lastName", required = true)
    //private String lastName;
    //private ArrayList<products_GetDataXML> products;
    
    public Customer(String id){
        this.id = id;
    }
    
    //public Customer(String id, String firstName, String lastName, ArrayList<products_GetDataXML> products) {
        //this.id = id;
        //this.firstName = firstName;
        //this.lastName = lastName;
        //this.products = products;
        
    //}

    public String getId (){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
}

