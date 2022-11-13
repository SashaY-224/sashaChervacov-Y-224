print("№2")
def F(N):
    if N>=2:
        for g in range(1,1000):
            if N%g==0 and g!=1:
                print(g)
                break
print(F(99))