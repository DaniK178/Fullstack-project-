

const FridgeItemDetails =({fridgeItem}) => {

    return(

    <>
    <p>{ fridgeItem.foodItem.name}</p>

    <button>Change quantity</button>
    <button> Change expiry Date </button>


    <button>Add to Shopping List!</button>
    <button>Add to Favourites List!</button>
    </>
    
    )

};

export default FridgeItemDetails;