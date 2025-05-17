// import React from 'react'

// const Card = (props) => {   // This is a functional component that takes props as an argument and returns a JSX element.
//     // The props object contains the properties passed to the component.
//     console.log(props)
//     return (
//         <div>
//             <h1 className='text-3xl'>Username is: {props.user}</h1>
//         </div>
//     )
// }

// export default Card





import React from 'react'

const Card = (props) => {
    return (
        <div className='bg-white text-black inline-block p-6 rounded-lg shadow-lg text-center'>
            <img className='ml-4 h-32 w-32 rounded-full mb-3' src="" alt="" />
            <h1 className='text-2xl font-semibold mb-4'>{props.user} {props.surname}</h1>
            <h2>{props.city} {props.age}</h2>
            <button className=' mt-5 bg-emerald-800 text-white px-4 py-2 rounded font-medium'>Add Friend</button>
        </div>
    )
}

export default Card