import { Routes, Route, BrowserRouter, Link } from "react-router-dom";
import ShoppingList from "../Components/ShoppingList";
import Login from "../Components/Login";
import FavouriteList from "../Components/FavouriteList";
import Fridge from "../Components/currentFridge";
import NavBar from "../Components/NavBar/NavBar";
import React, { useState,useEffect } from "react";

const FridgeContainer =() => {

    const [isShowAddItem, setIsShowAddItem] = useState(false);
    const handleAddItemClick =() => {
        setIsShowAddItem(!isShowAddItem);
    };

    return(

    <>
    <NavBar handleAddItemClick = {handleAddItemClick} isShownAddItem={isShowAddItem}  Fridge={Fridge}/>
    
    </>
    )

};

export default FridgeContainer;