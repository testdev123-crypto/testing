package com.example.School.models;

import com.example.School.dto.UserDetailDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Set;

@Entity
@SqlResultSetMapping(
        name = "userdetailmapping",
        classes = {
                @ConstructorResult(
                        targetClass = UserDetailDTO.class,
                        columns = {
                                @ColumnResult(name = "id",type = String.class),
                                @ColumnResult(name = "address",type = String.class),
                                @ColumnResult(name = "father",type = String.class),
                                @ColumnResult(name = "mother", type = String.class )

                        })
        })

@NamedNativeQuery(
        name = "UserDetail.getAllUserDetail",
        query = "SELECT * FROM user_detail",
        resultSetMapping = "userdetailmapping")

@NamedNativeQuery(
        name = "UserDetail.getUserDetailById",
        query = "SELECT * FROM user_detail WHERE id = ?1",
        resultSetMapping = "userdetailmapping")

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = UserDetail.class)
public class UserDetail {
    @Id
    @Column(length = 64)
    private String id;

    @Column
    private String address;
    @Column
    private String father;
    @Column
    private String mother;
    @OneToMany(mappedBy = "userDetail", cascade = CascadeType.DETACH)
    private Set<User> user;

}
