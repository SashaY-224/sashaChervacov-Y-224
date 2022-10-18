print("№3")
n=int(input())
if n<(24*60):
    hours=n%(24*60)//60
    minuts=n%60
    print(hours,":",minuts)
else:
    print("не подходит")