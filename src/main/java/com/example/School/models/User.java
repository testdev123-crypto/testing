package com.example.School.models;

import com.example.School.dto.UserDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@SqlResultSetMapping(
        name = "usermapping",
        classes = {
                @ConstructorResult(
                        targetClass = UserDTO.class,
                        columns = {
                                @ColumnResult(name = "id",type = String.class),
                                @ColumnResult(name = "name",type = String.class),
                                @ColumnResult(name = "email",type = String.class),
                                @ColumnResult(name = "phone_number",type = String.class),
                                @ColumnResult(name = "role_id",type = String.class),
                                @ColumnResult(name = "user_detail_id",type = String.class)
                        })

        })
@NamedNativeQuery(
        name = "User.getAllUser",
        query = "SELECT * FROM user",
        resultSetMapping = "usermapping")
@NamedNativeQuery(
        name = "User.getUserById",
        query = "SELECT * FROM user WHERE id = ?1",
        resultSetMapping = "usermapping")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = User.class)
public class User {
    @Id
    private String id;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Role role;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private UserDetail userDetail;
}
