print("№1")
def f(A,B):
    if A==0 and B == 0:
        return 1
    else:
        for i in range(A, B-1, -1): print(i)
        for i in range(A, B+1): print(i)
print(f(14,18))
