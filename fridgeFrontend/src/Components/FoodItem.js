import FoodItemsList from "./FoodItemsList";
import {React} from "react"

const FoodItem = ({ foodItems, deleteFoodItem, selectFoodItem}) => {
    

    const foodItemsListComponent = foodItems.map((foodItem, selectFoodItem) => {
        return <FoodItemsList
                key={foodItem.id}
                foodItem={foodItem}
                deleteFoodItem={deleteFoodItem}
                selectFoodItem={selectFoodItem}
        />
    })

    return (

        <>
        <br/>
        <h1>Food Items List</h1>

            <ul>
                {foodItemsListComponent}
            </ul>
        </>

    )

};

export default FoodItem;