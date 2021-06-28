package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.ist.calculate.Calculate;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class N_calculator extends JSLibrary {

 
 
	public static final String plus = "plus";
 
 
	public static final String minus = "minus";
 
 
	public static final String multiple = "multiple";
 
 
	public static final String divide = "divide";
 
	String[] methods = { plus, minus, multiple, divide };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[0];
 return libs;
 }



	public N_calculator(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 Double input10 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 input10 = (Double)params[0];
 }
 Double input20 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 input20 = (Double)params[1];
 }
 ret = this.plus( input10, input20 );
 
 			break;
 		case 1:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 Double input11 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 input11 = (Double)params[0];
 }
 Double input21 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 input21 = (Double)params[1];
 }
 ret = this.minus( input11, input21 );
 
 			break;
 		case 2:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 Double input12 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 input12 = (Double)params[0];
 }
 Double input22 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 input22 = (Double)params[1];
 }
 ret = this.multiple( input12, input22 );
 
 			break;
 		case 3:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 Double input13 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 input13 = (Double)params[0];
 }
 Double input23 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 input23 = (Double)params[1];
 }
 ret = this.divide( input13, input23 );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "calculator";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] plus( Double inputKey0, Double inputKey1 ){
 
		Object[] ret = null;
 Double val = new Double(com.ist.calculate.Calculate.plus( inputKey0.intValue() , inputKey1.intValue() ));
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
 
 	public final Object[] minus( Double inputKey0, Double inputKey1 ){
 
		Object[] ret = null;
 Double val = new Double(com.ist.calculate.Calculate.minus( inputKey0.intValue() , inputKey1.intValue() ));
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
 
 	public final Object[] multiple( Double inputKey0, Double inputKey1 ){
 
		Object[] ret = null;
 Double val = new Double(com.ist.calculate.Calculate.multiple( inputKey0.intValue() , inputKey1.intValue() ));
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
 
 	public final Object[] divide( Double inputKey0, Double inputKey1 ){
 
		Object[] ret = null;
 Double val = new Double(com.ist.calculate.Calculate.divide( inputKey0.intValue() , inputKey1.intValue() ));
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
};
