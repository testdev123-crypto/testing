package com.example.School.service;

import com.example.School.dto.UserDTO;


import com.example.School.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(UserDTO userDTO ){
        try{
            userRepository.addUser(userDTO.getId(),userDTO.getName(),userDTO.getEmail(),userDTO.getPhoneNumber(),userDTO.getRoleId(),userDTO.getUserDetailId());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public List<UserDTO> getAllUser(){
        try{
            List<UserDTO> response = userRepository.getAllUser();
            return response;
        }catch (Exception ex){
            System.out.println("Exception occured ||"+ex.getMessage());
        }
        return null;
    }
    public UserDTO getUserById(String id){
        try {
            UserDTO response = userRepository.getUserById(id);
            return response;
        }catch (Exception ex){
            System.out.println("Exception Occured ||" + ex.getMessage());
        }
        return null;
    }


}
