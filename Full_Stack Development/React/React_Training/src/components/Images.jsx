// src/components/Images.jsx

import React from 'react';

const Images = ({ data1, data2 }) => {
  return (
    <div className='p-5 mt-5 bg-gray-900 rounded'>
      {/* First set of images */}
      {data2.map((elem, idx) => (
        <div
          key={idx}
          className='bg-gray-100 text-black flex items-center justify-between w-full px-7 py-6 rounded mb-3'
        >
          <img src={elem.download_url} alt={elem.author} />
        </div>
      ))}

      {/* Second set of images */}
      {data1.map((elem, idx) => (
        <div
          key={idx}
          className='bg-gray-100 text-black flex items-center justify-between w-full px-7 py-6 rounded mb-3'
        >
          <img src={elem.download_url} alt={elem.author} />
        </div>
      ))}
    </div>
  );
};

export default Images;
