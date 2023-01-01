package org.aiokleo.appUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.*;

public interface UserRepository extends JpaRepository<Admins, String> {
}
