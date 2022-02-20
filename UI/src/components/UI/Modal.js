import React from 'react';
import ReactDOM from 'react-dom';
import style from './Modal.module.css';

const Backdrop = () => {
  return(
    <div className={style.backdrop}></div>
  )
};

const ModalOverlay = props => {
  return (
      <div className={style.modal}>
      <div className={style.content}> {props.children} </div>
      {/*Isme props.children matlab sab value cart.js se value aya hai */}
      </div>
  )
};

const Element = document.getElementById('overlays');

const Modal = (props) => {
  return (
    <>
      {ReactDOM.createPortal(<Backdrop />, Element)}
      {ReactDOM.createPortal(<ModalOverlay> {props.children} </ModalOverlay>, Element)}
    </>
  )
};

export default Modal;