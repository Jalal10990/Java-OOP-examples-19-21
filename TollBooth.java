
import java.util.Scanner; 
class TollBooth {
    private int totalCars;  
    private double totalCash;  

    TollBooth() {
        totalCars = 0;
        totalCash = 0.0;
    }

    // method to count a paying car ( adds 1 car by passing car and increases cash by $0.50)
    public void payingCar() {
        totalCars++;
        totalCash += 0.50;
    }

    // method to count a non-paying car (only adds 1 car ,not paynig cash)
    public void nopayCar() {
        totalCars++;
    }

    public void display() {
        System.out.println("Total cars: " + totalCars);
        System.out.println("Total cash: $" + totalCash);
    }
}

// main class to run the program
 class TestTollBooth {
    public static void main(String[] args) {
        TollBooth tollBooth = new TollBooth(); 
        Scanner jalal = new Scanner(System.in); 

        System.out.println("press 'p' for paying car, 'n' for a non-paying car, or 'e' to exit.");

        // Infinite loop to keep taking input until 'e' is entered
        while (true) {
            char key = jalal.next().charAt(0); 

            if ( key == 'p') { 
                tollBooth.payingCar();
                System.out.println("Paying car is counted.");
            } else if (key == 'n') { 
                tollBooth.nopayCar();
                System.out.println("Non-paying caris counted.");
            } else if (key == 'e') { 
                tollBooth.display();
                break;
            } else {  
                System.out.println("Invalid input. Try again.");
            }
        }
    }
}







