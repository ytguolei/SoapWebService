
package com.sgm.jqwms.wmstoilogtask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取taskNo属性的值。
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
     * 设置taskNo属性的值。
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
     * 获取plantId属性的值。
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
     * 设置plantId属性的值。
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
     * 获取warehouseId属性的值。
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
     * 设置warehouseId属性的值。
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
     * 获取moveType属性的值。
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
     * 设置moveType属性的值。
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
     * 获取taskBiztype属性的值。
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
     * 设置taskBiztype属性的值。
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
     * 获取planNo属性的值。
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
     * 设置planNo属性的值。
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
     * 获取allOpenMarker属性的值。
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
     * 设置allOpenMarker属性的值。
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
     * 获取planDate属性的值。
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
     * 设置planDate属性的值。
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
     * 获取taskItem属性的值。
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
     * 设置taskItem属性的值。
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
     * 获取huId属性的值。
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
     * 设置huId属性的值。
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
     * 获取externalNo属性的值。
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
     * 设置externalNo属性的值。
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
     * 获取partId属性的值。
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
     * 设置partId属性的值。
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
     * 获取qty属性的值。
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
     * 设置qty属性的值。
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
     * 获取section属性的值。
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
     * 设置section属性的值。
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
     * 获取urgentMarker属性的值。
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
     * 设置urgentMarker属性的值。
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
