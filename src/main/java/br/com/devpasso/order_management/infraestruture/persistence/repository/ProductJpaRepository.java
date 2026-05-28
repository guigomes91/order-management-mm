package br.com.devpasso.order_management.infraestruture.persistence.repository;

import br.com.devpasso.order_management.infraestruture.persistence.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<Product, UUID> {

}
