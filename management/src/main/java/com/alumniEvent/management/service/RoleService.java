package com.alumniEvent.management.service;

import com.alumniEvent.management.dto.RoleDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {

    List<String> saveRole(RoleDto roleDto);

    List<RoleDto> viewRoleDetails();
}