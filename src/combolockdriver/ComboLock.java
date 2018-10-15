/*
 * Corbin Nash
 * 00/00/2018
 * This Program
 */
package combolockdriver;

/**
 *
 * @author Corbin
 */
public class ComboLock {
    private int code1,code2,code3;
//If the user makes the lock the program will call on this constructor   
public ComboLock(int cd1,int cd2, int cd3){
code1 = cd1;
code2 = cd2; 
code3 = cd3;
}
//If the user does not make the lock the program will call on this constructor   
public ComboLock(){   
code1 = (int)(Math.random()*3) + 1;
code2 = (int)(Math.random()*3) + 1;
code3 = (int)(Math.random()*3) + 1;
}


 public int getCode1(){
 return code1;
 }
 public int getCode2(){
 return code2;
 }
 public int getCode3(){
 return code3;
 }
 public void setCode1(int cd1){
 code1 = cd1;
 }
 public void setCode2(int cd2){
 code2 = cd2;
 }
public void setCode3(int cd3){
 code3 = cd3;
 }




}

