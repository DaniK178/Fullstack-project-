import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";


const Login =({users, error, loggedInUser, postUser})=> {
    const navigate = useNavigate();

    // const [details, setDetails] = useState({name: "", email: "", password: "",favList:[]});
    const submitHandler = e => {
        e.preventDefault();
        Login(details);
    }

    const login = details=> {
        console.log(details);
    
        if (details.email == adminUser.email && details.password == adminUser.password)
          console.log("Logged in");
          setUser({
            name: details.name,
            email: details.email
          });}
    
      // } else {
        
      //   console.log("details not found");
      //   setError("details not found");
    
      // };
    
      const Logout = () => {
        console.log("Logout");
      }

      const [user, setUser] = useState({name:"", email: ""});
      const [error, setError] = useState("");

    return(
        <>
    
        <form onSubmit={submitHandler}>
            <div className="form-inner">
                <h2>Login</h2>
                {/* error! */}
                <div className="form-group">
                    <label htmlFor="name">Name:</label>
                    <input type="text" name="name" id="name" onChange={e => setDetails({...details, name: e.target.value})} value ={details.name} />

                </div>
                <div className="form-group">
                <label htmlFor="email">Email: </label>
                <input type="email" name="email" id="email" onChange={e => setDetails({...details, email: e.target.value})} value ={details.email} />
                </div>
                <div className="form-group">
                <label htmlFor="password">Password: </label>
                <input type="password" name="password" id="password" onChange={e => setDetails({...details, password: e.target.value})} value ={details.password} />
                </div>
                <input type="submit" value="Login"/>

            </div>
        </form>
        </>
    )

};

export default Login;