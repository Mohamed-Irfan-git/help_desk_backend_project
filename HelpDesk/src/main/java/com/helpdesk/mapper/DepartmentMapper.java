package com.helpdesk.mapper;


import com.helpdesk.Model.Department;
import com.helpdesk.dto.DepartmentDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;




@Mapper(componentModel = "spring" , uses = {UserMapper.class})
public interface DepartmentMapper {

    @Mapping(source = "users",target = "users")
    DepartmentDTO toDTO(Department department);

    @InheritInverseConfiguration
    @Mapping(target = "users",ignore = true)
    Department toEntity(DepartmentDTO departmentDTO);


//    @Named("mapUsersIds")
//    static List<Long> toDTOs(List<User> users) {
//        return users != null
//                ? users.stream()
//                .map(User::getUserId)
//                .collect(Collectors.toList()):null;
//
//    }
}
