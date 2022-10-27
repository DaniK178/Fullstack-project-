

const ShoppingListItems =({shoppingListItem, checked, setChecked, Checkbox}) => {

    const handleChange = () => {
        setChecked(!checked);
    }

    return(

    <>
    <li> {shoppingListItem.foodItem.name},{shoppingListItem.quantity}, {shoppingListItem.shop} </li>
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