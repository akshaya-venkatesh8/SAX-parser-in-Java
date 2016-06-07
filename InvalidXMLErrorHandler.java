package com.github.akshayavenkatesh8;


import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 *
 * @author akshaya
 */
class InvalidXMLErrorHandler implements ErrorHandler{
    String check;
    @Override
    public void warning(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
         check = "Invalid";
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
         check = "Invalid";
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
         check = "Invalid";
    }
    
}
