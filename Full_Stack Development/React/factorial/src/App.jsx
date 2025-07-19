import React, { useState } from 'react';

// Main App component
const App = () => {
  // State to store the input number
  const [number, setNumber] = useState('');
  // State to store the calculated factorial result
  const [factorial, setFactorial] = useState(null);
  // State to store any error messages
  const [error, setError] = useState('');

  // Function to calculate factorial
  const calculateFactorial = (num) => {
    // Base cases for factorial calculation
    if (num < 0) {
      return 'undefined (negative numbers)'; // Factorial is not defined for negative numbers
    }
    if (num === 0 || num === 1) {
      return 1; // Factorial of 0 and 1 is 1
    }

    // Initialize result for iterative calculation
    let result = 1;
    // Loop from 2 up to the number to multiply
    for (let i = 2; i <= num; i++) {
      result *= i;
    }
    return result;
  };

  // Event handler for input changes
  const handleInputChange = (event) => {
    // Update the number state with the input value
    setNumber(event.target.value);
    // Clear any previous error messages when input changes
    setError('');
    // Clear previous factorial result
    setFactorial(null);
  };

  // Event handler for the calculate button click
  const handleCalculateClick = () => {
    // Convert the input string to an integer
    const num = parseInt(number, 10);

    // Input validation
    if (isNaN(num) || number.trim() === '') {
      setError('Please enter a valid number.');
      setFactorial(null);
      return;
    }
    if (!Number.isInteger(num)) {
      setError('Please enter a whole number (integer).');
      setFactorial(null);
      return;
    }
    if (num < 0) {
      setError('Factorial is not defined for negative numbers.');
      setFactorial(null);
      return;
    }
    // Limit the input to prevent extremely large numbers that might cause performance issues or overflow
    if (num > 20) { // Factorial of 20 is already a very large number (2,432,902,008,176,640,000)
      setError('Number is too large for calculation. Please enter a number up to 20.');
      setFactorial(null);
      return;
    }

    // Calculate the factorial and update the state
    const result = calculateFactorial(num);
    setFactorial(result);
    setError(''); // Clear any errors if calculation is successful
  };

  return (
    <div className="min-h-screen bg-gradient-to-br from-purple-400 to-indigo-600 flex items-center justify-center p-4 font-inter">
      <div className="bg-white p-8 rounded-xl shadow-2xl w-full max-w-md transform transition-all duration-300 hover:scale-105">
        <h1 className="text-4xl font-extrabold text-center text-gray-800 mb-6">
          Factorial Calculator
        </h1>

        <div className="mb-6">
          <label htmlFor="number-input" className="block text-gray-700 text-lg font-semibold mb-2">
            Enter a non-negative integer:
          </label>
          <input
            id="number-input"
            type="number"
            value={number}
            onChange={handleInputChange}
            placeholder="e.g., 5"
            className="w-full px-4 py-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500 text-lg"
          />
        </div>

        <button
          onClick={handleCalculateClick}
          className="w-full bg-indigo-600 text-white py-3 rounded-lg text-xl font-bold hover:bg-indigo-700 transition-colors duration-300 shadow-lg transform hover:scale-100 active:scale-95"
        >
          Calculate Factorial
        </button>

        {error && (
          <p className="mt-6 text-red-600 text-center text-lg font-medium bg-red-100 p-3 rounded-lg border border-red-300">
            {error}
          </p>
        )}

        {factorial !== null && !error && (
          <div className="mt-6 p-5 bg-green-100 rounded-lg shadow-inner border border-green-300">
            <h2 className="text-2xl font-bold text-green-800 text-center mb-2">Result:</h2>
            <p className="text-4xl font-extrabold text-green-700 text-center">
              {factorial}
            </p>
          </div>
        )}
      </div>
    </div>
  );
};

export default App;
