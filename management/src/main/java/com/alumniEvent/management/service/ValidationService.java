package com.alumniEvent.management.service;

import com.alumniEvent.management.dto.RoleDto;

import java.util.List;

public interface ValidationService {

    public List<String> validateRoles(RoleDto roleDto);
}