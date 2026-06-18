package com.Assignment2.Eventease.service;

import java.util.List;
import com.Assignment2.Eventease.entity.Registration;

public interface RegistrationService {

    Registration registerUser(Long userId, Long eventId);

    List<Registration> getRegistrations(Long eventId);

}