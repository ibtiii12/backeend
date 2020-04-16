package com.pcd.ecommerce.service;


import com.pcd.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Product product);

    List<Product > getAllProduct();

    Product getProductById(long productId);

    List<Product> getAllByUserId(long id);

    Product uploadImage(long id, MultipartFile image) throws IOException;

    void deleteProduct(long id);

    void setOwner(long userId, long productId);
}
