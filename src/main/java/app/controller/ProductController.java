package app.controller;

import app.model.Product;
import app.service.ProductService;
import app.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @ResponseStatus(value = OK)
    @RequestMapping(method = POST, path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> addProduct(@RequestBody ProductVO productVO) {
        log.info("Request received:{}", productVO);
        Product product = productService.addProduct(productVO);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
