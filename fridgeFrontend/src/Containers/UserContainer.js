import Login from "../Components/Login";
import User from "../Components/User";

const UserContainer =({loggedInUser, onlineUser, user}) => {

    return(
      <>
      { onlineUser === undefined ?
      <Login loggedInUser={loggedInUser} /> :
      <User user={onlineUser} loggedInUser={loggedInUser}/>
      }
      </>
  )

};

export default UserContainer;