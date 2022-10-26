import FridgeItemsListItems from "./FridgeItemsListItems";

const FridgeItemsList =({fridge}) => {

    const fridgeListItems = fridge.fridgeItems.map((fridgeItem, deleteFridgeItem)=>{


        // fridgeItems.foodItems.map((fridgeItemFoodItem)=>{
            
            return <FridgeItemsListItems
                    fridgeItem={fridgeItem} 
                    deleteFridgeItem = {deleteFridgeItem}
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