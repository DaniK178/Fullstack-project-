import ShoppingListProperties from "./ShoppingListProperties";


const ShoppingList =({fridges, checked, setChecked, Checkbox}) => {
    
    
    const shoppingListItems = fridges.map((fridge) => {
        return <ShoppingListProperties
        fridge = {fridge}
        checked = {checked}
        setChecked = {setChecked}
        checkbox = {Checkbox}
        />
    })

    return(

    <>
    <h2>Shopping List</h2>
    <ul> 
        {shoppingListItems}
    </ul>
    </>
    
    )

};

export default ShoppingList;