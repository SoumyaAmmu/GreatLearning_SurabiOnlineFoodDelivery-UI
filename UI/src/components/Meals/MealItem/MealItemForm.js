import React, { useRef, useState } from 'react'
import style from './MealItemForm.module.css';
import Input from '../../UI/Input';

const MealItemForm = (props) => {

  const amountInputRef =useRef();
  const [isvalid, setIsValid] = useState(false)

  const submitHandler = event => {
    event.preventDefault();
  
  const enteredAmount = amountInputRef.current.value;
  const enteredAmountNumber = +enteredAmount;

  if(
    enteredAmount.trim().length === 0 || enteredAmountNumber < 1 || enteredAmountNumber > 10) {
      setIsValid(false);
      return;
    }
    props.onAddToCart(enteredAmountNumber);
  };
  

  return (
    <>
      <form className={style.form} onSubmit={submitHandler}>
        <Input
        ref={amountInputRef}
        label= 'Quantity'
        input={{
          id: 'amount' + props.id,
          type: 'number',
          min: '1',
          max: '10',
          step: '1',
          defaultValue: '1'
        }}
        />             {/*yahape Input.js component import karke usme value pass kiya hai */}
        <button>+Add</button>
        {isvalid && <p>please enter valid amount till 1-5</p>}
      </form>
    </>
  )
}

export default MealItemForm;