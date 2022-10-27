import FridgeItemsListItems from "./FridgeItemsListItems";

const FridgeItemsList =({fridge, deleteFridgeItem, selectFridgeItem }) => {

    const fridgeListItems = fridge.fridgeItems.map((fridgeItem)=>{
    
            return <FridgeItemsListItems
                    fridgeItem={fridgeItem} 
                    deleteFridgeItem = {deleteFridgeItem}
                    selectFridgeItem ={selectFridgeItem}
                    key = {fridgeItem.id}
               />
        })
        

    return(
    <>
    <h3> {fridge.name}</h3>
    {fridgeListItems}
    </>
    
    )

};
export default  FridgeItemsList;