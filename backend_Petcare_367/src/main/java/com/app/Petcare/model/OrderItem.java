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

@Entity(name = "OrderItem")
@Table(name = "\"OrderItem\"", schema =  "\"petcare_023\"")
@Data
                        
public class OrderItem {
	public OrderItem () {   
  }
	  
  @Id
  @Column(name = "\"OrderItemId\"", nullable = true )
  private String orderItemId;
	  
  @Column(name = "\"Quantity\"", nullable = true )
  private Integer quantity;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"OrderItemorder\"", referencedColumnName = "\"OrderId\"", insertable = false, updatable = false)
	private Order order;
	
	@Column(name = "\"OrderItemorder\"")
	private String orderItemorder;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"OrderItemproduct\"", referencedColumnName = "\"ProductId\"", insertable = false, updatable = false)
	private Product product;
	
	@Column(name = "\"OrderItemproduct\"")
	private String orderItemproduct;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "OrderItem [" 
  + "OrderItemId= " + orderItemId  + ", " 
  + "Quantity= " + quantity 
 + "]";
	}
	
}