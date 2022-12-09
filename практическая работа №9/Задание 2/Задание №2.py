
from random import randint
def F():
    m = randint (1,3)
    mat = [[randint(0, 9) for j in range(m)] for i in range(m)]
    L = []
    for i in range(len(mat)):    
        L.append(mat[i][i])
    print(L)
    print(sum(L))
    summ = 0
    for i in L:
        summ += i
    print(summ)
    for i in range(len(mat)):
        if i+1 % 2 == 0:
            for j in range(len(mat[i])):
                mat[i][j]  /= summ
    print(mat)
F()