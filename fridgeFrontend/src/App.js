import './App.css';
import FridgeContainer from './Containers/FridgeContainer';
import UserContainer from './Containers/UserContainer';

function App() {
  
  return (
    <> 

    useContxt for if statement

    see usr container (login) first
    if sucessfully logged --> fridge container
                               if assigned to a fridge ---> access to all pages
                              else---> only access to addFridge & favList & logout --> usecontainer once clciked on logout
    <FridgeContainer />
      {/* <usecontext>  */}
        {/* <UserContainer /> */}
    
    </>
    
  );
}

export default App;