package com.app.Petcare.function;

import com.app.Petcare.model.Customer;
import com.app.Petcare.model.Product;
import com.app.Petcare.model.Order;
import com.app.Petcare.model.OrderItem;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Petcare.repository.OrderRepository;
import com.app.Petcare.repository.CustomerRepository;
import com.app.Petcare.repository.OrderItemRepository;
import com.app.Petcare.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
