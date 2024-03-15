package org.aibles.api.product;

import jakarta.persistence.*;

@Entity
@Table(name = "product_list")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String product_name;
    @Column
    private String date_of_manufacture;

    @Column
    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDate_of_manufacture() {
        return date_of_manufacture;
    }

    public void setDate_of_manufacture(String date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
    }



    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
