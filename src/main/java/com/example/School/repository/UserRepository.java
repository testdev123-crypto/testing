package com.example.School.repository;

import com.example.School.dto.UserDTO;
import com.example.School.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user(id,name,email,phone_number,role_id,user_detail_id) VALUES (?1,?2,?3,?4,?5,?6)", nativeQuery = true)
    void addUser(String id,String name, String email, String PhoneNumber, String roleId, String userDetails);

    @Query(nativeQuery = true)
    List<UserDTO>getAllUser();

    @Query(nativeQuery = true)
    UserDTO getUserById(String id);
}
