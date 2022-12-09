def f(n):
    pf=1
    ps=0
    for i in range(1,n+1):
        pf *=i
        ps +=ps
    return ps
n = int(input())
print(f(n))
