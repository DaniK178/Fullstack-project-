import Login from "../Components/Login";
import User from "../Components/User";

const UserContainer =({loggedInUser, onlineUser, user}) => {

    return(

    <>
    <p>UserContainer</p>
    
    <div>//welcome page after correct user info
    {(user.email !=="") ? (
      <div className='welcome'>
        <h2>Welcome, <span>{user.name}</span></h2>
        <button>Logout</button> 
      </div> ): null }
    </div>


    <Login loggedInUser={} error={error} />
    <User user={user} />
    </>
    
    )
};

export default UserContainer;