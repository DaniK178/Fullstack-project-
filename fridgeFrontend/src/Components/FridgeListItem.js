
import './FridgeStyles.css'


const FridgeListItem =({fridge, handleFridgeNavigation, setSelectedFridge}) => {

    const handleClick = () => {
        setSelectedFridge(fridge)
        handleFridgeNavigation(fridge)
    }

    return(

    <>
    <div className="fridge-list-container">
    
    <ul>

   
        <li>{fridge.name}</li>
        <button onClick={handleClick}>Go to this fridge!</button>
    </ul> 
    </div>
    </>
    
    )

};

export default FridgeListItem;