const FoodItemsList = ({foodItem, handleDeleteFoodItem}) => {

    // const handleDeleteFoodItem = () => {
    //     handleDeleteFoodItem(foodItem.id);
    // }

    return (
        <>

        <li>Item: {foodItem.name}</li>
        <p>Food Group: {foodItem.foodGroup}</p>
        <button onClick={handleDeleteFoodItem}>
                delete
            </button>
        </>
    )
}

export default FoodItemsList