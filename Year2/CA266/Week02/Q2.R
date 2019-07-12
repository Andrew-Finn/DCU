attach(sleep)
par(mfrow=c(2, 1))
hist(extra[group==1], 
     breaks = (-2:6), 
     xlab= "Sleep", 
     ylab = "Extra Sleep(hrs)",
     main = "Sleep Group 1")

hist(extra[group == 2], 
     breaks = (-2:6), 
     xlab= "Sleep", 
     ylab = "Extra Sleep(hrs)",
     main = "Sleep Group 2")

