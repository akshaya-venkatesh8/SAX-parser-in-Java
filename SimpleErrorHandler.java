package com.github.akshayavenkatesh8;


import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 *
 * @author akshaya
 */
class SimpleErrorHandler implements ErrorHandler{

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        System.out.println("ERROR : "+exception.getMessage());
    }
    
}
