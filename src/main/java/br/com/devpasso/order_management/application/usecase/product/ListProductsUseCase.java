package br.com.devpasso.order_management.application.usecase.product;

import br.com.devpasso.order_management.domain.model.Product;
import br.com.devpasso.order_management.domain.repository.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // <-- Esta anotação já cria o construtor em segundo plano!
public class ListProductsUseCase {

    private final ProductRepositoryPort repository;

    // Se houver um bloco de código como:
    // public ListProductsUseCase(ProductRepositoryPort repository) { ... }
    // APAGUE ELE COMPLETAMENTE!

    public Page<Product> execute(Pageable pageable) {
        return repository.findAll(pageable);
    }
}