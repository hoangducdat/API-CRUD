package org.aibles.api.product;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductService {
    List<ProductEntity> getAllProduct();
    Optional<ProductEntity> getProductById(Long id);
    ProductEntity addProduct(ProductEntity newProduct);
    ProductEntity updateProduct(Long id, ProductEntity productDetails);
    void deleteProduct(Long id);
}
