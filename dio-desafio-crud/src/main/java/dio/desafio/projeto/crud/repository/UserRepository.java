package dio.desafio.projeto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.desafio.projeto.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
