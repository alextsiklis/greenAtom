package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "ProductDefinition", namespace = "urn:test.ru")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    @XmlElement(name = "RefNo")
    private int Id;

    @XmlElement(name = "Description")
    private String Description;
}