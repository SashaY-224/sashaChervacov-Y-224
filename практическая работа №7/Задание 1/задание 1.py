minim=1000000000
a=[]
b=int(input())
for i in range(b):
    z=int(input())
    if z%2!=0 and z<minim:
        minim=z
        a.append(z)
print("минимальное число массива:",minim)
    