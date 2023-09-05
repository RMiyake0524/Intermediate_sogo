package com.example.javasamplepj.domain.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.javasamplepj.domain.model.user.User;
import com.example.javasamplepj.domain.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
// @RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * ユーザー情報 全検索
     * 
     * @return 検索結果
     */
    public List<User> searchAll() {
        return userRepository.findAll();
    }
}