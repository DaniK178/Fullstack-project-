import FridgeItemsListItems from "./FridgeItemsListItems";

const FridgeItemsList =({fridge, deleteFridgeItem, selectFridgeItem }) => {

    const fridgeListItems = fridge.fridgeItems.map((fridgeItem)=>{


        // fridgeItems.foodItems.map((fridgeItemFoodItem)=>{
            
            return <FridgeItemsListItems
                    fridgeItem={fridgeItem} 
                    deleteFridgeItem = {deleteFridgeItem}
                    selectFridgeItem ={selectFridgeItem}
                    // fridgeItemFoodItem = {fridgeItemFoodItem}
               />

        })
        
    // })

    return(


    <>
    <h3> {fridge.name}</h3>

    <li>{fridgeListItems}</li>

    </>
    
    )

};

export default  FridgeItemsList;