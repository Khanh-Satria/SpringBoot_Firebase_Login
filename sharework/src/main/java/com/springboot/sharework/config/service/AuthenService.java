package com.springboot.sharework.config.service;

import com.google.firebase.auth.FirebaseAuthException;
import com.springboot.sharework.payload.RegisterDto;
import com.springboot.sharework.payload.SignInRequest;
import com.springboot.sharework.payload.SignInResponse;

public interface AuthenService {

	SignInResponse login(SignInRequest request);

	String findUserByEmail(String email) throws FirebaseAuthException;

	String createUser(RegisterDto registerDto) throws FirebaseAuthException;

}
