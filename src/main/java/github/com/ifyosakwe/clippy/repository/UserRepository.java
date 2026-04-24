package github.com.ifyosakwe.clippy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.ifyosakwe.clippy.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {
     Optional<User> findByEmail(String email);
}
