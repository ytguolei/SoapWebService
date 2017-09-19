
package com.sgm.jqwms.wmstoilogtask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaskResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskResult", propOrder = {
    "warehouseId",
    "plantId",
    "requestNo",
    "taskType",
    "status",
    "remark"
})
public class TaskResult {

    @XmlElement(name = "WarehouseId", required = true)
    protected String warehouseId;
    @XmlElement(name = "PlantId", required = true)
    protected String plantId;
    @XmlElement(name = "RequestNo", required = true)
    protected String requestNo;
    @XmlElement(name = "TaskType", required = true)
    protected String taskType;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Remark", required = true)
    protected String remark;

    /**
     * ��ȡwarehouseId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * ����warehouseId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseId(String value) {
        this.warehouseId = value;
    }

    /**
     * ��ȡplantId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantId() {
        return plantId;
    }

    /**
     * ����plantId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantId(String value) {
        this.plantId = value;
    }

    /**
     * ��ȡrequestNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     * ����requestNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNo(String value) {
        this.requestNo = value;
    }

    /**
     * ��ȡtaskType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * ����taskType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
