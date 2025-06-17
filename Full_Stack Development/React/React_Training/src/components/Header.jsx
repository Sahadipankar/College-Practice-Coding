import React from 'react'
import { Link } from 'react-router-dom'

const Header = () => {
    return (
        <div className="py-7 px-10 bg-emerald-700 text-white flex items-center justify-between">
            <h2 className="text-2xl font-bold">My Demo Website <input type="text" placeholder="Search..." className="px-4 py-2 rounded bg-amber-50 text-black text-shadow-black" /></h2>
            <div className='flex gap-10 text-xl font-semibold underline'> 

                {/* Using Link component from react-router-dom for navigation without page reload.
                a tag reloads the page while Link component does not. */}

                <Link to="/" className="px-4 py-2 hover:bg-emerald-600 rounded">Home</Link>
                <Link to="/about" className="px-4 py-2 hover:bg-emerald-600 rounded">About</Link>
                <Link to="/product" className="px-4 py-2 hover:bg-emerald-600 rounded">Product</Link>
                <Link to="/contact" className="px-4 py-2 hover:bg-emerald-600 rounded">Contact</Link>

            </div>
        </div>
    )
}

export default Header