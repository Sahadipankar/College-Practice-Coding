import React, { createContext } from 'react'

export const DataContext = createContext()

const UserContext = ({ children }) => {

    const UserData = {
        name: 'Raj',
        age: 30,
        email: 'raj@example.com'
    } // This is the data that we want to provide to all components that consume this context. It can be any data, in this case, it's an object with name, age, and email properties.

    return (
        <div>
            <DataContext.Provider value={UserData}>
                {/* This is the context provider that will provide the UserData to all components that consume this context. The value prop of the DataContext.Provider is an object that contains the UserData */}

                {children}
                {/* This will render the children components that are wrapped inside UserContext in main.jsx that is App.jsx */}

                <h1>This is User Context {UserData.name}</h1>
            </DataContext.Provider>
        </div>
    )
}

export default UserContext