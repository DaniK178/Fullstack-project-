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
    <hr></hr>
    <p>Fridge Item ID: {fridgeItem.id}, </p>
    <p>{fridgeItem.foodItem.id}, {fridgeItem.foodItem.name}, {fridgeItem.foodItem.foodGroup}</p>

    <li> Quantity: {fridgeItem.quantity} </li>
    <li> ExpiryDate: {fridgeItem.expiryDate}</li>
    

    <button className ="View Item" onClick= {handleViewFridgeItem}>View Item</button>

    <button className ="delete-fridgeItem-button" onClick= {handleDeleteFridgeItem}>Delete Fridge Item</button>
    <br></br>

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