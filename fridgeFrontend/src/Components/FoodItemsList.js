const FoodItemsList = ({foodItem, handleDeleteFoodItem}) => {

    // const handleDeleteFoodItem = () => {
    //     handleDeleteFoodItem(foodItem.id);
    // }

    return (
        <>
            <div className="foodItemList-list">

                <p><b>Food Item: </b>{foodItem.name}</p>
                <p><b>Food Category: </b>{foodItem.foodGroup}</p>
                <button onClick={handleDeleteFoodItem}>
                delete
                </button>

            </div>
        </>
    )
}

export default FoodItemsList