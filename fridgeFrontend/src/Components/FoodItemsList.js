const FoodItemsList = ({foodItem, handleDeleteFoodItem}) => {

    // const handleDeleteFoodItem = () => {
    //     handleDeleteFoodItem(foodItem.id);
    // }

    return (
        <>

        <li><b>ITEM: </b>{foodItem.name}</li>
        <p>Food Group: {foodItem.foodGroup}</p>
        <button onClick={handleDeleteFoodItem}>
                delete
            </button>
        </>
    )
}

export default FoodItemsList