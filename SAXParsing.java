
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
         factory.setValidating(false);
         factory.setNamespaceAware(true);
         SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
         factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource("address.xsd")}));
         SAXParser saxParser = factory.newSAXParser();
         XMLReader reader = saxParser.getXMLReader();
         InvalidXMLErrorHandler ieh = new InvalidXMLErrorHandler();
         reader.setErrorHandler(ieh);
         reader.parse(new InputSource("address.xml"));
         if (ieh.check == null){
         USAddressHandler userhandler = new USAddressHandler();
         saxParser.parse(inputFile, userhandler);
         Address add = userhandler.getAddress();
         System.out.println(add);
         }
          } 
         catch (Exception e) {
             System.out.println(e);
      }
    }
  }
