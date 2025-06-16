// // This is a simple React application that demonstrates the use of state and event handling.

// import React, { useState } from "react";

// const App = () => {
//   const [a, setA] = useState(10);
//   const [name, setName] = useState("Raj");

//   const toggleName = () => {
//     setName((prev) =>
//       (prev === "Raj" ? "Momo" : "Raj"));
//   };


//   return (
//     <div>
//       <h1 className="text-[50px] font-bold">The value of A is {a}</h1>
//       <button onClick={() => setA(a + 10)}>Increment A</button>
//       <button onClick={() => setA(a - 10)}>Decrement B</button>

//       <h1 className="text-[50px] font-bold">The user name is {name}</h1>
//       <button onClick={toggleName}>Toggle User Name</button>
//     </div>
//   );
// };

// export default App;







// // This is a simple React application that demonstrates the use of state and event handling.

// import React, { useState } from "react";

// const App = () => {
//   // This is a simple form with an input field and a submit button

//   const [username, setUsername] = useState("");
//   // useState is a React hook that allows you to add state to functional components

//   const submitHandler = (e) => {  // Handle form submission
//     console.log(username); // Log to console
//     e.preventDefault(); // Prevent page refresh
//     setUsername(""); // Clear the input field
//   };


//   return (
//     <div>
//       <form onSubmit={(e) => submitHandler(e)}>
//         <input
//           value={username} onChange={(e) => setUsername(e.target.value)}
//           className="px-5 py-3 text-xl m-5 bg-white text-black font-bold rounded"
//           type="text"
//           placeholder="Enter your name" />{" "}
//         <br />
//         <button className="px-5 py-3 m-5 text-xl font-semibold bg-emerald-600 rounded" type="submit">Submit
//         </button>
//       </form>
//     </div>
//   );
// };

// export default App;







// // This is a simple React application that demonstrates the use of state and event handling.
// import React from 'react'
// import Navbar from './components/Navbar'
// import Footer from './components/Footer'


// const App = () => {
//   return (
//     <>
//       <Navbar />
//       <Footer />
//     </>
//   )
// }

// export default App







// import React from 'react'
// import Card from './components/Card'

// const App = () => {
//   const user = "John"

//   return (
//     <div>
//       <Card user={user} />
//       <Card user='Raj' />
//     </div>
//   )
// }

// export default App







// import React from 'react'
// import Card from './components/Card'

// const App = () => {

//   const users = [
//     {
//       "name": "Aarav Sharma",
//       "city": "Mumbai",
//       "age": 29,
//       "profession": "Software Engineer",
//       "profile_photo": "https://example.com/photos/aarav.jpg"
//     },
//     {
//       "name": "Priya Mehra",
//       "city": "Delhi",
//       "age": 34,
//       "profession": "Marketing Manager",
//       "profile_photo": "https://example.com/photos/priya.jpg"
//     },
//     {
//       "name": "Rahul Verma",
//       "city": "Bangalore",
//       "age": 26,
//       "profession": "Data Analyst",
//       "profile_photo": "https://example.com/photos/rahul.jpg"
//     },
//     {
//       "name": "Sneha Iyer",
//       "city": "Chennai",
//       "age": 31,
//       "profession": "UX Designer",
//       "profile_photo": "https://example.com/photos/sneha.jpg"
//     },
//     {
//       "name": "Karan Patel",
//       "city": "Ahmedabad",
//       "age": 38,
//       "profession": "Financial Advisor",
//       "profile_photo": "https://example.com/photos/karan.jpg"
//     },
//     {
//       "name": "Raj Roy",
//       "city": "Kolkata",
//       "age": 21,
//       "profession": "UX Designer",
//       "profile_photo": "https://example.com/photos/raj.jpg"
//     }
//   ]



//   return (
//     <div>
//       <div className='p-10'>
//         {users.map(function (elem, idx) {
//           return <Card key={idx} name={elem.name} profession={elem.profession} city={elem.city} age={elem.age} image={elem.profile_photo} />
//         })}
//       </div>
//     </div>
//   )
// }

// export default App







// Axios is a promise-based HTTP client for the browser and Node.js. It is used to make HTTP requests to servers, allowing you to fetch or send data easily. In this example, we will use Axios to fetch data from a public API and display it in our React application.
// npm install axios 

import axios from 'axios'
import React, { useState } from 'react'

const App = () => {

  const [data, setData] = useState([])
  const [data2, setData2] = useState([])
  const [showMessage, setShowMessage] = useState(false) // Track button click


  const getImages = async () => {

    setShowMessage(true) // Set to true when button is clicked

    const response = await axios.get('https://picsum.photos/v2/list?page=2&limit=100')
    const response2 = await axios.get('https://picsum.photos/v2/list')
    // The above URL fetches a list of images from the Picsum API.
    setData(response.data)
    setData2(response2.data)

    console.log(response.data);
    console.log(response2.data);
    // The response.data contains the list of images, which we set to the state variable 'data'.
    // The response2.data contains the list of images, which we set to the state variable 'data2'.
  }



  return (
    <div className='p-10'>
      {/* Centered Container */}
      <div className='flex flex-col items-center justify-center'>
        <button
          onClick={getImages}
          className='bg-teal-600 text-white font-semibold text-2xl px-6 py-3 rounded active:scale-90'
        >
          Get Images
        </button>

        {/* Show message only after button is clicked */}
        {showMessage && (
          <h1 className='mt-5 text-white font-bold text-2xl text-center'>
            Please wait for a few seconds after clicking the button to see the images.
          </h1>
        )}
      </div>

      {/* Images container */}
      <div className='p-5 mt-5 bg-gray-900 rounded'>
        {data2.map((elem, idx) => (
          <div
            key={idx}
            className='bg-gray-100 text-black flex items-center justify-between w-full px-7 py-6 rounded mb-3'
          >
            <img src={elem.download_url} alt={elem.author} />
          </div>
        ))}

        {data.map((elem, idx) => (
          <div
            key={idx}
            className='bg-gray-100 text-black flex items-center justify-between w-full px-7 py-6 rounded mb-3'
          >
            <img src={elem.download_url} alt={elem.author} />
          </div>
        ))}
      </div>
    </div>
  );
}

export default App