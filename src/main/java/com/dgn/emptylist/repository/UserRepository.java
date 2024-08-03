package com.dgn.emptylist.repository;

import com.dgn.emptylist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
