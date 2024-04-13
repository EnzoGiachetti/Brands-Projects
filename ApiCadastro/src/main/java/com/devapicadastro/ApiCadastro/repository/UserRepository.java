package com.devapicadastro.ApiCadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devapicadastro.ApiCadastro.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
