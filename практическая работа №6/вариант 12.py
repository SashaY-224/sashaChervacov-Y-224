print("Вариант 12")
def F(s):
    for f in s:
        if f[-1] == "я":
            print(f)
print(F("ария акация люстра антон мяч  Коалиция".split()))