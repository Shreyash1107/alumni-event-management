package com.alumniEvent.management.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private int id;
    private String roleAssigned;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
