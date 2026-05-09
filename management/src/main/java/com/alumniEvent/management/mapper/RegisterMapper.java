package com.alumniEvent.management.mapper;

import com.alumniEvent.management.dto.RegisterDto;
import com.alumniEvent.management.entity.RegisterEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterMapper {
    @Autowired
    private ModelMapper modelMapper;

    public RegisterEntity dtoToEntity(RegisterDto registerDto){
        return modelMapper.map(registerDto, RegisterEntity.class);
    }

    public RegisterDto entityToDto(RegisterEntity registerEntity){
        return modelMapper.map(registerEntity, RegisterDto.class);
    }
}