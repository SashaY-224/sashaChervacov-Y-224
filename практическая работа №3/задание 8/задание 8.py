print("№8")
def F(x,y,z):
    if x==y and x==z and z==y:
        return 3
    if x==y or x==z or y==z:
        return 2
    else:
        return 0
print(F(3,2,3))