package mx.uv.hefv.copsboot.models.user;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import mx.uv.hefv.copsboot.jpa.AbstractEntity;
import mx.uv.hefv.copsboot.jpa.UserId;

@Entity
@Table(name = "users")
public class User extends AbstractEntity<UserId>{
    
    private String name;
    private String email;
    private String password;

    //@ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRole role;

    public User() {
    }

    public User(UserId id, String name, String email, String password, UserRole role) {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRoles() {
        return role;
    }

    public void setRoles(UserRole role) {
        this.role = role;
    }

    
}
