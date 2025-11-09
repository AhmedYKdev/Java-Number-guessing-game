void main() {
    Scanner input = new Scanner(System.in);
    int choice;

    System.out.println("Number Guessing game");
    System.out.println("Choose 1 for easy which you have to guess between 1 and 100 and you have infinite tries");
    System.out.println("Choose 2 for medium");
    System.out.println("Choose 3 for hard");

    //--- Loop until the user enters a valid integer that is 1, 2, or 3 ---//
    while (true) {
        System.out.print("Choose a game mode (1, 2, 3): ");

        //--- Check if the input is an integer ---//
        if (input.hasNextInt()) {
            choice = input.nextInt();

            //--- Check if it is 1, 2, or 3 ---//
            if (choice == 1 || choice == 2 || choice == 3) {
                break;
            } else {
                System.out.println("Invalid number! Please enter 1, 2, or 3.");
            }
        } else {
            System.out.println("That's not an integer!");
            input.next();
        }
    }

    if(choice == 1){
        System.out.println("You chose easy mode");
        easyMode();
    }
    else if(choice == 2){
        System.out.println("You chose medium mode");
        mediumMode();
    }
    if(choice == 3){
        System.out.println("You chose hard mode");
        hardMode();
    }

    input.close();
}
void hardMode(){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    //--- Variables ---//
    int guess;
    int attempts = 1;
    int randomNumber = random.nextInt(1, 501);

    System.out.println("*** Number Guessing Game ***");
    System.out.println("Guess a number between 1 and 500");
    System.out.println("You have 20 tries");
    System.out.println("******************");

    do {
        System.out.printf("Attempt %d of 20\n", attempts);
        System.out.print("Guess the number: ");

        while (!input.hasNextInt()) {
            System.out.println("That’s not a valid number! Try again.");
            System.out.print("Guess the number: ");
            input.next(); // clear the invalid input
        }

        guess = input.nextInt();
        attempts++;

        if (guess > randomNumber) {
            System.out.println("TOO HIGH!");
        } else if (guess < randomNumber) {
            System.out.println("TOO LOW!");
        } else {
            System.out.printf("You have won the number was %d\n", randomNumber);
            System.out.printf("Attempts used %d: ", 20 - attempts);
            System.out.printf("Number of attempts left : %d\n", attempts);
        }

        if(attempts >= 20){
            System.out.println("You used all of 20 your attempts");
            break;
        }

    }while (guess != randomNumber);
}
void mediumMode(){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    //--- Variables ---//
    int guess;
    int attempts = 1;
    int randomNumber = random.nextInt(1, 351);

    System.out.println("*** Number Guessing Game ***");
    System.out.println("Guess a number between 1 and 350");



        do {
            System.out.printf("Attempt %d of 40\n", attempts);
            System.out.print("Guess the number: ");

            while (!input.hasNextInt()) {
                System.out.println("That’s not a valid number! Try again.");
                System.out.print("Guess the number: ");
                input.next(); // clear the invalid input
            }

            guess = input.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO HIGH!");
            } else if (guess < randomNumber) {
                System.out.println("TOO LOW!");
            } else {
                System.out.printf("You have won the number was %d\n", randomNumber);
                System.out.printf("Attempts used %d: ", 40 - attempts);
                System.out.printf("Number of attempts left : %d\n", attempts);
            }
        }while (guess != randomNumber);
    }
void easyMode(){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    //--- Variables ---//
    int guess;
    int attempts = 0;
    int randomNumber = random.nextInt(1, 101);

    System.out.println("*** Number Guessing Game ***");
    System.out.println("Guess a number between 1 and 100");


    do{
        System.out.print("Guess the number: ");

        while (!input.hasNextInt()) {
            System.out.println("That’s not a valid number! Try again.");
            System.out.print("Guess the number: ");
            input.next(); // clear the invalid input
        }

        guess = input.nextInt();
        attempts++;

        if(guess > randomNumber){
            System.out.println("TOO HIGH!");
        }
        else if(guess < randomNumber){
            System.out.println("TOO LOW!");
        }
        else{
            System.out.printf("You have won the number was %d\n", randomNumber);
            System.out.printf("Number of attempts: %d\n", attempts);
        }
    }while(guess != randomNumber);

    input.close();
}