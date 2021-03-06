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

@XmlRootElement(name = "MATTEXT")
@XmlAccessorType(XmlAccessType.FIELD)
//Объект, входящий в product (если рассматривать лист этих объектов в объекте начального файла)
public class LangName {

    @XmlElement(name = "LANGKEY")
    private String lang;

    @XmlElement(name = "TEXT")
    private String name;
}
