import { useEffect, useState } from 'react';
import UserContext from './useContext';
import './App.css';
import FridgeContainer from './Containers/FridgeContainer';
import UserContainer from './Containers/UserContainer';

function App() {

  // const [loggedInUser,setLoggedInUser] = useState();
  // const [users,setUsers] = useState([]);

  // const fetchUsers = async () => {
  //   const response = await fetch('http://localhost:8080/users');
  //   const userData = await response.json();
  //   setUsers(userData);
  // }

  // const addUser = async (newUser) => { 
  //   const response = await fetch("http://localhost:8080/users", {
  //           method: "POST",
  //           headers: { 'Content-Type': 'application/json' },
  //           body: JSON.stringify(newUser)
  //       })
  //       const savedUser = await response.json();
  //       setUsers([...users, savedUser]);
  // }
  
  // useEffect(() => {
  //   fetchUsers();
  // },[])
  
  return (
    <> 
    
    {/* <UserContext.Provider value={{loggedInUser, users,setLoggedInUser}} >
        {loggedInUser ? 
        <FridgeContainer /> :   
        <UserContainer  register={addUser} />
      }
    </UserContext.Provider> */}

    <UserContainer />
    
    </>
  
     
  );
}

export default App;
