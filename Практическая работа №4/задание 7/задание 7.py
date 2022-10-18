n=int(input())
Fact=1
summFact=0
for x in range(1,n+1):
    Fact = Fact * x
    summFact += Fact
print(summFact)

