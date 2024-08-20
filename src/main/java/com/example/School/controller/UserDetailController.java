package com.example.School.controller;

import com.example.School.dto.UserDetailDTO;
import com.example.School.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDetailController {
@Autowired
UserDetailService userDetailService;

@PostMapping(value = "/addUserDetail")
public void addUserDetail(@RequestBody UserDetailDTO userDetailDTO){
userDetailService.addUserDetail(userDetailDTO);
System.out.println("Reached");
}

@PostMapping(value = "/addUserDetail2")
public void addUserDetail2(@RequestBody List<UserDetailDTO> userDetailDTOList){
userDetailService.addUserDetail2(userDetailDTOList);
}

@RequestMapping(method = RequestMethod.GET, value = "/getAllUserDetail")
public List<UserDetailDTO> getAllUserDetail() {
//System.out.println("reached controller 1");
return userDetailService.getAllUserDetail();
}

@RequestMapping(method = RequestMethod.GET, value = "/getUserDetailById")
public UserDetailDTO getUserDetailById(@RequestParam String id) {
//System.out.println("reached controller 1");
return userDetailService.getUserDetailById(id);
}

@PostMapping(value = "/updateUserDetail")
public void updateUserDetail(@RequestParam String id, @RequestParam String address) {
userDetailService.updateUserDetail(id, address);
}
@DeleteMapping(value = "/deleteUserDetail")
public void deleteUserDetail(@RequestParam String id) {
userDetailService.deleteUserDetail(id);
}
}

