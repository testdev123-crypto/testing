package com.example.School.service;

import com.example.School.dto.RoleDTO;
import com.example.School.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public void addRole(RoleDTO roleDTO) {
        try {
            System.out.println("ID:"+roleDTO.getId());
            roleRepository.addRole(roleDTO.getId(),roleDTO.getName());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addRole2(List<RoleDTO> roleDTOList){
        try {

            for (RoleDTO roleDTO : roleDTOList) {
                roleRepository.addRole(roleDTO.getId(),roleDTO.getName());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<RoleDTO> getAllUsers() {
        try {
            List<RoleDTO> response = roleRepository.getAllRole();
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
    return null;
    }

    public RoleDTO getRoleById(String id) {
        try {
            RoleDTO response = roleRepository.getRoleById(id);
//            Role response = roleRepository.getRoleById(String id);
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
        return null;
    }

    public void updateRole(String id, String name){
        try {
            roleRepository.updateRole(id, name);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }

    }

    public void deleteRole(String id){
        try {
            roleRepository.deleteRole(id);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }
    }
}
