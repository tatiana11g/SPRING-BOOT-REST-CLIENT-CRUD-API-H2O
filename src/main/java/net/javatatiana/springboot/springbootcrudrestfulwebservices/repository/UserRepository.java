package net.javatatiana.springboot.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javatatiana.springboot.springbootcrudrestfulwebservices.entity.User;





@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}