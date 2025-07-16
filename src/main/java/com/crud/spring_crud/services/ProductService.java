package com.crud.spring_crud.services;

import com.crud.spring_crud.models.ProductModel;
import com.crud.spring_crud.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public Page<ProductModel> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<ProductModel> findById(UUID id) {
        return productRepository.findById(id);
    }
}
