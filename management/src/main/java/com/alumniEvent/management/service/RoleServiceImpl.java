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
    @Override
    public List<String> saveRole(RoleDto roleDto) {
        List<String> roleSaved = new ArrayList<>();
        RoleEntity role = roleMapper.dtoToEntity(roleDto);
        role.setRoleAssigned(roleDto.getRoleAssigned().toUpperCase());
        roleRepository.save(role);
        roleSaved.add("Role " + roleDto.getRoleAssigned().toUpperCase() + " saved successfully");
        return roleSaved;
    }
}
