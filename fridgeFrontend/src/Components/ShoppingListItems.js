

const ShoppingListItems =({shoppingListItem, checked, setChecked,Checkbox, deleteShoppingListItem}) => {

    const handleChange = () => {
        setChecked(!checked);
    }

    const handleDeleteShoppingListItem = () => {
        deleteShoppingListItem(shoppingListItem.id);
    } 

    return(

    <>
    <li> {shoppingListItem.foodItem.name},{shoppingListItem.quantity}, {shoppingListItem.shop} </li>

    <button className ="delete-shoppingListItem-button" onClick= {handleDeleteShoppingListItem}>Delete Shopping List Item</button>
    <br></br>


    <div>
      {/* <Checkbox
        label="My Value"
        value={checked}
        onChange={handleChange}
      />
      */}

      <p>Is "My Value" checked? {checked.toString()}</p> 
    </div>
    
    
    {/* <div>
        <label>
      <input type="checkbox" 
       checked = {checked}
       onChange={handleChange}
      />
     My value 
      </label>

      <p>Is "My Value" checked? {checked.toString()}</p>
    </div> */}
    </>
    
    )

};

export default ShoppingListItems;