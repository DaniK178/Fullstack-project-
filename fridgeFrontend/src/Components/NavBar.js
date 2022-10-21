import React from "react"

//move memue list and dropdown to here

const NavBar = ({ handleAddItemClick , isShownAddItem }) => {
    const handleClick = () => {
      handleAddItemClick();
    };
    return (
      <div className="navbar">
        <div className={`${isShownAddItem ? "active show" : "hidden"} `}>
        <div className="food-form">
        <div className="form-box solid"> //clear div 
          <form>
            <h1 className="additem-text">Add Item</h1>
            <label>Food Name</label>
            <br></br>
            <input type="text" name="foodname" className="additem-box" />
            <br></br>
            <label>Expiry Date</label>
            <br></br>
            <input type="date" name="expiry date" className="additem-box" />
            <br></br>
            <input type="submit" value="Add now" className="additem-btn" />
          </form>
        </div>
      </div>
    </div>

        <div>
          <span onClick={handleClick} className="additemicon">
            Add Item
          </span>
        </div>
      </div>
    );
  }
  export default NavBar;