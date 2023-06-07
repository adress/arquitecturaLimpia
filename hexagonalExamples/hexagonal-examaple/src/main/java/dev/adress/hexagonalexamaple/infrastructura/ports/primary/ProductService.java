package dev.adress.hexagonalexamaple.infrastructura.ports.primary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;


public interface ProductService {
    Product addProduct(Product product);
}
