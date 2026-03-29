package com.alumniEvent.management.controller;

import com.alumniEvent.management.dto.RoleDto;
import com.alumniEvent.management.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/saveRoles")
    public ResponseEntity<List<String>> saveRoles(@RequestBody RoleDto roleDto){
        List<String> response = roleService.saveRole(roleDto);
        if(response.get(0).contains("saved")){
            return ResponseEntity.ok(response);
        }else{
            return ResponseEntity.badRequest().body(response);
        }
    }
    @GetMapping("/viewRoles")
    public ResponseEntity<List<RoleDto>> getRoleDetails(){
        return ResponseEntity.ok(roleService.viewRoleDetails());
    }
}