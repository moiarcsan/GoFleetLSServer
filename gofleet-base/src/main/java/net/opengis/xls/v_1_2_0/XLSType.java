//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.20 at 01:31:32 PM MEZ 
//


package net.opengis.xls.v_1_2_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Defines the top element of an XML document representing a message.
 * 
 * <p>Java class for XLSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}_Header"/>
 *         &lt;element ref="{http://www.opengis.net/xls}_Body" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute ref="{http://www.opengis.net/xls}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLSType", propOrder = {
    "header",
    "body"
})
@XmlRootElement(namespace="http://www.opengis.net/xls", name="xls")
public class XLSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Header", namespace = "http://www.opengis.net/xls", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractHeaderType> header;
    @XmlElementRef(name = "_Body", namespace = "http://www.opengis.net/xls", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractBodyType>> body;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "lang", namespace = "http://www.opengis.net/xls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractHeaderType> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     *     
     */
    public void setHeader(JAXBElement<? extends AbstractHeaderType> value) {
        this.header = ((JAXBElement<? extends AbstractHeaderType> ) value);
    }

    /**
     * Gets the value of the body property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the body property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractBodyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractBodyType>> getBody() {
        if (body == null) {
            body = new ArrayList<JAXBElement<? extends AbstractBodyType>>();
        }
        return this.body;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Defines the preferred language used for formatting responses. 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<? extends AbstractHeaderType> theHeader;
            theHeader = this.getHeader();
            strategy.appendField(locator, this, "header", buffer, theHeader);
        }
        {
            List<JAXBElement<? extends AbstractBodyType>> theBody;
            theBody = this.getBody();
            strategy.appendField(locator, this, "body", buffer, theBody);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            String theLang;
            theLang = this.getLang();
            strategy.appendField(locator, this, "lang", buffer, theLang);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof XLSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final XLSType that = ((XLSType) object);
        {
            JAXBElement<? extends AbstractHeaderType> lhsHeader;
            lhsHeader = this.getHeader();
            JAXBElement<? extends AbstractHeaderType> rhsHeader;
            rhsHeader = that.getHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header", lhsHeader), LocatorUtils.property(thatLocator, "header", rhsHeader), lhsHeader, rhsHeader)) {
                return false;
            }
        }
        {
            List<JAXBElement<? extends AbstractBodyType>> lhsBody;
            lhsBody = this.getBody();
            List<JAXBElement<? extends AbstractBodyType>> rhsBody;
            rhsBody = that.getBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "body", lhsBody), LocatorUtils.property(thatLocator, "body", rhsBody), lhsBody, rhsBody)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            String lhsLang;
            lhsLang = this.getLang();
            String rhsLang;
            rhsLang = that.getLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lang", lhsLang), LocatorUtils.property(thatLocator, "lang", rhsLang), lhsLang, rhsLang)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            JAXBElement<? extends AbstractHeaderType> theHeader;
            theHeader = this.getHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "header", theHeader), currentHashCode, theHeader);
        }
        {
            List<JAXBElement<? extends AbstractBodyType>> theBody;
            theBody = this.getBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "body", theBody), currentHashCode, theBody);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            String theLang;
            theLang = this.getLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lang", theLang), currentHashCode, theLang);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof XLSType) {
            final XLSType copy = ((XLSType) draftCopy);
            if (this.header!= null) {
                JAXBElement<? extends AbstractHeaderType> sourceHeader;
                sourceHeader = this.getHeader();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends AbstractHeaderType> copyHeader = ((JAXBElement<? extends AbstractHeaderType> ) strategy.copy(LocatorUtils.property(locator, "header", sourceHeader), sourceHeader));
                copy.setHeader(copyHeader);
            } else {
                copy.header = null;
            }
            if ((this.body!= null)&&(!this.body.isEmpty())) {
                List<JAXBElement<? extends AbstractBodyType>> sourceBody;
                sourceBody = this.getBody();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractBodyType>> copyBody = ((List<JAXBElement<? extends AbstractBodyType>> ) strategy.copy(LocatorUtils.property(locator, "body", sourceBody), sourceBody));
                copy.body = null;
                List<JAXBElement<? extends AbstractBodyType>> uniqueBodyl = copy.getBody();
                uniqueBodyl.addAll(copyBody);
            } else {
                copy.body = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.lang!= null) {
                String sourceLang;
                sourceLang = this.getLang();
                String copyLang = ((String) strategy.copy(LocatorUtils.property(locator, "lang", sourceLang), sourceLang));
                copy.setLang(copyLang);
            } else {
                copy.lang = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new XLSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof XLSType) {
            final XLSType target = this;
            final XLSType leftObject = ((XLSType) left);
            final XLSType rightObject = ((XLSType) right);
            {
                JAXBElement<? extends AbstractHeaderType> lhsHeader;
                lhsHeader = leftObject.getHeader();
                JAXBElement<? extends AbstractHeaderType> rhsHeader;
                rhsHeader = rightObject.getHeader();
                target.setHeader(((JAXBElement<? extends AbstractHeaderType> ) strategy.merge(LocatorUtils.property(leftLocator, "header", lhsHeader), LocatorUtils.property(rightLocator, "header", rhsHeader), lhsHeader, rhsHeader)));
            }
            {
                List<JAXBElement<? extends AbstractBodyType>> lhsBody;
                lhsBody = leftObject.getBody();
                List<JAXBElement<? extends AbstractBodyType>> rhsBody;
                rhsBody = rightObject.getBody();
                target.body = null;
                List<JAXBElement<? extends AbstractBodyType>> uniqueBodyl = target.getBody();
                uniqueBodyl.addAll(((List<JAXBElement<? extends AbstractBodyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "body", lhsBody), LocatorUtils.property(rightLocator, "body", rhsBody), lhsBody, rhsBody)));
            }
            {
                String lhsVersion;
                lhsVersion = leftObject.getVersion();
                String rhsVersion;
                rhsVersion = rightObject.getVersion();
                target.setVersion(((String) strategy.merge(LocatorUtils.property(leftLocator, "version", lhsVersion), LocatorUtils.property(rightLocator, "version", rhsVersion), lhsVersion, rhsVersion)));
            }
            {
                String lhsLang;
                lhsLang = leftObject.getLang();
                String rhsLang;
                rhsLang = rightObject.getLang();
                target.setLang(((String) strategy.merge(LocatorUtils.property(leftLocator, "lang", lhsLang), LocatorUtils.property(rightLocator, "lang", rhsLang), lhsLang, rhsLang)));
            }
        }
    }

    public void setBody(List<JAXBElement<? extends AbstractBodyType>> value) {
        List<JAXBElement<? extends AbstractBodyType>> draftl = this.getBody();
        draftl.addAll(value);
    }

}
