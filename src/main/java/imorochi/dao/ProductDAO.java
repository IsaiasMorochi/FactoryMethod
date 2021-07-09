package imorochi.dao;

import imorochi.DBConnectionFactory;
import imorochi.IDBAdapter;
import imorochi.entity.Product;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private IDBAdapter dbAdapter;

    public ProductDAO(){
        dbAdapter = DBConnectionFactory.getDefaultDBAdapter();
    }

    public List<Product> findAllProducts(){
        Connection connection = dbAdapter.getConnection();
        List<Product> productList = new ArrayList<>();
        // TODO: Implementation
        return productList;
    }

    public boolean saveProduct(Product product){
        Connection connection = dbAdapter.getConnection();
        // TODO: Implementation
        return false;
    }
}
