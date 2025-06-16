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
//     }
//   ]


//   users.map(function () {

//     return "hey";
//   })


//   return (
//     <div className='p-6'>
//       {users.map(function (elem, idx) {
//         return <Card key={idx} username={elem.name} age={elem.age} city={elem.city} profile_photo={elem.profile_photo} />
//       })}
//     </div>
//   )
// }

// export default App
