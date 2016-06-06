/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.akshayavenkatesh8;
import java.util.jar.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 *
 * @author akshaya
 */
class UserHandler extends DefaultHandler {
    public Address address = new Address();
    public String temp;
    @Override
   public void startElement(String uri, String localName, String qName, Attributes att) throws SAXException {
       
       temp="";
       
   }
    @Override
   public void endElement(String uri, String localName, String qName)  {
             if (qName.equalsIgnoreCase("name")) {
             address.setName(temp);
              } else if (qName.equalsIgnoreCase("streetnumber")) {
                     address.setStreetNumber(temp);
              } else if (qName.equalsIgnoreCase("streetname")) {
                     address.setStreetName(temp);
              } else if (qName.equalsIgnoreCase("secondaryaddress")) {
                     address.setSecondaryAddress(temp);
              } else if (qName.equalsIgnoreCase("city")) {
                     address.setCity(temp);
              } else if (qName.equalsIgnoreCase("statecode")) {
                     address.setStateCode(temp);
              } else if (qName.equalsIgnoreCase("zipcode")) {
                     address.setZipCode(temp);
              }
}

      @Override
   public void characters(char[] buffer, int start, int length)  {
      
         temp = new String(buffer, start, length);
        
   }
   public Address getAddress()
   {
       return address;
   }
    
}
