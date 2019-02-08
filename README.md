# FizzBuzzCLI
CLI for the FizzBuzz game

(Note: it requires JRE 1.8 or higher to run.)

# License

It's licensed under the GNU GPLv3 license.

# Rules:
  - lucky: all numbers containing a 3 are changed to the word "lucky";
  - fizz: all numbers that are multiple of 3 are changed to the word "fizz";
  - buzz: all numbers that are multiple of 5 are changed to the word "buzz".

# Sintax: 

                              fizzbuzz <minValue> <maxValue> <rules>
                              rules : [ [ lucky | fizz | buzz ]^+ [ or ]^* ]^+

# Example:

Input: 

                              fizzbuzz 1 16 lucky or fizz buzz

Output:

                              1 2 lucky 4 buzz fizz 7 8 9 buzz 11 fizz lucky 14 fizzbuzz 16

# How to install (with alias creation):
(Note: I'm assuming that you have Bash or a unix terminal of some sort. Without it, the creation of the alias will not work.)

Windows:

  - Download the file fizzbuzz-1.*.*.jar in the directory /release.
    Save the file in a directory of your choosing.

  - Setup an alias (if you have Bash) (optional): in the Bash installation directory, edit the file aliases.sh adding the line below 
  
                              alias fizzbuzz='java -jar <absolute-path>/fizzbuzz*.jar'
                              
    where "<absolute-path>" is the absolute path where you saved the fizzbuzz jar.
    (Atention: this action may require admin permissions)
  
  - Type "fizzbuzz" in your terminal. If it returns a message saying that it lacks parameters, then this installation is completed.
