// // This is a simple React application that demonstrates the use of state and event handling.

// import React, { useState } from "react";

// const App = () => {
//   const [a, setA] = useState(10);

//   return (
//     <div>
//       <h1 className="text-[50px] font-bold">The value of A is {a}</h1>
//       <button onClick={() => setA(a + 10)}>Increment A</button>
//       <button onClick={() => setA(a - 10)}>Decrement B</button>
//     </div>
//   );
// };

// export default App;







// // This is a simple React application that demonstrates the use of state and event handling.

// import React, { useState } from "react";

// const App = () => {
//   // This is a simple form with an input field and a submit button
//   const submitHandler = (e) => {
//     // Handle form submission
//     console.log(username); // Log to console
//     e.preventDefault(); // Prevent page refresh
//     setUsername(""); // Clear the input field
//   };

//   const [username, setUsername] = useState("");

//   return (
//     <div>
//       <form onSubmit={(e) => submitHandler(e)}>
//         <input
//           value={username}
//           onChange={(e) => setUsername(e.target.value)}
//           className="px-5 py-3 text-xl m-5 bg-white text-black font-bold rounded"
//           type="text"
//           placeholder="Enter your name"
//         />{" "}
//         <br />
//         <button
//           className="px-5 py-3 m-5 text-xl font-semibold bg-emerald-600 rounded"
//           type="submit"
//         >
//           Submit
//         </button>
//       </form>
//     </div>
//   );
// };

// export default App;







// // This is a simple React application that demonstrates the use of state and event handling.
// import React from 'react'
// import Navbar from './components/Navbar'


// const App = () => {
//   return (
//     <>
//     <Navbar />

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








import React from 'react'
import Card from './components/Card'

const App = () => {
  const user = "John"

  return (
    <div className='p-6'>
      <Card user='Dipankar' surname='Saha' age='Age: 28' city='City: Kolkata' />
    </div>
  )
}

export default App
