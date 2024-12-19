package com.app.Petcare.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Petcare.model.Customer;
import com.app.Petcare.model.Product;
import com.app.Petcare.model.Order;
import com.app.Petcare.model.OrderItem;

@Entity(name = "ProductorderItems")
@Table(schema = "\"petcare_023\"", name = "\"ProductorderItems\"")
@Data
public class ProductorderItems{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ProductId\"")
	private String productId;

    
    @Column(name = "\"OrderItemId\"")
    private String orderItemId;
 
}