package cn.cxd.springcloud.service;

import java.util.List;

import cn.cxd.springcloud.client.ProductClientFeign;
import cn.cxd.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();

    }
}