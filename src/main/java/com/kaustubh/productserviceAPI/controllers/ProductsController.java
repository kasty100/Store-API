package com.kaustubh.productserviceAPI.controllers;

import com.kaustubh.productserviceAPI.models.Products;
import com.kaustubh.productserviceAPI.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductsController {

        @GetMapping()// localhost:8080/products
    public List<Products> getAllProducts(){


            return new ArrayList<>();
        }

        private ProductService productService ;

        @Autowired
        public ProductsController(ProductService productService){
            this.productService=productService;
        }

        @GetMapping("/{id}")
        public Products getSingleProduct(@PathVariable("id") Long id){
            return productService.getSinglePeoduct(id);
        }

        @PostMapping()
        public  Products addNewProduct(@RequestBody Products products){

            Products p = new Products();
            p.setTitle("A New Product ");
            return  p;
        }
        @PatchMapping("/{id}")
        public Products updateProduct(@PathVariable("id") Long id, @RequestBody Products products){
            return new Products();
        }

        @PutMapping("/{id}")

        public Products removeProduct(@PathVariable("id") Long id, @RequestBody Products products){
            return new Products();
        }

        @DeleteMapping("/{id}")

        public void deleteProduct(@PathVariable("id") Long id){

        }
}
