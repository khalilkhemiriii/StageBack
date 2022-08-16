package com.shop.app.domain;

import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Order.
 */
@Document(collection = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("final_price")
    private Integer finalPrice;

    @Field("shipping_city")
    private String shippingCity;

    @Field("shipping_street")
    private String shippingStreet;

    @Field("shipping_date")
    private LocalDate shippingDate;

    @Field("order_date")
    private LocalDate orderDate;

    @Field("credit_card")
    private Integer creditCard;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getId() {
        return this.id;
    }

    public Order id(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFinalPrice() {
        return this.finalPrice;
    }

    public Order finalPrice(Integer finalPrice) {
        this.setFinalPrice(finalPrice);
        return this;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getShippingCity() {
        return this.shippingCity;
    }

    public Order shippingCity(String shippingCity) {
        this.setShippingCity(shippingCity);
        return this;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingStreet() {
        return this.shippingStreet;
    }

    public Order shippingStreet(String shippingStreet) {
        this.setShippingStreet(shippingStreet);
        return this;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public LocalDate getShippingDate() {
        return this.shippingDate;
    }

    public Order shippingDate(LocalDate shippingDate) {
        this.setShippingDate(shippingDate);
        return this;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public Order orderDate(LocalDate orderDate) {
        this.setOrderDate(orderDate);
        return this;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getCreditCard() {
        return this.creditCard;
    }

    public Order creditCard(Integer creditCard) {
        this.setCreditCard(creditCard);
        return this;
    }

    public void setCreditCard(Integer creditCard) {
        this.creditCard = creditCard;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", finalPrice=" + getFinalPrice() +
            ", shippingCity='" + getShippingCity() + "'" +
            ", shippingStreet='" + getShippingStreet() + "'" +
            ", shippingDate='" + getShippingDate() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            ", creditCard=" + getCreditCard() +
            "}";
    }
}
