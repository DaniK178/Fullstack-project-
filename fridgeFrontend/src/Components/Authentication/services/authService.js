// ignore_for_file: prefer_const_constructors

import axios from "axios";

const API_URL = "http://localhost:8080/users"; //user path

const register = (username, email, password) => {//register -- post
  return axios.post(API_URL, {
    username,
    email,
    password,
  });
};

const login =   (username, password) => { //login -- get 
    console.log("login");
  return axios
    .get(API_URL , {
      username,
      password,
    })
    .then((response) => {
        console.log(response.data);
      if (response.data.accessToken) {
        localStorage.setItem("users", JSON.stringify(response.data));
      }
      return response.data;
    });
};

const logout = () => {
  localStorage.removeItem("users");
};

const getCurrentUser = () => {
  return JSON.parse(localStorage.getItem("users"));
};

const AuthService = {
  register,
  login,
  logout,
  getCurrentUser,
};

export default AuthService;
