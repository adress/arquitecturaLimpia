package dev.adress.hexagonalexamaple.infrastructura.adapters.secondary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryMySQLDataBaseTest {

    private final ProductRepositoryMySQLDataBase sut = new ProductRepositoryMySQLDataBase();

    @Test
    public void shouldAddProduct() {
        final Product product = Product.builder().build();

        sut.addProduct(product);
        assertEquals(ProductRepositoryMySQLDataBase.products.size(), 1);
    }
}