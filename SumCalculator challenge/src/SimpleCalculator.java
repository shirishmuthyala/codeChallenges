public class SimpleCalculator {
     private double firstNumber;
     private double secondNumber;

     public void setFirstNumber(double firstNumber){
         this.firstNumber = firstNumber;
     }

     public void setSecondNumber(double secondNumber){
         this.secondNumber = secondNumber;
     }

     public double getFirstNumber(){
         return this.firstNumber;
     }

     public double getSecondNumber(){
         return this.secondNumber;
     }

     public double getAdditionResult(){
         return (double) (this.firstNumber + this.secondNumber);
     }

    public double getSubtractionResult(){
        return (double) (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult(){
        return (double) (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult(){
         if(this.secondNumber == 0){
            return 0;
         }
         return (double) (this.firstNumber / this.secondNumber);
    }
}
