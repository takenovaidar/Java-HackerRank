import random

distance = [1, 2, 3, 4, 5, 6, 7]
total_weight = 713

box_1 = random.randint(1, total_weight)
box_2 = random.randint(1, total_weight - box_1)
box_3 = total_weight - box_1 - box_2 

counting_weight = 0

while True:
    num1, num2, num3 = map(int, input('Enter your numbers: ').split())
    
    first, second, third = random.sample(distance, k=3)

    random_km = [first, second, third]

    if num1 in random_km:
        random_km.remove(num1)
        counting_weight += box_1
        print(f"You've found box 1 with weight {box_1} kg!")
    
    if num2 in random_km:
        random_km.remove(num2)
        counting_weight += box_2
        print(f"You've found box 2 with weight {box_2} kg!")
    
    if num3 in random_km:
        counting_weight += box_3
        print(f"You've found box 3 with weight {box_3} kg!")
    
    if counting_weight == total_weight:
        print("\nCongratulations! You've found all boxes and the total weight is: 713 kg!")
        break
    
    counting_weight = 0
    distance = [1, 2, 3, 4, 5, 6, 7]
    
    distance.remove(first)
    distance.remove(second)
    distance.remove(third)
    
    print("\nNot all boxes have been found or the total weight is incorrect. The boxes have been moved!")
