import React, { useContext } from 'react'
import { DataContext } from '../context/userContext'

const User_Footer = () => {

    const Footer_Username = useContext(DataContext) // Using useContext to consume the DataContext created in userContext.jsx. This will give us the username provided by the DataContext.Provider

    return (
        <div>
            <h1>This is User Footer {Footer_Username.email}</h1>
        </div>
    )
}

export default User_Footer