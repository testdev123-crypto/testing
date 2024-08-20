package com.example.School.repository;


import com.example.School.dto.RoleDTO;
import com.example.School.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO role(id, name) VALUES(?1,?2)", nativeQuery = true)
    void addRole(String id, String name);

    @Query(nativeQuery = true)
    List<RoleDTO> getAllRole();

    @Query(nativeQuery = true)
    RoleDTO getRoleById(String id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE role SET name=?2 WHERE id=?1", nativeQuery = true)
    void updateRole(String id, String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM role WHERE id=?1", nativeQuery = true)
    void deleteRole(String id);






}


