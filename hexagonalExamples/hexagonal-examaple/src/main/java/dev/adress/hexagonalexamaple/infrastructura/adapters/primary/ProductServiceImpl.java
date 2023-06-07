package dev.adress.hexagonalexamaple.infrastructura.adapters.primary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.ports.primary.ProductService;
import dev.adress.hexagonalexamaple.infrastructura.ports.secondary.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }
}
