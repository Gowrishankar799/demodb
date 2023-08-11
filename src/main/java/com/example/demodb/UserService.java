package com.example.demodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(UserInformation userInfo){
        log.info("user Details"+" "+userInfo);

        userRepository.save(userInfo);
    }
    public UserInformation getByUserId(Integer id) throws Exception{
        Optional<UserInformation>userInfoOptional = userRepository.findById(id);
        if(!userInfoOptional.isPresent()){
            throw new Exception("No user present in the database");
        }
        UserInformation userInfo = userInfoOptional.get();
        return userInfo;
    }
    /*public String deleteByUserId(Integer id) throws Exception{
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "Delete the user in the database";
        }
        else throw new Exception("user is not present in the database");
    }
    public List<UserInfo> listOfUsers(Integer age){
        List<UserInfo> list = userRepository.findAll();
        List<UserInfo>listt = new ArrayList<>();
        for(UserInfo userInfo : list){
            if(userInfo.getAge()>age){
                listt.add(userInfo);
            }
        }
        return listt;
    }
    public String updateUser(Integer id, String name)throws Exception{
        Optional<UserInfo>userInfo = userRepository.findById(id);
        if(!userInfo.isPresent()){
            throw new Exception("user is not there");
        }
        UserInfo userInfo1 = userInfo.get();
        userInfo1.setName(name);
        userRepository.save(userInfo1);
        return "update the user";

    }*/
}
