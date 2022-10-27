import './App.css';
// import FridgeContainer from './Containers/FridgeContainer';
import FoodItemContainer from './Containers/FoodItemContainer';
import UserContainer from './Containers/UserContainer';
import Footer from './Components/Footer';

function App() {
  
  return (
    <> 
      {/* 
      useContxt for if statement

      see usr container (login) first
      if sucessfully logged --> fridge container
                               if assigned to a fridge ---> access to all pages
                              else---> only access to addFridge & favList & logout --> usecontainer once clciked on logout */}
      {/* <FridgeContainer /> */}
      <UserContainer />
      <FoodItemContainer/>
      <Footer/>
      {/* <usecontext>  */}
      
    
    </>
    
  );
}

export default App;
