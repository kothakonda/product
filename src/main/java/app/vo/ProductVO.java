package app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductVO extends BaseVO{
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("productName")
    private String productName;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
