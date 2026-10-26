package tn.tp.dev.Customer_service;

import java.io.Serializable;

public class OrderDto implements Serializable {
    private Long customerId;
    private String productName;

    public OrderDto() {}

    public OrderDto(Long customerId, String productName) {
        this.customerId = customerId;
        this.productName = productName;
    }

    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

}
