def f(a,b):
    if a<=b:
        for i in range(a,b+1):
            print(i)
    else:
        for i in range(a,b+1,-1):
            print(i)
a = int(input())
b = int(input())
f(a,b)

