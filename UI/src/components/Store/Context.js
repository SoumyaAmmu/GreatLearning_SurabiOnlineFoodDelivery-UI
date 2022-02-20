import React from 'react';

const CartContext = React.createContext({
  items: [],
  totalAmount: 0,
  addItem: (item) => {},
  removeItem: (id) => {}
});                    
// eslint-disable-next-line
{/* here useContext value has initiated*/}

export default CartContext;
