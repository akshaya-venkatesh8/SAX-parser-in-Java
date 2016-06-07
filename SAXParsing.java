
package com.github.akshayavenkatesh8;

import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author akshaya
 */
public class SAXParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    
      try {	
        File inputFile = new File("address.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         USAddressHandler userhandler = new USAddressHandler();
         saxParser.parse(inputFile, userhandler);
        Address add = userhandler.getAddress();
         System.out.println(add);      
          } 
         catch (Exception e) {
             System.out.println(e);
      }
    }
  }
