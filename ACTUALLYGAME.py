from random import randint 
z = randint(1,100)
print("This is a game named Number Guesser ")
print("In this Game you have to choose a Number between 1-100")
print("So,lets begin ")
print("There are three levels")
print('''==========WELCOME==========
1 Noobs level 
2 Pro level
3 God level''')
x = int(input("Choose your level\n"))
if (x==1):
    print('In this level you will get to know that wether you choose greater number or smaller number ')
    a = int(input("Write your Number\n"))
    if(a==z):
        print("Why you played this level you are actually a pro")
    while a!=z:
        if (a>z):
            print("You choosed a Greater number try  to choose a smaller number")
        else:
            print("You choosed a Smaller number try  to choose a Greater number")   
        a = int(input("Write your Guess again\n"))   
        if(a==z):
            print("Finally you choosed a write number Good :)")
elif (x==2):
    print("In this level  you will get unlimited turns but you will not get to know wether the number you choosed is greter or smaller than the actual number")              
    a = int(input("Write your Guess \n")) 
    if (a==z):
        print("You are actually a Pro!\nYOU WON!")
    while (a!=z):
        a = int(input("Write your Guess Again \n")) 
    if (a==z):
        print("Finally You Choosed a write number")    
elif(x==3):
    print('Well you think you are a God \nLets see')
    print ("You have only one chance so be carefull while choosing a number :) All The Best!")
    a = int(input("Write your Guess \n"))   
    if (a==z):
        print ("You Are Actually A God in this game!")
        print("congratualtions\n"*10)
    else:
        print("You are a NOOB!\n"*20)
else :
    print("Choose a valid Level")
if (x==1 or x==2 or x==3):
    print("THANKS FOR PLAYING :)")    
            
  
















