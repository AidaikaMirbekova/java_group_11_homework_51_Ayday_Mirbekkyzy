package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Service;

import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model.UserModel;
import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserService {

    private final UsersRepository userRepository;

//    public UserModel save(UserModel user) {
//        Optional<UserModel> byEmail = this.userRepository.findByEmail(user.getEmail());
//        if (byEmail.isPresent()){
//            return byEmail.get();
//        }
//            return this.userRepository.save(user);
//    }
//    public UserModel addUser(String userName, String userEmail){
//        return UserModel.from(userRepository.save(User.createUser(userName, userEmail)));
//    }
//
//    public List<User> findByUser(String name, String email) {
//        return this.userRepository.findByNameAndEmail(name, email);
//    }
//
//    public Boolean checkIfExist(String email) {
//        return this.userRepository.existsByUser(email);
//    }
//}
