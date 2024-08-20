package com.example.School.models;

import com.example.School.dto.RoleDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@SqlResultSetMapping(
        name = "rolemapping",
        classes = {
                @ConstructorResult(
                        targetClass = RoleDTO.class,
                        columns = {
                                @ColumnResult(name = "id",type = String.class),
                                @ColumnResult(name = "name",type = String.class)

                        })
        })

@NamedNativeQuery(
        name = "Role.getAllRole",
        query = "SELECT id , name FROM role",
        resultSetMapping = "rolemapping")

@NamedNativeQuery(
        name = "Role.getRoleById",
        query = "SELECT id , name FROM role WHERE id = ?1",
        resultSetMapping = "rolemapping")




//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Role.class)
public class Role {
    @Id
    private String id;

    @Column
    private String Name;
    @OneToMany(mappedBy = "role", cascade = CascadeType.DETACH)
    private Set<User> user;
}
