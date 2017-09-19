
package com.sgm.jqwms.wmstoilogtask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskResult" type="{http://www.saic-gm.com/jq-wms/WmsToIlogTask/}TaskResult" maxOccurs="unbounded"/>
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
    "taskResult"
})
@XmlRootElement(name = "WTOIOperationResponse")
public class WTOIOperationResponse {

    @XmlElement(name = "TaskResult", required = true)
    protected List<TaskResult> taskResult;

    /**
     * Gets the value of the taskResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskResult }
     * 
     * 
     */
    public List<TaskResult> getTaskResult() {
        if (taskResult == null) {
            taskResult = new ArrayList<TaskResult>();
        }
        return this.taskResult;
    }

}
