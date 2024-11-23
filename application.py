import sys
import os

def clear_screen():
    # For Windows
    if os.name == 'nt':
        os.system('cls')
    # For MacOS and Linux
    else:
        os.system('clear')

first_name = input("Enter your first name: ")
last_name = input("Enter your last name: ")

print("Do you have a school education certificate? (0 - not available, 1 - available)")
certificate_option = int(input())
if certificate_option == 1:
    has_certificate = True
elif certificate_option == 0:
    has_certificate = False
    clear_screen ()
    print("You do not have a school education certificate. You can't be admitted!")
    sys.exit()
else:
    clear_screen ()
    print("Invalid choice. Please enter 0 or 1.")
    sys.exit()

print("Do you have an ORT test score? (0 - not available, 1 - available)")
ort_option = int(input())
if ort_option == 1:
    has_ort = True
elif ort_option == 0:
    has_ort = False
    clear_screen ()
    print("You do not have ORT certificate. You can't be admitted!")
    sys.exit()
else:
    print("Invalid choice. Please enter 0 or 1.")
if has_ort:
    ort_score = int(input("Enter your ORT score: "))
    if ort_score < 110:
        clear_screen ()
        print("Your ORT score is not enough. You can't be admitted!")
        sys.exit()
print()       
print("Choose your English language proficiency level:")
print("1 - Beginner (A1)")
print("2 - Elementary (A2)")
print("3 - Pre-Intermediate (B1)")
print("4 - Intermediate (B2)")
print("5 - Upper-Intermediate (C1)")
print("6 - Advanced (C2)")

english_level = int(input("Enter your level: "))
if english_level < 4:
    clear_screen ()
    print("Your english level is not enough. ")
    print("But you will be offered a one-year preparatory English language course (Foundation Course AIU) at the university. ")
    print("Then next year, after completing that course, you will be able to enroll the university. ")
    sys.exit()

clear_screen()
print("Congratulations! You are recommended for admission to Ala-Too University.")
input("Press enter to continue...")

clear_screen ()
print("These are the specialities in AIU: ")
print()
print("1 - Computer Engineering 2500$")
print("2 - Artificial Intelligence 2200$")
print("3 - Psychology 1900$")
print("4 - Journalism 1700$")
print("5 - International Relations 2200$")
print("6 - Law 1800$")
print("7 - Management 2200$")
print("8 - Medicine 3300$")
print()
speciality = int(input("Enter the number of speciality you've chosen: "))


if speciality == 1:
    base_cost = 2500
    speciality_name = "Computer Engineering"
elif speciality == 2:
    base_cost = 2200
    speciality_name = "Artificial Intelligence"
elif speciality == 3:
    base_cost = 1900
    speciality_name = "Psychology"
elif speciality == 4:
    base_cost = 1700
    speciality_name = "Journalism"
elif speciality == 5:
    base_cost = 2200
    speciality_name = "International Relations"
elif speciality == 6:
    base_cost = 1800
    speciality_name = "Law"
elif speciality == 7:
    base_cost = 2200
    speciality_name = "Management"
elif speciality == 8:
    base_cost = 3300
    speciality_name = "Medicine"
else:
        print("Invalid choice for specialty.")
        speciality_name = None
        base_cost = 0

if 140 <= ort_score <= 155:
    discount_percentage = 5
elif 156 <= ort_score <= 174:
    discount_percentage = 10
elif 175 <= ort_score <= 199:
    discount_percentage = 25
elif 200 <= ort_score <= 209:
    discount_percentage = 50
elif 210 <= ort_score <= 218:
    discount_percentage = 75
elif 219 <= ort_score <= 240:
    discount_percentage = 100
else:
    discount_percentage = 0

final_cost = base_cost * (1 - discount_percentage / 100)
clear_screen ()

if speciality_name is not None:
    print(f"Dear {first_name} {last_name}, we congratulate you!")
    print(f"You have been admitted to the {speciality_name} programm at Ala-Too International University.")
    if discount_percentage > 0:
        print(f"The cost of your tuition with a {discount_percentage}% discount will be {final_cost:.2f}$ per year.")
    else:
        print(f"The cost of your tuition will be {base_cost}$ per a year.")
        