

const FridgeItemsListItems =({fridgeItem, deleteFridgeItem,selectFridgeItem }) => {

    // const fridgeItemFoodItem = fridgeItem.foodItem.map((fridgeItemFoodItem)=> { 
    //     return 
    //    <FridgeItemFoodItem 
    //    fridgeItemFoodItem = {fridgeItemFoodItem }
    //    />
    // })

    // const fridgeListItems = fridgeItems.map((fridgeItems)=>{
    //     return fridgeItems
    //     // return <FridgeItemsList 
    //     //             fridge={fridge} 
    //        //     />
    // })

    const handleDeleteFridgeItem = () => {
        deleteFridgeItem(fridgeItem.id);
    } 

    const handleViewFridgeItem = () => {
        selectFridgeItem(fridgeItem);
    } 


    return(


    <>
    <hr></hr>
    <p>Fridge Item ID: {fridgeItem.id}, </p>
    <p>{fridgeItem.foodItem.id}, {fridgeItem.foodItem.name}, {fridgeItem.foodItem.foodGroup}</p>

    <li> Quantity: {fridgeItem.quantity} - ExpiryDate: {fridgeItem.expiryDate}</li>

    <button class ="View Item" onClick= {handleViewFridgeItem}>View Item</button>

    <button class ="delete-fridgeItem-button" onClick= {handleDeleteFridgeItem}>Delete Fridge Item</button>
    <br></br>

    </>
    
    )

};

export default  FridgeItemsListItems ;