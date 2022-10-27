import { useNavigate, useParams } from "react-router-dom"
import { useState } from "react";
import FridgeListItem from "./FridgeListItem";


const FridgeList =({fridges , setSelectedFridge, selectedFridge}) => {

    const navigate = useNavigate();
    
    
    const handleFridgeNavigation = (fridge) => {
        navigate(`/CurrentFridge`)
    }


    const fridgeOptions = fridges.map((fridge, index) => {
        return <FridgeListItem
           fridge= {fridge}
           key= {index}
           handleFridgeNavigation = {handleFridgeNavigation}
           setSelectedFridge = {setSelectedFridge}
           />
        
        })



    return(

        <>
         <p>Fridge List</p>

         <section> 
        <h2>Please select the Fridge</h2>
        <ul>
        {fridgeOptions} 
        </ul>

        
       </section>

        
        </>
    )
}

export default FridgeList;