import React, { useState,useEffect } from "react";
import FridgeItemDetails from "./FridgeItemDetails";

const FridgeItemsListItems =({fridgeItem, deleteFridgeItem}) => {
    

    const [isSelected, setIsSelected] = useState(false)

    const handleDeleteFridgeItem = () => {
        deleteFridgeItem(fridgeItem.id);
    } 

    const handleViewFridgeItem = () => {
        setIsSelected(!isSelected)
    } 

    return(
    <>
    <div className="list-item">
        
        <p>{fridgeItem.foodItem.name} </p>

        <li> Quantity: {fridgeItem.quantity} </li>
        <li> ExpiryDate: {fridgeItem.expiryDate}</li>
        

        <button className ="list-item-button" onClick= {handleViewFridgeItem}>View Item Details</button>

        <button className ="list-item-button" onClick= {handleDeleteFridgeItem}>Delete Fridge Item</button>
        <br></br>
    </div>

    <hr></hr>

    {isSelected?
       <FridgeItemDetails
       fridgeItem = {fridgeItem}
       />
       :<div></div>
    
            }
            
    </>
    
    );

}

export default  FridgeItemsListItems ;