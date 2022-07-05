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
class Product_GetData {
    //Atributos
        private  String name;
        private  double price;
        private  double taxes;
        
        public Product_GetData() {} 
        
        public String getName(){
            return name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public double getTaxes(){
            return taxes;
        }
        
        public void setTaxes(Double taxes){
            this.taxes = taxes;
        }
        
        public double getPrice(){
            return price;
        }
        
        public void setPrice(Double price){
            this.price = price;
        }
        
        
        
        
}
