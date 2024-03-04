package com.kaustubh.productserviceAPI.services;

import com.kaustubh.productserviceAPI.dtos.FakeStoreProductDto;
import com.kaustubh.productserviceAPI.models.Category;
import com.kaustubh.productserviceAPI.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FackStoreProductService implements  ProductService {

    private RestTemplate restTemplate;

    @Autowired
    public FackStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }



    private Products convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProduct){
        Products products= new Products();
        products.setId(fakeStoreProduct.getId());
        products.setTitle(fakeStoreProduct.getTitle());
        products.setPrice(fakeStoreProduct.getPrice());
        products.setCategory(new Category());
        products.getCategory().setName(fakeStoreProduct.getCategory());
        products.setDescription(fakeStoreProduct.getDescription());
        products.setImgUrl(fakeStoreProduct.getImage());

        return products;
    }
    @Override


    public Products getSinglePeoduct(Long id  ) {

        String apiUrl;
       FakeStoreProductDto productDto= restTemplate.getForObject(
                apiUrl = "https://fakestoreapi.com/products/"+id,
                FakeStoreProductDto.class
                                );
        return convertFakeStoreProductToProduct(productDto);
     }


}
