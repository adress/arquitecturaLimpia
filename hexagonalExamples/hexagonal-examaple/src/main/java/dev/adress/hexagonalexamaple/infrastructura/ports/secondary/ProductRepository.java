package dev.adress.hexagonalexamaple.infrastructura.ports.secondary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;

public interface ProductRepository {
    Product addProduct(Product product);
}
