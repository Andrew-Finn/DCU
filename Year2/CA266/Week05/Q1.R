pos = 0
virus = 0

for (i in c(1:10000))
{
  if(runif(1)<0.15){
    virus[i] = 1
    if(runif(1)<0.95) pos[i]=1 else pos[i]=0
  }
  else{
    virus[i] = 0
    if(runif(1)<0.2) pos[i]=1 else pos[i]=0
  }
}