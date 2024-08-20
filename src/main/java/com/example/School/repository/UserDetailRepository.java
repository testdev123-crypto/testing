package com.example.School.repository;

import com.example.School.dto.UserDetailDTO;
import com.example.School.models.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, String> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user_detail(id, address, father, mother) VALUES(?1,?2,?3,?4)", nativeQuery = true)
    void addUserDetail(String id, String address, String father, String mother);

    @Query(nativeQuery = true)
    List<UserDetailDTO> getAllUserDetail();

    @Query(nativeQuery = true)
    UserDetailDTO getUserDetailById(String id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE user_detail SET address=?2 WHERE id=?1", nativeQuery = true)
    void updateUserDetail(String id, String address);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_detail WHERE id=?1", nativeQuery = true)
    void deleteUserDetail(String id);
}

