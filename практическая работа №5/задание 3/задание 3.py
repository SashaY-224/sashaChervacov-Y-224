def f(n):
  if n == 1:
    print('1','0')
  else:
    i = 2
    s = 0
    while i<=n:
      s +=1
      i = i*2
    print(i//2,s)

f(33)
    
