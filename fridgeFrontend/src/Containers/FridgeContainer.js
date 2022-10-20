import { Dropdown } from "bootstrap";
import { Routes, Route, useNavigate, BrowserRouter, Link } from "react-router-dom";
import ShoppingList from "../Components/ShoppingList";
import Login from "../Components/Login";
import FavouriteList from "../Components/FavouriteList";
import Fridge from "../Components/Fridge";

const FridgeContainer =() => {

    return(

    <>
    <BrowserRouter>
    <nav>
        <div className="logo">
            <p>logo</p>
        </div>
        <div className="menu">
            <li><Link to = '/'>Login</Link></li>
            <li><Link to = '/frige'>Fridge</Link></li>
            <li><Link to = '/frige/shopplingList'>Shopping List</Link></li>
            <li> Dropdown</li>
            <li>
                {/* <Dropdown></Dropdown> */}
                
            </li>
        </div>
    </nav>

    <Routes>
        <Route path="/" element={<Login />}/>
        <Route path="/fridge" element={<Fridge />}/>
        <Route path="/fridge/shoppingList" element={<ShoppingList />}/>
        <Route path="/favoriteList" element={<FavouriteList />}/>
    </Routes>

    </BrowserRouter>

    {/* <BrowserRouter>
    <nav className="navbar">
        <div className="logo">
            <p>logo</p>
        </div>

        <ul className="nav-links">
            <div className="menu">
                <li><Link to = '/'>Login</Link></li>
                <li><Link to = '/frige'>Fridge</Link></li>
                <li><Link to = '/frige/shopplingList'>Shopping List</Link></li>
                <li>
                    <Dropdown>
                        <Dropdown.Toggle variant="dark">Users</Dropdown.Toggle>

                        <Dropdown.Menue>
                            <Dropdown.item href="#">Friges</Dropdown.item>
                        </Dropdown.Menue>

                        <Dropdown.Menue>
                            <Dropdown.item href="#">Favourite List</Dropdown.item>
                        </Dropdown.Menue>

                        <Dropdown.Menue>
                            <Dropdown.item href="#">Log out</Dropdown.item>
                        </Dropdown.Menue>

                    </Dropdown>
                </li>
            </div>

        </ul>

    </nav>
    
    <Routes>
        <Route path="/" element={<Login />}/>
        <Route path="/fridge" element={<Fridge />}/>
        <Route path="/fridge/shoppingList" element={<ShoppingList />}/>
        <Route path="/favoriteList" element={<FavouriteList />}/>
    </Routes>
    </BrowserRouter> */}

    </>
    )

};

export default FridgeContainer;