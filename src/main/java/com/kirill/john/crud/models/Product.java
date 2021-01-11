package com.kirill.john.crud.models;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class Product {

    private int id;

    @NotEmpty(message = "Название продукта не может быть пустым.")
    @Size(min = 2, max = 30, message = "Длина названия должна быть от 2-х до 30-ти символов")
    private String title;

    @NotEmpty(message = "Введите описание продукта.")
    @Size(min = 2, max = 30, message = "Длина описания должна быть от 2-х до 300-ти символов")
    private String description;

    @DecimalMin(value = "0.0", message = "Цена должна быть больше 0", inclusive = false)
    private BigDecimal price;


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public Product() {
    }

    public Product(int id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
