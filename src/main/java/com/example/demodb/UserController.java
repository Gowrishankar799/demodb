package com.example.demodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.example.demodb.UserInfo;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity addUser(UserInformation userInfo) {
        userService.addUser(userInfo);
        return new ResponseEntity("addUser to acciodbTest", HttpStatus.OK);
    }

   /* @GetMapping("/getByUserId")
    public ResponseEntity getByUserId(@RequestParam("id") Integer id) {
        try {
            UserInfo userInfo = userService.getByUserId(id);
            return new ResponseEntity(userInfo, HttpStatus.OK);
        } catch (Exception e) {
            log.error("user is not present in db");
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/updateUser")
    public ResponseEntity updateUser(@RequestParam("id") Integer id, @RequestParam("name") String name){
        try {
            String msg = userService.updateUser(id,name);
            return new ResponseEntity(msg,HttpStatus.OK);
        }
        catch (Exception e){
            log.error("user is not there");
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/deleteByUserId")
    public ResponseEntity deleteByUserId(@RequestParam("id") Integer id){
        try {
            String msg = userService.deleteByUserId(id);
            return new ResponseEntity(msg,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity("user is not there",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/listOfUsers")
    public List<UserInfo> listOfUsers(@RequestParam("id") Integer age){
        List<UserInfo> list = userService.listOfUsers(age);
        return list;
    }*/

}
