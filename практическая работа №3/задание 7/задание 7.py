print("№7")
print("Введите год")
god=int(input())
if god%4==0 and god%100!=0 and god%400!=0:
    print("да")
else:
    print("нет")

print("№7")   
print("введите год")
def F(god):
    if god%4==0 and god%100!=0 and god%400!=0:
        print("да")
    else:
        print("нет")
print(F(2014))