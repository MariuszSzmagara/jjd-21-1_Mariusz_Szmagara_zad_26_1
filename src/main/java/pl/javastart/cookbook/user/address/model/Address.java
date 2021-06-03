package pl.javastart.cookbook.user.address.model;

import pl.javastart.cookbook.user.model.User;
import pl.javastart.cookbook.validator.PostalCode;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "{pl.javastart.cookbook.user.address.model.Address.streetFlatAndHouseNumber.NotEmpty.message}")
    private String streetFlatAndHouseNumber;
    @NotEmpty(message = "{pl.javastart.cookbook.user.address.model.Address.postalCode.NotEmpty.message}")
    @PostalCode(message = "{pl.javastart.cookbook.user.address.model.Address.postalCode.PostalCode.message}")
    private String postalCode;
    @NotEmpty(message = "{pl.javastart.cookbook.user.address.model.Address.city.NotEmpty.message}")
    private String city;
    @OneToOne
    private User user;

    public Address() {
    }

    public Address(String streetFlatAndHouseNumber, String postalCode, String city) {
        this.streetFlatAndHouseNumber = streetFlatAndHouseNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetFlatAndHouseNumber() {
        return streetFlatAndHouseNumber;
    }

    public void setStreetFlatAndHouseNumber(String streetFlatAndHouseNumber) {
        this.streetFlatAndHouseNumber = streetFlatAndHouseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
