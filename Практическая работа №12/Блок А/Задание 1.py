print("№1")
def f(A,B):
    if A<B:
        for i in range(A, B+1): print(i)
    else:
        for i in range(A, B-1, -1): print(i)
print(f(14,18))
