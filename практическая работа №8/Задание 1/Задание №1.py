print(№8.1)
import math
def d(x,y):
     return math.sqrt(x*x+y*y)
 
def S1(x, y):
     return x*y*0.5
     
def S2(z, t):
     p = (z+t+d(5,5)) / 2 
     return math.sqrt(p*(p-z)*(p-t)*(p-d(5,5)))
     
print(S1(5,5) + S2(5,5))
