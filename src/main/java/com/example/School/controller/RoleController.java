package com.example.School.controller;

import com.example.School.dto.RoleDTO;
import com.example.School.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping(value = "/addRole")
    public void addRole(@RequestBody RoleDTO roleDTO){
        roleService.addRole(roleDTO);
        System.out.println("Reached");
    }

    @PostMapping(value = "/addRole2")
    public void addRole2(@RequestBody List<RoleDTO> roleDTOList){
        roleService.addRole2(roleDTOList);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllRole")
    public List<RoleDTO> getAllRole() {
        //System.out.println("reached controller 1");
        return roleService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getRoleById")
    public RoleDTO getRoleById(@RequestParam String id) {
        //System.out.println("reached controller 1");
        return roleService.getRoleById(id);
    }

    @PostMapping(value = "/updateRole")
    public void updateRole(@RequestParam String id, @RequestParam String name) {
        roleService.updateRole(id, name);
    }
    @DeleteMapping(value = "/deleteRole")
    public void deleteRole(@RequestParam String id) {
        roleService.deleteRole(id);
    }
}
