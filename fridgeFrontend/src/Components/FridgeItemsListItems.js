

const FridgeItemsListItems =({fridgeItem, deleteFridgeItem}) => {

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

    const handleDeleteFridgeItem = (evt) => {
        evt.preventDefault();
        deleteFridgeItem(fridgeItem.id);
    } 

    return(


    <>
    <hr></hr>
    <p>Fridge Item ID: {fridgeItem.id}, </p>
    <p>{fridgeItem.foodItem.id}, {fridgeItem.foodItem.name}, {fridgeItem.foodItem.foodGroup}</p>

    <li> Quantity: {fridgeItem.quantity} - ExpiryDate: {fridgeItem.expiryDate}</li>

    <button class ="delete-movie-button" onClick= {handleDeleteFridgeItem}>Delete Fridge Item</button>
    <br></br>

    </>
    
    )

};

export default  FridgeItemsListItems ;