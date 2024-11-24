import time

correct_login = "aidar"
correct_password = "1111"

attempts = 0

while True:
    login = input("Enter your login: ")
    password = input("Enter your password: ")

    if login == correct_login and password == correct_password:
        print("Login successful! Welcome to the website.")
        break  
    else:
        print("Incorrect login or password. Please try again.")
        attempts += 1 

        if attempts == 3:
            print("Too many incorrect attempts. Please wait 5 seconds.")
            time.sleep(5)  
            attempts = 0