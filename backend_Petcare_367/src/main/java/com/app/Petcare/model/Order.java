package com.app.Petcare.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.Petcare.model.Customer;
import com.app.Petcare.model.Product;
import com.app.Petcare.model.Order;
import com.app.Petcare.model.OrderItem;
import com.app.Petcare.converter.DurationConverter;
import com.app.Petcare.converter.UUIDToByteConverter;
import com.app.Petcare.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Order")
@Table(name = "\"Order\"", schema =  "\"petcare_023\"")
@Data
                        
public class Order {
	public Order () {   
  }
	  
  @Id
  @Column(name = "\"OrderId\"", nullable = true )
  private String orderId;
	  
  @Column(name = "\"OrderDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date orderDate;  
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"Ordercustomer\"", referencedColumnName = "\"CustomerId\"", insertable = false, updatable = false)
	private Customer customer;
	
	@Column(name = "\"Ordercustomer\"")
	private String ordercustomer;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"OrderorderItems\"",
            joinColumns = @JoinColumn( name="\"OrderId\""),
            inverseJoinColumns = @JoinColumn( name="\"OrderItemId\""), schema = "\"petcare_023\"")
private List<OrderItem> orderItems = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Order [" 
  + "OrderId= " + orderId  + ", " 
  + "OrderDate= " + orderDate 
 + "]";
	}
	
}