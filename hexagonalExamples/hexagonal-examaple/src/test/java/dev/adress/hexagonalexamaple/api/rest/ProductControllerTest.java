package dev.adress.hexagonalexamaple.api.rest;

import dev.adress.hexagonalexamaple.api.converters.ProductConverter;
import dev.adress.hexagonalexamaple.api.vo.ProductVO;
import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.ports.primary.ProductService;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ProductControllerTest {

    private final ProductConverter productConverter = mock(ProductConverter.class);
    private final ProductService productService = mock(ProductService.class);
    private final ProductController sut = new ProductController(productConverter, productService);

    @Test
    public void shouldCallServiceToAddProduct() {
        ProductVO productVo = ProductVO.builder().build();
        Product product = Product.builder().build();

        when(productConverter.convertToVO(any())).thenReturn(productVo);
        when(productConverter.convertToDomain(any())).thenReturn(product);

        sut.addProduct(productVo);

        verify(productService).addProduct(product);
    }

}
