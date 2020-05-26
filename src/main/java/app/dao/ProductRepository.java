package app.dao;

import app.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductRepository<T extends Product, ID extends Serializable> extends MongoRepository<T, String> {


}
