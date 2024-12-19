package com.app.Petcare.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Petcare.model.Customer;
import com.app.Petcare.model.Product;
import com.app.Petcare.model.Order;
import com.app.Petcare.model.OrderItem;

@Entity(name = "Customerorders")
@Table(schema = "\"petcare_023\"", name = "\"Customerorders\"")
@Data
public class Customerorders{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CustomerId\"")
	private String customerId;

    
    @Column(name = "\"OrderId\"")
    private String orderId;
 
}