######################################
Andrew Finn
18XXXXXX
andrew.finn8mail.dcu.ie
######################################
The Sleeping Barber


Please find source code located in main.py

Testing
Testing consisted of following the guidelines set out in the project specs, first getting the 20% working correctly before then proceeding to the criteria for 60% and then 100%. I tested each iteration with various values for haircut time and customer iteration time to ensure the queue could be filled and customers turned away correctly and work distribution was working as intended.

Limitations:
os._exit(n) --> Will only work on UNIX systems (Sorry Windows, well not really)
Names generated --> Finite number, names can occur more than once however not a concern in this small example (Won't cause the program to fail just for clarity in output).
Finite customers --> Program operates with a finite number of customers this can be set to a very large integer to see the output over a longer period. This was a design choice as I wanted the program to end, this could be easily changed by setting the customer loop to True rather than to a finite range.
Seats finite --> Again as a design choice seats are not truly infinite they are however set to the number of customers when infinity is desired, this acts the same in this example (No customer turned away). This again could be changed by removing boundaries on the queue however again is unnecessary due to this workaround and benefits in code clarity as a result of less logic

