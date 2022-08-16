package com.shop.app.domain;

import java.io.Serializable;
import javax.validation.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Product.
 */
@Document(collection = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("id_product")
    private Integer id_product;

    @Field("product_name")
    private String productName;

    @NotNull
    @Min(value = 0)
    @Max(value = 9999)
    @Field("amount")
    private Integer amount;

    @Field("image")
    private String image;

    @Field("price")
    private Integer price;

    @Field("category_name")
    private String categoryName;

    @Field("category_id")
    private Integer categoryId;

    @Field("total_price")
    private Integer totalPrice;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getId() {
        return this.id;
    }

    public Product id(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getId_product() {
        return this.id_product;
    }

    public Product id_product(Integer id_product) {
        this.setId_product(id_product);
        return this;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getProductName() {
        return this.productName;
    }

    public Product productName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Product amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getImage() {
        return this.image;
    }

    public Product image(String image) {
        this.setImage(image);
        return this;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Product price(Integer price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Product categoryName(String categoryName) {
        this.setCategoryName(categoryName);
        return this;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public Product categoryId(Integer categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public Product totalPrice(Integer totalPrice) {
        this.setTotalPrice(totalPrice);
        return this;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", id_product=" + getId_product() +
            ", productName='" + getProductName() + "'" +
            ", amount=" + getAmount() +
            ", image='" + getImage() + "'" +
            ", price=" + getPrice() +
            ", categoryName='" + getCategoryName() + "'" +
            ", categoryId=" + getCategoryId() +
            ", totalPrice=" + getTotalPrice() +
            "}";
    }
}
