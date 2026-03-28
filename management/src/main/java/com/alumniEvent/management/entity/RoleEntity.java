package com.alumniEvent.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity{
    @Column(name = "roleassigned")
    private String roleAssigned;
}