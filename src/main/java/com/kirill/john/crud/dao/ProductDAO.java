package com.kirill.john.crud.dao;

import com.kirill.john.crud.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> list() {
        return jdbcTemplate.query("SELECT * FROM product", new BeanPropertyRowMapper<>(Product.class));
    }

    public Product show(int id) {
        return jdbcTemplate.query("SELECT * FROM product WHERE id=?", new BeanPropertyRowMapper<>(Product.class), id)
                .stream().findAny().orElse(null);
    }

    public void save(Product product) {
        jdbcTemplate.update("INSERT INTO product(title, description, price) VALUES(?, ?, ?)",
                product.getTitle(), product.getDescription(), product.getPrice());

    }

    public void update(int id, Product updatedProduct) {
        jdbcTemplate.update("UPDATE product SET title=?, description=?, price=? WHERE id=?",
                updatedProduct.getTitle(), updatedProduct.getDescription(), updatedProduct.getPrice(), id);

    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM product WHERE id=?", id);
    }
}
