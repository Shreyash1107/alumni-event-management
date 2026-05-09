package com.alumniEvent.management.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "register")
public class RegisterEntity extends BaseEntity{
    @Column(name = "fname",length = 20)
    private String firstName;
    @Column(name = "lname",length = 20)
    private String lastName;
    @Column(name = "email",length = 30)
    private String email;
    @Column(name = "contact",length = 10)
    private String contact;
    @Column(name = "password",length = 8)
    private String password;
    @Column(name = "confirmPassword",length = 8)
    private String confirmPassword;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    private RoleEntity roleEntity;
}