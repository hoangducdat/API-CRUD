package org.aibles.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAllProduct(){
        return productRepository.findAll();
    }
    @Override
    public Optional<ProductEntity> getProductById(Long id) {
        return productRepository.findById(id);
    }
    @Override
    public ProductEntity addProduct(ProductEntity newProduct) {
        return productRepository.save(newProduct);
    }
    @Override
    public ProductEntity updateProduct(Long id, ProductEntity productDetails) {
        ProductEntity product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));

        product.setProduct_name(productDetails.getProduct_name());
        product.setPrice(productDetails.getPrice());

        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
