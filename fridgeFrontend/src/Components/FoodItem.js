import FoodItemsList from "./FoodItemsList";
import {React} from "react"
import "./Style.css";

const FoodItem = ({ handleAddItemClick ,isShownAddItem, foodItems, deleteFoodItem, selectFoodItem}) => {
    // const [stateChocolate, setStateFoodItem] = useState(
    //     {
    //         name: "",
    //         foodGroup: null
    //     }
    // )

    
    

    const foodItemsListComponent = foodItems.map((foodItem, selectFoodItem) => {
        return <FoodItemsList
                key={foodItem.id}
                foodItem={foodItem}
                deleteFoodItem={deleteFoodItem}
                selectFoodItem={selectFoodItem}
        />
    })

    const handleFormSubmit = (event) => {
        event.preventDefault()
    }

    return (

        <>
            <br/>
            <br/>
            <div className="foodItem-title-container">
                <h1>Food List</h1>
            </div>
            <br/>

            <div className='footer-content'>
        
                <form onSubmit={handleFormSubmit}>
                    <h3>Add Item</h3>
                
                    <input 
                        type="text" 
                        placeholder="Enter name" 
                        name="name"
                    />
                
                    <select 
                        name="foodGroup" 
                        defaultValue="select-foodGroup">
                    </select>
            
                    <button type="submit">OK</button>
                </form>

            </div>
    

            <ul>
                {foodItemsListComponent}
            </ul>
        </>

    )

};

export default FoodItem;