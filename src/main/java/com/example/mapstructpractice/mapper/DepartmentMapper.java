package com.example.mapstructpractice.mapper;

import java.util.Optional;
import com.example.mapstructpractice.config.MapperConfig;
import com.example.mapstructpractice.dto.department.CreateDepartmentRequestDto;
import com.example.mapstructpractice.dto.department.DepartmentDto;
import com.example.mapstructpractice.model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(config = MapperConfig.class)
public interface DepartmentMapper {
    DepartmentDto toDto(Department department);
    Department toModel(CreateDepartmentRequestDto requestDto);

    @Named("getById")
    default Department getById(Long id) {
        return Optional.ofNullable(id)
                .map(Department::new)
                .orElse(null);
    }









//    @Named("departmentById")
//    default Department departmentById(Long id) {
//       return Optional
//               .ofNullable(id)
//               .map(Department::new)
//               .orElse(null);
//    }

}
