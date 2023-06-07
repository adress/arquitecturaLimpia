package dev.adress.hexagonalexamaple.api.converters;

import dev.adress.hexagonalexamaple.api.vo.ProductVO;
import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.domain.ProductData;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public ProductVO convertToVO(Product product) {
        ProductVO productVO = ProductVO.builder()
                .id(product.getId())
                .name(product.getProductData().getName())
                .price(product.getProductData().getPrice())
                .company(product.getProductData().getCompany())
                .build();
        return productVO;
    }

    public Product convertToDomain(ProductVO productVO) {
        ProductData productData = ProductData.builder()
                .name(productVO.getName())
                .price(productVO.getPrice())
                .company(productVO.getCompany())
                .build();

        Product product = Product.builder()
                .id(productVO.getId())
                .productData(productData)
                .build();
        return product;
    }
}
