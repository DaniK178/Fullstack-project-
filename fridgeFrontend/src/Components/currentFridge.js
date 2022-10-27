import { useState, React } from "react"
import { useParams } from "react-router-dom"
import FridgeItemDetails from "./FridgeItemDetails";
import FridgeItemsList from "./FridgeItemsList";
import AddFridgeItemForm from "./AddFridgeItemForm";

const CurrentFridge =({fridge, postFridgeItem,
    deleteFridgeItem, setSelectedFridge, selectedFridge, selectFridgeItem, selectedFridgeItem }) => {


        const [isAddSelected, setIsAddSelected] = useState(false)    

    const fridgeListItems = (
        <FridgeItemsList 
                    fridge={fridge} 
                    postFridgeItem = {postFridgeItem}
                    deleteFridgeItem = {deleteFridgeItem}
                    selectedFridgeItem = {selectedFridgeItem}
                    selectFridgeItem = {selectFridgeItem}
                />
    )

    

    const fridgeItemDetails = 
    <FridgeItemDetails
    selectedFridgeItem = {selectedFridgeItem}
    /> 
   
        // POST NEW ITEM METHOD
        //   const handlePostFridgeItem = (event) => {
        //         event.preventDefault()
        //         postFridgeItem(fridge.id, foodItem.id)
        //     }

        const handleViewAddForm = () => {
            setIsAddSelected(!isAddSelected)
        } 

            

    return(

    <>

    <h2>Fridge</h2>

     <button className ="View Item" onClick= {handleViewAddForm}>Add Item</button>

     {isAddSelected?
       <AddFridgeItemForm
       />
       :<div></div>
    
            }



    <ul>
        {fridgeListItems}
    </ul>

    

    
    </>
    
    )

};

export default CurrentFridge;