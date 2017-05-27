//package com.example.auth;
//
//import com.example.web.CustomerRepository;
//import com.example.web.User;
//import com.sun.media.jfxmedia.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by oferschonberger on 17/01/17.
// */
////@Component
//public class MongoUserDetailsAuth implements UserDetailsService {
//
//    @Autowired
//    CustomerRepository repository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User byUserName = repository.findByUserName(username);
//        Logger.logMsg(Logger.DEBUG, "loadUserByUsername: " + byUserName);
//        UserDetails userDetails = new org.springframework.security.core.userdetails.User(byUserName.userName, byUserName.password,				true,
//                true,
//                true,
//                true,
//                getAuthorities());
//        return userDetails;
//    }
//
//    public List getAuthorities() {
//        ArrayList<SimpleGrantedAuthority> authorata = new ArrayList<>();
//        authorata.add(new SimpleGrantedAuthority("ROLE_USER"));
//        return authorata;
//    }
//}
