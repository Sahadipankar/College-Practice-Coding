import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App.jsx";
import "./index.css";
import { BrowserRouter } from "react-router-dom";
import UserContext from "./context/userContext.jsx";

createRoot(document.getElementById("root")).render(

    // BrowserRouter is used to enable routing in the application
    // <BrowserRouter>
    //     <App />
    // </BrowserRouter>

    // UserContext is used to provide user-related data throughout the application
    <UserContext>
        <App />
    </UserContext>
);
