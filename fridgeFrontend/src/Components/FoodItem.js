import FoodItemsList from "./FoodItemsList";
import {React} from "react"

const FoodItem = ({ foodItems }) => {
    

    const foodItemsList = foodItems.map((foodItem, selectFoodItem) => {
        return <FoodItemsList
                key={foodItem.id}
                foodItem={foodItem}
                selectFoodItem={selectFoodItem}
        />
    })

    return (

        <>
        <br/>
        <h1>Food Items List</h1>

            <ul>
                {foodItemsList}
            </ul>
        </>

    )

};

export default FoodItem;