print("№5")
def F(x,y,z):
    if x<y:
        if x<z:
            min=x
        else:
            min=z
    else:
        if y<z:
            min=y
        else:
            min=z
    print("минимальное =",min)
print(F(4,5,6))