import login from "../Components/Authentication/loginComponents/login";
import Register from "../Components/Authentication/loginComponents/register";
import Home from "../Components/Authentication/loginComponents/home";
import Profile from "../Components/Authentication/loginComponents/profile";
import user from "../Components/Authentication/loginComponents/user";

import React, { Component } from "react";
import { Routes, Route, Link } from "react-router-dom";

import EventBus from "../Components/Authentication/common/EventBus";
import AuthService from "../Components/Authentication/services/authService";


class UserContainer extends Component{
  constructor(props){
    super(props);
    this.logOut = this.logOut.bind(this); //converting Java objects to JSON messages
  
    this.state={
      currentUser:undefined,
      noFridge:true //no fridge first and then normal user
    };
  }

  componentDidMount(){//execute the React code when the component is already placed in the DOM
    const user = AuthService.getCurrentUser();
    
    if(user){
      this.setState({
        currentUser:user,
        noFridge:user.props.includes("no fridge"),//disable the access to normal fridge & shopping list + access to favList + assgined2Fridge function
      });
    }

    EventBus.on("logout",()=>{
      this.logOut();
    });
  }

  componentWillUnmount() {
    EventBus.remove("logout");
  }

  logOut() {
    AuthService.logout();
    this.setState({
      noFridge:true,// no fridge
      currentUser: undefined,
    });
  }

  render(){
    const { currentUser, noFridge } = this.state;
    
    return(//separate login page and then 1. normal fridge/shoppingList/favList 2. "get assigned to a fridge now" function
    <>
    <div>
        <nav className="navbar navbar-expand navbar-dark bg-dark">
          <Link to={"/"} className="navbar-brand">
            bezKoder
          </Link>
          <div className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link to={"/home"} className="nav-link">
                Home
              </Link>
            </li>

            {currentUser && (
              <li className="nav-item">
                <Link to={"/user"} className="nav-link">
                  User
                </Link>
              </li>
            )}
          </div>

          {currentUser ? (
            <div className="navbar-nav ml-auto">
              <li className="nav-item">
                <Link to={"/profile"} className="nav-link">
                  {currentUser.username}
                </Link>
              </li>
              <li className="nav-item">
                <a href="/login" className="nav-link" onClick={this.logOut}>
                  LogOut
                </a>
              </li>
            </div>
          ) : (
            <div className="navbar-nav ml-auto">
              <li className="nav-item">
                <Link to={"/login"} className="nav-link">
                  Login
                </Link>
              </li>

              <li className="nav-item">
                <Link to={"/register"} className="nav-link">
                  Sign Up
                </Link>
              </li>
            </div>
          )}
        </nav>

        <div className="container mt-3">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/home" element={<Home />} />
            {/* <Route path="/login" element={<login />} /> */}
            <Route path="/register" element={<Register />} />
            <Route path="/profile" element={<Profile />} />
            {/* <Route path="/user" element={<user />} /> */}
          </Routes>
        </div>

        {/* <AuthVerify logOut={this.logOut}/> */}
      </div>
    </>

    );
  }


}

export default UserContainer;