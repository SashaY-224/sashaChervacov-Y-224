print("№6")
def f(n):
    sum = 1
    for i in range(1,n+1):
        sum +=sum*i
    return sum
n = int(input())
print(f(n))
