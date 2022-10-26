import { useParams } from "react-router-dom";
import FoodItemsList from "./FoodItemsList";



const FoodItem = ({ foodItems }) => {
    const { id } = useParams()

    const foodItem = foodItems.find((foodItem) => {
        const foodItemId = parseInt(id)
        return foodItemId === foodItem.id;
    })

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