print("№1")
N=int(input())
cnt=0
for x in range(1,N+1):
    x = x**2
    cnt+=1
    if x<N:
        print(cnt,x)
