package pl.javastart.cookbook.user.model;

import org.springframework.format.annotation.DateTimeFormat;
import pl.javastart.cookbook.user.address.model.Address;
import pl.javastart.cookbook.validator.Password;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "{pl.javastart.cookbook.user.model.User.firstName.NotEmpty.message}")
    @Size(min = 3, message = "{pl.javastart.cookbook.user.model.User.firstName.Size.message}")
    private String firstName;
    @NotEmpty(message = "{pl.javastart.cookbook.user.model.User.lastName.NotEmpty.message}")
    @Size(min = 3, message = "{pl.javastart.cookbook.user.model.User.lastName.Size.message}")
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "{pl.javastart.cookbook.user.model.User.dateOfBirth.Past.message}")
    private LocalDate dateOfBirth;
    @Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "{pl.javastart.cookbook.user.model.User.emailAddress.Email.message}")
    private String emailAddress;
    private boolean signedUpForNewsletter;
    @NotEmpty(message = "{pl.javastart.cookbook.user.model.User.userName.NotEmpty.message}")
    private String userName;
    @NotEmpty(message = "{pl.javastart.cookbook.user.model.User.password.NotEmpty.message}")
    @Size(min = 8, message = "{pl.javastart.cookbook.user.model.User.password.Size.message}")
    @Password(message = "{pl.javastart.cookbook.user.model.User.password.Password.message}")
    private String password;
    private String passwordResetKey;
    @AssertTrue(message = ("{pl.javastart.cookbook.user.model.User.agreedToTermsAndConditions.AssertTrue.message}"))
    private boolean agreedToTermsAndConditions;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private Set<Role> roles;
    @NotNull
    @Valid
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    public User() {
    }

    public User(String firstName, String lastName, LocalDate dateOfBirth, String emailAddress, boolean signedUpForNewsletter, String userName, String password, String passwordResetKey, boolean agreedToTermsAndConditions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.signedUpForNewsletter = signedUpForNewsletter;
        this.userName = userName;
        this.password = password;
        this.passwordResetKey = passwordResetKey;
        this.agreedToTermsAndConditions = agreedToTermsAndConditions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isSignedUpForNewsletter() {
        return signedUpForNewsletter;
    }

    public void setSignedUpForNewsletter(boolean signedUpForNewsletter) {
        this.signedUpForNewsletter = signedUpForNewsletter;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordResetKey() {
        return passwordResetKey;
    }

    public void setPasswordResetKey(String passwordResetKey) {
        this.passwordResetKey = passwordResetKey;
    }

    public boolean isAgreedToTermsAndConditions() {
        return agreedToTermsAndConditions;
    }

    public void setAgreedToTermsAndConditions(boolean agreedToTermsAndConditions) {
        this.agreedToTermsAndConditions = agreedToTermsAndConditions;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
