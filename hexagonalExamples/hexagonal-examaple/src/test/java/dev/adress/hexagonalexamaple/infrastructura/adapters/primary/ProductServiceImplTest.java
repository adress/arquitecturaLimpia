package dev.adress.hexagonalexamaple.infrastructura.adapters.primary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.ports.primary.ProductService;
import dev.adress.hexagonalexamaple.infrastructura.ports.secondary.ProductRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ProductServiceImplTest {

    private final ProductRepository productRepository = mock(ProductRepository.class);
    private final ProductService sut = new ProductServiceImpl(productRepository);

    @Test
    public void ShouldCallRepositoryToSaveProduct() {
        Product product = Product.builder().build();

        sut.addProduct(product);

        verify(productRepository).addProduct(product);

    }
}