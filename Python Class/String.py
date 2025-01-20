import random

def number_predictor_game():
    print("Welcome to the Number Predictor Game!")
    print("Guess the number correctly to win.")
    
    # Step 1: Define range and generate random number
    lower_bound = int(input("Enter the lower bound of the range: "))
    upper_bound = int(input("Enter the upper bound of the range: "))
    secret_number = random.randint(lower_bound, upper_bound)
    
    print(f"\nI have picked a number between {lower_bound} and {upper_bound}. Try to guess it!")
    
    attempts = 0
    while True:
        try:
            # Step 2: Player makes a guess
            guess = int(input("\nEnter your guess: "))
            attempts += 1
            
            # Step 3: Check the guess and give feedback
            if guess < lower_bound or guess > upper_bound:
                print(f"Please guess a number within the range {lower_bound} to {upper_bound}.")
            elif guess < secret_number:
                probability = round((secret_number - guess) / (upper_bound - guess), 2)
                print(f"Too low! Hint: Probability of the number being higher is {probability * 100}%.")
            elif guess > secret_number:
                probability = round((guess - secret_number) / (guess - lower_bound), 2)
                print(f"Too high! Hint: Probability of the number being lower is {probability * 100}%.")
            else:
                print(f"Congratulations! You guessed the number in {attempts} attempts!")
                break
        except ValueError:
            print("Please enter a valid number.")
    
    print("\nThanks for playing!")

# Run the game
number_predictor_game()
