const FoodItemsList = ({foodItem}) => {

    return (
        <>

        <li>Item: {foodItem.name}</li>
        <p>Food Group: {foodItem.foodGroup}</p>
        </>
    )
}

export default FoodItemsList