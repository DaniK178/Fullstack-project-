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
    <nav className="navbar">
        
        <div className="logo">
            <p>logo</p>
        </div>
        <div className="nav-links">
        <div className="menu">
            <li><Link to = '/'>Login</Link></li>
            <li><Link to = '/Fridge'>Fridge</Link></li>
            <li><Link to = '/ShoppingList'>Shopping List</Link></li>
            <li><a href="#">User</a>
            <ul className="dropdown">
                <li><Link to = '/fridge'>Fridges</Link></li>
                <li><Link to = '/FavouriteList'>Favourite List</Link></li>
                <li><Link to = '/login'>Log Out</Link></li>
            </ul>
            </li>


                {/* <li>
                <div className="dropdown">
                    <button className="dropbt">Dropdown &dtrif;<i className="fa fa-caret-down"></i></button>
                    <div className="dropdown-content">
                        <a className="dropdown-content" href="#">Fridges</a>
                        <a className="dropdown-content" href="#">FavouriteList</a>
                        <a className="dropdown-content" href="#">LogOut</a>
                    </div>
                </div>

            </li> */}
            

            </div>
            
        </div>
        
    </nav>

    <Routes>
        <Route path="/" element={<Login />}/>
        <Route path="/fridge" element={<Fridge />}/>
        <Route path="/shoppingList" element={<ShoppingList />}/>
        <Route path="/favouriteList" element={<FavouriteList />}/>
    </Routes>

    </BrowserRouter>

    {/* <BrowserRouter>
    <nav className="navbar">
        <div className="logo">
            <p>logo</p>
        </div>

        <ul className="nav-links">
            <div className="menu">
                <li>
                    <Dropdown>
                        <Dropdown.Toggle variant="dark">Users</Dropdown.Toggle>

                        <Dropdown.Menue>
                            <Dropdown.item href="#">Fridges</Dropdown.item>
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
    
   
    </BrowserRouter> */}

    </>
    )

};

export default FridgeContainer;