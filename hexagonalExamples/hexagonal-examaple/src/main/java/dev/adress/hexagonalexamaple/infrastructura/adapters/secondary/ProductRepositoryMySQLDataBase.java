package dev.adress.hexagonalexamaple.infrastructura.adapters.secondary;

import dev.adress.hexagonalexamaple.infrastructura.domain.Product;
import dev.adress.hexagonalexamaple.infrastructura.ports.secondary.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryMySQLDataBase implements ProductRepository {

    public static List<Product> products = new ArrayList<>();


    @Override
    public Product addProduct(Product product) {
        if (products.add(product)) {
            return product;
        }
        return null;
    }
}
