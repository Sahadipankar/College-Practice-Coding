import React, { useContext } from 'react'
import { DataContext } from '../context/userContext'

const User_Section = () => {

    const Section_Username = useContext(DataContext) // Using useContext to consume the DataContext created in userContext.jsx This will give us the username provided by the DataContext.Provider

    return (
        <div>
            <h1>This is User Section {Section_Username.name}</h1>
        </div>
    )
}

export default User_Section