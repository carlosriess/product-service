package com.tutuman.productservice.data_migration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.tutuman.productservice.model.Product;
import com.tutuman.productservice.repository.ProductRepository;

import java.math.BigDecimal;

@ChangeLog(order = "001")
public class DatabaseChangeLog {
    @ChangeSet(order = "001", id = "add xiaomi products", author = "tutuman.es")
    public void init(ProductRepository repo) {
        Product product = new Product();
        product.setDescription("mobile phone");
        product.setName("Redmi Note 8T");
        product.setPrice(BigDecimal.valueOf(150));
        repo.save(product);
    }
}
