from random import randint
def F():
    m = randint (1,3)
    a = [[randint(0, 9) for j in range(m)] for i in range(m)]
    b = []
    c = []
    for i in range(len(a)):
        for j in range(len(a[i])):  
            a[j][i]=a[i][j]         

    for w in a:
        print( w, sep ='\t' )


F()

    
