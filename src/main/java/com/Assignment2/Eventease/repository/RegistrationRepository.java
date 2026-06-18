package com.Assignment2.Eventease.repository;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Assignment2.Eventease.entity.Registration;

public interface RegistrationRepository
extends JpaRepository<Registration,Long>{

    List<Registration> findByEventId(Long eventId);
    Optional<Registration>
findByUserIdAndEventId(
        Long userId,
        Long eventId);
}