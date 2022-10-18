print("№4")
second=int(input())
day=second//(24*3600)
hours=(second - day*(24*3600))//3600
minuts=(second-((day*(24*3600))+(hours*3600)))//60
sec=(second-((day*(24*3600))+(hours*3600)+(minuts*60)))
print(day,"дни",hours,"часы",minuts,"минуты",sec,"секунды")


        
