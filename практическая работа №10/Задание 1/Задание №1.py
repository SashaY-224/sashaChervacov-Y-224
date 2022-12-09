

u = open(r'D:\Users\Chervakov-A.S_Y-224_vvod1.txt')
T = open(r'D:\Users\Chervakov-A.S_Y-224_vvod1.txt')

f = open(r'D:\Users\Chervakov-A.S_Y-224_vivod1.txt', 'w+')
R = u.readlines()
O = T.readlines(5)
M = T.readlines(5)
P = T.readlines(5)
a = [[int(x) for x in O],[int(x) for x in M],[int(x) for x in P]]
  
    
def F():    
    b = []
    c = []
    for i in range(len(a)):
        for j in range(len(a[i])):  
            a[j][i]=a[i][j]         

    for w in a:
        f.write(str(w))
F()
f.close()