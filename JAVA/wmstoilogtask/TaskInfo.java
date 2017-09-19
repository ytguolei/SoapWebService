
package com.sgm.jqwms.wmstoilogtask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaskInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MoveType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskBiztype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlanNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllOpenMarker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UrgentMarker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfo", propOrder = {
    "taskNo",
    "plantId",
    "warehouseId",
    "moveType",
    "taskBiztype",
    "planNo",
    "allOpenMarker",
    "planDate",
    "taskItem",
    "huId",
    "externalNo",
    "partId",
    "qty",
    "section",
    "urgentMarker"
})
public class TaskInfo {

    @XmlElement(name = "TaskNo", required = true)
    protected String taskNo;
    @XmlElement(name = "PlantId", required = true)
    protected String plantId;
    @XmlElement(name = "WarehouseId", required = true)
    protected String warehouseId;
    @XmlElement(name = "MoveType", required = true)
    protected String moveType;
    @XmlElement(name = "TaskBiztype", required = true)
    protected String taskBiztype;
    @XmlElement(name = "PlanNo", required = true)
    protected String planNo;
    @XmlElement(name = "AllOpenMarker", required = true)
    protected String allOpenMarker;
    @XmlElement(name = "PlanDate", required = true)
    protected String planDate;
    @XmlElement(name = "TaskItem", required = true)
    protected String taskItem;
    @XmlElement(name = "HuId", required = true)
    protected String huId;
    @XmlElement(name = "ExternalNo", required = true)
    protected String externalNo;
    @XmlElement(name = "PartId", required = true)
    protected String partId;
    @XmlElement(name = "Qty", required = true)
    protected String qty;
    @XmlElement(name = "Section", required = true)
    protected String section;
    @XmlElement(name = "UrgentMarker", required = true)
    protected String urgentMarker;

    /**
     * ��ȡtaskNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskNo() {
        return taskNo;
    }

    /**
     * ����taskNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskNo(String value) {
        this.taskNo = value;
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
     * ��ȡmoveType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveType() {
        return moveType;
    }

    /**
     * ����moveType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveType(String value) {
        this.moveType = value;
    }

    /**
     * ��ȡtaskBiztype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskBiztype() {
        return taskBiztype;
    }

    /**
     * ����taskBiztype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskBiztype(String value) {
        this.taskBiztype = value;
    }

    /**
     * ��ȡplanNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * ����planNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNo(String value) {
        this.planNo = value;
    }

    /**
     * ��ȡallOpenMarker���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllOpenMarker() {
        return allOpenMarker;
    }

    /**
     * ����allOpenMarker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllOpenMarker(String value) {
        this.allOpenMarker = value;
    }

    /**
     * ��ȡplanDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * ����planDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDate(String value) {
        this.planDate = value;
    }

    /**
     * ��ȡtaskItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskItem() {
        return taskItem;
    }

    /**
     * ����taskItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskItem(String value) {
        this.taskItem = value;
    }

    /**
     * ��ȡhuId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuId() {
        return huId;
    }

    /**
     * ����huId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuId(String value) {
        this.huId = value;
    }

    /**
     * ��ȡexternalNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalNo() {
        return externalNo;
    }

    /**
     * ����externalNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalNo(String value) {
        this.externalNo = value;
    }

    /**
     * ��ȡpartId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartId() {
        return partId;
    }

    /**
     * ����partId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartId(String value) {
        this.partId = value;
    }

    /**
     * ��ȡqty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * ����qty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * ��ȡsection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * ����section���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * ��ȡurgentMarker���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgentMarker() {
        return urgentMarker;
    }

    /**
     * ����urgentMarker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgentMarker(String value) {
        this.urgentMarker = value;
    }

}
