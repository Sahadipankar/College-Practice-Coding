import React, { useContext } from 'react'
import { DataContext } from '../context/userContext'

const User_Header = () => {

    const Header_Username = useContext(DataContext) // Using useContext to consume the DataContext created in userContext.jsx. This will give us the username provided by the DataContext.Provider

    return (
        <div>
            <h1>This is User Header {Header_Username.age}</h1>
        </div>
    )
}

export default User_Header