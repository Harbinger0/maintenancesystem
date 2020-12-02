package com.startup.repository.registration;

import com.startup.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<User, String> {
}
