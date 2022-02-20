import React, { useContext } from 'react';
import CartIcon from '../cart/CartIcon';
import style from './HeaderCartButton.module.css';
import CartContext from '../../components/Store/Context';
 
const HeaderCartButton = (props) => {

  const cartCtx = useContext(CartContext);

  const numberOfCartItems = cartCtx.items.reduce((curNumber, item) => {
    return (curNumber + item.amount);
  }, 0)

  return (
    <button className={style.button} onClick={props.onClick}>   {/* yaha onClick ki value Header se ayi hai */}
      <span className={style.icon}>
      <CartIcon />
      </span>
      <span>Cart</span>
      <span className={style.badge}> {numberOfCartItems} </span>
    </button>
  )
};

export default HeaderCartButton;