package com.keven.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@NamedQueries({
    @NamedQuery(
            name = OrderEntry.QUERY_BY_ORDER_NUMBER,
            query = "from OrderEntry r where r." + OrderEntry.PARAM_ORDER_NUMBER + "= :"
            		+ OrderEntry.PARAM_ORDER_NUMBER
    )
})
@Entity
@XmlRootElement(name = "OrderEntry")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderEntry implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public static final String QUERY_BY_ORDER_NUMBER = "findByOrderNumber";
    public static final String PARAM_ORDER_NUMBER = "orderNumber";
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OrderEntry_seq")
    @SequenceGenerator(name = "OrderEntry_seq", sequenceName = "OrderEntry_seq")
    private Long id;	
	
	private String orderNumber;
	private Integer quantity;
	private boolean active;
	private String note;

	public OrderEntry() {
		super();
	}
	
	public OrderEntry(String orderNumber, int quantity, boolean active,
			String note) {
		super();
		this.orderNumber = orderNumber;
		this.quantity = quantity;
		this.active = active;
		this.note = note;
	}
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "OrderEntry [id=" + id + ", orderNumber=" + orderNumber
				+ ", quantity=" + quantity + ", active=" + active + ", note="
				+ note + "]";
	}

}
