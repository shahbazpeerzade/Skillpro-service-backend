package com.skillpro.common_feign_clients;


import com.Category.Category_service.module.CategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category-service", url = "${category.service.url}") // Or use service name in microservices
public interface CategoryClient {

    @GetMapping("/categories/{id}")
    CategoryDto getCategoryById(@PathVariable("id") Long id);
}
