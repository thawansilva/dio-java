package dio.desafio.projeto.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_details")
@Getter
@Setter
public class User {
    @Id
    private int id;
    
    @Column(name = "user_name")
    private String username;
    
    @Column(unique = true)
    private String email;
    private String password;
}
