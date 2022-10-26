import FoodItemsList from "./FoodItemsList";
import {React} from "react"

const FoodItem = ({ foodItems }) => {

    const foodListItems = foodItems.map((foodItem) => {
        return <FoodItemsList
                foodItem={foodItem}
        />
    })

    return (

        <>

            <ul>
                <li>
                    {foodListItems}
                </li>

            </ul>
        </>

    )

};

export default FoodItem;