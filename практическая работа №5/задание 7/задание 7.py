print("№7")
def F(x):
  a = -1
  f = -1
  n = -1
  while a != 0:
      a = int(input())
      if a > f:   
          n += 1
      f = a       
  print(n)
print(F(0))
        