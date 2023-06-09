package org.turkovaleksey.webfood.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.webfood.repository.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
