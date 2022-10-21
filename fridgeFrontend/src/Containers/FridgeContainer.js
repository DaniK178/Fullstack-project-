import { Dropdown } from "bootstrap";
import { Routes, Route, useNavigate, BrowserRouter, Link } from "react-router-dom";
import ShoppingList from "../Components/ShoppingList";
import Login from "../Components/Login/Login";
import FavouriteList from "../Components/FavouriteList";
import Fridge from "../Components/Fridge";
import NavBar from "../Components/NavBar";
import React, { useState,useEffect } from "react";

const FridgeContainer =() => {

    const [isShowAddItem, setIsShowAddItem] = useState(false);
    const handleAddItemClick =() => {
        setIsShowAddItem(!isShowAddItem);
    };
    

    return(

    <>

    <BrowserRouter>
    <nav className="navbar">
        <div className="logo">
            <p>logo</p>
        </div>
        <div className="nav-links">
        <ul className="menu">
            <li><Link to = '/' className="link">Login</Link></li>
            <li><Link to = '/Fridge' className="link">Fridge</Link></li>
            <li><Link to = '/ShoppingList' className="link">Shopping List</Link></li>
            <li><a href="#" className="link">User</a>
            <ul className="dropdown">
                <li><Link to = '/fridge' className="link">Fridges</Link></li>
                <li><Link to = '/FavouriteList' className="link">Favourites</Link></li>
                <li><Link to = '/login' className="link">Log Out</Link></li>
            </ul>
            </li>
            </ul>
        </div>
    </nav>

    <Routes>
        <Route path="/" element={<Login />}/>
        <Route path="/fridge" element={<Fridge />}/>
        <Route path="/shoppingList" element={<ShoppingList />}/>
        <Route path="/favouriteList" element={<FavouriteList />}/>
    </Routes>

    </BrowserRouter>


    <NavBar handleAddItemClick = {handleAddItemClick} isShownAddItem={isShowAddItem} />
    <Login  />

    </>
    )

};

export default FridgeContainer;