import { useState, React } from "react"
import { useParams } from "react-router-dom"
import FridgeItemsList from "./FridgeItemsList";

const CurrentFridge =({fridges}) => {

    const { id } = useParams()
    const fridge = fridges.find((fridge) => {
        const fridgeId = parseInt(id)
        return fridgeId === fridge.id;
    })

    const fridgeListItems = fridges.map((fridge)=>{
        return <FridgeItemsList 
                    fridge={fridge} 
                />
    })


    return(

    <>
     <p>current fridge</p>
    <ul>
        {fridgeListItems}
    </ul>
   
    </>
    
    )

};

export default CurrentFridge;