package app.service;


import app.dao.ProductRepository;
import app.model.Product;
import app.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(ProductVO productVO) {
        Product product = new Product();
        product.setName(productVO.getProductName());
        product.setProductId(productVO.getProductId());
        productRepository.save(product);
        return product;
    }


}
