package com.alumniEvent.management.service;

import com.alumniEvent.management.dto.RegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegisterService {

    List<String> registerUsers(RegisterDto registerDto);
}