
const FridgeListItem =({fridge, handleFridgeNavigation, setSelectedFridge}) => {

    const handleClick = () => {
        setSelectedFridge(fridge)
        handleFridgeNavigation(fridge)
    }

    return(

    <>
    <li>{fridge.name}</li>
    <button onClick={handleClick}>Go to this fridge!</button>
    </>
    
    )

};

export default FridgeListItem;