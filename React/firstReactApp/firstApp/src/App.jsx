import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import MyButton from "./components/MyButton";
("./components/MyButton");
import ShoppingList from "./components/ShoppingList";

function App() {
  return (
    <>
      <div>
        <h1>Welcome to my app</h1>
        <MyButton />
      </div>
      <div>
        <ShoppingList />
      </div>
    </>
  );
}

export default App;
