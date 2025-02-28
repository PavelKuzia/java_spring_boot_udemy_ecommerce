package ecommerce_app.configuration;

import ecommerce_app.dao.ProductCategoryRepository;
import ecommerce_app.dao.ProductRepository;
import ecommerce_app.entity.Product;
import ecommerce_app.entity.ProductCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class DataConfig {
    @Bean
    public CommandLineRunner DataLoader(ProductRepository repo, ProductCategoryRepository catRepo) {
        return _ -> {
            System.out.println("Server is ready to receive requests!");
            /*ProductCategory cat = new ProductCategory("Books");

            catRepo.save(cat);
            repo.save(new Product("BOOK-TECH-1000", "JavaScript - The Fun Parts", "Learn JavaScript",
                    "assets/images/products/placeholder.png"
                    ,true,100, BigDecimal.valueOf(19.99),cat));
            repo.save(new Product("BOOK-TECH-1001", "Spring Framework Tutorial", "Learn Spring",
                    "assets/images/products/placeholder.png",true,100,BigDecimal.valueOf(29.99),cat));
            repo.save(new Product("BOOK-TECH-1002", "Kubernetes - Deploying Containers", "Learn Kubernetes",
                    "assets/images/products/placeholder.png"
                    ,true,100,BigDecimal.valueOf(24.99),cat));
            repo.save(new Product("BOOK-TECH-1003", "Internet of Things (IoT) - Getting Started", "Learn IoT",
                    "assets/images/products/placeholder.png"
                    ,true,100,BigDecimal.valueOf(29.99),cat));
            repo.save(new Product("BOOK-TECH-1004", "The Go Programming Language: A to Z", "Learn Go",
                    "assets/images/products/placeholder.png"
                    ,true,100,BigDecimal.valueOf(24.99),cat));
            System.out.println(" Done!");*/
        };
    }
}
