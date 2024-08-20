package com.example.School.service;

import com.example.School.dto.UserDetailDTO;
import com.example.School.repository.UserDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserDetailService {
    @Autowired
    UserDetailRepository userDetailRepository;

    public void addUserDetail(UserDetailDTO userDetailDTOList) {
        try {
            System.out.println("ID:"+userDetailDTOList.getId());
            System.out.println("Address:"+userDetailDTOList.getAddress());
            System.out.println("Father:"+userDetailDTOList.getFather());
            System.out.println("mother:"+userDetailDTOList.getMother());
            userDetailRepository.addUserDetail(userDetailDTOList.getId(),userDetailDTOList.getAddress(),userDetailDTOList.getFather(),userDetailDTOList.getMother());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addUserDetail2(List<UserDetailDTO> userDettailDTOList){

            for (UserDetailDTO userDetailDTO : userDettailDTOList) {
                userDetailRepository.addUserDetail(userDetailDTO.getId(),userDetailDTO.getAddress(), userDetailDTO.getFather(),userDetailDTO.getMother());
            }

    }

    public List<UserDetailDTO> getAllUserDetail() {
        try {
            List<UserDetailDTO> response = userDetailRepository.getAllUserDetail();
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
        return null;
    }

    public UserDetailDTO getUserDetailById(String id) {
        try {
            UserDetailDTO response = userDetailRepository.getUserDetailById(id);
//            Role response = roleRepository.getRoleById(String id);
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
        return null;
    }

    public void updateUserDetail(String id, String address){
        try {
            userDetailRepository.updateUserDetail(id, address);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }

    }

    public void deleteUserDetail(String id){
        try {
            userDetailRepository.deleteUserDetail(id);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }
    }
}

