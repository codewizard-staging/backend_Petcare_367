package com.app.Petcare.repository;

import com.app.Petcare.model.Order;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderRepository extends SimpleJpaRepository<Order, String> {
    private final EntityManager em;
    public OrderRepository(EntityManager em) {
        super(Order.class, em);
        this.em = em;
    }
    @Override
    public List<Order> findAll() {
        return em.createNativeQuery("Select * from \"petcare_023\".\"Order\"", Order.class).getResultList();
    }
}