package com.app.Petcare.repository;

import com.app.Petcare.model.OrderItem;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderItemRepository extends SimpleJpaRepository<OrderItem, String> {
    private final EntityManager em;
    public OrderItemRepository(EntityManager em) {
        super(OrderItem.class, em);
        this.em = em;
    }
    @Override
    public List<OrderItem> findAll() {
        return em.createNativeQuery("Select * from \"petcare_023\".\"OrderItem\"", OrderItem.class).getResultList();
    }
}