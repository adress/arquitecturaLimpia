package dev.adress.hexagonalexamaple.api.rest;

import dev.adress.hexagonalexamaple.api.converters.ProductConverter;
import dev.adress.hexagonalexamaple.api.vo.ProductVO;
import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.ports.primary.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductConverter productConverter;
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductVO> addProduct(@RequestBody final ProductVO productVO) {
        final Product product = productConverter.convertToDomain(productVO);
        Product savedProduct = productService.addProduct(product);
        return ResponseEntity.of(Optional.of(productConverter.convertToVO(savedProduct)));
    }
}
