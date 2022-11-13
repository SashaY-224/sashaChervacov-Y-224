print("№6")
def F(x):
    s = -1
    while True:
        a = int(input())
        x = x + a
        s = s + 1
        if a == 0:
            break
    print(x/s)
print(F(0))
        
        
        
        