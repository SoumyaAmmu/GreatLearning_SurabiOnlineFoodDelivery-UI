import React from 'react'
import { useContext } from 'react';
import style from './MealItem.module.css';
import MealItemForm from './MealItemForm';
import CartContext from '../../Store/Context';

const MealItem = (props) => {

  const cartCtx = useContext(CartContext);

  const price = `${props.price.toFixed(2)}`;

  const addToCartHandler = (amount) => {
    cartCtx.addItem({
      id: props.id,
      name: props.name,
      price: props.price,
      amount: amount
    });
  };
  
  return (
    <>
     <li className={style.meal}>  {/*yahape AvailableMeal.js component se data aya hai */}
      <div>
       <h2> {props.name} </h2>
       <div className={style.description}> {props.description} </div>
       <div className={style.price}> ₹{price} </div>
      </div>

        <div><MealItemForm onAddToCart={addToCartHandler} /></div>
      
    </li>
    </>
  )
}

export default MealItem;