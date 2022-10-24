import login from "../Components/Authentication/loginComponents/login";
import Register from "../Components/Authentication/loginComponents/register";
import Home from "../Components/Authentication/loginComponents/home";
import Profile from "../Components/Authentication/loginComponents/profile";
import user from "../Components/Authentication/loginComponents/user";

import React, { Component } from "react";
import { Routes, Route, Link } from "react-router-dom";

import EventBus from "./common/EventBus";
import AuthService from "./services/auth.service";


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
    
    
    
    </>

    )
  }


}

export default UserContainer;