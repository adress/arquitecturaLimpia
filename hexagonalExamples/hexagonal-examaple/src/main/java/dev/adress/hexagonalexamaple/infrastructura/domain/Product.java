package dev.adress.hexagonalexamaple.infrastructura.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Product {
    private int id;
    private ProductData productData;

}
