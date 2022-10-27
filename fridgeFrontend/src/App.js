
import React, { useState, useEffect, useContext } from "react";
import { Routes, Route, Link, BrowserRouter } from "react-router-dom";
import UserContext from './useContext';
import './App.css';
// import FridgeContainer from './Containers/FridgeContainer';
import FoodItemContainer from './Containers/FoodItemContainer';
import UserContainer from './Containers/UserContainer';
import FridgeContainer from './Containers/FridgeContainer';
import AuthService from './Components/Authentication/services/authService';
import EventBus from './Components/Authentication/common/EventBus';
import NavBar from "./Components/NavBar/NavBar";
import Home from "./Components/Authentication/loginComponents/home";
import Login from "./Components/Authentication/loginComponents/login";
import Profile from "./Components/Authentication/loginComponents/profile";
import User from "./Components/Authentication/loginComponents/user";
import Register from "./Components/Authentication/loginComponents/register";
import AddFridge from "./Components/addFridge";
import CurrentFridge from "./Components/currentFridge";
import ShoppingList from "./Components/ShoppingList";
import FavouriteList from "./Components/FavouriteList";
import FoodItem from "./Components/FoodItem";
import FridgeList from "./Components/fridgeList";

function App() {


  const [currentUser, setCurrentUser] = useState(undefined);

  // const {setLoggedInUser} = useContext(UserContext);

  useEffect(() => {
    const user = AuthService.getCurrentUser();

    if (user) {
      setCurrentUser(user);
    }

    EventBus.on("logout", () => {
      logOut();
    });

    return () => {
      EventBus.remove("logout");
    };
  }, []);

  const logOut = () => {
    AuthService.logout();
    // set no fridge false
    setCurrentUser(undefined);
  };

  // const [loggedInUser,setLoggedInUser] = useState();
  // const [users,setUsers] = useState([]);

  // const fetchUsers = async () => {
  //   const response = await fetch('http://localhost:8080/users');
  //   const userData = await response.json();
  //   setUsers(userData);
  // }

  // const addUser = async (newUser) => { 
  //   const response = await fetch("http://localhost:8080/users", {
  //           method: "POST",
  //           headers: { 'Content-Type': 'application/json' },
  //           body: JSON.stringify(newUser)
  //       })
  //       const savedUser = await response.json();
  //       setUsers([...users, savedUser]);
  // }
  
  // useEffect(() => {
  //   fetchUsers();
  // },[])
  
  return (
    <> 

<BrowserRouter>
      <div className="navbar navbar-expand navbar-dark bg-dark">
        <Link to={"/"} className="navbar-brand">
          DigitalFridge
        </Link>
        <div className="navbar-nav mr-auto">


          {currentUser && (
            <li className="nav-item">
             
  
                

            </li>

          )}
        </div>

        {currentUser ? (
          <div className="navbar-nav">
            <li className="nav-item">
              <Link to={"/profile"} className="nav-link">
                {currentUser.username}
              </Link>
            </li>
            <li className="nav-item">
              <Link to ="/login" className="nav-link" onClick={logOut}>
                LogOut
              </Link>
            </li>
            
            {/* <li><Link to = '/AddFridge' className="link">Add Fridge</Link></li>  */}
            <li><Link to = '/CurrentFridge' className="link">Current Fridge</Link></li>
            <li><Link to = '/ShoppingList' className="link">Shopping List</Link></li>
            <li><Link to = '/FavouriteList' className="link">Favourites</Link></li>
            <li><Link to='/FoodItem' className="link">Food List</Link></li>
            {/* <li><Link to = '/fridgeList' className="link">Fridges</Link></li> */}
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
      </div>

      <div className="container mt-3">
        <Routes>
          
          <Route path="/login" element={<Login/>} />
          <Route path="/register" element={<Register/>} />
          <Route path="/profile" element={<Profile/>} />

        <Route path="/addfridge" element={<AddFridge />} />
        <Route path="/currentfridge" element={<CurrentFridge />}/>
        <Route path="/ShoppingList" element={<ShoppingList />}/>
        <Route path="/favouriteList" element={<FavouriteList />}/>
        {/* <Route path="/FoodItem" element={<FoodItem foodItems={foodItems} />} /> */}
        <Route path="/fridgeList" element={<FridgeList/>} />
          
        </Routes>
      </div>

    </BrowserRouter>

 
     {/* <UserContext.Provider value={{loggedInUser, users,setLoggedInUser}} >
        {loggedInUser ? 
        <FridgeContainer /> :   
        <UserContainer  register={addUser} />}
        
     

      UserContext.Provider>  */}

 {/* put <BrowserRoute> inside here*/}

{/* 
    useContxt for if statement

    see usr container (login) first
    if sucessfully logged --> fridge container
                               if assigned to a fridge ---> access to all pages
                              else---> only access to addFridge & favList & logout --> usecontainer once clciked on logout */}
    {/* <FridgeContainer /> */}
    {/* <FoodItemContainer/> */}
      {/* <usecontext>  */}
  
    
    </>
  
     
  );
}

export default App;
