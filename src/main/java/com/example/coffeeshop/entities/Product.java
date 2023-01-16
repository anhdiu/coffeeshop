package com.example.coffeeshop.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    private int productId;
    @Basic
    @Column(name = "product_desc", nullable = true, length = 255)
    private String productDesc;
    @Basic
    @Column(name = "product_img", nullable = true)
    private Integer productImg;
    @Basic
    @Column(name = "product_name", nullable = true, length = 255)
    private String productName;
    @Basic
    @Column(name = "quatity", nullable = true)
    private Long quatity;
    @Basic
    @Column(name = "stock", nullable = true)
    private Integer stock;
    @Basic
    @Column(name = "category_id", nullable = true)
    private Integer categoryId;
    @Basic
    @Column(name = "branch_id", nullable = true)
    private Integer branchId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<CartItem> cartItemsByProductId;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category categoryByCategoryId;
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Brand brandByBranchId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductImg() {
        return productImg;
    }

    public void setProductImg(Integer productImg) {
        this.productImg = productImg;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuatity() {
        return quatity;
    }

    public void setQuatity(Long quatity) {
        this.quatity = quatity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productDesc, product.productDesc) && Objects.equals(productImg, product.productImg) && Objects.equals(productName, product.productName) && Objects.equals(quatity, product.quatity) && Objects.equals(stock, product.stock) && Objects.equals(categoryId, product.categoryId) && Objects.equals(branchId, product.branchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productDesc, productImg, productName, quatity, stock, categoryId, branchId);
    }

    public Collection<CartItem> getCartItemsByProductId() {
        return cartItemsByProductId;
    }

    public void setCartItemsByProductId(Collection<CartItem> cartItemsByProductId) {
        this.cartItemsByProductId = cartItemsByProductId;
    }

    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    public Brand getBrandByBranchId() {
        return brandByBranchId;
    }

    public void setBrandByBranchId(Brand brandByBranchId) {
        this.brandByBranchId = brandByBranchId;
    }
}
