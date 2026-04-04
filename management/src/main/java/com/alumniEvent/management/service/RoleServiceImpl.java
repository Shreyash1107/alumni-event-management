package com.alumniEvent.management.service;

import com.alumniEvent.management.dto.RoleDto;
import com.alumniEvent.management.entity.RoleEntity;
import com.alumniEvent.management.mapper.RoleMapper;
import com.alumniEvent.management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private ValidationService validationService;

    @Override
    public List<String> saveRole(RoleDto roleDto) {
        List<String> roleSaved = new ArrayList<>();
        List<String> roleValidation = validationService.validateRoles(roleDto);
        if(roleValidation.isEmpty()){
            RoleEntity role = roleMapper.dtoToEntity(roleDto);
            role.setRoleAssigned(roleDto.getRoleAssigned().toUpperCase());
            roleRepository.save(role);
            roleSaved.add("Role " + roleDto.getRoleAssigned().toUpperCase() + " saved successfully");
            return roleSaved;
        }else{
            return roleValidation;
        }
    }

    @Override
    public List<RoleDto> viewRoleDetails() {
        return roleRepository.findAll()
                .stream().map(roleMapper::entityToDto)
                .toList();
    }
}
