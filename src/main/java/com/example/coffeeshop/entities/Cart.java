package com.example.coffeeshop.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Cart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "cookie_session", nullable = true, length = 255)
    private String cookieSession;
    @OneToMany(mappedBy = "cartByCartId")
    private Collection<CartItem> cartItemsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCookieSession() {
        return cookieSession;
    }

    public void setCookieSession(String cookieSession) {
        this.cookieSession = cookieSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && Objects.equals(cookieSession, cart.cookieSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cookieSession);
    }

    public Collection<CartItem> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItem> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }
}
