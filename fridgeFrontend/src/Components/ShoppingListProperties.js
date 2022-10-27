import ShoppingListItems from "./ShoppingListItems";

const ShoppingListProperties =({fridge, checked, setChecked, Checkbox, deleteShoppingListItem }) => {

    const fridgeId = fridge.id
    const shoppingListName = fridge.shoppingList.name
    
    const shoppingListItems = fridge.shoppingList.shoppingListItems.map((shoppingListItem)=>{
        return <ShoppingListItems
        shoppingListItem = {shoppingListItem}
        checked = { checked} 
        setChecked = { setChecked}
        Checkbox = {Checkbox}
        deleteShoppingListItem = {deleteShoppingListItem}
        />

    }
    
    )


    return(

    <>
    <h3>{shoppingListName}</h3>
    <li>{fridgeId}</li>
    
    <ul>
    {shoppingListItems}
    </ul>

    </>
    
    )

};

export default ShoppingListProperties;