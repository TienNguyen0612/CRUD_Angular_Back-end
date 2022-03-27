package codegym.service;

import codegym.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> FindAllProducts();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void remove(Long id);
}
