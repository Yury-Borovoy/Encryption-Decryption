# Encryption-Decryption
This program encrypts/decrypts messages and texts using Shift/Unicode algorithms. The program accepts five arguments from command line:
1. -mode
2. -key
3. -data
4. -in
5. -out
### For example:
**java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode**

The program can accept the arguments both from command line and standart input. And it can write a result both to a file and standart output.

## How do algorithms work?
### 1. Using of the Shift algorithm
The program gets a message and a key from the standart input or the command line and shifts each letter by specified number according to its order in the alphabet. If it reaches the end of the alphabet, starts back at the beginning (a follows z). The program doesn't modify non-letter characters.

![code](https://github.com/Yury-Borovoy/Encryption-Decryption/blob/master/Screenshot_1.jpg)

 For example:
 
 ***welcome to hyperskill***
 
 ***bjqhtrj yt mdujwxpnqq***
 
 ### 2. Using of the Unicode algorithm
 The program gets a message and a key from the standart input or the command line and shifts each character by specified number according to the Unicode table. All non-letter characters are encrypted as well as regular letters.
 
 ![code](https://github.com/Yury-Borovoy/Encryption-Decryption/blob/master/Screenshot_2.jpg)

 For example:
 
 ***Welcome to hyperskill!***
 
 ***\jqhtrj%yt%m~ujwxpnqq&***
 
 *In this project I used the FactoryMethod pattern.*
