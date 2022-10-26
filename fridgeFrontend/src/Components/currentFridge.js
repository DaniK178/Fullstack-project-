import { useState, React } from "react"
import { useParams } from "react-router-dom"
import FridgeItemsList from "./FridgeItemsList";

const CurrentFridge =({fridges, postFridgeItem,
    deleteFridgeItem}) => {

    const { id } = useParams()
    const fridge = fridges.find((fridge) => {
        const fridgeId = parseInt(id)
        return fridgeId === fridge.id;
    })

    const fridgeListItems = fridges.map((fridge)=>{
        return <FridgeItemsList 
                    fridge={fridge} 
                    postFridgeItem = {postFridgeItem}
                    deleteFridgeItem = {deleteFridgeItem}
                />
    })

    // const handlePostFridgeItem = (event) => {
    //     event.preventDefault()
    //     postFridgeItem(fridge.id, foodItem.id)
    // }


    return(

    <>
  {/* <div className="postFridgeItem">
                <form onSubmit={handlePostFridgeItem}>
                    <h3>Add a new Screen</h3>
                    <label htmlFor="screen capacity">Enter Screen Capacity:</label>
                    <input
                        type="text"
                        placeholder="Enter Screen Capacity"
                        name="capacity"
                        onChange={handleScreenChange}
                        value={stateScreen.capacity}
                    />
                    <button type="submit">Add</button>
                </form>
            </div> */}



     <h2>current fridge</h2>
    <ul>
        {fridgeListItems}
    </ul>
   
    </>
    
    )

};

export default CurrentFridge;