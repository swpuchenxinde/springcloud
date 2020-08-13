package cn.cxd.springcloud.client;

import cn.cxd.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClientRibbon {
    //Ribbon 是使用 restTemplate 进行调用，并进行客户端负载均衡
    @Autowired
    RestTemplate restTemplate;
    public List<Product> listProdcuts() {
        //product-data-service 是数据服务在 eureka 注册中心的名称
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }
}