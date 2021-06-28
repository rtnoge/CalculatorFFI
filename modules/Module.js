//Type your code here
function plus() {
  var input1 = frmHome.inputFirst.text;
  var input2 = frmHome.inputSecond.text;

  /* FFI Function */
  var result = calculator.plus(
    /**Number*/ input1, 
    /**Number*/ input2);
  
  empty_form();
  
  frmHome.lblValueResult.text = result;
}

function minus() {
  var input1 = frmHome.inputFirst.text;
  var input2 = frmHome.inputSecond.text;

  /* FFI Function */
  var result = calculator.minus(
		/**Number*/ input1, 
		/**Number*/ input2);
  
  empty_form();
  
  frmHome.lblValueResult.text = result;
}

function multiple() {
  var input1 = frmHome.inputFirst.text;
  var input2 = frmHome.inputSecond.text;

  /* FFI Function */
  var result = calculator.multiple(
		/**Number*/ input1, 
		/**Number*/ input2);
  
  empty_form();
  
  frmHome.lblValueResult.text = result;
}

function divide() {
  var input1 = frmHome.inputFirst.text;
  var input2 = frmHome.inputSecond.text;

  /* FFI Function */
  var result = calculator.divide(
		/**Number*/ input1, 
		/**Number*/ input2);
  
  empty_form();
  
  frmHome.lblValueResult.text = result;
}

function empty_form() {
  var input1 = frmHome.inputFirst.text;
  var input2 = frmHome.inputSecond.text;

  if(input1 === "" && input2 === ""){
    alert("Isi dulu bambank");
    frmHome.lblValueResult.text = "";
    return;
  }

  if (input1 === "" || input1 === null) {
    alert("First Input is empty");
    frmHome.lblValueResult.text = "";
    return;
  }

  if (input2 === "" || input2 === null) {
    alert("Second Input is empty");
    frmHome.lblValueResult.text = "";
    return;
  }
}

function reset() {
  frmHome.inputFirst.text = "";
  frmHome.inputSecond.text = "";
  frmHome.lblValueResult.text = "-";
  frmHome.inputFirst.setFocus(true);
}

function exit() {
  kony.application.exit();
}