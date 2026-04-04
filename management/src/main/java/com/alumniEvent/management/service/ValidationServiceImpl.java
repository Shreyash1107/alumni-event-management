package com.alumniEvent.management.service;

import com.alumniEvent.management.dto.RoleDto;
import com.alumniEvent.management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired
    private RoleRepository roleRepository;

    /**
     * @param roleDto
     * @return
     */
    @Override
    public List<String> validateRoles(RoleDto roleDto){
        List<String> roleValidation = new ArrayList<>();
        boolean b = roleRepository.existsByRoleAssigned(roleDto.getRoleAssigned());
        if(roleDto.getRoleAssigned() == null){
            roleValidation.add("Role Details are Missing");
        }if(b){
            roleValidation.add("Role " + roleDto.getRoleAssigned() + " is already Present");
        }
        return roleValidation;
    }
}