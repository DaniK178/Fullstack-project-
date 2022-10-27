import ShoppingListProperties from "./ShoppingListProperties";


const ShoppingList =({fridge, checked, setChecked, Checkbox, deleteShoppingListItem }) => {
    

    return(

    <>
    <h2 className= "list-heading" ><span>Shopping List </span></h2>
    <ul> 
        <ShoppingListProperties
        fridge = {fridge}
        checked = {checked}
        setChecked = {setChecked}
        checkbox = {Checkbox}
        deleteShoppingListItem = {deleteShoppingListItem} 
        />
    </ul>
    </>
    
    )

};

export default ShoppingList;