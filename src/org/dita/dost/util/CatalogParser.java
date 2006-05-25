/*
 * (c) Copyright IBM Corp. 2005, 2006 All Rights Reserved.
 */
package org.dita.dost.util;

import java.io.File;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


/**
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 *
 * @author Zhang, Yuan Peng
 */
public class CatalogParser implements ContentHandler{
    
    /**
     * Automatically generated constructor: CatalogParser
     */
    public CatalogParser() {
    	dtdBase = null;
    	map = null;
    }

    private String dtdBase; 
    private HashMap map;
    private String catalogDir;
           

    /**
     * Default constructor of CatalogParser class.
     * 
     * @param catalogMap
     * 
     */
    public CatalogParser(HashMap catalogMap, String ditaDir) {
        super();
        map = catalogMap;
        catalogDir = ditaDir;
        dtdBase = null;
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#characters(char[], int, int)
     */
    public void characters(char[] ch, int start, int length)
            throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#endDocument()
     */
    public void endDocument() throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
     */
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if ("group".equals(qName)){
            dtdBase = null;
        }
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#endPrefixMapping(java.lang.String)
     */
    public void endPrefixMapping(String prefix) throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
    public void ignorableWhitespace(char[] ch, int start, int length)
            throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#processingInstruction(java.lang.String, java.lang.String)
     */
    public void processingInstruction(String target, String data)
            throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#setDocumentLocator(org.xml.sax.Locator)
     */
    public void setDocumentLocator(Locator locator) {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#skippedEntity(java.lang.String)
     */
    public void skippedEntity(String name) throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#startDocument()
     */
    public void startDocument() throws SAXException {
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    public void startElement(String uri, String localName, String qName,
            Attributes atts) throws SAXException {
        if ("group".equals(qName)){
            dtdBase = atts.getValue("xml:base");
        }
        
        if ("public".equals(qName)){
            String localURI;
            String absoluteLocalURI;
            localURI = (dtdBase != null) ? dtdBase+File.separatorChar+atts.getValue("uri") : atts.getValue("uri");
            absoluteLocalURI = (catalogDir != null) ? catalogDir + File.separatorChar + localURI : localURI;
            map.put(atts.getValue("publicId"), absoluteLocalURI);
        }
    }
    /** (non-Javadoc)
     * @see org.xml.sax.ContentHandler#startPrefixMapping(java.lang.String, java.lang.String)
     */
    public void startPrefixMapping(String prefix, String uri)
            throws SAXException {
    }
}