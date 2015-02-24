//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.11 at 02:28:24 PM BST 
//


package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstPage" type="{}StaticPage" minOccurs="0"/>
 *         &lt;element name="previousPage" type="{}StaticPage" minOccurs="0"/>
 *         &lt;element name="nextPage" type="{}StaticPage" minOccurs="0"/>
 *         &lt;element name="lastPage" type="{}StaticPage" minOccurs="0"/>
 *         &lt;element name="pages" type="{}Pages"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currentPage",
    "totalPages",
    "firstPage",
    "previousPage",
    "nextPage",
    "lastPage",
    "pages"
})
@XmlRootElement(name = "pagination")
public class Pagination {

    protected int currentPage;
    protected int totalPages;
    protected StaticPage firstPage;
    protected StaticPage previousPage;
    protected StaticPage nextPage;
    protected StaticPage lastPage;
    @XmlElement(required = true)
    protected Pages pages;

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link StaticPage }
     *     
     */
    public StaticPage getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticPage }
     *     
     */
    public void setFirstPage(StaticPage value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the previousPage property.
     * 
     * @return
     *     possible object is
     *     {@link StaticPage }
     *     
     */
    public StaticPage getPreviousPage() {
        return previousPage;
    }

    /**
     * Sets the value of the previousPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticPage }
     *     
     */
    public void setPreviousPage(StaticPage value) {
        this.previousPage = value;
    }

    /**
     * Gets the value of the nextPage property.
     * 
     * @return
     *     possible object is
     *     {@link StaticPage }
     *     
     */
    public StaticPage getNextPage() {
        return nextPage;
    }

    /**
     * Sets the value of the nextPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticPage }
     *     
     */
    public void setNextPage(StaticPage value) {
        this.nextPage = value;
    }

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link StaticPage }
     *     
     */
    public StaticPage getLastPage() {
        return lastPage;
    }

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticPage }
     *     
     */
    public void setLastPage(StaticPage value) {
        this.lastPage = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

}