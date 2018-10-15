/*
 * Corbin Nash
 * 00/00/2018
 * This Program
 */
package combolockdriver;

import javax.swing.JOptionPane;

 public class ComboLockDriver {
  public static void main(String[] args) {
  //Call on constructors
  ComboLock userLock = new ComboLock(0,0,0);
  ComboLock randomLock = new ComboLock();

  int userCodeInput1,userCodeInput2,userCodeInput3,userCodeGuess1,userCodeGuess2,userCodeGuess3,amountofGuessesLeft,userLockChoice;
  int correctAnswer1 = 0,correctAnswer2 = 0,correctAnswer3 = 0;
  userLockChoice = Integer.parseInt(JOptionPane.showInputDialog("Would you like to make the lock  \n Please enter 1 for Yes or 0 No")); 
  String lockCombo = null;
   if(userLockChoice == 1){
      //Make user input code and set it as the lock combo
      userCodeInput1 = Integer.parseInt(JOptionPane.showInputDialog("What should the first number of the lock be")); 
      userCodeInput2 = Integer.parseInt(JOptionPane.showInputDialog("What should the second number of the lock be")); 
      userCodeInput3 = Integer.parseInt(JOptionPane.showInputDialog("What should the third number of the lock be")); 
      userLock.setCode1(userCodeInput1);
      userLock.setCode2(userCodeInput2);
      userLock.setCode3(userCodeInput2);
      lockCombo = Integer.toString(userLock.getCode1()) + " "+ Integer.toString(userLock.getCode2()) + " "+Integer.toString(userLock.getCode3());
   }
   else if(userLockChoice == 0){
     JOptionPane.showMessageDialog(null,"Generating lock combo");
     lockCombo = Integer.toString(randomLock.getCode1()) + Integer.toString(randomLock.getCode2()) + Integer.toString(randomLock.getCode3());
 }
   else{
     JOptionPane.showMessageDialog(null,"invalid input");  
 }
JOptionPane.showMessageDialog(null,"Now it is time to guess the lock combo");
amountofGuessesLeft = 3;
  switch (userLockChoice) {
      case 1:
          //Run this if the user made the lock
          //A bunch of while loops to allow the user to guess 3 times
          do {
              userCodeGuess1 = Integer.parseInt(JOptionPane.showInputDialog("What is first Number of the lock"));
              if(userCodeGuess1 == userLock.getCode1()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer1 = 1;
             break;
              }
              else if(userCodeGuess1 != userLock.getCode1()){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else {
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }
              }
          }while(true);
          //do it for a second time
          do {
              userCodeGuess2 = Integer.parseInt(JOptionPane.showInputDialog("What is second number of the lock"));
              if(userCodeGuess2 == userLock.getCode2()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer2 = 1;  
                  break;
              }
              else if(userCodeGuess2 != userLock.getCode2() ){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else {
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }

          }
         }
          while(true) ;
          do {
              userCodeGuess3 = Integer.parseInt(JOptionPane.showInputDialog("What is third number of the lock"));
              if(userCodeGuess3 == userLock.getCode3()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer2 = 1;  
                  break;
              }
              else if(userCodeGuess3 != userLock.getCode3() ){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else {
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }

          }
         }
          while(true) ;
          //give them a final message based if they guess correctly
           JOptionPane.showMessageDialog(null,"Congragulations you guessed it correctly the combo was"+ lockCombo);
           System.exit(0); 

      case 0:
          // Run this for random
          do {
              userCodeGuess1 = Integer.parseInt(JOptionPane.showInputDialog("What is first Number of the lock"));
              if(userCodeGuess1 == randomLock.getCode1()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer1 = 1;
                  break;
              }
              else if(userCodeGuess1 != randomLock.getCode1()){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else{
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }
                }
               }
          while(true);
          //do it for a second time
          do {
              userCodeGuess2 = Integer.parseInt(JOptionPane.showInputDialog("What is second number of the lock"));
              if(userCodeGuess2 == randomLock.getCode2()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer2 = 1;  
                  break;
              }
              else if(userCodeGuess2 != randomLock.getCode2() ){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else {
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }
                 }
                }
          while(true) ;
          do {
              userCodeGuess3 = Integer.parseInt(JOptionPane.showInputDialog("What is third number of the lock"));
              if(userCodeGuess3 == randomLock.getCode3()){
                  JOptionPane.showMessageDialog(null,"Correct answer moving on");
                  correctAnswer2 = 1;  
                  break;
              }
              else if(userCodeGuess3 != randomLock.getCode3() ){
                  if(amountofGuessesLeft > 0){
                   JOptionPane.showMessageDialog(null,"Incorrect you have " + amountofGuessesLeft + " guesses left please try again");
                   amountofGuessesLeft -= 1;
                  }
                  else {
                   JOptionPane.showMessageDialog(null,"Incorrect you have run out guesses \nending program");
                   System.exit(0); 
                  }
                 }
                }
          while(true) ;
          //give them a final message when they guess correctly
           JOptionPane.showMessageDialog(null,"Congragulations you guessed it correctly the combo was"+ lockCombo);
           System.exit(0); 
 }
}
}