import React, { useState } from "react";
import './App.css';
import Header from './components/layout/Header';
import AvailableMeal from './components/Meals/AvailableMeal';
import Cart from './components/cart/Cart';
import CartProvider from './components/Store/CartProvider';

const App = (props) => {

  const [cartHandler, setCartHandler] = useState(false);

  const openCartHandler = () => {
    setCartHandler(true);
  }
  const closeCartHandler = () => {
    setCartHandler(false);
  }

  return (
    <CartProvider>
    {cartHandler && <Cart onClose={closeCartHandler} />}
    <Header onOpen={openCartHandler} />
    <main>
    <AvailableMeal />
    </main>
   </CartProvider>
  )
  };

export default App;
