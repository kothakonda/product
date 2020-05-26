package app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

    @Id
    private String id;

    private String name;

    private String productId;

    //private ProductType productType;

}
