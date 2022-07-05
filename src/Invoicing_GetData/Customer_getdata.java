/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoicing_GetData;

/**
 *
 * @author joses
 */
public class Customer_getdata {

    //Atributos
    private String id;
    private  String firstName;
    private  String lastName;
    
    public Customer_getdata(){}
    
    public String getId (){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void Firstname(String firstName){
        this.firstName  = firstName;
    }
    
    public void Lastname(String lastName){
        this.lastName  = lastName;
    }
}
