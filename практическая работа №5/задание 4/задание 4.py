print("№4")
def F(x,y):
    den = 0
    for z in range(1,10000000):
        x=x*1.1
        den+=1
        if y<=x:
            print(den)
            break
print(F(14,43))
            