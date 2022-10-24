import React from "react"
import { Routes, Route, BrowserRouter, Link } from "react-router-dom";
import ShoppingList from "../ShoppingList";
import Login from "../Login";
import FavouriteList from "../FavouriteList";
import Fridge from "../Fridge";
import "./NavBar.css";


const NavBar = ({ handleAddItemClick ,isShownAddItem }) => {
    const handleClick = () => {
      handleAddItemClick();
    };


    return (
    <>  
<BrowserRouter>

     <nav className="navbar">
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
            <li>
          <span onClick={handleClick} className="additemicon">
            Add Item
          </span>
        </li>

        <div className={`${isShownAddItem ? "active show" : "hidden"} `}>
        <div className="food-form">
        <div className="form-box"> 
          <form>
            <h1 className="additem-text">Add Item</h1>
            <label>Food Name</label>
            <br></br>
            <input type="text" name="foodname" className="additem-box" />
            <br></br>
            <label>Category</label> //Using option tag to enable Category choose
            <br></br>
            <input type="text" name="expiry date" className="additem-box" />
            <br></br>
            <input type="submit" value="Add now" className="additem-btn" />
          </form>
        </div>
      </div>
    </div>
    
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

    
        </>
     
    );
  }
  export default NavBar;