package com.app.Petcare.repository;

import com.app.Petcare.model.Product;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProductRepository extends SimpleJpaRepository<Product, String> {
    private final EntityManager em;
    public ProductRepository(EntityManager em) {
        super(Product.class, em);
        this.em = em;
    }
    @Override
    public List<Product> findAll() {
        return em.createNativeQuery("Select * from \"petcare_023\".\"Product\"", Product.class).getResultList();
    }
}